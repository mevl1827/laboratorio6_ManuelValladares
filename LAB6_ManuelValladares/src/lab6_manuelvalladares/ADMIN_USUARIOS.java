/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_manuelvalladares;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mevl1
 */
public class ADMIN_USUARIOS {
    private ArrayList <USUARIO> usuarios=new ArrayList();
    private File archivo =null;
      public ADMIN_USUARIOS(String path) {
        archivo=new File(path);
    }

    public ADMIN_USUARIOS() {
    }

    public ArrayList<USUARIO> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<USUARIO> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ADMIN_USUARIOS{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }
       public void cargarArchivo(){
        Scanner sc=null;
        Scanner sc2=null;
        if(archivo.exists()){
        usuarios=new ArrayList();
        try {
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                usuarios.add(new USUARIO(sc.next(),sc.next()));
                
            }
        } catch (Exception e) {
            
        }
        finally {
            sc.close();
        }
    }
    }
    
}
