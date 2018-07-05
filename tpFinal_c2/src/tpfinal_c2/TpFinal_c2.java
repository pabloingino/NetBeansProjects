/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c2;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_c2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner car = new Scanner(System.in);
        String exit;
        char var;
        System.out.println("Este programa lee dos caracteres por teclado y determina si son iguales o no");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese unicamente un caracter");
            char carac1=sc.next().charAt(0);
            System.out.println("Ingrese un caracter mas por favor");
            char carac2=sc.next().charAt(0);
            if (carac1==carac2)
            {
                    System.out.println("Los caracteres ingresados son iguales y son: "+carac1);
            }
            else {
                     System.out.println("Los caracteres ingresados son distintos y son 1º "+carac1+" y 2º "+carac2);
            }
        
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
