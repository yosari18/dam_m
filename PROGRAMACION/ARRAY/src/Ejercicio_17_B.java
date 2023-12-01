
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_17_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int miarray[] = new int[30];
         for (int i = 0; i < miarray.length; i++) {
            miarray[i]=(int) (Math.random()*10+0);
        }
         Arrays.sort(miarray);
         System.out.println(Arrays.toString(miarray));
         
     
    }
    
}
