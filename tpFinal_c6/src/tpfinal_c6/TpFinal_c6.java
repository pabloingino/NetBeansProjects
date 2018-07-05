/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_c6;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagnon - Ingino
 */
public class TpFinal_c6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        String exit;
        
        System.out.println("Este programa comprueba si la hora que indican es una hora válida,\n Y luego imprimira por pantalla la pregunta del TP Final Ejercicio C-6");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            int H,M,S;
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca hora: ");
            H =  sc.nextInt();
            System.out.print("Introduzca minutos: ");
            M =  sc.nextInt();
            System.out.print("Introduzca segundos: ");
            S =  sc.nextInt();
            if((H>=0 && H<24) && (M>=0 && M<60) && (S>=0 && S<60))  {

            System.out.println("La hora ingresada es correcta: "+H+":"+M+":"+S);

            }
            else{
            System.out.println("La hora ingresada no tiene el formato correcto");
            }
            System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("El ejercicio tal como fue dado, no tomaba las horas de forma correcta. Al momento de evaluar la condicion\n" +
            "Faltaba separar la comparacion logica de cada variable en parentesis.\n" +
            "Por otro lado, el ejercicio tampoco poseia la respuesta del sistema en caso de que fuera falso o verdadero el IF\n" +
            "Por este motivo, se agrego la salida del if tanto para verdadero como para falso, y se corrigió la evaluacion de las variables");
        
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }
    
}
