
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Repaso_tipo_U {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introducir altura : ");
        int altura = entrada.nextInt();
        for (int i = 0; i < altura; i++) {
            System.out.print(" *");
            for (int j = 0; j < altura; j++) {
                System.out.print(" ");

            }
        }

    }

}
