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

// Para mostrar varias variables pondremos tantos 
//% como valores vamos a mostrar. Las variables se escriben
//a continuación de las comillas separadas por comas:   
        double A = 1.25036;
        int B = 10;
        System.out.printf("A = %.2f B = %d %n", A, B); // SALIDA : n = 1,25 x = 10
        // System.out.printf("A = %1$.2f B = %2$d %n", A, B); Esto funciona como el de arriba 

        //Si queremos mostrar el número 123.4567 y su cuadrado ambos con dos decimales debemos escribir:
        double num = 123.4567;
        System.out.printf("El cuadrado de %.2f es %.2f\n", num, num * num);

        //printf permite mostrar valores con un ancho de campo determinado. 
        //Por ejemplo, si queremos mostrar el contenido de n en un ancho de campo de 10 caracteres escribimos:
        double num1 = 1.25036;
        System.out.printf("%+10.2f %n", num1); // el simbolo + se puede quitar si asi lo quieres 
        System.out.printf("%010.2f %n", num1);// En lugar de espacios imprime 0

        
        //Mostrar la cadena "Total:" con un ancho de 10 caracteres y alineada a la izquierda:
        System.out.printf("%-10s %n", "Total:");// izquierda
        System.out.printf("%10s %n", "Total  :");//derecha

    }

}
