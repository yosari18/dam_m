/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iesME.edd.calcula;

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
        int verdadero = 1;
        this.lastResult = falso;
        this.lastResult = verdadero;
        this.lastOp = "MayorQue";

        if (op1 > op2) {
            return verdadero;

        }
        return falso;

    }

    public boolean isPrime(float op1) {
        boolean esPrimo = true;
        float contador = op1 - 1;
        while (contador > 1) {
            if (op1 % contador == 0) {
                esPrimo = false;

            }
            contador--;

        }
        return (esPrimo = true) ? true : false;
    }

    public int nextPrime(float op1) {

        if (op1 < 2) {
            return 2;

        }
        int prime = (int) Math.ceil(op1);
        if (prime % 2 == 0) {
            prime++;

        }
        while (!isPrime(prime)) {
            prime += 2;
        }
        return prime;
    }
}

