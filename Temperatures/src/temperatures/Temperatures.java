/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatures;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.print(" introducir temperatura :");
        double enero = entrada.nextDouble();
        System.out.print("Gener |");
        for (int i = 0; i < enero; i++) {
            System.out.print("*");
        }
        System.out.print(enero+"  "+"ºc");
       
        double febrero = entrada.nextDouble();
        System.out.print("Febrere |");
        for (int i = 0; i < febrero; i++) {
            System.out.print("*");
        }
        System.out.print( febrero+ "  "+"ºc");
        
         
        double marzo = entrada.nextDouble();
        System.out.print("Març |");
        for (int i = 0; i < marzo; i++) {
            System.out.print("*");
        }
        System.out.print( marzo+ "  "+"ºc");
        
        
        double abril = entrada.nextDouble();
        System.out.print("Abril |");
        for (int i = 0; i < abril; i++) {
            System.out.print("*");
        }
        System.out.print( abril+ "    "+"ºc");
        
        
        
        
        double mayo = entrada.nextDouble();
        System.out.print("Maig |");
        for (int i = 0; i < mayo; i++) {
            System.out.print("*");
        }
        System.out.print( mayo+ "    "+"ºc");
        
        
        
        double junio = entrada.nextDouble();
        System.out.print("Juny |");
        for (int i = 0; i < junio; i++) {
            System.out.print("*");
        }
        System.out.print( junio+ "    "+"ºc");
        
        
        
        
        double julio = entrada.nextDouble();
        System.out.print("Juliol |");
        for (int i = 0; i < julio; i++) {
            System.out.print("*");
        }
        System.out.print( julio+ "    "+"ºc");
        
        
        
        double agosto = entrada.nextDouble();
        System.out.print("Agost |");
        for (int i = 0; i < agosto; i++) {
            System.out.print("*");
        }
        System.out.print( agosto+ "    "+"ºc");
        
        
        
        double septiembre = entrada.nextDouble();
        System.out.print("Setembre |");
        for (int i = 0; i < septiembre; i++) {
            System.out.print("*");
        }
        System.out.print( septiembre+ "    "+"ºc");
        
        
        double octubre = entrada.nextDouble();
        System.out.print("Octubre |");
        for (int i = 0; i < octubre; i++) {
            System.out.print("*");
        }
        System.out.print( octubre+ "    "+"ºc");
        
        
        
        
        
        double noviembre = entrada.nextDouble();
        System.out.print("Novembre |");
        for (int i = 0; i < noviembre; i++) {
            System.out.print("*");
        }
        System.out.print( octubre+ "    "+"ºc");
        
        
        
        double diciembre = entrada.nextDouble();
        System.out.print("Desembre |");
        for (int i = 0; i < diciembre; i++) {
            System.out.print("*");
        }
        System.out.print( diciembre+ "    "+"ºc");
       
        
    }

}
