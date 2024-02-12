/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author yosari
 */
public class Produc_uni {

    private String cod;
    private String titol;
    private int format;
    private double preu;
    private final static double IVA = 0.21;

    public Produc_uni(String cod, String titol, int format, double preu) {
        this.cod = cod;
        this.titol = titol;
        this.format = format;
        this.preu = preu;
    }

    public double preu(double preu_dia) {
        return preu;

    }

    public double Preu2(double preu_dos) {
        double resultado;
        resultado = (preu * 0.2) * 0.8;
        return resultado;
    }

    public void setModifica(String cod, String titol, int format, double preu) {
        this.cod = cod;
        this.format = format;
        this.titol = titol;
        this.preu = preu;

    }

    public String getcod() {
        return cod;

    }

    public String gettitol() {
        return titol;

    }

    public int getformat() {
        return format;

    }

    public double getpreu() {
        return preu;
    }

}
