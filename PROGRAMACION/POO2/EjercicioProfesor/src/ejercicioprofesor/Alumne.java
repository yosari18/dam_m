/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioprofesor;

import java.util.ArrayList;
/**
 *
 * @author yosari
 */
public class Alumne extends Persona {
    private int exp;
    private String cicle;
    private int curso;
    private ArrayList<Integer>notas;

    public Alumne(String nom, String DNI, String direccion, int telefon, int exp, String cicle, int curso, ArrayList<Integer>notas) {
        super(nom, DNI, direccion, telefon);
        
        this.exp = exp;
        this.cicle = cicle;
        this.curso = curso;
        this.notas = notas;
    }

    public int getExp() {
        return exp;
    }

    public String getCicle() {
        return cicle;
    }

    public int getCurso() {
        return curso;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public void  mostraPersona(){
        super.mostrarPersona();
        System.out.println("Exp "+this.exp);
        System.out.println("Ciclo "+this.cicle);
        System.out.println("Curso "+this.curso);
        System.out.println("Notas "+this.notas);
    }
    
    
    
}
