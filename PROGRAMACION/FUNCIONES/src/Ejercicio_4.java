
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

    public static String dimeSigne(int a) {
       String resultado = "negativo";
       String resultado2 = "cero";
       String resultado3 = "positivo";
        if (a < 0) {
            return resultado;
        } else if (a == 0) {
            return resultado2;
        } else {
            return resultado3;
        }
    }

    public static void main(String[] args) {
         PrintStream pri = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner entrada = new Scanner(System.in);
        pri.print("Ingrese un número : ");
        int num = entrada.nextInt();
        pri.println("El número que ingreso es : " + dimeSigne(num));
    }

}
