/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_manuelvalladares;

/**
 *
 * @author mevl1
 */
public class PELICULA {
    private String nombre;
    private String duracion;
    private String categoria;
    private String actores;
    private String director;
    private String productora;
    private  String idioma;
    private String doblaje;
    private String subs;

    public PELICULA() {
    }

    public PELICULA(String nombre, String duracion, String categoria, String actores, String director, String productora, String idioma, String doblaje, String subs) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
        this.actores = actores;
        this.director = director;
        this.productora = productora;
        this.idioma = idioma;
        this.doblaje = doblaje;
        this.subs = subs;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDoblaje() {
        return doblaje;
    }

    public void setDoblaje(String doblaje) {
        this.doblaje = doblaje;
    }

    public String getSubs() {
        return subs;
    }

    public void setSubs(String subs) {
        this.subs = subs;
    }

    @Override
    public String toString() {
        return  nombre ;
    }
    
}
