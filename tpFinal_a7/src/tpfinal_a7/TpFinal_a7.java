/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_a7;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_a7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String exit;
        int c;
        System.out.println("Programa que indica si el el valor ingresado por pantalla es par o impar, positivo o negativo, multiplo de 5, multiplo de 10 y si es menor que 100");
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            System.out.println("Ingrese un numero entero: ");
            c = teclado.nextInt();
            String parim = (c%2==0)?"par":"impar";
            String pn = (c>=0)?"positivo":"negativo";
            String mcinco = (c%5==0)?"es multiplo de 5":"no es multiplo de 5";
            String mdiez = (c%10==0)?"es multiplo de 10":"no es multiplo de 10";
            String m100 = (c>=100)?"es mayor que 100":"es menor que 100";
            System.out.println("El numero ingresado es " +parim +", " +pn +", " +mcinco +", " +mdiez +", " +m100);
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
