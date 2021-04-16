package com.microservice.api.user.service;

import com.microservice.api.user.model.Donante;
import reactor.core.publisher.Mono;

public interface DonanteService {

    Mono<Donante> save(Donante donante);
}
