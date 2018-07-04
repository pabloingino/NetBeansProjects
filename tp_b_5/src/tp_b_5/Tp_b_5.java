
package tp_b_5;

import java.util.Scanner;


public class Tp_b_5 {

    
    public static void main(String[] args) {
        System.out.println("Programa que lee la longitud de los catetos de un triángulo rectángulo ingresado por pantalla y muestra la longitud de la hipotenusa");
        Scanner teclado = new Scanner(System.in);
        double c, h;
        System.out.println("Ingrese el valor del cateto ");
        c = teclado.nextDouble();
        h = Math.sqrt(c*c + c*c);
        System.out.println("La hipotenusa mide "+h);
        
    }
    
}
