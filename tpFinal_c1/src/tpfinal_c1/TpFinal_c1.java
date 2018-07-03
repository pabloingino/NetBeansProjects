/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c1;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_c1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner car = new Scanner(System.in);
        char var;
        System.out.println("Este programa lee un caracter por teclado y evalua si es una letra mayuscula");
        System.out.print("Ingrese el caracter a evaluar: ");
        var = car.next().charAt(0);
        if(Character.isUpperCase(var)){
            System.out.println("El caracter " + var + " es una letra mayuscula");
        }else{
            System.out.println("El caracter "+ var +" no es una letra mayuscula");
        }
        
    }
    
}
