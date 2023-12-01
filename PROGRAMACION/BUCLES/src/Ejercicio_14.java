
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidad, numBilletes, billete;

        billete = 500;

        System.out.print("Introduce una cantidad (multiplo de 5) en €: ");
        cantidad = entrada.nextInt();

        while (cantidad > 0) {
            numBilletes = cantidad / billete;
            cantidad = cantidad % billete;

            System.out.println(numBilletes + " billetes de " + billete);

            switch (billete) {
                case 500:
                    billete = 200;
                    break;
                case 200:
                    billete = 100;
                    break;
                case 100:
                    billete = 50;
                    break;
                case 50:
                    billete = 20;
                    break;
                case 20:
                    billete = 10;
                    break;
                case 10:
                    billete = 5;
                    break;
            }

        }
    }

}
