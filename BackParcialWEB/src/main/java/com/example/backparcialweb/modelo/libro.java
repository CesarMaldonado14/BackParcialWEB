package com.example.backparcialweb.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLM;
    private String titulo;
    private String referencia;
    private String autor;
    private String precio;
    private String ubicacion;

    //-----------------------------------------------G&S
    public void setId(Long id) {
        this.idLM = id;
    }

    public Long getId() {
        return idLM;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    //-----------------------------------------------G&S



}
