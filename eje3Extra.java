/*
 *Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.
 */
package Guia5;

import java.util.Scanner;

public class eje3Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimenson del vector");
        int n = leer.nextInt();
        int[] vector;
        vector = llenarvector(n);
        imprimirvector(n, vector);

    }

    public static int[] llenarvector(int n) {
        int[] vector1 = new int[n];

        for (int i = 0; i < n; i++) {

            vector1[i] = (int) (Math.random() * 10);

        }
        return vector1;
    }

    public static void imprimirvector(int n, int vector[]) {
        for (int i = 0; i < n; i++) {
            System.out.print("[ " + vector[i] + " ]");

        }
        System.out.println("");
    }

}


