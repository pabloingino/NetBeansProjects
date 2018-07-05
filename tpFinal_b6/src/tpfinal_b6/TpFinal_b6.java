/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_b6;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_b6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        double la, lb, a;
        System.out.println("Programa que calcula y muestra el área de un triángulo a partir de la longitud de sus lados");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese la longitud de un lado "); 
            la = teclado.nextDouble();
            System.out.println("Ingrese la longitud del otro lado "); 
            lb = teclado.nextDouble();
            a = la * lb / 2;
            System.out.println("El area del triangulo es "+a);
            
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
