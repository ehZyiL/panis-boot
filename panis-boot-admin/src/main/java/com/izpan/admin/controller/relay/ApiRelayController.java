package com.izpan.admin.controller.relay;

import com.ehzyil.relay.executor.parameter.CompletionRequest;
import com.izpan.modules.relay.facade.IApiRelayFacade;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


/**
 * @author mahaonan
 */
@RestController
@Slf4j
public class ApiRelayController {

    @Autowired
    private IApiRelayFacade apiRelayFacade;


    @RequestMapping(value = "/v1/chat/completions")
    @Operation(operationId = "1", summary = "chat")
    public Flux<ServerSentEvent<String>> chat(@RequestBody CompletionRequest request) throws Exception {
//        // 确保 apiRelayFacade.chat(request) 返回 Flux<String>
//        Flux<String> chatDataStream = apiRelayFacade.chat(request);

        return apiRelayFacade.chat(request)
                .map(data -> {
                    log.debug("发送 SSE 数据：{}", data);
                    return ServerSentEvent.<String>builder()
                            .data(data)
                            .build();
                })
                .onErrorReturn(ServerSentEvent.<String>builder()
                        .data("发生错误")
                        .build());

    }

}
