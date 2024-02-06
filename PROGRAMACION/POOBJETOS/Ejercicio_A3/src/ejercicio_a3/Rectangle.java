/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_a3;

/**
 *
 * @author yosari
 */
public class Rectangle {

    int x1;
    int y1;
    int x2;
    int y2;
    public Rectangle(int x1,int y1,int x2,int y2){
        
        if((x2>x1) && (y2>y1)){
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        
        }else{
            System.out.println("**ERROR al instanciar el rectangulo");
        }
    
    }
}
