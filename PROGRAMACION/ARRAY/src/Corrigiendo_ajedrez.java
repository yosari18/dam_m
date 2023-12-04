
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Corrigiendo_ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int n;

        do {
            System.out.print("Introducir numero :");
            n = entrada.nextInt();
            if (n <= 2) {
                System.out.println("Error en datos de entrada");
            }
        } while (n <= 2);
        int jugador = (int) Math.random() * (n - 2) + 2;
        String nomJugadores[] = new String[jugador];
        double puntos[] = new double[jugador];
        boolean fase[] = new boolean[jugador];

        for (int i = 0; i < jugador; i++) {
            System.out.print("Ingresar nombre :");
            nomJugadores[i] = entrada.nextLine();
            entrada.nextLine();
            System.out.print("Ingresar puntuacion: ");
            puntos[i] = entrada.nextDouble();

            do {

                if (puntos[i] < 1.0 || puntos[i] > 2.0) {//Si el punto que ingreso el usuario cumple con esta condicion, vuelve a pedir que ingrese la correcta
                    System.out.println("El valor tiene que estar entre 1 y 2");

                    System.out.println("Ingresar puntuacion: ");
                    puntos[i] = entrada.nextDouble();

                    entrada.nextLine();

                }
            } while (puntos[i] < 1.0 || puntos[i] > 2.0);
            while (true) {//Creo un blucle infinito
                String respuesta = entrada.nextLine().toLowerCase();//Uso el metodo toLowerCase() para obtener minusculas 
                if (respuesta.equals("s")) {
                    fase[i] = true;//Almacenamos en el array
                    break;
                } else if (respuesta.equals("n")) {
                    fase[i] = false;//No almacenamos en el array
                    break;
                } else {
                    System.out.print("Ha superado la fase previa? (s/n):");
                }

            }
        }
        /* for (int i = 0; i < jugador; i++) {
            System.out.println(nomJugadores[i]+" consiguio "+puntos[i]);
        }*/

    }

}
