/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Mostrar_prints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double numero=1.523867;
        System.out.printf("%.2f %n ", numero);//2f muestra la cantidad de decimales y n da un salto de linea
       
        double pos=1.4563346;
        System.out.printf("%+.3f %n", pos);//imprime el signo + antes del numero
        
        int x=10;
        System.out.printf("%d %n ", x);//d para numeros enteros
        
        int x1=10;
        System.out.printf("%+d %n", x1);//con signo
        
        int num1=12;
        double num2=2.45612098;
        
        System.out.printf("num1=%d  num2=%.2f %n", num1,num2);//varias variables
      
        double cuadrado=5.234267;// saca el cuadrado
        System.out.printf("El cuadrado de %.2f  es %.2f\n",cuadrado, cuadrado*cuadrado);
        
        double spacio=2.4535478;
        System.out.printf("%+10.2f %n",spacio);//el 10 es modificable ´para dar espacio
        
        System.out.printf("%10s %n","total");//espacio
    }
    
}
