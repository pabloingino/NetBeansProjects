/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_ej_3;

import java.util.*;

/**
 *
 * @author pablo
 */
public class Tp8_ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner salida = new Scanner(System.in);
        Scanner kg = new Scanner(System.in);
        Scanner vl = new Scanner(System.in);
        Scanner day = new Scanner(System.in);
        Scanner pg = new Scanner(System.in);
        String exit;
        int peso = 0;
        int valor = 0;
        String dia;
        String pago;
        int costo = 0;
        int promo = 0;
        int total = 0;
        
        do {
            int x = 0; //Variable bandera para validar las promociones
            System.out.print("Peso de la mercaderia: ");
            peso = kg.nextInt();
            System.out.print("Valor de la mercaderia: ");
            valor = vl.nextInt();
            System.out.print("Es lunes [S]i [N]o: ");
            dia = day.next();
            System.out.print("Tipo de pago [E]fectivo [T]arjeta: ");
            pago = pg.next();
            
//Costos de envios

            if(peso < 100){
                costo=20000;
            }else if(peso >= 100 && peso <= 150){
                costo=25000;
            }else if(peso > 150 && peso <= 200){
                costo=30000;
            }else {
                costo= 35000 +((((peso-200)/10))*2000);
            }
            
//Validaciones
            
            // Promociones
            if("s".equalsIgnoreCase(dia)){
                    if("t".equalsIgnoreCase(pago)){
                        //Promocion 1
                        promo = (costo*50)/100;
                        x = 1;
                    }
                    
                    
            }
            if("e".equalsIgnoreCase(pago)){
                    if(valor > 1000000){
                        //Promocion 2
                        promo = (costo*40)/100;
                        
                        x = 1;
                    }
            }
            // Descuentos
            if(x == 0){
                    if(valor > 300000 && valor <= 600000){
                        costo -= (costo*10)/100;
                        
                }   
                    else if(valor > 600000 && valor <= 1000000){
                        costo -= (costo*20)/100;
                        
                }   
                    else if(valor > 1000000){
                    costo -= (costo*30)/100;
                    
                    }
            }
            total = costo - promo;
            System.out.println("Tarifa: " + costo);
            System.out.println("Promoción: " + promo);
            System.out.println("Total a pagar: " + total);
            //Salir de la APP
            System.out.println("Desea Continuar en la aplicacion? (Debe ingresar si o no)");
            exit = salida.nextLine();
        } while(!"no".equalsIgnoreCase(exit));
    }
    
}
