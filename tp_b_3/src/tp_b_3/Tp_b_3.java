
package tp_b_3;

import java.util.Scanner;


public class Tp_b_3 {

    
    public static void main(String[] args) {
        System.out.println("Programa que transforma de grados centigrados a grados fahrenheit");
        double c, f;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrado a convertir a Farenheit ");
        c = teclado.nextDouble();
        f = (c*1.8) + 32;
        System.out.println("el calculo es ("+ c +" x 1,8) + 32 = "+ f+" Fº");
        
    }
    
}
