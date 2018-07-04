
package tp_a_3;

import java.util.Scanner;


public class Tp_a_3 {

    
    public static void main(String[] args) {
        System.out.println("Programa que toma un valor ingresado por pantalla , lo incrementa en 77, lo decrementa en 3 y duplica su valor");
        Scanner teclado = new Scanner(System.in);
        int N;
        int tope;
        int decremento;
        int duplicado;
        System.out.println("Ingrese un valor entero: ");
        N = teclado.nextInt();
        tope = N + 77;
        for (int i = N; i < tope; i++) {
            N++;
            System.out.print(N +"  ");
        }
        decremento = N - 3;
        System.out.println("");
        for (int i = N; i > decremento; i--) {
            N--;
            System.out.print(N +"  ");
        }
        duplicado = N*2;
        System.out.println("");
        for (int i = N; i < duplicado; i++) {
            N++;
            System.out.print(N +"  ");
        }
        
    }
    
}
