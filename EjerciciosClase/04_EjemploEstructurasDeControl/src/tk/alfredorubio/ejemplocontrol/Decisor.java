/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.alfredorubio.ejemplocontrol;

/**
 *
 * @author cice
 */
public class Decisor {

    private static final int CAFE_SOLO = 1;
    private static final int CAFE_CON_LECHE = 2;
    private static final int TE = 3;
    private static final int POLEO = 4;

    public void ifSimple() {

        int edad = 15;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }

    public void ifElseSimple() {
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

    }

    public void ifElseifSimple() {

        int edad = 15;
        if (edad >= 65) {
            System.out.println("Estás jubilado");
        } else if (edad >= 16) {
            System.out.println("Estás en edad laboral");
        } else {
            System.out.println("Disfruta de tu ocio");
        }

    }

    public void switchNormal() {

        int eleccion = CAFE_CON_LECHE;

        switch (eleccion) {

            case CAFE_SOLO:
                System.out.println("Café solo");
                break;
            case CAFE_CON_LECHE:
                System.out.println("Café con leche");
                break;
            case TE:
                System.out.println("Té");
                break;
            case POLEO:
                System.out.println("Poleo");
                break;
            default:
                System.out.println("No sabes los que quieres");

        }

    }

    public void forSimple() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hola" + i);
        }
    }

    public void forAlReves() {

        for (int i = 10; i > 0; i--) {
            System.out.println("Adios " + i);
        }
    }

    public void forConBreak() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Hola");
        }

    }

    public void forConContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Hola");
        }

    }

    public void whileSimple() {

        int contador = 0;
        while (contador < 1000) {
            System.out.println("Saludo");
            contador++;
        }
    }

    
    public void doWhileSimple(){
    
        int contador = 0;
        
        do {
            System.out.println("Saludo");
            contador++;
        } while (contador < 1000);
    }
    
    
    
    
}
