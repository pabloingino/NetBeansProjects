/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_b7;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_b7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        int d, m , a, s;
        System.out.println("Programa que calcula el número de la suerte de una persona a partir de su fecha de nacimiento");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese el año de su nacimiento con 4 cifras");
            a=teclado.nextInt();
            System.out.println("Ingrese el mes de su nacimiento");
            m=teclado.nextInt();
            System.out.println("Ingrese el dia de su nacimiento");
            d=teclado.nextInt();
            s = a * m / d;
            System.out.println("Su numero de la suerte es "+s);
            
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
