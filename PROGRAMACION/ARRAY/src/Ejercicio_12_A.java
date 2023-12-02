
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_12_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[10];
        boolean seguir = true;
        int valor = 0;
        int posicion = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("A) Mostrar valores ");
            System.out.println("B) Introducir valor ");
            System.out.println("C) Salir");
            System.out.println("Elige :");
            String resul = entrada.nextLine();
            switch (resul) {
                case "a":
                    for (int i = 0; i < num.length; i++) {
                        System.out.print(num[i] + " ");

                    }

                    break;
                case "b":
                    System.out.println("Introduce valor : ");
                    valor = entrada.nextInt();
                    System.out.println("Introducir posicion : ");
                    posicion = entrada.nextInt();
                    if (posicion < 0 || posicion >= num.length) {
                        System.out.println("Fuera del array");
                    } else {
                        num[posicion] = valor;
                    }
                    entrada.nextLine();
                    break;
                case "c":
                    seguir = false;
                    break;
                default:
                    System.out.println("Error en datos de entrada");

            }
        } while (seguir == true);
    }
}
