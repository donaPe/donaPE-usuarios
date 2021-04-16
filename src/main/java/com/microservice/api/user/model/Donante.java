package com.microservice.api.user.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "donante", schema = "equipo1")
@Getter
@Setter
@Builder
@Entity
public class Donante {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;

}
