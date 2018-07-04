/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d1;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_d1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String exit;
        int[] arreglo = new int[10];
        int x=0;
        int sum=0;
        System.out.println("Este programa lee 10 numeros ingresados por teclados,\nlos guarda en un array de 10 elementos,\nmuestra los datos en las posiciones pares y las suma.");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            sum=0;
            for(int i=0;i<=9;i++){
                x = i+1;
                System.out.print("Por favor infrese el "+ x +" numero: ");
                arreglo[i] = num.nextInt();
                System.out.println();
            }
            for(int i=0;i<10;i=i+2){
                //System.out.print("Por favor infrese el "+ i +" numero: ");
                //arreglo[i] = num.nextInt();
                
                System.out.println("Este numero esta guardado en la posicion "+i+" del array arrglo: "+arreglo[i]);
                sum=sum+arreglo[i];
               
            }
             System.out.println("La suma de los numeros guardados en las posiciones pares es "+sum);
        
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
