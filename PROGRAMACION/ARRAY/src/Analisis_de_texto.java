
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Analisis_de_texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un programa que analice un texto ingresado por el usuario. Debe contar la cantidad de palabras, la
        longitud promedio de las palabras y determinar la palabra más larga.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir frase :");
        String texto = entrada.nextLine();
       
        String cantPalabras[] = texto.split(" ");
        int contPalabras = cantPalabras.length;

        int suma = 0;
        int medialong;
        //loguitud promedio
        for (String palabras : cantPalabras) {
            suma += palabras.length();
        }
        medialong = suma / cantPalabras.length;
        //palabras mas largas
        String palabralarga = "";
        for (String palabras : cantPalabras) {
            if (palabras.length() > palabralarga.length()) {
                palabralarga = palabras;

            }
        }
        System.out.println("Cantidad de palabras " + contPalabras);
        System.out.println("longuitud " + medialong);
        System.out.print("palabra largo " + palabralarga);
    }

}
