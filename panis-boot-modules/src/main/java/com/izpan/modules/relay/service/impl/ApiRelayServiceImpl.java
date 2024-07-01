package com.izpan.modules.relay.service.impl;

import com.ehzyil.relay.executor.parameter.CompletionRequest;
import com.ehzyil.relay.session.OpenAiSession;
import com.izpan.modules.relay.service.IApiRelayService;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.annotation.Nullable;

@Service
@Slf4j
public class ApiRelayServiceImpl implements IApiRelayService {


    private final OpenAiSession openAiSession;

    @Autowired
    public ApiRelayServiceImpl(OpenAiSession openAiSession) {
        this.openAiSession = openAiSession;
    }

    @Override
    public Flux<String> chat(CompletionRequest request) throws Exception {
        Flux<String> response = Flux.create(sink -> {
            try {
                openAiSession.completions(request, new EventSourceListener() {
                    @Override
                    public void onEvent(EventSource eventSource, @Nullable String id, @Nullable String type, String data) {
                        if ("[DONE]".equalsIgnoreCase(data)) {
                            sink.complete();
                            return;
                        }
                        sink.next(data);
                    }

                    @Override
                    public void onClosed(EventSource eventSource) {
                        log.info("对话完成");
                    }

                    @Override
                    public void onFailure(EventSource eventSource, @Nullable Throwable t, @Nullable Response response) {
                        log.info("对话异常");
                    }
                });
            } catch (Exception e) {
                log.error(e.getMessage());
                throw new RuntimeException(e);
            }

        });
        return response;
    }
}
