package com.microservice.api.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class DonanteRequest implements Serializable {
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("apellidos")
    private String apellidos;
    @JsonProperty("dni")
    private String dni;
    @JsonProperty("direccion")
    private String direccion;
}
