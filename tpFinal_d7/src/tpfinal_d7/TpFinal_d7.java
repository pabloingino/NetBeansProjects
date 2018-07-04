/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d7;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_d7 {

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
        System.out.println("Este programa guarda los 10 primeros numeros pares en un array de 10 elementos");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            
                  
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
