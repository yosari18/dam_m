
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_11_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tama =100;
        int miarray[] = new int[tama];
        int miarray2[] = new int[tama];
        System.out.print("Primer array : ");
        for (int i = 0; i < tama; i++) {
            miarray[i] = i + 1;
            System.out.print(miarray[i] + " ");

        }
        System.out.print("\nSegundo array :");
        for (int i = 0; i < tama; i++) {
            miarray2[i]=miarray[tama-i-1];
            System.out.print(miarray2[i]+" ");
            
        }
        
    }

}
