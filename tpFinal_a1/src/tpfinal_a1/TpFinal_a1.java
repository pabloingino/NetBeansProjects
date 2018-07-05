/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a1;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_a1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        int N;
        double A;
        char C;
        int codigo;
        System.out.println("Programa para mostrar el valor numerico de las variables ingresadas, la suma y la diferencia entre los primeros 2 numeros ingresados y que valor numerico tiene un caracter");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
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
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
