
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author yosari
 */
public class Repaso_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int numeroOld = 0;
        int media = 0;
        int numeroNew;
        
        do {
            System.out.println("Introducir numeros: ");
            numeroNew = entrada.nextInt();

            numeroOld = numeroOld + numeroNew;
            if(numeroOld <= 10000){
            
            }

        } while (numeroOld <= 10000);
        media = numeroOld / numeroNew;
        
        System.out.println("La media  es " +media);
        System.out.println("La suma es "+numeroOld);
    }

}
