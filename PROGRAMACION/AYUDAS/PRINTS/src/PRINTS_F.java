/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class PRINTS_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  Si queremos mostrar el número 12.3698 de tipo double con dos decimales:

System.out.printf("%.2f %n", 12.3698);

//Para mostrar el signo + en un número positivo:
double n = 1.25036;
System.out.printf("%+.3f %n", n);//Salida: +1.250

//Si el número a mostrar es un entero se utiliza el caracter d:
int x = 10;
System.out.printf("%d %n", x);//Salida: 10           


    }
    
}
