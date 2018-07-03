/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_5;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Tp8_ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        Scanner C = new Scanner(System.in);
        String exit;
        
        do {
            double a, b, c = 0;
            double x1 = 0, x2 = 0;
            System.out.print("Ingrese el valor de a: ");
            a = A.nextDouble();
	    System.out.print("Ingrese el valor de b: ");
            b = B.nextDouble();
            System.out.print("Ingrese el valor de c: ");
            c = C.nextDouble();
            while(a == 0){
                System.out.print("El valor de 'a' no debe ser 0, por favor ingreselo nuevamente: ");
                a = A.nextInt();
            }
            double det = Math.pow(b,2)-(4*a*c);
            if(det > 0){
                x1 = ((b*(-1)) + Math.sqrt(det))/(2*a);
                x2 = ((b*(-1)) - Math.sqrt(det))/(2*a);
                System.out.println("x1: "+ x1);
                System.out.println("x2: "+ x2);
            } if(det < 0){
                System.out.println("Las raices de la ecuacion son imaginarias");
            } if(det == 0){
                x1 = (b*(-1))/(2*a);
                System.out.println("El determinante es 0(cero) tiene una sola raiz ");
                System.out.println("x: "+ x1);
            }
            
//validacion de salida
	    System.out.println("Desea Continuar en la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"no".equalsIgnoreCase(exit));
        
    }
    
}
