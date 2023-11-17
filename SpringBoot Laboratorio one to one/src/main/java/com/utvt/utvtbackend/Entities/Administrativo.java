package com.utvt.utvtbackend.Entities;

import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@Repository
@DiscriminatorValue(value = "2")
public class Administrativo extends Usuario{
    private double salario;

    public Administrativo() {
        // Constructor vacío
    }

    public Administrativo(String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String email, boolean status, double salario) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, email, status);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
