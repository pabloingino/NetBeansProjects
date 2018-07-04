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
            do{
            System.out.print("Ingrese el numero de mes a evaluar, recuerde que debe ingresar un numero del 1 al 12: ");
            mes = lmes.nextLine();
            }while(false == isNumeric(mes));
            mes.replaceAll(" ", "");
            int numMes = Integer.parseInt(mes);
            //while(numMes < 1 || numMes > 12){
              //  System.out.print("El numero es incorrecto, Debe ingresar un numero entre 1 y 12 ");
               // mes = lmes.nextInt();
            //}
            switch(numMes) {
                case 1:
                    System.out.println("El mes ingresado es Enero y tiene  "+ mes31);
                    break;
                case 2:
                    System.out.println("El mes ingresado es Febrero y tiene  "+ mes28);
                    break;
                case 3:
                    System.out.println("El mes ingresado es Marzo y tiene  "+ mes31);
                    break;
                case 4:
                    System.out.println("El mes ingresado es Abril y tiene  "+ mes30);
                    break;
                case 5:
                    System.out.println("El mes ingresado es Mayo y tiene  "+ mes31);
                    break;
                case 6:
                    System.out.println("El mes ingresado es Junio y tiene  "+ mes30);
                    break;
                case 7:
                    System.out.println("El mes ingresado es Julio y tiene  "+ mes31);
                    break;
                case 8:
                    System.out.println("El mes ingresado es Agosto y tiene  "+ mes31);
                    break;
                case 9:
                    System.out.println("El mes ingresado es Septiembre y tiene  "+ mes30);
                    break;
                case 10:
                    System.out.println("El mes ingresado es Octubre y tiene  "+ mes31);
                    break;
                case 11:
                    System.out.println("El mes ingresado es Noviembre y tiene  "+ mes30);
                    break;
                case 12:
                    System.out.println("El mes ingresado es Diciembre y tiene  "+ mes31);
                    break;

            }
        
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

    private static boolean isNumeric(String mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
