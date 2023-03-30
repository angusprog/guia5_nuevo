/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en
una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de 
las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().

 */
package Guia5;

import java.util.Scanner;

public class eje6Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        String strnum;

        String[][] matriz = new String[20][20];//convertir la matriz a string
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                num = (int) (Math.random() * 10);

                strnum = Integer.toString(num);

                matriz[i][j] = strnum;
            }
        }

        String[] palabras = new String[5];

        for (int j = 0; j < 5; j++) {

            do {
                System.out.println("ingrese 5 palabras de maximo 5 caracteres");
                palabras[j] = leer.nextLine();

            } while ((palabras[j].length() < 3) || (palabras[j].length() > 5));

        }
        for (int j = 0; j < 5; j++) {
            System.out.print("[" + palabras[j] + "]");
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                 matriz[(int)(Math.random() * 19)][j]= palabras[i];
                    
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ matriz[i][j] + "]");
            }System.out.println(" ");
        }

    }

}
