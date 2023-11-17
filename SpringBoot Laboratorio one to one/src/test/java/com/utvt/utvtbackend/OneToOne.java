package com.utvt.utvtbackend;

import com.utvt.utvtbackend.Entities.Alumno;
import com.utvt.utvtbackend.Entities.User;
import com.utvt.utvtbackend.Entities.Usuario;
import com.utvt.utvtbackend.Repositories.UsuarioRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest
public class OneToOne {
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

   /* @Test
    public void agregarAlumno() {
        Usuario usuario = null;
        usuario =
                new Usuario("Richi", "Pipian", "Ya", "10Febrero2020","richi@gmail.com", true);
        User user1 = new User();
        user1.setUsername("oliverfuerroutvt");
        user1.setPassword("aaaaaaaaaa");
        user1.setUsuario(usuario);
        usuario.setUser(user1);
        usuarioRepositorio.save(usuario);
        usuarioRepositorio.save(user1);

    }*/




  /* @Test
    public void actualizarAlumno() {
        Usuario usuario = usuarioRepositorio.findById(2L).orElse(null);
        Alumno alumno = (Alumno) usuario;
        Objects.requireNonNull(alumno).setNombre("German");
        Objects.requireNonNull(alumno).setPrimerApellido("Garmendia");
        Objects.requireNonNull(alumno).setSegundoApellido("Paz");
        Objects.requireNonNull(alumno).setNombre("Gibran");
        Objects.requireNonNull(alumno).setFechaNacimiento("29/09/2021");
        Objects.requireNonNull(alumno).setEmail("gibran@gmail.com");
        Objects.requireNonNull(alumno).setStatus(false);
        usuarioRepositorio.save(alumno);
    }*/

   @Test
    public void eliminarAlumno() {
        usuarioRepositorio.deleteById(1L);
    }


}
