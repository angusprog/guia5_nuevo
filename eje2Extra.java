/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N : ");
        n = leerDato(leer);
        int v1[] = new int[n], v2[] = new int[n];
        cargarVector(v1);
        cargarVector(v2);
        mostrarVector(v1);
        mostrarVector(v2);
        System.out.println(" ");
        System.out.println("Los vectores son iguales ? " + (iguales(v1, v2)));
    }

    static void cargarVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (10 * Math.random());
        }
    }

    static void mostrarVector(int vector[]) {
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" | " + vector[i]+ " | ");
        }
    }

    public static int leerDato(Scanner entrada) {
        int num = entrada.nextInt();
        return num;
    }

    public static boolean iguales(int[] v1, int[] v2) {
        boolean igual = true;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                igual = false;
                break;
            }
        }
        return igual;
    }
}
