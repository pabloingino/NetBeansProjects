/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_b5;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_b5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        double c1, c2, h;
        System.out.println("Programa que lee la longitud de los catetos de un triángulo rectángulo ingresado por pantalla y muestra la longitud de la hipotenusa");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese el valor del cateto mayor ");
            c1 = teclado.nextDouble();
            System.out.println("Ingrese el valor del cateto menor ");
            c2 = teclado.nextDouble();
            h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
            System.out.println("La hipotenusa mide "+h);
            
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
