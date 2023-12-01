/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma100;

/**
 *
 * @author yosari
 */
public class Suma100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, sum;
        sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.print("La suma de 100 nombres: " + sum);
    }

}
