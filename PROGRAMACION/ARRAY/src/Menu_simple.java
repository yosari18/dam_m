
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Menu_simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        int a = 0;
        int b = 0;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("a) Ingrese dos numeros");
            System.out.println("b) Sumar numeros ingresados");
            System.out.println("c) Restar numeros");
            System.out.println("d) Salir   ");
            System.out.print("Elige una opcion :");
            String resp = entrada.nextLine();

            switch (resp.toLowerCase().charAt(0)) {
                case 'a':
                    System.out.println("Ingrese numero a:");
                    a = entrada.nextInt();
                    System.out.println("Ingrese numero b");
                    b = entrada.nextInt();
                    entrada.nextLine();
                    break;
                case 'b':
                    int suma = a + b;
                    System.out.println("la suma es " + suma);
                    break;
                case 'c':
                    int resta = a - b;
                    System.out.println("la resta es " + resta);
                    break;
                case 'd':
                    seguir = false;
                
            }

        } while (seguir);

    }

}
