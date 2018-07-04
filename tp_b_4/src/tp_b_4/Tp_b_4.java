
package tp_b_4;

import java.util.Scanner;


public class Tp_b_4 {

    
    public static void main(String[] args) {
        System.out.println("Programa que lee un valor ingresado por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia");
        Scanner teclado = new Scanner(System.in);
        Double l, a, r;
             
        System.out.println("Ingrese el radio de la cirdunferencia ");
        r = teclado.nextDouble();
        l = 2 * Math.PI*r; 
        a = Math.PI * Math.pow(r, 2);
        System.out.println("La longitud de la circunferencia es 2 x π x "+r+" = "+l);
        System.out.println("El area de la circunferencia es  π x "+r+"^2 = "+a);
    }
    
}
