package com.microservice.api.user.config;

import com.microservice.api.user.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> routes(UserHandler handler) {

        return RouterFunctions.route(RequestPredicates.GET("/api/login"), handler::findByUserAndPass);
        //.andRoute(RequestPredicates.POST("/api/register"),handler::findById);
    }
}
