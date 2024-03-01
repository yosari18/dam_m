/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_menu;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Menu {

    static Scanner entrada = new Scanner(System.in);

    static final String titulo = " 1 DAM";
    String progr;
    String lm;
    String titu;

    public Menu() {
    }

    public Menu(String titu) {
        this.titu = titu;
    }

    public Menu(String titu, String progr, String lm) {
        this.progr = progr;
        this.lm = lm;
        this.titu = titu;
    }

    public static String getTitulo() {
        return titulo;
    }

    public String getProgr() {
        return progr;
    }

    public String getLm() {
        return lm;
    }

    public String getTitu() {
        return titu;
    }

    private int mostrarMenu() {

        int opcion;
        do {
            System.out.println(this.titu);
            System.out.println("-".repeat(19));
            System.out.println("1 " + this.progr);
            System.out.println("2 " + this.lm);
            System.out.println("3 salir");
            System.out.print("Elige opcion :");
            opcion = entrada.nextInt();
        } while (opcion <= 0 && opcion >= 4);
        return opcion;
    }

    public void triarOpcio() {

        boolean salir = true;
        do {

            switch (this.mostrarMenu()) {
                case 1:
                    System.out.println("PROGRAMACIO");

                    break;
                case 2:
                    System.out.println("LENGUAJE DE MARCA");

                    break;
                case 3:
                    salir = false;

                    break;
                default:
                    this.mostrarMenu();

            }
        } while (salir);
    }

    public void combinar(Menu m, Menu m2) {
        //this.mostrarMenu();
        System.out.println(this.titu);
        System.out.println("-".repeat(12));
        System.out.println("1 " + this.getProgr());
        System.out.println("2 " + this.lm);
        System.out.println("4 " + this.progr);
        System.out.println("5 " + this.lm);
        System.out.print("Elige opcion :");
        int opcion = entrada.nextInt();

    }

}
