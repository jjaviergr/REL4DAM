/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion4.dam;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Portatil
 */
public class MenuInteractivo {

    public static void main(String[] args) {
        int op = 0;

        do {
            System.out.println("\n*************************************");
            for (int i = 1; i < 10; i++) {
                System.out.println(i+".Ejercicio " + i);
            }

            System.out.println("Pulsa el 0 para salir");
            System.out.println("Escoge una opcion :");
            Scanner var = new Scanner(System.in);
            String opcion = var.nextLine();
            try {
                op = Integer.parseInt(opcion);
            } catch (Exception e) {
                System.out.println("Debes meter un numero entero " + e.toString());
                main(null);
            }
            switch (op) {
                case 1:
                    Relacion4DAM.Ejercicio1();

                    break;

                case 2:
                    Relacion4DAM.Ejercicio2();
                    break;
                case 3:
                    Relacion4DAM.Ejercicio3();
                    break;
                case 4:
                    Relacion4DAM.Ejercicio4();
                    break;
                case 5:
                    Relacion4DAM.Ejercicio5();
                    break;
                case 6:
                    Relacion4DAM.Ejercicio6();
                    break;
                case 7:
                    Relacion4DAM.Ejercicio7();
                    break;
                case 8:
                    Relacion4DAM.Ejercicio8();
                    break;
                case 77:
                    Relacion4DAM.Ejercicio77();
                    break;
                case 88:
                    Relacion4DAM.Ejercicio88();
                    break;
                case 99:
                    Relacion4DAM.Ejercicio99();
                    break;
                case 100:
                    Relacion4DAM.Ejercicio100();
                    break;
                case 110:
                    Relacion4DAM.Ejercicio110();
                    break;
                case 120:
                    Relacion4DAM.Ejercicio120();
                    break;
//                case 16:
//                    Relacion4DAM.Ejercicio16();
//                    break;
//                case 17:
//                    Relacion4DAM.Ejercicio17();
//                    break;
//                case 18:
//                    Relacion4DAM.Ejercicio18();
//                    break;
//                case 19:
//                    Relacion4DAM.Ejercicio19();
//                    break;
//                case 20:
//                    Relacion4DAM.Ejercicio20();
//                    break;
//                case 21:
//                    Relacion4DAM.Ejercicio21();
//                    break;
//                case 22:
//                    Relacion4DAM.Ejercicio22();
//                    break;
//                case 23:
//                    Relacion4DAM.Ejercicio23();
//                    break;
                case 0:

                    break;
                default:
                    System.out.print("Ese número de ejercicio no esta");
            }
        } while (op != 0);
    }

}
