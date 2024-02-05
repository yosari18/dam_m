/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;

/**
 *
 * @author yosari
 */
public class alumnes {

    private String nom;
    private String ape;
    private int edat;

    public void setNom(String inNom) {
        nom = inNom;

    }

    public void setApe(String inApe) {
        ape = inApe;

    }

    public void setedat(int inedad) {
        edat = inedad;

    }
    public String toString(){
    return (nom+" "+ape+" tiene "+edat+ " any" );
    }

}
