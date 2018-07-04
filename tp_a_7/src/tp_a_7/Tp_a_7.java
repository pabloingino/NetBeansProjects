
package tp_a_7;

import java.util.Scanner;


public class Tp_a_7 {

    
    public static void main(String[] args) {
        System.out.println("Programa que indica si el el valor ingresado por pantalla es par o impar, positivo o negativo, multiplo de 5, multiplo de 10 y si es menor que 100");
        Scanner teclado = new Scanner(System.in);
        int c;
        System.out.println("Ingrese un numero entero: ");
        c = teclado.nextInt();
        String parim = (c%2==0)?"par":"impar";
        String pn = (c>=0)?"positivo":"negativo";
        String mcinco = (c%5==0)?"es multiplo de 5":"no es multiplo de 5";
        String mdiez = (c%10==0)?"es multiplo de 10":"no es multiplo de 10";
        String m100 = (c>=100)?"es mayor que 100":"es menor que 100";
        System.out.println("El numero ingresado es " +parim +", " +pn +", " +mcinco +", " +mdiez +", " +m100);
    }
    
}
