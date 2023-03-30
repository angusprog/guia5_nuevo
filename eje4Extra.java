/*
 *Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados
y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y desaprobados, 
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.


 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author claud
 */
public class eje4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double[] promNota = new double[10];
        int totalA, totalD;
        double not1, not2, not3, not4;
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese su nota en el primer parcial ");
            not1 = (leer.nextInt() * 0.10);
            System.out.println("ingrese su nota en el segundo parcial ");
            not2 = (leer.nextInt() * 0.15);
            System.out.println("ingrese su nota en el tercero parcial ");
            not3 = (leer.nextInt() * 0.25);
            System.out.println("ingrese su nota en el cuarto parcial ");
            not4 = (leer.nextInt() * 0.50);
            promNota[i] = not1 + not2 + not3 + not4;

        }
        totalA = cantaprobados(promNota);
        System.out.println("el total de aprobados es " + totalA);
        System.out.println("el total de apalzados  es " + (3 - totalA));
    }

    public static int cantaprobados(double promNota[]) {
        int cantA = 0, cantD = 0;
        for (int i = 0; i < 3; i++) {
            if (promNota[i] >= 7) {
                cantA++;

            }

        }
        return cantA;

    }

}
