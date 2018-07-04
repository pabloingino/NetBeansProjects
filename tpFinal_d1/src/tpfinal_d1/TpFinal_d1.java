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
        Scanner arreglo = new Scanner(System.in);
        String exit;
        
        int[] arr = new int[10];
        System.out.println("Este programa lee un numero ingresados por teclado, \ndetermina e imprime que mes es y si tiene 30, 31 o 28 dias");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            int x = 0;
            for(int i = 0;i < 9; i++){
                System.out.print("Por favor ingrese el valor numerico de la posicion "+i+ " del array arr: ");
                arr[i] = arreglo.nextInt();
                System.out.println();
            }
            for(int i = 0; i < 9; i++){
                if(i%2 == 0){ 
                    System.out.println("Este es el valor guardado en la posicion "+ i +": "+arr[i]);
                }
            }
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

    private static boolean isNumeric(String mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
