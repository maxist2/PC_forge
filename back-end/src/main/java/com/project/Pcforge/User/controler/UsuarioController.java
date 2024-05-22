package com.project.Pcforge.User.controler;

import com.project.Pcforge.User.Service.UsuarioService;
import com.project.Pcforge.User.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/api/usuarios/{nombreUsuario}")
    public ResponseEntity<Usuario> obtenerUsuarioPorNombre(@PathVariable String nombreUsuario) {
        Usuario usuario = usuarioService.buscarPorNombreUsuario(nombreUsuario);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}