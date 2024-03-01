/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mare_ejemplo;

/**
 *
 * @author yosari
 */
public class Mare_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mare mare1 = new Mare();
        Filla1 filla1 = new Filla1();
        Filla2 filla2 = new Filla2();

        System.out.println("Variable mare 1:");
        mare1.crida();

        Mare mare2;
        mare2 = mare1;
        System.out.println("Variable mare 2:");
        mare2.crida();

        mare2 = filla1;
        System.out.println("Variable mare2:");
        mare2.crida();

        mare2 = filla2;
        System.out.println("Variable mare2");
        mare2.crida();
        filla2.crida(14,"Nodf");
    }

}
