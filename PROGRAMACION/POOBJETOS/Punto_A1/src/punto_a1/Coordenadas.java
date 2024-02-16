/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_a1;

import java.util.Random;

/**
 *
 * @author yosari
 */
public class Coordenadas {

    int x;
    int y;

    public Coordenadas(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public void setx(int x) {
        this.x = x;

    }

    public void sety(int y) {
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public void imprime() {
        System.out.println("Las coordendas son : (" + getx() + "," + gety() + ")");
        creaPuntoAleatorio();

    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public int distancia(Coordenadas p) {
        return (int) Math.sqrt((Math.pow(p.getx(), 2)) + (Math.pow(p.gety(), 2)));
    }

    public static Coordenadas creaPuntoAleatorio() {
        Random rand = new Random();
        int inicio = -100;
        int ultimo = 100;
        int x = rand.nextInt(21) -10;
        int y = rand.nextInt(21) - 10;
        return new Coordenadas(x, y);
    }

}
