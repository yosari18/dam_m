/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemaven;

/**
 *
 * @author yosari
 */
public class EJEMaven {

    private static float operand1;
    private static float operand2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 2) {
            System.out.println("\n Sintaxi incorrecta. Necesitas dos numeros.");
            System.exit(-1);
        }
        operand1 = Float.parseFloat(args[0]);
        operand2 = Float.parseFloat(args[1]);

        calculadora myCalc = new calculadora();

        System.out.println("La suma entre " + operand1 + " y " + operand2 + " es  :" + myCalc.suma(operand1, operand2));
        System.out.println("La resta entre " + operand1 + " y " + operand2 + " es  :" + myCalc.resta(operand1, operand2));
        System.out.println("La division entre " + operand1 + " y " + operand2 + " es  :" + myCalc.division(operand1, operand2));
        System.out.println("La multiplicacion  entre " + operand1 + " y " + operand2 + " es  :" + myCalc.multipliuca(operand1, operand2));
        System.out.println(operand1 + " es mayor que " + operand2 + "   :" + myCalc.MayorQue(operand1, operand2));
        System.out.println("Ultima operacionj realizada : " + myCalc.getLastOp() + "; ultimo resultado " + myCalc.getLastResult());
    }
}
