/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.validador;

/**
 * Valida las credenciales de un usuario en el sistema
 * 
 * @author ARN
 */
public class GestorCredenciales {
    
    private static final String EMAIL = "f@cice.com";
    private static final String PASSWORD = "12345";
    private static final int MIN_SIZE_EMAIL = 5;
    private static final int MIN_SIZE_PASSWORD = 8;
    
    /**
     * Valida las credenciales de un usuario
     * 
     * @param usuarioAValidar
     * @return true si el usuario y la contraseña son correctos
     * 
     */
    public boolean validarUsuario(Credencial usuarioAValidar) {
    
        boolean correcto = false;
        
        if (usuarioAValidar.getEmail().equals(EMAIL) && usuarioAValidar.getPassword().equals(PASSWORD)) {
            correcto = true;
        }
        
        return correcto;
    
    }
    
    
    public boolean validarCredencial(Credencial credencial) {
    
        boolean correcto = false;
        boolean emailCorrecto = false;
        
        /* condiciones a cumplir:
         1. email que contenga una arroba y un punto
         2. y email que contenga como mínimo MIN_SIZE_EMAIL caracteres
         3. contraseña mínimo 8 caracteres
         4. o contiene la palabra 'apple'
        */
        
        if (credencial.getEmail().contains("@") &&
            credencial.getEmail().contains(".") && 
            credencial.getEmail().length() >= MIN_SIZE_EMAIL) {
            emailCorrecto = true;
        }
        
        if (emailCorrecto) {

            if (credencial.getPassword().toUpperCase().contains("APPLE")   ||
                credencial.getPassword().length() >= MIN_SIZE_PASSWORD) {
                correcto = true;
            }

        }
        
        return correcto;
    }
    
}
