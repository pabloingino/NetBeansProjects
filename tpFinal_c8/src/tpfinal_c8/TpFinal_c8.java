/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class TpFinal_c8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner dat = new Scanner(System.in);
        String exit;
        
        int n;
        System.out.println("Este programa lee un numero ingresados por teclado, \ndetermina e imprime que mes es y si tiene 30, 31 o 28 dias");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
          // System.out.print("Ingresar el numero del cual se quiere obtener su tabla de multiplicacion: ");
          // n = dat.nextInt();
           n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "));
           
           System.out.println("Tabla del " + n);
           System.out.println("---------------");
           for(int i = 1; i <= 10; i++){
               System.out.println(n + " * " + i + " = " + n*i);
           }
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
