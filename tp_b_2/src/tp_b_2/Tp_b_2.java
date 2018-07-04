
package tp_b_2;

import java.util.Scanner;


public class Tp_b_2 {

    
    public static void main(String[] args) {
        System.out.println("Programa que lee un numero ingresado por pantalla y muestra su doble y su triplo");
        int i, a, e;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un entero ");
        i = teclado.nextInt();
        a = i * 2;
        e = i *3;
        System.out.println("El doble del numero ingresado es "+a);
        System.out.println("El triple del numero ingresado es "+e);
        
    }
    
}
