/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c7;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_c7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner lmes = new Scanner(System.in);
        String exit;
        String mes28 = "28 Dias o 29 si el año es bisiesto";
        String mes30 = "30 Dias";
        String mes31 = "31 Dias";
        String mes;
        System.out.println("Este programa lee un numero ingresados por teclado, \ndetermina e imprime que mes es y si tiene 30, 31 o 28 dias");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

    private static boolean isNumeric(String mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
