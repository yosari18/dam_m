
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_4 {

    public static int dimeSigne(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número :");
        int num = entrada.nextInt();

        switch (dimeSigne(num)) {
            case 1:
                System.out.println("positivo");

                break;
            case 2:
                System.out.println("negativo");

                break;
            case 3:
                System.out.println("zero");

                break;
            default:
                throw new AssertionError();
        }
    }

}
