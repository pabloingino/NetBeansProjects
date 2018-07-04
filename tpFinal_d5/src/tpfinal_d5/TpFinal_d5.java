/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d5;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_d5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner sue = new Scanner(System.in);
        String exit;
        String[] nombre = new String[20];
        float[] sueldo = new float[20];
        int x=0;
        System.out.println("Este programa guarda los 10 primeros numeros pares en un array de 10 elementos");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            for(int i = 0; i < 20; i++){
                System.out.print("Ingrese el nombre del empleado: ");
                nombre[i]=nom.nextLine();
                System.out.print("Ingrese el sueldo del empleado: ");
                sueldo[i]=sue.nextFloat();
                System.out.println("-----------------------------------------");
            }
            
            for(int i = 0; i < 20; i++){
                System.out.println("Nombre: "+nombre[i]+ "         | " + " Sueldo: " +sueldo[i] +" | ");
                System.out.println("-----------------------------------------");
            }      
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
