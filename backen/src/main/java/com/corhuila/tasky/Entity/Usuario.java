package com.corhuila.tasky.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.Date;
@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

    @Column(name ="direccion")
    private String direccion;


}
