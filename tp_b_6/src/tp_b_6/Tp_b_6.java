
package tp_b_6;

import java.util.Scanner;


public class Tp_b_6 {

    
    public static void main(String[] args) {
        System.out.println("Programa que calcula y muestra el área de un triángulo a partir de la longitud de sus lados");
        Scanner teclado = new Scanner(System.in);
        double la, lb, a;
        System.out.println("Ingrese la longitud de un lado "); 
        la = teclado.nextDouble();
        System.out.println("Ingrese la longitud del otro lado "); 
        lb = teclado.nextDouble();
        a = la * lb / 2;
        System.out.println("El area del triangulo es "+a);
    }
    
}
