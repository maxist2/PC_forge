package com.project.Pcforge.User.controler;

import com.project.Pcforge.User.Repository.UserRepository;
import com.project.Pcforge.User.domain.Usuario;
import com.project.Pcforge.User.domain.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistroController {

   @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/api/registro")
    public ResponseEntity<String> registrarUsuario(@RequestBody UsuarioRequest usuarioRequest) {

        if (userRepository.findByNombreUsuario(usuarioRequest.getNombreUsuario()) != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("El nombre de usuario ya está en uso.");
        }


        Usuario usuario = new Usuario(usuarioRequest.getNombreUsuario(),
                usuarioRequest.getCorreoUsuario(),
                passwordEncoder.encode(usuarioRequest.getContraseñaUsuario()));

        userRepository.save(usuario);
        return ResponseEntity.ok("Usuario registrado exitosamente.");
    }
}
