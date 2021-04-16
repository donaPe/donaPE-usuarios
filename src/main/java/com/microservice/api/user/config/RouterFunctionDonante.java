package com.microservice.api.user.config;

import com.microservice.api.user.handler.DonanteHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterFunctionDonante {
    @Bean
    public RouterFunction<ServerResponse> routes(DonanteHandler handler) {

        return RouterFunctions.route(RequestPredicates.POST("/api/register"), handler::save);
    }
}
