/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion4.dam;

import java.util.Scanner;

/**
 *
 * @author Portatil
 */
public class teclado {

     public static char leer_char(String cadena) {
        char i = ' ';
        String aux;
        System.out.println(cadena);
        try {
            Scanner lectura = new Scanner(System.in);
            aux = lectura.nextLine();
            i=aux.charAt(0);
        } catch (Exception e) {
            System.err.println("No me has introducido un char. Por favor , "
                    + "vuelve a intentarlo");
            leer_entero(cadena);
        }
        return (i);
    }
     
     
    public static int leer_entero(String cadena) {
        int i = 0;
        System.out.println(cadena);
        try {
            Scanner lectura = new Scanner(System.in);
            i = lectura.nextInt();
        } catch (Exception e) {
            System.err.println("No me has introducido un número. Por favor , "
                    + "vuelve a intentarlo");
            leer_entero(cadena);
        }
        return (i);
    }
    
        public static float leer_float(String cadena) {
        float i = 0;
        System.out.println(cadena);
        try {
            Scanner lectura = new Scanner(System.in);
            i = lectura.nextFloat();
        } catch (Exception e) {
            System.err.println("No me has introducido un número. Por favor , "
                    + "vuelve a intentarlo");
            leer_float(cadena);
        }
        return (i);
    }
    
    public static String leer_cadena(String cadena) {
        String cad = "";
        System.out.println(cadena);
        try {
            Scanner lectura = new Scanner(System.in);
            cad = lectura.nextLine();
        } catch (Exception e) {
            System.err.println("No me has introducido una cadena. Por favor , "
                    + "vuelve a intentarlo");
            leer_cadena(cadena);
        }
        return (cad);
    }
}
