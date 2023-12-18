/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejemplo_1 {

    
        public static void imprimiendoHolaMundo() {
        System.out.println("Hola mundo");
    }

    public static int doble(int a) {
        int resultado = a * 2;
        return resultado;

    }

    public static int multiplica(int a, int b) {
        int resultado = a * b;
        return resultado;

    }

    public static void main(String[] args) {
        imprimiendoHolaMundo();
        int a=doble(10);
        int b=multiplica(3,5);
        System.out.println("Funcion doble: "+a+"\nFuncion multiplica: "+b);
        
    }
    
    
}
