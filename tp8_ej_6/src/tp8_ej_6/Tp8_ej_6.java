/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_6;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Tp8_ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner salida = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String exit;
        int n = 0;
        
        do {
            System.out.print("Cuantos terminos quiere: ");
            n = sc.nextInt();
            int sum = 0;
            int f = 1;
            int x = 0;
            int acu = 0;
            for(int i = 0; i<=n;i++){
                System.out.print(sum + "    ");
                x = sum;
                acu +=sum;
                sum += f;
                f = x;
            }
	    System.out.println("");
            System.out.println("La suma es: "+acu);
            //validacion de salida
	    System.out.println("Desea Continuar en la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"no".equalsIgnoreCase(exit));

    }
    
}
