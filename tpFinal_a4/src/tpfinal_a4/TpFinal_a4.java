/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a4;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_a4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        System.out.println("Programa que permiteingresar cuatro variables enteras A, B, C y D,\na continuación realiza las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.\nY lo imprime por pantalla.");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            int a = 0, b = 0, c = 0, d = 0, aux;
            
            System.out.print("Ingrese el Valor de A: ");
            a = teclado.nextInt();
            System.out.print("Ingrese el Valor de B: ");
            b = teclado.nextInt();
            System.out.print("Ingrese el Valor de C: ");
            c = teclado.nextInt();
            System.out.print("Ingrese el Valor de D: ");
            d = teclado.nextInt();
                      
            System.out.println("Valores iniciales");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
            System.out.println("D = " + d);
            aux = b;
            b = c;
            c = a;
            a = d;
            d = aux;
            System.out.println("B toma el valor de actual de B = " + b);
            System.out.println("C toma el valor de actual de C = " + c);
            System.out.println("A toma el valor de actual de A = " + a);
            System.out.println("D toma el valor de actual de D = " + d);
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
