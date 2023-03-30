package Guia5;



import java.util.Scanner;


/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
 */
/**
 *
 * @author claud
 */
public class ejer5_antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int[][] matA = {{2, -4, 4}, {-6, 6, 9}, {8, 10, -12}};

        
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matA[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int[][] matB = new int[3][3];
        for (int k = 0; k < 3; k++) {
            for (int r = 0; r < 3; r++) {
                matB[k][r] = -matA[k][r];
            }

        }
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {

                System.out.print("[" + matB[m][n] + "]");
            }
            System.out.println(" ");
        }
    }

}
