
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir  10 numero: ");

        boolean leer = false;

        for (int i = 0; i <= 10; i++) {
            System.out.print("numero # " + (i + 1) + " :");
            int n = entrada.nextInt();
            if (n < 0) {
                leer = true;

            }

        }
        if(leer==false){
            System.out.println("No hay negativos");
        }else{
            System.out.println("hay negativos");
        }

    }

}
