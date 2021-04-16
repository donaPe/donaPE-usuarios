package com.microservice.api.user.handler;

import com.microservice.api.user.domain.LoginRequest;
import com.microservice.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
public class UserHandler {
    @Autowired
    private UserService userService;

    public Mono<ServerResponse> findByUserAndPass(ServerRequest req) {
        Mono<LoginRequest> login = req.bodyToMono(LoginRequest.class);
        return login.flatMap(loginRequest ->
                userService.validationLogin(loginRequest))
                .flatMap(user -> ServerResponse
                        .ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(user)))
                .switchIfEmpty(ServerResponse.notFound().build());
    }

}
