/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c5;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_c5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        String exit;
        float var1, var2;
        System.out.println("Este programa lee dos numeros ingresados por teclado, \ndivide el primero por el segundo e imprime el resultado");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
        System.out.print("Ingrese el primer numero: ");
        var1 = num1.nextFloat();
        System.out.print("Ingrese el segundo numero (Recuerde que no debe ser cero (0)): ");
        var2 = num2.nextFloat();
        //VALIDACION SI NUM2 ES CERO SE LE PIDE AL USUARIO QUE REINGRESE EL NUMERO
        while(var2 == 0){
            System.out.print("Ingrese el segundo numero (Recuerde que no debe ser cero (0)): ");
            var2 = num2.nextInt();
        }
        
        System.out.println("El resultado de la division es: "+ var1/var2);
       
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
