package com.project.Pcforge.User.controler;

import com.project.Pcforge.User.Security.JwtService;
import com.project.Pcforge.User.Service.UsuarioService;
import com.project.Pcforge.User.domain.LoginRequest;
import com.project.Pcforge.User.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private JwtService jwtService;

    @PostMapping("token/generate")
    public ResponseEntity<String> authenticateAndGetToken(@RequestBody LoginRequest authRequest) {
        Usuario authentication = usuarioService.validateUser(authRequest.getNombreUsuario(), authRequest.getContraseñaUsuario());
        if (authentication != null) {
            String token = jwtService.generateToken(authentication);
            return ResponseEntity.ok(token);
        } else {
            System.out.println("Invalid user request!");
            return ResponseEntity.ok("Invalid user request!");
        }
    }
}