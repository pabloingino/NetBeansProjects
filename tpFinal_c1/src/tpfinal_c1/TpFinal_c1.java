/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c1;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_c1 {

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
        System.out.println("Este programa lee un caracter por teclado y evalua si es una letra mayuscula");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
        System.out.print("Ingrese el caracter a evaluar: ");
        var = car.next().charAt(0);
        //VALIDACION SI ES LATRA Y MAYUSCULA CON METODO isUpperCase
        if(Character.isUpperCase(var)){
            //SI ENTRA ACA INFORMA QUE ES UNA LETRA MAYUSCULA
            System.out.println("El caracter " + var + " es una letra mayuscula");
        }else{
            //INFORMA QUE NO ES LETRA MAYUSCULA
            System.out.println("El caracter "+ var +" no es una letra mayuscula");
        }
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
