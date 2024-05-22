package com.project.Pcforge.Armador.Controller;

import com.project.Pcforge.Armador.Entity.TipoComponente;
import com.project.Pcforge.Armador.Repository.TipoComponenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/tipos-componente")
public class TipoComponenteController {
    @Autowired
    private TipoComponenteRepository tipoComponenteRepository;

    @GetMapping
    public List<TipoComponente> getAllTiposComponente() {
        return tipoComponenteRepository.findAll();
    }
}
