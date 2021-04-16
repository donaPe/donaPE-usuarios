package com.microservice.api.user.service.impl;

import com.microservice.api.user.domain.LoginRequest;
import com.microservice.api.user.model.User;
import com.microservice.api.user.repository.UserRepository;
import com.microservice.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> validationLogin(LoginRequest request) {
        return Mono.just(userRepository.findByDniAndPassword(request.getDni(), request.getPassword()));
    }
}
