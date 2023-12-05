
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author yosari
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int miarray [][]= new int [5][5];
        int num=0;
        for(int i=0; i<miarray.length; i++){
            for (int j = 0; j <miarray[i].length; j++) {
                num=num+1;
                miarray[i][j]=num;
               
                
            }
            System.out.println(Arrays.toString(miarray[i]));
            System.out.println(Arrays.deepToString(miarray[i]));
        
        }
    }
    
}
