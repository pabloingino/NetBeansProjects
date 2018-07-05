/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a6;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_a6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        int B;
        System.out.println("Programa que indica si un valor es positivo o negativo");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese un numero entero: ");
            B = teclado.nextInt();
            String resultado = (B>=0)?"positivo":"negativo";
            System.out.println("El numero ingresado es " +resultado);
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
