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
public class SERIE {
    private String nombre;
    private String duracion;
    private String categorias;
    private String actores;
    private String temporadas;
    private String productora;
    private String idioma;
    private String doblaje;
    private String subs;

    public SERIE() {
    }

    
    public SERIE(String nombre, String duracion, String categorias, String actores, String temporadas, String productora, String idioma, String doblaje, String subs) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categorias = categorias;
        this.actores = actores;
        this.temporadas = temporadas;
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

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
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
        return nombre ;
    }
    
    
}
