/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d8;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_d8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String exit;
        int lista[]=new int[5];

        System.out.println("Este programa permite a el usuario debe ingresar valores para llenar un array con números aleatorios. ");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese números para el listado");
         
            for (int i=1;i<lista.length;i++)
            {
                System.out.println("Número: "+i);
                lista[i] = sc.nextInt();                        
            }
        
            for (int i=1; i<lista.length; i++){
         
                 System.out.println("Los numeros aleatorios ingresados fueron:");
                 System.out.println(lista[i]);
         
            }
                  
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
