
package tp_a_2;

import java.util.Scanner;

public class Tp_a_2 {

   
    public static void main(String[] args) {
        System.out.println("Programa que toma 2 variables de tipo entero y 2 de tipo double y toma valores ingresados por teclado y muestra en pantalla operaciones entre ellas");
        int x,y;
        double n, m;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        x = teclado.nextInt();
        System.out.println("Ingrese un numero entero");
        y = teclado.nextInt();
        System.out.println("Ingrese un numero con decimales");
        n = teclado.nextDouble();
        System.out.println("Ingrese un numero con decimales");
        m = teclado.nextDouble();
        double suma, multi, opecom;
        suma = x + y;
        multi = x * n;
        opecom = Math.sqrt(y * m / (n + m) + (multi * suma));
        System.out.println("√(" +y +" * " +m +" /(" +n +" + " +m +") + ((" +x +" * " +n +") * ( " +x +" + " +y +" ))) = " +opecom);
    }
    
}
