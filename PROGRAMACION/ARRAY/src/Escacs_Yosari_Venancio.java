
import java.util.Arrays;
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

        Scanner entrada = new Scanner(System.in);

        int n;
        double suma = 0;
        double media = 0;
        //Pedimos cantidad de jugadores

        do {

            System.out.print("Total jugadors =");
            n = entrada.nextInt();
            entrada.nextLine();

            if (n <=2) {
                System.out.println("Error en datos de entrada ");
            }

        } while (n<=2);
        //Declaramos los arrays con la cantidad de jugadores
        String[] nomJugador = new String[n];
        double puntos[] = new double[n];
        boolean[] fase = new boolean[n];
        //Pedimos nombres y puntos del jugador y almacenamos en nuestro array
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresar nombre :");
            nomJugador[i] = entrada.nextLine();

            System.out.print("Ingresar puntuacion: ");
            puntos[i] = entrada.nextDouble();
            entrada.nextLine();

            do {

                if (puntos[i] < 1.0 || puntos[i] > 2.0) {//Si el punto que ingreso el usuario cumple con esta condicion, vuelve a pedir que ingrese la correcta
                    System.out.println("El valor tiene que estar entre 1 y 2");

                    System.out.println("Ingresar puntuacion: ");
                    puntos[i] = entrada.nextDouble();

                    entrada.nextLine();

                }
            } while (puntos[i] < 1.0 || puntos[i] > 2.0);
            //Calculamos la media con la cantidad de datos que tenemos almacenado en nuestro array puntos
            suma += puntos[i];
            media = suma / n;
            System.out.print("Ha superado la fase previa? (s/n): ");

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

        System.out.println("#####RESULTATS#####");
        System.out.println("Total jugadors =" + n);
        System.out.printf("Puntuació mitjana =%.3f  ", media);
        System.out.println("\n////Nom i puntuacions de tots els jugadors////");

        //Mostramos a todos los jugadores 
        for (int i = 0; i < n; i++) {
            System.out.println(nomJugador[i] + "ha aconsesguit " + puntos[i] + " punts");
        }

        // Mostrar nombre y puntuación solo de los jugadores que han superado la fase previa
        System.out.println("\n////Només dels jugadors que han superat la fase prévia");
        for (int i = 0; i < n; i++) {
            if (fase[i]) {
                System.out.println(nomJugador[i] + " ha aconsesguit " + puntos[i] + " punts");
            }
        }

    }

}
