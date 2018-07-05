/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a3;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_a3 {

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
        int tope;
        int decremento;
        int duplicado;
        System.out.println("Programa que toma un valor ingresado por pantalla , lo incrementa en 77, lo decrementa en 3 y duplica su valor");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese un valor entero: ");
            N = teclado.nextInt();
            tope = N + 77;
            System.out.println("Incremento de "+ N +" en 77");
            for (int i = N; i < tope; i++) {
                N++;
                System.out.print(N +"  ");
            }
            System.out.println("Incremento de "+ N +" en 3");
            decremento = N - 3;
            System.out.println("");
            for (int i = N; i > decremento; i--) {
                N--;
                System.out.print(N +"  ");
            }
            System.out.println("");
            duplicado = N*2;
            
            System.out.println("Valor de "+ N+ " duplicado" );
            for (int i = N; i < duplicado; i++) {
                N++;
                System.out.print(N +"  ");
            }
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
