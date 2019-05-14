/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.validador;

/**
 * Representa un usuario de nuestro sistema de seguridad
 * @author ARN
 */
public class Credencial {
    
    private String email;
    private String password;

    /**
     * Constructor con la contraseña por defecto
     * Se le asigna contraseña 'pendiente'
     * @param email Identificador de usuario
     */
    public Credencial(String email) {
        this.email = email;
        this.password = "pendiente";
    }

    /**
     * Constructor con todos los datos de la credencial
     * @param email Identificador de usuario
     * @param password Contraseña de usuario
     */
    public Credencial(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
