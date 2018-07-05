/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a2;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_a2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        int x,y;
        double n, m;
        System.out.println("Programa que toma 2 variables de tipo entero y 2 de tipo double y toma valores ingresados por teclado y muestra en pantalla operaciones entre ellas");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese un numero entero");
            x = teclado.nextInt();
            System.out.println("Ingrese un numero entero");
            y = teclado.nextInt();
            System.out.println("Ingrese un numero con decimales");
            n = teclado.nextDouble();
            System.out.println("Ingrese un numero con decimales");
            m = teclado.nextDouble();
            double suma, multi, opecom;
            suma = x + y;
            multi = x * n;
            opecom = Math.sqrt(y * m / (n + m) + (multi * suma));
            System.out.println("√(" +y +" * " +m +" /(" +n +" + " +m +") + ((" +x +" * " +n +") * ( " +x +" + " +y +" ))) = " +opecom);
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
