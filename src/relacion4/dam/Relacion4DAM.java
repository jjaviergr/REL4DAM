/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacion4.dam;

/**
 * Definir un array de cinco números enteros y hallar su suma
 *
 * @author Portatil
 */
public class Relacion4DAM {

    public static void ejemplo() {

        //1º DEclaracion estatica de un array
        //int[] v={1,2,3,4,5};
        //1º Declaración dinamica de un array
        int[] v = new int[5];
        v[0] = 1;
        v[1] = 2;
        v[3] = 3; // Esto es una manera de inicializar .2º Cargar los datos

        for (int i = 0; i < v.length; i++) // Esto mete valores aleatorios al array.
        {
            v[i] = (int) Math.round(100 * (Math.random()));
            System.out.println(v[i]);
        }

    }

    /**
     * 1. Un programa que pida al usuario 4 números, los memorice (utilizando un
     * array), calcule su media aritmética y después muestre en pantalla la
     * media y los datos tecleados.
     */
    public static void Ejercicio1() {

        int[] v = new int[4];
        for (int i = 0; i < 4; i++) {
            v[i] = teclado.leer_entero("Mete un dato :");
        }
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma = suma + v[i];
        }
        float media = (float) suma / v.length;
        System.out.println("El contenido del array es :");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println("\nSuma es : " + suma + " La media es :" + media);
    }

    /**
     * Un programa que pida al usuario 5 números reales y luego los muestre en
     * el orden contrario al que se introdujeron.
     */
    public static void Ejercicio2() {

        float[] v = new float[5];
        for (int i = 0; i < v.length; i++) {

            v[i] = teclado.leer_float("Mete un dato :");
        }
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
    }

    public static void Imprime_Array_int(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void Imprime_Array_str(String[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    /**
     * 10. Un programa que prepare espacio para un máximo de 10 nombres. Deberá
     * mostrar al usuario un menú que le permita realizar las siguientes
     * operaciones: a. Anadir un dato al final de los ya existentes.
     *
     * b. Insertar un dato en una cierta posición (los que queden detrás deberán
     * desplazarse "a la derecha" para dejarle hueco; por ejemplo, si el array
     * contiene "hola", "adios" y se pide insertar "bien" en la segunda
     * posición, el array pasara a contener "hola", "bien", "adios".
     *
     * c. Borrar el dato que hay en una cierta posición (los que estaban detrás
     * deberán desplazarse "a la izquierda" para que no haya huecos; por
     * ejemplo, si el array contiene "hola", "bien", "adios" y se pide borrar el
     * dato de la segunda posición, el array pasara a contener "hola", "adios"
     * d. Mostrar los datos que contiene el array. e. Salir del programa
     */
    public static void Ejercicio100() {
        String opcion;
        String marca_borrado = "_";
        String[] Astr = new String[10]; // instanciación
        String dato = "";
        int pos_ult_borrado;
        int pos = Astr.length - 1;
        //inicialización
        for (int i = 0; i < Astr.length; i++) {
            Astr[i] = marca_borrado;
        }
        //////////////////
        do {
            System.out.println(" ");
            imprime("a");
            imprime("b");
            imprime("c");
            imprime("d");
            imprime("e");
            opcion = teclado.leer_cadena("Escoge una opcion (e para salir):");
            switch (opcion) {
                case "a":
                    //interpretación n1 - puedo suponer que es el final del array
                    //interpretacion n2 - insertar en ultima posicion libre mas cercana del final
                    //interpretacion n3 - ¿puede tener huecos o elementos libres intermedios?

                    // asumimos interpretacion n2.
                    //1º hago bucle que busque la ultima pos insertada, empiezo por el final.
                    dato = teclado.leer_cadena("Introduceme una dato :");
                    pos = Astr.length - 1;
                    while (Astr[pos].equals("_") && (pos != 0)) {
                        pos--;
                    }
                    //no me puedo pasar del final que es length -1
                    //si pos es 0 tengo que comprobar si pos esta libre.

                    if (pos == Astr.length - 1) {
                        System.out.println("No hay sitio");
                    } else {
                        if (pos == 0) {
                            if (Astr[pos].equals("_")) {
                                Astr[pos] = dato;
                            } else {
                                Astr[pos + 1] = dato;
                            }
                        } else {
                            Astr[pos + 1] = dato;
                        }
                    }

                    Imprime_Array_str(Astr);
                    break;
                case "b":
                    dato = teclado.leer_cadena("Introduceme una dato :");
                    do {
                        pos = teclado.leer_entero("Introduce una posición :");

                    } while ((pos < 0) || (pos >= Astr.length));
//                     String[] Astr={"0","1","2","3","_","5","6","7","8","9"};
//                     int pos=1;
//                     String dato="z";
//                     int pos_ult_borrado;
                    //cuento cuantas posiciones libres tengo
                    int contador = 0,
                     i = pos;
                    while (i < Astr.length) {

                        if (Astr[i].equals("_")) {
                            contador++;
                        }
                        i++;
                    }
                    if (contador == 0) {
                        System.out.println("No puedes insertar, no hay sitio a la derecha");
                    } else {
                        //localizar posicion libre desde el final
                        i = Astr.length - 1;
                        pos_ult_borrado = 0;
                        while (i > pos) {
                            if (Astr[i].equals("_")) {
                                pos_ult_borrado = i;
                            }
                            i--;
                        }
                        //muevo los datos a la derecha e inserto.
                        for (int j = pos_ult_borrado; j > pos; j--) {
                            // 1,2,3,b --a en pos 2 ; 
                            Astr[j] = Astr[j - 1];
                        }
                        Astr[pos] = dato;
                    }
                    Imprime_Array_str(Astr);
                    break;
                case "c":
                    /**
                     * c. Borrar el dato que hay en una cierta posición (los que
                     * estaban detrás deberán desplazarse "a la izquierda" para
                     * que no haya huecos; por ejemplo, si el array contiene
                     * "hola", "bien", "adios" y se pide borrar el dato de la
                     * segunda posición, el array pasara a contener "hola",
                     * "adios"
                     */

                    do {
                        pos = teclado.leer_entero("Introduce una posición para borrar:");

                    } while ((pos < 0) || (pos >= Astr.length));
//                   String[] Astr1={"0","1","2","3","4","5","6","7","8","9"}; 
//                   pos=2;
                    Astr[pos] = "_";
                    //0,1,,3,4,5,6,7,8,9
                    //0,1,3,4,5,6,7,8,9,9
                    for (int j = pos; j < Astr.length - 1; j++) {
                        Astr[j] = Astr[j + 1];
                    }
                    Astr[Astr.length - 1] = "_";
                    Imprime_Array_str(Astr);
                    break;
                case "d":
                    Imprime_Array_str(Astr);
                    break;
                case "e":
                    break;
                default:
                    break;
            }

        } while (!opcion.equalsIgnoreCase("e"));
    }

    /**
     * Un programa que pida al usuario 10 números enteros y calcule (y muestre)
     * cual es el mayor de ellos.
     */
    public static void Ejercicio3() {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {

            v[i] = teclado.leer_entero("Mete un dato :");
        }
        int mayor = 0;
        for (int i = 0; i < v.length; i++) {

            if (v[i] > mayor) {
                mayor = v[i];
            }
        }
        Imprime_Array_int(v);
        System.out.println("\nEl número mayor es :" + mayor);
    }

    /**
     * 4. Un programa que almacene en un array el número de días que tiene cada
     * mes (supondremos que es un año no bisiesto), pida al usuario que le
     * indique un mes (1=enero, 12=diciembre) y muestre en pantalla el numero de
     * días que tiene ese mes.
     */
    public static void Ejercicio4() {
        int[] v = {30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        int n_mes;
        do {
            n_mes = teclado.leer_entero("Mete un dato (1-12):");
        } while ((n_mes < 1) || (n_mes > 12));
        System.out.println("El número de dias es :" + v[n_mes - 1]);
    }

    /**
     * 5. Un programa que almacene en un array el número de días que tiene cada
     * mes (año no bisiesto), pida al usuario que le indique un mes (ej. 2 para
     * febrero) y un día (ej. El día 15) y diga que numero de día es dentro del
     * año (por ejemplo, el 15 de febrero seria el día número 46, el 31 de
     * diciembre seria el día 365).
     */
    public static void Ejercicio5() {
        int[] v = {30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        int n_mes;
        do {
            n_mes = teclado.leer_entero("Mete un dato (1-12):");
        } while ((n_mes < 1) || (n_mes > 12));
        int n_dia;

        do {
            n_dia = teclado.leer_entero("Mete un dato (1-30):");
        } while ((n_dia < 1) || (n_dia > 31));
        int suma = 0;
        if (n_mes == 1) {
            suma = n_dia;
        } else {
            for (int i = 0; i < n_mes - 1; i++) {
                suma = suma + v[i];
            }
            suma = suma + n_dia;
        }
        System.out.println("El número de días que han pasado es :" + suma);
    }

    public static void imprime(int i) {
        System.out.println(i);
    }

    public static void imprime(String i) {
        System.out.println(i);
    }

    /**
     * Un programa que le pida al usuario seis números, los almacene en un array
     * y calcule la suma de todos los elementos.
     */
    public static void Ejercicio6() {
        int[] v = new int[6];
        for (int i = 0; i < v.length; i++) {

            v[i] = teclado.leer_entero("Mete un dato :");
        }
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma = suma + v[i];
        }
        imprime(suma);
    }

    /**
     * 7.A partir del programa propuesto, que almacenaba en un array el número
     * de días que tiene cada mes, crear otro que pida al usuario que le indique
     * la fecha, detallando el día (1 al 31) y el mes (1=enero, 12=diciembre),
     * como respuesta muestre en pantalla el numero de días que quedan hasta
     * final de año.
     */
    public static void Ejercicio7() {
        int[] v = {30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        int n_mes;
        do {
            n_mes = teclado.leer_entero("Mete un dato (1-12):");
        } while ((n_mes < 1) || (n_mes > 12));
        int n_dia;

        do {
            n_dia = teclado.leer_entero("Mete un dato (1-30):");
        } while ((n_dia < 1) || (n_dia > 31));

        int suma = 0;
        if (n_mes == 12) {
            suma = 30 - n_dia;
        } else {
            // 30-nov
            for (int i = n_mes; i < v.length; i++) {
                suma = suma + v[i];
            }
            suma = suma + 30 - n_dia;
        }
        System.out.println("El número de días que faltan hasta diciembre es :" + suma);
    }

    /**
     * . Un programa que almacene en un array el número de días que tiene cada
     * mes (supondremos que es un año no bisiesto), pida al usuario que le
     * indique un mes (1=enero, 12=diciembre) y muestre en pantalla el numero de
     * días que tiene ese mes.
     */
    public static void Ejercicio8() {
        int[] v = {30, 28, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        int n_mes;
        do {
            n_mes = teclado.leer_entero("Mete un dato (1-12):");
        } while ((n_mes < 1) || (n_mes > 12));
        System.out.println("El número de dias es :" + v[(n_mes - 1)]);
    }

    /**
     * Un programa que pida al usuario 10 números, calcule su media y luego
     * muestre aquellos números que están por encima de la media.
     */
    public static void Ejercicio77() {
        int[] v = new int[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = teclado.leer_entero("Mete un dato :");
        }
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma = suma + v[i];
        }
        float media = (float) suma / v.length;
        System.out.println("La media es :" + media + " y estos números son mayores que ella :\n");
        for (int i = 0; i < v.length; i++) {
            if (v[i] > media) {
                System.out.print(v[i] + " ");
            }
        }

//        System.out.println("El contenido del array es :");
    }

    /**
     * Ejercicio 88.Un programa que pida 10 nombres y los memorice (pista: esta
     * vez se trata de un array de "string"). Después deberá pedir que se teclee
     * un nombre y el programa nos dirá si este se encuentra o no entre los 10
     * que se han tecleado antes. Volverá a pedir otro nombre y a decir si se
     * encuentra entre ellos, y así sucesivamente hasta que se teclee "fin".
     *
     */
    public static void Ejercicio88() {
//        String a[] = new String[10];
        String nombre_buscar = "";
        boolean encontrado = false;
        int contador;
//        for (int i = 0; i < 10; i++) {
//            a[i] = teclado.leer_cadena("Mete un nombre :");
//        }
        String a[] = {"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "oo", "uu"};
        do {
            nombre_buscar = teclado.leer_cadena("Introduce un nombre para buscar o escribe 'fin' para salir :");
            contador = 0;
            encontrado = false;
            while ((!encontrado) && (contador < a.length)) {
                if (nombre_buscar.equalsIgnoreCase(a[contador])) {
                    encontrado = true;
                }
                contador++;
            }
            if (encontrado) {
                System.out.println("Encontrado");
            } else {
                System.out.println("No encontrado");

            }
        } while (nombre_buscar.compareToIgnoreCase("final") != 0);
    }

    /**
     * Un programa que prepare espacio para un máximo de 100 nombres. El usuario
     * deberá ir introduciendo un nombre cada vez, hasta que se pulse Intro sin
     * teclear nada, momento en el que dejaran de pedirse más nombres y se
     * mostrara en pantalla la lista de los nombres que se han introducido.
     */
    public static void Ejercicio99() {
        int longitud = 10; // se puede poner 100
        String[] A_nombres = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            A_nombres[i] = teclado.leer_cadena("Pon un nombre :");
        }
        Imprime_Array_str(A_nombres);
    }

    /**
     * 110. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden:
     * el primero, el último, el segundo, el penúltimo, el tercero, etc.
     */
    public static void Ejercicio110() {
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = teclado.leer_entero("Introduce número :");
        }
//        int[] v={0,1,2,3,4,5,6,7,8,9};
        System.out.println("primero :" + v[0]);
        System.out.println("ultimo :" + v[v.length - 1]);
        System.out.println("segundo :" + v[1]);
        System.out.println("penúltimo :" + v[v.length - 2]);
        System.out.println("tercero :" + v[2]);

    }

    /**
     * 120. Leer por teclado dos arrays de 10 números enteros y mezclarlas en un
     * tercero de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
     *
     */
    public static void Ejercicio120() {
        int[] v=new int[10];
        int[] h=new int[10];
        for (int i=0;i<10;i++)
        {
            v[i]=teclado.leer_entero("Introduce número para Array A :");
            h[i]=teclado.leer_entero("Introduce número para Array B :");
        }
//        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] h = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] z = new int[20];
        int j = 0, k = 0, contador = 0;

        for (int i = 0; i < z.length; i++) {
            if (i % 2 == 0) {
                z[i] = v[contador];
                contador++;
            }
        }
        contador=0;
        for (int i = 0; i < z.length; i++) {
             if (i % 2 != 0) {
                z[i] = h[contador];
                contador++;
             }
             
        }

        Imprime_Array_int(z);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ejemplo();
    }

}
