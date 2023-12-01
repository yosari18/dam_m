
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_15_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma =0;
        for (int i = 0; i <= 10; i++) {
             suma+=i;
           
        }
        int miarray[] = new int [suma];
        for (int i = 1; i < miarray.length; i++) {
            for (int j = 0; j <= i; j++) {
                miarray[i]=j;
                
                
                
            }
           System.out.println(Arrays.toString(miarray));
        }
         
    }

}
