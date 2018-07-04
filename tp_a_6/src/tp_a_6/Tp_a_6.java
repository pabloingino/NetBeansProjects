
package tp_a_6;

import java.util.Scanner;


public class Tp_a_6 {

    
    public static void main(String[] args) {
        System.out.println("Programa que indica si un valor es positivo o negativo");
        Scanner teclado = new Scanner(System.in);
        int B;
        System.out.println("Ingrese un numero entero: ");
        B = teclado.nextInt();
        String resultado = (B>=0)?"positivo":"negativo";
        System.out.println("El numero ingresado es " +resultado);
    }
    
}
