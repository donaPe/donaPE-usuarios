package com.microservice.api.user.service.impl;

import com.microservice.api.user.model.Donante;
import com.microservice.api.user.repository.DonanteRepository;
import com.microservice.api.user.service.DonanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DonanteServiceImpl implements DonanteService {

    @Autowired
    private DonanteRepository donanteRepository;

    @Override
    public Mono<Donante> save(Donante donante) {
        return Mono.just(donanteRepository.save(donante));
    }
}
