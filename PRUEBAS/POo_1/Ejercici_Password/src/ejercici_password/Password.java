/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercici_password;

import java.util.Random;

/**
 *
 * @author yosari
 */
public class Password {

    final int longitudTama = 8;
    int longui;
    String contraseña;

    public Password() {
    }

    public Password(int longui) {
        this.longui = longui;
    }

    public boolean esFuerte() {
        if (generarPassword().matches("^(?=(?:[^A-Z]*[A-Z]){2})(?=(?:[^a-z]*[a-z]){1})(?=(?:\\D*\\d){5}).{8}$")) {
            return true;
        } else {
            return false;
        }
    }

    public String generarPassword() {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int recibeContra;
        for (int i = 0; i < longui; i++) {
            recibeContra = rand.nextInt(caracteres.length());
            sb.append(caracteres.charAt(recibeContra));
        }
        return sb.toString();
    }

    public int getLongui() {
        return longui;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongui(int longui) {
        this.longui = longui;
    }

    @Override
    public String toString() {
        return "Password{" + "longitudTama=" + longitudTama + ", longui=" + longui + ", contrase\u00f1a=" + this.generarPassword() + "es fuerte "+this.esFuerte()+'}';
    }

}
