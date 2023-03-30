package Guia5;


import java.util.Scanner;

/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.

 */


public class guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[]equipo= new String[8];
        for (int i = 0; i < 7; i++) {
            System.out.println("ingrese un  nombre de integrante del equipo");
            
          equipo[i] = leer.nextLine() ;
  
          
                
            }
        for (int i = 0; i < 7; i++) {
            System.out.print(equipo[i] + " , " );
            
            //
        }
        System.out.println("");
        }
        
    }
    

/*Scanner leer = new Scanner(System.in);
        //ingreso cantidad de compañeros
        System.out.print("Ingrese cantidad de compañeros: ");
        int comp = leer.nextInt();
        //declaro matriz y dimensiono 
        String [] Equipo = new String [comp];
        
        //Llenar vector
        for(int i = 0; i < comp; i++){
             System.out.print("Nombre [" + i + "]= ");
            //acceder al valor i del vector
            Equipo[i] = leer.next();
        }
        //solo genera espacio linea 40
        System.out.println("");
        //Mostrar Vector
        for (int i = 0; i < comp; i++) {
            System.out.print("[" + Equipo[i] + "] ");
        }
        System.out.println("");
    }
*/