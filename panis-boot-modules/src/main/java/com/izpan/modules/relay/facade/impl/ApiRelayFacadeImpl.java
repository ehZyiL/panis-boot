package com.izpan.modules.relay.facade.impl;

import com.ehzyil.relay.executor.parameter.CompletionRequest;
import com.izpan.modules.relay.facade.IApiRelayFacade;
import com.izpan.modules.relay.service.IApiRelayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApiRelayFacadeImpl implements IApiRelayFacade {
    @Autowired
    private IApiRelayService apiRelayService;
    @Override
    public Flux<String> chat(CompletionRequest request) throws Exception {
        return apiRelayService.chat(request);
    }
}
