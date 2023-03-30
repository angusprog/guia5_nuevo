/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n, suma = 0;
        int[] vector = new int[n = leer.nextInt()];
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese un numero");
            vector[i] = leer.nextInt();
            suma = vector[i] + suma;

        }

        System.out.println("la suma es " + suma);

    }

}
