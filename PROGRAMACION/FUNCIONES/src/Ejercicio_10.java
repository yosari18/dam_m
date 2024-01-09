
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Ejercicio_10 {

    public static boolean fechaCorrecta(int dia, int mes, int anio) {
        boolean resultado=true;
        if(dia>=1 && dia<=30 && mes>=1 && anio>=1){
           return resultado;
        
        }
        return resultado=false;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime el dia :");
        int dia = entrada.nextInt();
        System.out.print("Dime el mes : ");
        int mes = entrada.nextInt();
        System.out.print("Dime el año :");
        int anio = entrada.nextInt();
        
        System.out.println("Los datos que ingreso es : "+fechaCorrecta(dia, mes, anio)+ "  ( "+dia);
    }

}
