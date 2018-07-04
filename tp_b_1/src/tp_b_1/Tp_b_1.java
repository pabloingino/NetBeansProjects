
package tp_b_1;

import java.util.Scanner;


public class Tp_b_1 {

    
    public static void main(String[] args) {
        System.out.println("Programa que lee un nombre ingresado por pantalla y le da la bienvenida");
        String n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        n = teclado.nextLine();
        System.out.println("Buenos dias "+n);
        
        }
    
}
