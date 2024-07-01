package com.izpan.modules.relay.service;

import com.ehzyil.relay.executor.parameter.CompletionRequest;
import reactor.core.publisher.Flux;

public interface IApiRelayService {
    public Flux<String> chat(CompletionRequest request) throws Exception;
}
