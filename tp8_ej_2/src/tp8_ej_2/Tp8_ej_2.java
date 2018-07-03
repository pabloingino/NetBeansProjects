/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_2;

import java.util.*;

/**
 *
 * @author pablo
 */
public class Tp8_ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner salida = new Scanner(System.in);
        Scanner cants = new Scanner(System.in);
        String exit;
        int cant = 0;
        
        do {
            int price = 650000;
            System.out.print("Numero de escritorios: ");
            cant = cants.nextInt();
            if(cant < 5){
                price -= (price * 10) / 100;
                price = price * cant;
                System.out.println("El valor a pagar es: " + price);
            }
            else if(cant >= 5 && cant < 10){
                price -= (price * 20) / 100;
                price = price * cant;
                System.out.println("El valor a pagar es: " + price);
            }
            else {
                price -= (price * 40) / 100;
                price = price * cant;
                System.out.println("El valor a pagar es: " + price);
            }
            
            System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));

    
    }
    
}
