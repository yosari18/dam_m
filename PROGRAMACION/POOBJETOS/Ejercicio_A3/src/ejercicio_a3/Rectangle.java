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

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        if ((x2 > x1) && (y2 > y1)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;

        } else {
            System.out.println("**ERROR al instanciar el rectangulo");
        }

    }

    public int getarea() {
        return (this.x2 - this.x1) * (this.y2 - this.y1);
    }

    public int getperimetro() {
        return (this.x2 - this.x1) + (this.y2 - this.y1) + (this.x2 - this.x1) + (this.y2 - this.y1);
    }

    public void imprimir() {
        System.out.println("Las coordenadas  son : (" + this.x1 + " " + this.y1 + ") (" + this.x2 + " " + this.y2 + ")");
        System.out.println("El perimetro es : " + this.getperimetro());
        System.out.println("El area es : " + this.getarea());
    }

    public void setX1(int x1) {
        if (this.x1 > this.x2) {
            System.out.println("error");
        }

    }

    public void setxxyy(int x1, int x2,int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    public void setx1x2(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public void sety1y2(int y1, int y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setY1(int y1) {
        if (this.y1 > this.y2) {
            System.out.println("error");
        }
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }

}
