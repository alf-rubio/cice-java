/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.pruebas;

/**
 *
 * @author cice
 */
public class Pruebas {
    
    public static void main(String[] args) {
        
        String s = new String("85");
        int i = 85;
        float f = 85.7f;
        boolean b = true;
        
        // Conversiones de tipo - castear - hacer un cast - hacer un casteo - hacer un casting
        // conversión implícita ( automática )
        f = i; // 85.0f
        System.out.println(f);
        
        i = (int) f;
        System.out.println(i);
        
        // Wraper para cada tipo básico
        // el método parseInt está declarado como estático, no requiere una instancia de la clase
        // también se puede llamar sobre una instancia i.parseInt(5)
        i = Integer.parseInt(s);
        System.out.println(i);
        
        s = Boolean.toString(b);
        
        // la operación suma está sobrecargada, en este caso suma concatena cadenas de caracteres
        String s2 = i + "$";
        System.out.println(s2);
        
        
    }
    
}
