package Guia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author claud
 */
public class ejercicio1_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      int vector[] = new int[101]; // Le ponemos la dimension al vector 
        // Puedo asignar valores de esta manera
        //vector[0] = 1;
        // Asigno valores mediante el for
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
        // Muestro el vector
        for (int i = 100; i > 0; i--) {
            System.out.print("[" + vector[i] + "]"  + " , ");
        }
    }
    
}
