package com.izpan.modules.relay.facade;


import com.ehzyil.relay.executor.parameter.CompletionRequest;
import reactor.core.publisher.Flux;

public interface IApiRelayFacade {

    public Flux<String> chat(CompletionRequest request) throws Exception;
}
