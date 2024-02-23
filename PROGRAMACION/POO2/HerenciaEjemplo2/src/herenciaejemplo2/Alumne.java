/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejemplo2;

/**
 *
 * @author yosari
 */
public class Alumne extends Persona2{
    private String assignatira;
    private  double nota;
    
    public Alumne(String nom, String DNI,  String assignatura, double nota) {
        super(nom, DNI);
        this.assignatira=assignatira;
        this.nota=nota;
        
        
        super.DNI="1837474995";
    }

    public String getAssignatira() {
        return assignatira;
    }

    public double getNota() {
        return nota;
    }
    
    public void mostrarPersona(){
    super.mostrarPersona();
        System.out.println("Assignatura: "+this.getAssignatira());
        System.out.println("Nota     :"+this.getNota());
            
    }
    
}
