package com.microservice.api.user.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "usuario", schema = "equipo1")
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dni;
    private String password;
    private int id_donante;
}
