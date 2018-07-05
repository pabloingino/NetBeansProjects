/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c4;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_c4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner car1 = new Scanner(System.in);
        Scanner car2 = new Scanner(System.in);
        String exit;
        char var1, var2;
        System.out.println("Este programa lee un caracter por teclado y comprueba si es un numero");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un caracter entre 0 y 9");
            char carac1=sc.next().charAt(0);
           
            int n = 0;
              if (Character.isDigit(carac1))
            {   
                System.out.println("El caracter" + carac1 + "ingresado es un numero");
                }
            else {
                     System.out.println("El caracter ingresado no es un numero. El mismo es: "+carac1);
            }
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
