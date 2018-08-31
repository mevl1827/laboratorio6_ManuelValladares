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
public class USUARIO {
    private String user;
    private String contra;

    public USUARIO() {
    }

    public USUARIO(String user, String contra) {
        this.user = user;
        this.contra = contra;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "USUARIO{" + "user=" + user + ", contra=" + contra + '}';
    }
    
}
