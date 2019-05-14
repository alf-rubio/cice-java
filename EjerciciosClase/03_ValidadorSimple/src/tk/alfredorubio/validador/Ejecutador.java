/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.validador;

/**
 *
 * @author ARN
 */
public class Ejecutador {
    
    public static void main(String[] args) {

        Credencial credencial1 = new Credencial("f@cice.com", "12345678");
        GestorCredenciales gesCre = new GestorCredenciales();
        
        boolean credencialValida = gesCre.validarCredencial(credencial1);
        
        if (credencialValida) {
            System.out.println("Credencial válida");
        } else {
            System.out.println("Credencial no válida");
        }
        
        /*
        boolean credencialCorrecta = gesCre.validarUsuario(credencial1);

        if (credencialCorrecta) {
            System.out.println("Credencial correcta");
        } else {
            System.out.println("Impostor");
        }
        */
    }
    
}
