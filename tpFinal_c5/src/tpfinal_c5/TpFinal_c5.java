/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c5;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_c5 {

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
        System.out.println("Este programa lee un caracter por teclado y evalua si es una letra mayuscula");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
        System.out.print("Ingrese el primer caracter a evaluar: ");
        var1 = car1.next().charAt(0);
        System.out.print("Ingrese el segundo caracter a evaluar: ");
        var2 = car2.next().charAt(0);
        //VALIDACION SI VAR1 Y VAR2 SON DOS LETRAS MINUSCULAS
        if(Character.isLowerCase(var1) && Character.isLowerCase(var2)){
            //SI ENTRA ACA INFORMA QUE LOS DOS CARACTERES SON LETRAS MINUSCULAS
            System.out.println("Ambos caracteres, " + var1 +" y "+ var2 + ", son letras minusculas");
        }else{
            //SI ENTRA ACA INFORMA QUE NO SON LETRAS MINUSCULAS
            System.out.println("Los dos caracteres no son letras minusculas");
        }
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
