/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_a_4;

/**
 *
 * @author pablo
 */
public class Tp_a_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1, b = 2, c = 3, d = 4, aux;
        System.out.println("Valores iniciales");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("B toma el valor de C -> B = " + b);
        System.out.println("C toma el valor de A -> C = " + c);
        System.out.println("A toma el valor de D -> A = " + a);
        System.out.println("D toma el valor de B -> D = " + d);
    }
    
}
