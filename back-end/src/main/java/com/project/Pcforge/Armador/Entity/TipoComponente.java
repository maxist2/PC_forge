package com.project.Pcforge.Armador.Entity;

import jakarta.persistence.*;
import lombok.Builder;



@Entity
@Builder
public class TipoComponente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String componentes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }
}
