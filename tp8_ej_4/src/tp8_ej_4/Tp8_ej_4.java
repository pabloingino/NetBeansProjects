/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_4;

import java.util.*;

/**
 *
 * @author pablo
 */
public class Tp8_ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String exit;

        
        do {
            int n = 0;
            int count = 0;
            int x = 1;
            System.out.print("Cuantos numeros desea: ");
            n = num.nextInt();
            while(x <= n){
                for(int i=0;i<15;i++){
                    if(x>n){
                        x = n+1;
                    }else{
                        System.out.print(x);
                        System.out.print("    ");
                        count = count+x;
                        x++;
                    }
                }    
                System.out.println("");
                //System.out.print("    ");
            }
            int prom = count/n; 
            System.out.println("La suma es: " + count);
            System.out.println("El promedio es: " + prom);
            //Validacion de salida
            System.out.println("Desea Continuar en la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"no".equalsIgnoreCase(exit));

    }
    
}
