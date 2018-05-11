/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoenlinea;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author texch_000
 */
public class Estudiante extends Cliente implements Serializable{
    private String usuario;
    private String contrasena;

    public Estudiante(String usuario, String contrasena, String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String genero, Date nacimiento) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp,genero, nacimiento);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
