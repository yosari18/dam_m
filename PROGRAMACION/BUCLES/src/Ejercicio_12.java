
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir base : ");
        int a = entrada.nextInt();
        System.out.println("Introducir potencia : ");
        int b = entrada.nextInt();
        int veces;
        double poten = 1;
        if (b < 0) {
            veces = -b;
        } else {
            veces = b;
        }
        for (int i = 0; i < b; i++) {
            poten *= a;
        }
        if (b < 0) {
            poten = 1 / poten;

        }
        System.out.println(a + " elevado a " + b + " es " + poten);
    }

}
