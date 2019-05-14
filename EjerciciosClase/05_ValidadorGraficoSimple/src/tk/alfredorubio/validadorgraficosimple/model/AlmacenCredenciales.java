/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.validadorgraficosimple.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class AlmacenCredenciales {
    
    public Credencial getCredencial(Credencial c){
        
        Credencial fakeCredencial = null;
        
        try {
            fakeCredencial = new Credencial("f@gmail.com", "12345");
            
        } catch (UsuarioErroneoException ex) {
            System.out.println("Error de email");
        } catch (PasswordErroneaException ex) {
            System.out.println("Error de password");
        }
        return fakeCredencial;
        
    }
    
}
