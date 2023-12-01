
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int num;

        boolean seguir = true;

        while (seguir == true) {
            num = (max + min) / 2;

            System.out.println("El numero es " + num + " ?<>o= para adivinar");
            String respu = entrada.nextLine();
            switch (respu) {
                case "<":
                    max = num;

                    break;
                case "=":
                    seguir = false;
                    break;
                case ">":
                    min = num;

                    break;

            }

        }
        System.out.println("felicidades");
    }

}
