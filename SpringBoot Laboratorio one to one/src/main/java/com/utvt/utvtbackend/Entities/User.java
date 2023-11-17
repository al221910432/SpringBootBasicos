package com.utvt.utvtbackend.Entities;

import javax.persistence.*;

@Entity
public class User extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;


    public User() {
    }

    @OneToOne
    @JoinColumn(name = "id")
    private Usuario usuario;

    public User(String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String email, boolean status, Long id, String username, String password) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, email, status);
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsuario(Usuario usuario) {
    }
}
