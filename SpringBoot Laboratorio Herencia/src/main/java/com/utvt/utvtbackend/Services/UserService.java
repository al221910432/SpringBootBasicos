package com.utvt.utvtbackend.Services;

import com.utvt.utvtbackend.Entities.Usuario;
import com.utvt.utvtbackend.Repositories.UsuarioRepositorio;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UsuarioRepositorio usuarioRepository;

}
