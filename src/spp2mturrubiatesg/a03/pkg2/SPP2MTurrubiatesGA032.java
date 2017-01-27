/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2mturrubiatesg.a03.pkg2;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGA032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              System.out.println("Calculadora del area de un círculo");
    double r,a;
    Scanner kb= new Scanner (System.in);
        System.out.println("Introduce el valor del radio del círculo");
        r= kb.nextDouble();
        
        //Cálculo del area
        a= Math.pow(r,2)* Math.PI;
        
        //Mostrar resultado
        System.out.println("Area del círculo="+ a);
        // TODO code application logic here
    }
    
}
