package com.utvt.utvtbackend;

import com.utvt.utvtbackend.Entities.Administrativo;
import com.utvt.utvtbackend.Entities.Alumno;
import com.utvt.utvtbackend.Entities.Usuario;
import com.utvt.utvtbackend.Repositories.UsuarioRepositorio;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

@SpringBootTest

public class Herencia {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    /*@Test
    public void agregarAlumno(){
      Alumno alumno = null;
      alumno =
              new Alumno("Hector", "Garcia", "Nuez", "al221910432","hector12@gmail.com", true);
      this.usuarioRepositorio.save(alumno);
    }*/

   /* @Test
    public void agregarAdministrativo() {
        Administrativo administrativo =
                new Administrativo("Gael", "Garcia", "Oliver", "45abril2030", "oliver@gmail.com", true, 90.1);
        usuarioRepositorio.save(administrativo);
    }*/




    /*@Test
    public void actualizarAdministrativo() {
        Usuario usuario = usuarioRepositorio.findById(2L).orElse(null);
        Administrativo administrativo = (Administrativo) usuario;
        Objects.requireNonNull(administrativo).setNombre("Carlos");
        Objects.requireNonNull(administrativo).setPrimerApellido("Hernandez");
        Objects.requireNonNull(administrativo).setSegundoApellido("Hernandez");
        Objects.requireNonNull(administrativo).setFechaNacimiento("12/12/2012");
        Objects.requireNonNull(administrativo).setEmail("carlos.furro@gmail.com");
        Objects.requireNonNull(administrativo).setStatus(false);
        Objects.requireNonNull(administrativo).setSalario(1.0);
        usuarioRepositorio.save(administrativo);
    }*/



   /* @Test
    public void eliminarAdministrativo() {
        usuarioRepositorio.deleteById(2L);
    }*/
}
