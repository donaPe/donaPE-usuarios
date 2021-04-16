package com.microservice.api.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "usuario", schema = "equipo1")
@Getter
@Setter
@Entity
public class User implements Serializable {
    @Id
    private int id;
    private String dni;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "donante_id", referencedColumnName = "id")
    private Donante donante;
}
