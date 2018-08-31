/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_manuelvalladares;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mevl1
 */
public class ADMIN {
    private ArrayList<PELICULA>peliculas=new ArrayList();
      private File archivo = null;

    public ADMIN() {
    }
       public ADMIN(String path) {
        archivo=new File(path);
    }

    public ArrayList<PELICULA> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<PELICULA> peliculas) {
        this.peliculas = peliculas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ADMIN{" + "peliculas=" + peliculas + ", archivo=" + archivo + '}';
    }
  //metodos de administracion
    public void escribirArchivo() throws IOException{
    FileWriter fw=null;
    BufferedWriter bw=null;
        try {
            fw=new FileWriter(archivo,true);
            bw=new BufferedWriter(fw);
            for (PELICULA t : peliculas) {
                bw.write(t.getNombre()+",");
                bw.write(t.getDuracion()+",");
                bw.write(t.getCategoria()+",");
                bw.write(t.getActores()+",");
                bw.write(t.getDirector()+",");
                bw.write(t.getProductora()+",");
                bw.write(t.getIdioma()+",");
                bw.write(t.getDoblaje()+",");
                bw.write(t.getSubs()+";");
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo(){
        Scanner sc=null;
        Scanner sc2=null;
        if(archivo.exists()){
        peliculas=new ArrayList();
        try {
            sc=new Scanner(archivo);
             sc2=null;
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                peliculas.add(new PELICULA(sc2.next(),sc2.next(),sc2.next(),sc2.next(),sc2.next(),sc2.next(),sc2.next(),sc2.next(),sc2.next()));
            }
        } catch (Exception e) {
            
        }
        finally {
            sc.close();
        }
    }
    }
}
