package com.project.Pcforge.Armador.Repository;


import com.project.Pcforge.Armador.Entity.Componente;
import com.project.Pcforge.Armador.Entity.TipoComponente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComponenteRepository extends JpaRepository<Componente, Long> {
    List<Componente> findByTipoComponente(TipoComponente tipoComponente);
    List<Componente> findByNombreComponente(String nombreComponente);
    List<Componente> findByCompatibilidadAndTipoComponente(String compatibilidad, TipoComponente tipoComponente);
}

