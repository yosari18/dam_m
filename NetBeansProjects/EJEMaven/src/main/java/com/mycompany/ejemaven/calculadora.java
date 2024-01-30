/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemaven;

/**
 *
 * @author yosari
 */
public class calculadora {

    private float lastResult;
    private String lastOp;

    public float getLastResult() {
        return this.lastResult;
    }

    public String getLastOp() {
        return this.lastOp;
    }

    public float suma(float op1, float op2) {
        float resultado = op1 + op2;
        this.lastResult = resultado;
        this.lastOp = "suma";
        return resultado;
    }

    public float resta(float op1, float op2) {
        float resultado = op1 - op2;
        this.lastResult = resultado;
        this.lastOp = "resta";
        return resultado;
    }

    public float division(float op1, float op2) {
        float resultado = op1 / op2;
        this.lastResult = resultado;
        this.lastOp = "division";
        return resultado;
    }

    public float multipliuca(float op1, float op2) {
        float resultado = op1 * op2;
        this.lastResult = resultado;
        this.lastOp = "multiplica";
        return resultado;
    }

    public int MayorQue(float op1, float op2) {
        int falso = 0;
        int verdadero=1;
        this.lastResult = falso;
         this.lastResult = verdadero;
        this.lastOp ="MayorQue";

        if (op1 > op2) {
          return  verdadero;

        }
        return falso;

    }

}
