/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_b4;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_b4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        Double l, a, r;
        System.out.println("Programa que lee un valor ingresado por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese el radio de la cirdunferencia ");
            r = teclado.nextDouble();
            l = 2 * Math.PI*r; 
            a = Math.PI * Math.pow(r, 2);
            System.out.println("La longitud de la circunferencia es 2 x π x "+r+" = "+l);
            System.out.println("El area de la circunferencia es  π x "+r+"^2 = "+a);
            
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
