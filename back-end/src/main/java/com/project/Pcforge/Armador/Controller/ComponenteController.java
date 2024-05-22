package com.project.Pcforge.Armador.Controller;


import com.project.Pcforge.Armador.Entity.Componente;
import com.project.Pcforge.Armador.Entity.TipoComponente;
import com.project.Pcforge.Armador.Repository.ComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/componentes")
public class ComponenteController {
    @Autowired
    private ComponenteRepository componenteRepository;

    @GetMapping("/tipo/{id}")
    public List<Componente> getComponentesByTipo(@PathVariable Long id) {
        TipoComponente tipo = TipoComponente.builder().id(id).build();
        return componenteRepository.findByTipoComponente(tipo);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Componente> getComponentesByNombre(@PathVariable String nombre) {
        return componenteRepository.findByNombreComponente(nombre);
    }

    @GetMapping("/procesadores/{placaBaseId}")
    public List<Componente> getProcesadoresByCompatibilidad(@PathVariable Long placaBaseId) {
        Componente placaBase = componenteRepository.findById(placaBaseId).orElse(null);

        if (placaBase != null) {
            String compatibilidad = placaBase.getCompatibilidad();
            return componenteRepository.findByCompatibilidadAndTipoComponente(compatibilidad, TipoComponente.builder().id(2L).build()); // 2L asumiendo que el id 2 corresponde a procesadores
        }

        return List.of();
    }
}

