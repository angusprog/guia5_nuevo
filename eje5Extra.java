/*
 *Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
         int n,m ,cont=0;
        System.out.println("ingrese las F y C");
        int [][] matriz= new int [n=leer.nextInt()][m=leer.nextInt()];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int) (Math.random()*10);
                cont+=matriz[i][j];  
            }
        }
        
        System.out.println("la suma de los elementos es "+ cont);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[ "+matriz[i][j]+" ]");
                
                
                
            }
            System.out.println(""); 
        }
    }
    
}
    
    

