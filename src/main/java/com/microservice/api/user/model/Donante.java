package com.microservice.api.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "donante", schema = "equipo1")
@Getter
@Setter
@Entity
public class Donante {
    @Id
    @Column(name = "id")
    private int id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;

    @OneToOne(mappedBy = "donante")
    private User usuario;

}
