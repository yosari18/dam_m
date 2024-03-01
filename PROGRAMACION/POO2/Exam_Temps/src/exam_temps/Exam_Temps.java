/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_temps;

import java.util.Scanner;

/**
 *
 * @author yosari
 */
public class Exam_Temps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        Temps t1 = new Temps(12, 15, 352);
        Temps t2 = new Temps(5, 100, -5);

       t1.setSegundo(70);
       t2.setSegundo(-70);
       
       t1.setMinuto(120);
       t2.setMinuto(-120);
       t1.toString();
       t2.toString();
       
       t1.setHora(4);
       t2.setHora(-4);
       
       
    }

}
