/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.creadorvideojuegos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class Ejecutador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
              
        ArrayList<Videojuego> listaJuegos = new ArrayList();
        
        // Lo podemos hacer sin especificar el tipo de objeto
        // ArrayList listaJuegos = new ArrayList();
        

        for (int i = 0; i < 3; i++) {
            
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            
            System.out.print("Año lanzamiento: ");
            int anyoLanzamiento = sc.nextInt();
            
            System.out.print("Precio: ");
            float precio = sc.nextFloat();
            sc.nextLine(); // borrar el buffer
            
            System.out.print("Género: ");
            String genero = sc.nextLine();
            
            Videojuego v = new Videojuego(titulo, genero, anyoLanzamiento, precio);
            
            listaJuegos.add(v);
            
        }
        
        sc.close();
      
        
        for (Videojuego vj : listaJuegos) {
            
            vj.mostrarInformacion();
                
        }
        
        
    }
}
