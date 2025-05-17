package com.tecsup.evaluacion02srping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codEspec;

    private String descripcionEsp;

    public Especialidad() { }

    public Especialidad(Integer codEspec, String descripcionEsp) {
        this.codEspec = codEspec;
        this.descripcionEsp = descripcionEsp;
    }

    public Integer getCodEspec() {
        return codEspec;
    }

    public void setCodEspec(Integer codEspec) {
        this.codEspec = codEspec;
    }

    public String getDescripcionEsp() {
        return descripcionEsp;
    }

    public void setDescripcionEsp(String descripcionEsp) {
        this.descripcionEsp = descripcionEsp;
    }
}