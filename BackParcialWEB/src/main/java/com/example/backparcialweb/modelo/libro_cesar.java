package com.example.backparcialweb.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class libro_cesar {

    private String titulo;
    private String referencia;
    private String autor;
    private Double precio;
    private String ubicacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public libro_cesar(String titulo, String referencia, String autor, Double precio, String ubicacion) {
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public libro_cesar(){
        this.titulo = null;
        this.referencia = null;
        this.autor = null;
        this.precio = 0.0;
        this.ubicacion = null;

    }

    public libro_cesar(Long idLM, String titulo, String referencia, String autor, double precio, String ubicacion) {

    }

    public libro_cesar(String titulo, String referencia, String autor, double precio, String ubicacion) {

    }


    //-----------------------------------------------G&S

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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    //-----------------------------------------------G&S

    @Override
    public String toString() {
        return "libro{" +
                "titulo='" + titulo + '\'' +
                ", referencia='" + referencia + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}
