/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejem_1;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejem_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        System.out.print("Dame la radio del circulo :");
        int radio =entrada.nextInt();
        int area =  (int) (Math.PI * Math.pow(radio, 2));
        int circum =(int) (2*Math.PI*radio);   
        System.out.println("El area es: "+ area);
        System.out.println("La circumferencia :"+circum);
                
    }
    
}
