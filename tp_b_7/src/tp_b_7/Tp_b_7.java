
package tp_b_7;

import java.util.Scanner;


public class Tp_b_7 {

    
    public static void main(String[] args) {
        System.out.println("Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento");
        Scanner teclado = new Scanner(System.in);
        int d, m , a, s;
        System.out.println("Ingrese el año de su nacimiento con 4 cifras");
        a=teclado.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        m=teclado.nextInt();
        System.out.println("Ingrese el dia de su nacimiento");
        d=teclado.nextInt();
        s = a * m / d;
        System.out.println("Su numero de la suerte es "+s);
    }
    
}
