/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d5;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_d5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner arreglo = new Scanner(System.in);
        String exit;
        System.out.println("Este programa guarda  10 numeros ingresados por teclado en un array de 10 elementos e imprime su valor negativo");
        int[] arr = new int[10];
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            for(int i = 0;i <= 9; i++){
                System.out.print("Por favor ingrese el valor numerico de la posicion "+i+ " del array arr: ");
                arr[i] = arreglo.nextInt();
                System.out.println();
            }
            for(int i = 0;i <= 9; i++){
                System.out.print("Valor Positivo: " + arr[i]);
                System.out.println(" Valor Negativo: " + arr[i]*-1);
            }
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
