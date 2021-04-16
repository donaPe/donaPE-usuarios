package com.microservice.api.user.handler;

import com.microservice.api.user.domain.DonanteRequest;
import com.microservice.api.user.model.Donante;
import com.microservice.api.user.model.User;
import com.microservice.api.user.service.DonanteService;
import com.microservice.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.net.URI;

@Configuration
public class DonanteHandler {

    @Autowired
    private DonanteService donanteService;

    @Autowired
    private UserService userService;

    public Mono<ServerResponse> save(ServerRequest request) {
        Mono<DonanteRequest> type = request.bodyToMono(DonanteRequest.class);

        return type.flatMap(p -> donanteService.save(buildObjectDonante(p)))
                .flatMap(donante -> userService.save(
                        User.builder()
                                .dni(donante.getDni())
                                .password(donante.getDni())
                                .id_donante(donante.getId())
                                .build()))
                .flatMap(flat -> ServerResponse.created(URI.create("api/save/".concat(String.valueOf(flat.getId()))))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(flat)));
    }

    private Donante buildObjectDonante(DonanteRequest donanteRequest) {
        return Donante
                .builder()
                .dni(donanteRequest.getDni())
                .nombre(donanteRequest.getNombre())
                .apellidos(donanteRequest.getApellidos())
                .direccion(donanteRequest.getDireccion())
                .build();
    }

}
