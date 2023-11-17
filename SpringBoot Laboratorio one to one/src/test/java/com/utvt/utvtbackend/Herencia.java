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
              new Alumno("Oliver", "Esquivel", "Aguilar", "19Abril2001","oliverfurri@gmail.com", true);
      this.usuarioRepositorio.save(alumno);
    }*/

  /*  @Test
    public void agregarAdministrativo() {
        Administrativo administrativo =
                new Administrativo("Ricardo", "Cruz", "Flores", "11Diciembre2005", "ricardo12@gmail.com", true, 90.1);
        usuarioRepositorio.save(administrativo);
    }*/




   /* @Test
    public void actualizarAdministrativo() {
        Usuario usuario = usuarioRepositorio.findById(3L).orElse(null);
        Administrativo administrativo = (Administrativo) usuario;
        Objects.requireNonNull(administrativo).setNombre("Dulce");
        Objects.requireNonNull(administrativo).setPrimerApellido("Rosas");
        Objects.requireNonNull(administrativo).setSegundoApellido("Fernandez");
        Objects.requireNonNull(administrativo).setFechaNacimiento("23/09/2000");
        Objects.requireNonNull(administrativo).setEmail("dulce@gmail.com");
        Objects.requireNonNull(administrativo).setStatus(false);
        Objects.requireNonNull(administrativo).setSalario(100.5);
        usuarioRepositorio.save(administrativo);
    }*/



   /* @Test
    public void eliminarAdministrativo() {
        usuarioRepositorio.deleteById(3L);
    }*/
}
