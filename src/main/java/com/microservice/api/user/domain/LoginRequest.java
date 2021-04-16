package com.microservice.api.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class LoginRequest implements Serializable {
    @JsonProperty("dni")
    private String dni;
    @JsonProperty("password")
    private String password;
}
