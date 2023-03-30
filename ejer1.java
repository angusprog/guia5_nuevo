package Guia5;

import static java.lang.Math.random;
import java.util.Scanner;

/*
 * 

Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

 */

/**
 *
 * @author claud
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector");
        int n=leer.nextInt();
        int [] vector = new int [n];
        for (int i = 0; i < n-1; i++) {
            vector[i]=(int) (random()*100);
            
        }
        System.out.println("ingrese el numero a busca");
        int numb=leer.nextInt();
        int x=0;
        for (int i = 0; i < n-1; i++) {
            if (vector[i]==numb) {
               x++;
               
                System.out.println("el numero esta en la posicion " + i);
               
            }
           
        }
         System.out.println("el vector se repite " +x+ " veces");
    }
    
}
