
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
public class Rotar_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
 *    elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1,
 *    el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 *    posición 0. Finalmente, muestra el contenido del array.
         */

        Scanner entrada = new Scanner(System.in);
        int numero[] = new int[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Numero #" + (i + 1) + " :");
            numero[i] = entrada.nextInt();

        }
        int cont = numero[4];
        for (int i = 4; i > 0; i--) {
            numero[i] = numero[i - 1];

        }
        numero[0] = cont;
        System.out.println("Array real :" + Arrays.toString(numero));
    }

}
