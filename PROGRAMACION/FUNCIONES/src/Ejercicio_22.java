
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_22 {

    public static int menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1)circumferencia ");
        System.out.println("2)area");
        System.out.println("3)volumen");
        System.out.println("4)todas");
        System.out.println("5)salida");
        int elig;
        System.out.print("Elige  :");
        elig = entrada.nextInt();
        return elig;

    }

    public static double demanaRadi() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir radio: ");
        double radio = entrada.nextDouble();
        return radio;
    }

    public static double circum(double r) {
        return 2 * Math.PI * r;
    }

    public static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double volumen(double r) {
        return (3 / 4) * Math.PI * Math.pow(r, 3);

    }

    public static void main(String[] args) {
        boolean contMenu = true;
        while (contMenu) {

            switch (menu()) {
                case 1:
                    System.out.printf("cercunferencia es:%.2f ", circum(demanaRadi()));
                    break;
                case 2:
                    System.out.printf("El area del cuadrado es: %.2f", area(demanaRadi()));
                    break;
                case 3:
                    System.out.printf("El volumen es :%.2f", volumen(demanaRadi()));
                    break;
                case 4:
                    System.out.printf("cercunferencia es:%.2f ", circum(demanaRadi()));
                    System.out.printf("El area del cuadrado es: %.2f", area(demanaRadi()));
                    System.out.printf("El volumen es :%.2f", volumen(demanaRadi()));
                    break;
                case 5:
                    contMenu = false;
                    break;
                default:
                    System.out.println("Debe ingresar entre 1 y 2 ");
            }
        }
    }

}
