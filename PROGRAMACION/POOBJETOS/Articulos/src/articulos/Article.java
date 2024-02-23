/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulos;

/**
 * @author yosari
 */
public class Article {

    private String nombre;
    private double preu;
    private double IVA;
<<<<<<< HEAD
    private int QuantsQueden;

    public Article(String nombre, double preu, double IVA, int QuantsQueden) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("*** ERROR  nombres ");
=======
    private static final double IVA1 = 21;
    private static final double IVA2 = 10;
    private static final double IVA3 = 4;
    private int cuantasQuedan;

    /*
   Comprobamos que los parámetros estén correctos, de lo contrario, se mostrará un mensaje de error.
     */
    public Article(String nombre, double preu, double IVA, int cuantasQuedan) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("***ERROR:  El nom no pot estar buit");
        }
        if (preu >= 1) {
            this.preu = preu;
        } else {
            System.out.println("ERROR: El preu no pot ser menor que 0");
        }
        if (IVA == IVA1 || IVA == IVA2 || IVA == IVA3) {
            this.IVA = IVA;
        } else {
            System.out.println("*** ERROR:  IVA " + IVA + "% no valid");
        }
        if (cuantasQuedan > 0) {
            this.cuantasQuedan = cuantasQuedan;
        } else {
            System.out.println("*** ERROR: El stock no pot ser menor que 0");
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
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
<<<<<<< HEAD
        return QuantsQueden;
=======
        return cuantasQuedan;
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Tenemos errores en el nombre");
        }
    }

<<<<<<< HEAD
    public void setPreu(double precioNu) {
        if (precioNu > 0) {
            this.preu = precioNu;
        } else {
            System.out.println("*** ERROR: El preu no pot ser menor que 0 ");
=======
    public void setPreu(double precioSinIva) {
        if (precioSinIva > 0) {
            this.preu = precioSinIva;
        } else {
            System.out.println("***ERROR: El preu no pot ser menor que 0");
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
        }
    }

    public void setIva(double IVA) {
<<<<<<< HEAD
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
=======
        if (IVA == IVA1 || IVA == IVA2 || IVA == IVA3) {
            this.IVA = IVA;
        } else {
            System.out.println("*** ERROR:  IVA " + IVA + "% no valid");
        }
    }

    public int setQuantsQueden(int cuantasQuedan) {
        if (cuantasQuedan < 0) {
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
            System.out.println("Tenemos errores en cantidades de producto");
        } else {
            return this.cuantasQuedan = cuantasQuedan;
        }
        return 0;
    }

    public double getPVP() {
<<<<<<< HEAD
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
=======
        return (this.preu / 100.0 * this.IVA) + this.preu;
    }

    /*
    @param El porcentaje de descuento a aplicar
    @return Devuelve el precio con el porcentaje aplicado
     */
    public double getPVPDescompte(int cant) {
        return (this.getPVP() - this.getPVP()) * cant / 100.0;
    }

    /*
    @param Recibe la cantidad de venta y descuenta lo que hay el stock
     */
    public boolean vendre(int cantidad) {
        if (cantidad <= this.cuantasQuedan) {
            this.cuantasQuedan -= cantidad;
            return true;
        } else {
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
            return false;
        }
    }

<<<<<<< HEAD
=======
    /*
    @param Recibe la cantidad de productos y lo actualiza
     */
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
    public boolean emmagatzema(int cantida) {
        if (cantida < 0) {
            System.out.println("Error: No se puede almacenar una cantidad negativa de artículos.");
            return false;
        }
<<<<<<< HEAD

        this.QuantsQueden += cantida;
=======
        this.cuantasQuedan += cantida;
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
        return true;
    }

    public void imprimeix() {
<<<<<<< HEAD
        System.out.println(getNom() + " - Preu:" + getPreu() + "% - IVA:" + this.IVA + "% - PVP: " + getPVP() + "€" + " (queden " + getQuantsQueden() + " articles)");

=======
        System.out.println(getNom() + " - Preu: " + getPreu() + " - IVA: " + this.getIVA() + "% - PVP: " + getPVP() + "€ (queden " + this.setQuantsQueden(cuantasQuedan) + " articles )");
>>>>>>> c61860e0d1c9ea596aa6f4bbcfa66d028738ce40
    }
}
