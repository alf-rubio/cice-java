/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.validadorgraficosimple;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tk.alfredorubio.validadorgraficosimple.gui.JFVentanaValidacion;
import tk.alfredorubio.validadorgraficosimple.model.Credencial;
import tk.alfredorubio.validadorgraficosimple.model.GestorCredenciales;
import tk.alfredorubio.validadorgraficosimple.model.PasswordErroneaException;
import tk.alfredorubio.validadorgraficosimple.model.UsuarioErroneoException;

/**
 *
 * @author cice
 */
public class Ejecutador {
    
    
    public static void main(String[] args) {
        
        new JFVentanaValidacion().setVisible(true);
        
    }
    /*
    
    public static void main(String[] args) {
        
        boolean correcta = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Email: ");
        String email = sc.nextLine();
        
        System.out.println("Contraseña: ");
        String password = sc.nextLine();

        try {
    
            Credencial c = new Credencial(email, password);
            GestorCredenciales gestor = new GestorCredenciales();    

            correcta = gestor.validarCredencial(c);
            
            if (correcta) {
               System.err.println("Usuario válido");
           } else {
               System.err.println("Usuario no válido");
           }
            
        } catch (UsuarioErroneoException ex) {
            System.err.println("Email vacio");
        } catch (PasswordErroneaException ex) {
            System.err.println("Contraseña muy corta");
        } 
        
        
        
    }
*/
    
}
