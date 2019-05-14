/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.creadorvideojuegos;

/**
 * Representa un videojuego
 * @author ARN
 */
public class Videojuego {
    
    // Atributos
    private String titulo;
    private String genero;
    private int anyoLanzamiento;
    private String plataforma; // ps4, xbox , ...
    private float precio; // 14.3f, 164.23f , 21.55f
    private boolean esViolento; // true o false
    

    // Constructores
   
    /**
     * 
     * @param titulo Título del videojuego
     * @param genero Tipo de juego
     * @param anyoLanzamiento Año de lanzamiento
     * @param precio El precio de venta
     */
    
    public Videojuego(String titulo, String genero, int anyoLanzamiento, float precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEsViolento() {
        return esViolento;
    }

    public void setEsViolento(boolean esViolento) {
        this.esViolento = esViolento;
    }

    
    // Métodos

    /**
     * Muetra la información del videojuego por la consola 
     */
    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Precio: " + precio);
    }

    
    
    
    
}
