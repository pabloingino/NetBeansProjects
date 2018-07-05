/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpfinal_d2;

import java.util.*;

/**
 *
 * @authors Bonetti - Campagñon - Ingino
 */
public class TpFinal_d2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        //SE DECLARAN LOS SCANNER PARA VALIDAR LA SALIDA Y PARA LA CAPTURA DEL CARACTER
        Scanner salida = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String exit;
        int lista[]=new int[6];
        
        System.out.println("Ingresar por teclado la nota de los (5) alumnos de una clase. Mostar los alumnos con notas superiores a 7 primero y los demás últimos");
        
        //INICIO DEL CICLO QUE VALIDA SI EL USUARIO QUIERE SALIR DEL PROGRAMA
        do {
            for (int i=1;i<lista.length;i++)
            {
                System.out.println("Ingrese la calificacion del alumno: "+i);
                lista[i] = sc.nextInt();                        
            }
           //Arrays.sort(lista);
            for(int i=0;i<(lista.length-1);i++){
               for(int j=i+1;j<lista.length;j++){
                   if(lista[i]<lista[j]){
                       //Intercambiamos valores
                       int variableauxiliar=lista[i];
                       lista[i]=lista[j];
                       lista[j]=variableauxiliar;
                   }
               }
           }
            for (int i=1; i<lista.length; i++){
                System.out.println("El orden de las calificaciones es el siguiente:");
                System.out.println(lista[i]);
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
