package com.project.Pcforge.Armador.Controller;

import com.project.Pcforge.Armador.Entity.Componente;
import com.project.Pcforge.Armador.Entity.Plano;
import com.project.Pcforge.Armador.Repository.ComponenteRepository;
import com.project.Pcforge.Armador.Repository.PlanoRepository;
import com.project.Pcforge.User.Repository.UserRepository;
import com.project.Pcforge.User.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.security.Principal;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/planos")
public class PlanoController {
    @Autowired
    private PlanoRepository planoRepository;

    @Autowired
    private UserRepository usuarioRepository;

    @Autowired
    private ComponenteRepository componenteRepository;

    @GetMapping("/usuario/{usuarioId}")
    public List<Plano> getPlanosByUsuarioId(@PathVariable Long usuarioId) {
        Usuario user = new Usuario();
        user.setIdUsuario(usuarioId);
        return planoRepository.findByUsuario(user);
    }

    @PostMapping
    public ResponseEntity<Plano> savePlano(@RequestBody Plano plano, Principal principal) {
        Optional<Usuario> usuario = usuarioRepository.findById(plano.getUsuario().getIdUsuario());
        Optional<Componente> componente = componenteRepository.findById(plano.getComponente().getId());

        if (usuario.isPresent() && componente.isPresent()) {
            plano.setUsuario(usuario.get());
            plano.setComponente(componente.get());
            Plano savedPlano = planoRepository.save(plano);
            return new ResponseEntity<>(savedPlano, HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/plano/users")
    public List<Plano> getPlanos(Principal principal) {
        String username = principal.getName();
        Usuario usuario = usuarioRepository.findByNombreUsuario(username).get();
        return planoRepository.findByUsuario(usuario);
    }
}

