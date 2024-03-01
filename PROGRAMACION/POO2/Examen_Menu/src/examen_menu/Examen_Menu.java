/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_menu;

/**
 *
 * @author yosari
 */
public class Examen_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m1 = new Menu("fdg", "dnjfnv", "nfvjf");
        Menu m2 = new Menu("ddddd", "yy", "uuuu");

       Menu m3 =new Menu ("3dam");

        m3.combinar(m2,m1);
        m2.triarOpcio();
           
      
    }

}
