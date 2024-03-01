/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_astres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Ejercicio_Astres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Planeta tierra = new Planeta("tierra ", 34, 56, 754, 433, 435, 43, 345, false);
        SatelLit luna = new SatelLit("ddd", 2334, 32, 433, 212345, 67767, 4354, 5656, tierra);

        ArrayList<Astre> astres = new ArrayList<Astre>();
        astres.add(new SatelLit("luna", 2334, 32, 433, 212345, 67767, 4354, 5656, tierra));
        astres.add(tierra);
        astres.add(luna);

        ArrayList<SatelLit> jupiter = new ArrayList<SatelLit>();
        jupiter.add(new SatelLit("ddddsd", 2334, 32, 433, 212345, 67767, 4354, 5656));
        jupiter.add(new SatelLit("dsffas", 23567734, 68798, 435347688, 454, 65756, 456576, 5657876));
        astres.add(new Planeta("jupiter ", 34, 56, 754, 433, 435, 43, 345, true, jupiter));

        Planeta jupiter2 = new Planeta("jupiter2 ", 34, 56, 754, 433, 435, 43, 345, false);
        jupiter2.setSatelite(jupiter);
        astres.add(jupiter2);

        menu(astres);
    }

    public static void menu(ArrayList<Astre> as) {

        Scanner entrada = new Scanner(System.in);
        int elegir;
        do {
            System.out.println("");
            System.out.println("ASTROS");
            for (int i = 0; i < as.size(); i++) {
                System.out.println((i + 1) + "  " + as.get(i).getNom());
            }
            System.out.print("Elige un astros  0 para salir :");
            
            elegir = entrada.nextInt();
            int newEle = elegir - 1;

            if (elegir == 0) {
                break;

            } else if (newEle < as.size()) {
                as.get(newEle).mostrar();
            } else {
                System.out.println("Numero incorrecto");
            }
        } while (true);

    }
}
