
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame un numero para contar los multiplos: ");
        int num=entrada.nextInt();
        int cont=0;
        for (int i = 1; i <= num; i++) {
            if(i%3==0){
                cont++;
            
            }
            
        }
        System.out.println("Cantidad de multiplos de 3 es :"+cont);
    }
    
}
