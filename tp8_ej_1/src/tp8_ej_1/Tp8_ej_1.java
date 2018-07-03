/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_1;

import java.util.*;

/**
 *
 * @author pablo
 */
public class Tp8_ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        Scanner years = new Scanner(System.in);
        String exit;
        int year = 0;
        do {
        //Se le solicita al usuario que ingrese el año a evaluar y se captura con el scanner years
            System.out.print("Ingrese año: ");
            year = years.nextInt();
        //Se valida con un IF que el año sea bisiesto  
            if((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
                System.out.println("El año: "+ year +", es bisiesto");
            else
                System.out.println("El año: "+ year +", no es bisiesto");
            //Validacion de salida del programa
            System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    
    }
}
