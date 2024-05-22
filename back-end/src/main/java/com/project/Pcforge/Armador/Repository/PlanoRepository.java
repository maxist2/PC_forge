package com.project.Pcforge.Armador.Repository;


import com.project.Pcforge.Armador.Entity.Plano;
import com.project.Pcforge.User.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanoRepository extends JpaRepository<Plano, Long> {
    List<Plano> findByUsuario(Usuario idUsuario);
}
