package com.project.Pcforge.User.Repository;

import com.project.Pcforge.User.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    Usuario findByCorreoUsuario(String correoUsuario);
    Usuario findByNombreUsuarioAndPasswordUsuario(String user, String pwd);
}