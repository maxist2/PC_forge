package com.project.Pcforge.User.Service;

import com.project.Pcforge.User.Repository.UserRepository;
import com.project.Pcforge.User.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Usuario buscarPorNombreUsuario(String nombreUsuario) {
        return userRepository.findByNombreUsuario(nombreUsuario).get();
    }

    @Override
    public Usuario buscarPorCorreoUsuario(String correoUsuario) {
        return userRepository.findByCorreoUsuario(correoUsuario);
    }

    @Override
    public Usuario validateUser(String user, String pwd) {
        return userRepository.findByNombreUsuarioAndPasswordUsuario(user, pwd);
    }
}