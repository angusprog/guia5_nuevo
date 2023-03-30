package Guia5;


//import static java.lang.Math.random;
import java.util.Random;

import java.util.Scanner;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
public class ejer4_tranpuesta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matriz = new int[4][4];

        // Llenamos la matriz con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100); // Generamos un número aleatorio entre 0 y 99
            }
        }

        // Mostramos la matriz original
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
            
        }
        System.out.println(" ");
        // Creamos la matriz traspuesta
        int[][] tran = new int[4][4];
        

        for (int q = 0; q < 4; q++) {
            for (int m = 0; m < 4; m++) {
                tran[m][q] = matriz[q][m];
            }
        }

        // Mostramos la matriz traspuesta
        for (int x = 0; x < 4; x++) {
            for (int p = 0; p < 4; p++) {
                System.out.print("[" + tran[x][p] + "]");
            }

            System.out.println("");
        }
    } 
}

