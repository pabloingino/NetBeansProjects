/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d7;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
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
        Scanner nom = new Scanner(System.in);
        Scanner sue = new Scanner(System.in);
        String[] nombre = new String[20];
        float[] sueldo = new float[20];

        System.out.println("Este programa lee el nombre y sueldo de 20 empleados y muestra el nombre y sueldo del empleado que más gana");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            double sueldomayor;
            int p;
            for(int i = 0; i < 20; i++){
                System.out.print("Ingrese el nombre del empleado: ");
                nombre[i]=nom.nextLine();
                System.out.print("Ingrese el sueldo del empleado: ");
                sueldo[i]=sue.nextFloat();
                System.out.println("-----------------------------------------");
            }
            sueldomayor = 0;
            p = 0;
            for(int i=0; i<sueldo.length && i<nombre.length; i++){
                if(sueldo[i]>sueldomayor){ // 
                    sueldomayor = sueldo[i];
                    p = i;
                }
            }   
               System.out.println("El empleado que mas cobra es "+ nombre[p] + " y el sueldo es de " +sueldomayor);   
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
