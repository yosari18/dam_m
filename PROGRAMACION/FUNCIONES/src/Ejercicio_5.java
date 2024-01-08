
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
public class Ejercicio_5 {

    public static double milles_a_quilometres(int milles) {
        return 160934 * milles;

    }

    public static void main(String[] args) {
        PrintStream pri = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce cantidad de millas : ");
        int millas = entrada.nextInt();
        pri.println("En kilómetros es : " + milles_a_quilometres(millas));

    }

}
