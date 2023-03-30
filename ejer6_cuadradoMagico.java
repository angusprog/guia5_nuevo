package Guia5;

import java.util.Scanner;

/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus fila
, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado 
y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.
 */
/**
 * @author claud
 */
public class ejer6_cuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // boolean magico = verdadero;
        int[][] mat = new int[3][3];
        System.out.println("ingrese 9 numeros entre 1 y 9");

        for (int i = 0; i < 3; i++) { //cargamos la matriz
            for (int j = 0; j < 3; j++) {
                int num = leer.nextInt();

                if (num > 0 && num < 10) {
                    mat[i][j] = num;
                } else {
                    j = j - 1;
                }
            }
        }

        for (int k = 0; k < 3; k++) { //mostramos la matriz
            for (int l = 0; l < 3; l++) {
                System.out.print("[" + mat[k][l] + "]");

            }
            System.out.println(" ");
        }
        int sumaDiagonal = 0; //suma de la diagonal principal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiagonal = sumaDiagonal + mat[i][j];

                }
            }
        }
        System.out.println("la suma de la diagonal principal es: " + sumaDiagonal);

        int sumaDiagonal2 = 0; //suma de la diagonal secundaria
        for (int h = 0; h < 3; h++) {
            for (int v = 0; v < 3; v++) {
                if ((h + v) == 2) {
                    sumaDiagonal2 = sumaDiagonal2 + mat[h][v];
                }
            }
        }
        System.out.println("la suma de la diagonal secundaria es: " + sumaDiagonal2);
        if (sumaDiagonal == sumaDiagonal2){
            
            int suma = 0;
    
            for (int g = 0; g < 3; g++) {
              
            
            for (int p = 0; p < 3; p++) {
                suma = suma + mat[g][p];
                
            }
            System.out.println(" la suma de la fila es: " + suma);
            if (suma == sumaDiagonal){
                  suma=0;
            }else 
                
                System.out.println("la matriz no es magica");
            break;
            }
            
            int sumaCol =0;
            for (int g = 0; g < 3; g++) {
              
            
            for (int p = 0; p < 3; p++) {
                sumaCol = sumaCol + mat[p][g];
                
            }
                System.out.println(" la suma de la columna es: " + sumaCol);
            if (sumaCol == sumaDiagonal){
                  sumaCol=0;
            }else 
                
                System.out.println("la matriz no es magica");
            break;
            
    }
            System.out.println("La matriz es magica");   
    
        }
    }
}
     
         
