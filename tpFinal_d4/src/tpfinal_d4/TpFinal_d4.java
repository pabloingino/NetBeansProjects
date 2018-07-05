/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d4;

import java.util.*;

/**
 *
 * @author pablo
 */
public class TpFinal_d4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String exit;
        int[] arreglo = new int[10];
        //int num;
        
        System.out.println("Este programa guarda los 10 primeros numeros pares en un array de 10 elementos");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            int countP = 0, countN = 0, countZ = 0;
            for(int i=0;i<10;i++){
                System.out.print("Por favor ingrese un numero positivo, negativo o cero: ");
                arreglo[i] = num.nextInt();
                //System.out.println(arreglo[i]);
            }
            for(int i=0;i<10;i++){
                if(arreglo[i] == 0){
                    countZ = countZ + 1;
                }
                if(arreglo[i] < 0){
                    countN = countN + 1;
                }
                if(arreglo[i] > 0){
                    countP = countP + 1;
                }
                
                
            }
            System.out.println("La cantidad de valores Positivos es: " + countP); 
            System.out.println("La cantidad de valores Negativos es: " + countN);
            System.out.println("La cantidad de ceros es: " + countZ);
           
        //PREGUNTA AL USUARIO SI QUIERE SALIR DEL PROGRAMA
        System.out.println("Desea salir de la aplicacion? (Debe ingresar si o no)");
        exit = salida.nextLine();
        } while(!"si".equalsIgnoreCase(exit));
    }

}
