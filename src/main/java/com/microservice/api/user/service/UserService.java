package com.microservice.api.user.service;

import com.microservice.api.user.domain.LoginRequest;
import com.microservice.api.user.model.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> validationLogin(LoginRequest request);

    Mono<User> save(User user);

}
