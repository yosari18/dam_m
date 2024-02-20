/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

/**
 *
 * @author yosari
 */
public class Article {

    private String nombre;
    private double preu;
    private double IVA;
    private int QuantsQueden;

    public Article(String nombre, double preu, double IVA, int QuantsQueden) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("*** ERROR  nombres ");
        }
        if (preu >= 1) {
            this.preu = preu;
        } else {
            System.out.println("*** ERROR  precio ");
        }
        if (IVA == 21 || IVA == 10 || IVA == 4) {
            if (IVA == 21) {
                this.IVA = 0.21;
            } else if (IVA == 10) {
                this.IVA = 0.10;
            } else if (IVA == 4) {
                this.IVA = 0.4;
            }
        } else {
            System.out.println("*** ERROR:  IVA " + IVA + "% no vàlid");
        }
        if (QuantsQueden > 1) {
            this.QuantsQueden = QuantsQueden;
        } else {
            System.out.println("*** ERROR: El stock no pot ser menor que 0 ");
        }

    }

    public String getNom() {
        return nombre;
    }

    public double getPreu() {
        return preu;
    }

    public double getIVA() {

        return IVA;
    }

    public int getQuantsQueden() {
        return QuantsQueden;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Tenemos errores en el nombre");
        }

    }

    public void setPreu(double precioNu) {
        if (precioNu > 0) {
            this.preu = precioNu;
        } else {
            System.out.println("*** ERROR: El preu no pot ser menor que 0 ");
        }
    }

    public void setIva(double IVA) {
        if (IVA == 21 || IVA == 10 || IVA == 4) {
            this.IVA = IVA;
        } else {
            System.out.println("*** ERROR: IVA " + IVA + "%  no vàlid");
        }
    }

    public void setQuantsQueden(int cuantasQuedan) {
        if (this.QuantsQueden > 1) {
            this.QuantsQueden = cuantasQuedan;
        } else {
            System.out.println("Tenemos errores en cantidades de producto");
        }
    }

    public double getPVP() {
        return getPreu() * (getIVA() + 1);
    }

    public double getPVPDescompte(int descuento) {
        return getPreu() * (getIVA());
    }

    public boolean vendre(int cantidad) {
        if (cantidad <= this.QuantsQueden) {
            this.QuantsQueden -= cantidad;
            return true;
        } else {
            //System.out.println("Error: No hay suficiente stock para vender " + cantidad + " unidades del artículo '" + nombre + "'.");
            return false;
        }
    }

    public boolean emmagatzema(int cantida) {
        if (cantida < 0) {
            System.out.println("Error: No se puede almacenar una cantidad negativa de artículos.");
            return false;
        }

        this.QuantsQueden += cantida;
        return true;
    }

    public void imprimeix() {
        System.out.println(getNom() + " - Preu:" + getPreu() + "% - IVA:" + this.IVA + "% - PVP: " + getPVP() + "€" + " (queden " + getQuantsQueden() + " articles)");

    }

}
