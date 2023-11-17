package com.utvt.utvtbackend.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "1")
public class Alumno extends Usuario{



    public Alumno() {
    }

    public Alumno(String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String email, boolean status) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, email, status);
    }
}
