
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

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce cantidad de millas : ");
        int millas = entrada.nextInt();
        System.out.println("En kilometros es : " + milles_a_quilometres(millas));

    }

}
