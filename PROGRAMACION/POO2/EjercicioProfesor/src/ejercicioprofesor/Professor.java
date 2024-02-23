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
public class Professor extends Persona{
    private int cod;
    private String dept;
    private ArrayList <String> modulos;
    private String horario;

    public Professor(int cod, String dept, ArrayList<String> modulos, String horario, String nom, String DNI, String direccion, int telefon) {
        super(nom, DNI, direccion, telefon);
        this.cod = cod;
        this.dept = dept;
        this.modulos = modulos;
        this.horario = horario;
    }

    public int getCod() {
        return cod;
    }

    public String getDept() {
        return dept;
    }

    public ArrayList<String> getModulos() {
        return modulos;
    }

    public String getHorario() {
        return horario;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setModulos(ArrayList<String> modulos) {
        this.modulos = modulos;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void mostraPersona (){
        super.mostrarPersona();
        System.out.println("Codigo "+this.cod);
        System.out.println("Departamento "+this.dept);
        System.out.println("Modulos "+this.modulos);
        System.out.println("Horario "+this.horario);
    }
}
