
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Escacs_Yosari_Venancio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int n;
        String nomJugador;
        double puntos;

        do {

            System.out.print("Total jugadors =");
            n = entrada.nextInt();

            if (n <= 2) {
                System.out.println("Error en datos de entrada ");
            }

        } while (n <= 2);
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre del jugador :");
            nomJugador = entrada.nextLine();
            entrada.next();

            do {
                System.out.print("Ingresar puntuacion del jugador :");
                puntos = entrada.nextDouble();
                if (puntos >= 1 && puntos <= 2) {
                    System.out.println("Los valores tiene que ser entre 1.0 y 2.0");

                }

            } while (puntos >= 1 && puntos <= 2);

        }

    }

}
