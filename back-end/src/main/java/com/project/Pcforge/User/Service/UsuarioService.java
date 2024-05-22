package com.project.Pcforge.User.Service;

import com.project.Pcforge.User.domain.Usuario;

public interface UsuarioService {
    Usuario buscarPorNombreUsuario(String nombreUsuario);
    Usuario buscarPorCorreoUsuario(String correoUsuario);
    Usuario validateUser(String user, String pwd);
}