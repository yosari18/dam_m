
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
        System.out.println("#####RESULTATS#####");
        int n;

        do {

            System.out.print("Total jugadors =");
            n = entrada.nextInt();
            

            if (n <= 2) {
                System.out.println("Error en datos de entrada ");
            }

        } while (n <= 2);
        System.out.println("///Nom i puntuacions de tots els jugadors///");

    }

}
