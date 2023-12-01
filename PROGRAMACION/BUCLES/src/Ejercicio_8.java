
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        int neg=0;
        int pos=0;
        boolean leer=false;
        do {
            System.out.print("Introducir un numero: ");
            n = entrada.nextInt();
            if(n<0){
            neg+=1;
            leer =true;
            }else{
            pos+=1;
            }

        } while (n != 0);
        
        if(leer==false){
            System.out.println("No hay numeros negativos ");
        
        }else{
            System.out.println(" Hay numeros negativos ");
        }
         System.out.println("Hay "+neg+" negativos");
        System.out.println("Hay "+pos+" positivos");
    }

}
