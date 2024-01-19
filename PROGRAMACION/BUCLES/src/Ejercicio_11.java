   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int par=0;
        int impar=0;
        for (int i = 100; i <= 200; i++) {
            if(i%2==0){
            par+=i;
            }else{
            impar+=i;
            }
            
        }
        System.out.println("La suma es :"+par+" de numeros pares");
        System.out.println("La suma es :"+impar+" de numeros  imapar");
    }
    
}
