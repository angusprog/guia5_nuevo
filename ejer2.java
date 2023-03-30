package Guia5;


import static java.lang.Math.random;
import java.util.Scanner;

/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
.
 */
/**
 *
 * @author claud
 */
public class ejer2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n = 0, d = 0, f = 0, g = 0, h = 0, k = 0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int[] vector = new int[n];//definiendo y dimencionando

        for (int i = 0; i < n - 1; i++) {//cargar
            vector[i] = (int) (random() * 100000);
            if (vector[i] >= 1 && vector[i] <= 9) {
                d++;

            } else if (vector[i] >= 10 && vector[i] <= 99) {
                f++;

            } else if (vector[i] >= 100 && vector[i] <= 999) {
                g++;

            } else if (vector[i] >= 1000 && vector[i] <= 9999) {
                h++;

            } else if (vector[i] >= 10000 && vector[i] <= 99999) {
                k++;
            }

        }
        System.out.println("la cantidad de numeros de 1 digito es:" + d);
        System.out.println("la cantidad de numeros de 2 digito es:" + f);
        System.out.println("la cantidad de numeros de 3 digito es:" + g);
        System.out.println("la cantidad de numeros de 4 digito es:" + h);
        System.out.println("la cantidad de numeros de 5 digito es:" + k);
    }

}
