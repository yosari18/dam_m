/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam_temps;

/**
 *
 * @author yosari
 */
public class Temps {

    private int hora;
    private int minuto;
    private int segundo;

    public Temps(int hora, int minuto, int segundo) {
        this.hora = hora;

        if (minuto > 0 && minuto < 59) {
            this.minuto = minuto;
        } else {
            this.normalitza();
        }
        if (segundo > 0 && segundo < 59) {
            this.segundo = segundo;
        } else {
            this.normalitza();
        }

    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {

        return segundo;
    }

    public void setHora(int hora) {
        if (hora > 0) {
            this.hora += hora;
        } else {
            this.hora -= hora;
        }

    }

    public void setMinuto(int minuto) {
        if (minuto > 0) {
            this.minuto += minuto;
        } else {
            this.minuto -= minuto;
        }

    }

    public void setSegundo(int segundo) {
        if (segundo > 0) {
            this.segundo += segundo;
        } else {
            this.segundo -= segundo;
        }

    }

    private void normalitza() {
        int s = this.hora * 3600 + this.minuto * 60 + this.segundo;

        this.hora = s / 3600;
        this.minuto = (s % 3600) / 60;
        this.segundo = (s % 3600) % 60;
    }

    public Temps suma(Temps t) {
        int hora = this.hora + this.hora;
        int segundo = this.minuto + this.minuto;
        int minuto = this.segundo + this.segundo;

        //return Temps(hora, minuto, segundo);
        return null;
    }

    public Temps resta(Temps t) {
        int hora = this.hora - this.hora;
        int segundo = this.minuto - this.minuto;
        int minuto = this.segundo - this.segundo;

        //return Temps(hora, minuto, segundo);
        return null;
    }

    @Override
    public String toString() {
        return +this.hora + "h " + this.minuto + "m " + this.segundo + "s";

    }

}
