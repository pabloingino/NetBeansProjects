
package tp_a_5;

import java.util.Scanner;


public class Tp_a_5 {

    
    public static void main(String[] args) {
        System.out.println("Programa que muestra si es par o impar un numero ingresado por pantalla");
        Scanner teclado = new Scanner(System.in);
        int A;
        System.out.println("Ingrese un numero entero: ");
        A = teclado.nextInt();
        String resultado = (A%2==0)?"par":"impar";
        System.out.println("El numero ingresado es " +resultado);
    }
    
}
