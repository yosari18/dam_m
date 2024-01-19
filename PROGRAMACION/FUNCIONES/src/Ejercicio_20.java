/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_20 {

    public static void tabla(int num) {
        int prod = 1;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                prod = i * j;
                System.out.println(i + " x " + j + " = " + prod);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int num = 1;
        tabla(num);

    }

}
