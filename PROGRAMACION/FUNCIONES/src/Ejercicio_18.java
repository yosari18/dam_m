
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_18 {

    /**
     * 18. El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera:
     * Se divide el número de DNI entre 23 y el resto es codificado por una
     * letra según la siguiente equivalencia: 0:"T", 1: "R", 2: "W", 3: "A", 4:
     * "G", 5: "M", 6: "*Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
     * 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C",
     * 21: "K", 22: "E" Escribe un programa que pido el DNI y muestro por
     * pantalla la letra asociada. Para lo cual se tendrá que crear una función
     * a la cual se le paso el número y devuelvo la letra. Ejemplo: para el DNI
     * 56321122 el NIF es ‘X’.
     */
    private static char NIF(int dni) {
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasNIF[dni % 23]; // Calcular el resto
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de DNI: ");
        int dni = scanner.nextInt();
        System.out.println(dni + "" + NIF(dni));

    }
}
