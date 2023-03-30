/*
 * Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la 
sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba como parámetro 
el valor de “n” y que calcule la serie hasta llegar a ese valor.

 */
package Guia5;

import java.util.Scanner;

public class eje7Extra_fobonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de términos de la sucesión de Fibonacci que desea calcular: ");

        int n = sc.nextInt();

        int[] fibo = new int[n]; // Creamos un arreglo vacío para almacenar los valores de Fibonacci

        // calcular y almacenar los valores de Fibonacci
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                fibo[i] = 1; // El primer y segundo término de la sucesión son 1
            } else {
                fibo[i] = fibo[i - 1] + fibo[i - 2]; // Calculamos el valor de Fibonacci para el término actual
            }
        }

        // Imprimimos los valores de Fibonacci almacenados en el arreglo
        System.out.println("La sucesión de Fibonacci de " + n + " términos es:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
            
        }System.out.println(" ");
    }
}
