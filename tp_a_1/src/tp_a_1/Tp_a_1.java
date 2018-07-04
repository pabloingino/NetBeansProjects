
package tp_a_1;

import java.util.Scanner;


public class Tp_a_1 {

   
    public static void main(String[] args) {
        int N;
        double A;
        char C;
        int codigo;
        System.out.println("Programa para mostrar el valor numerico de las variables ingresadas, la suma y la diferencia entre los primeros 2 numeros ingresados y que valor numerico tiene un caracter");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        N = teclado.nextInt();
        System.out.println("Ingrese un numero con decimales");
        A = teclado.nextDouble();
        System.out.println("Ingrese un carater");
        C = teclado.next().charAt(0);
        double suma = N + A;
        double resta = A - N;
        codigo = (int)C;
        
                
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La diferencia de los valores es: " + resta);
        System.out.println("El codigo ASCII del caracter es: " + codigo);
        
                
        
    }
    
}
