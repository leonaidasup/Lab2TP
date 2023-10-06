/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.view.PruebasFIsicasMentales;

/**
 *
 * @author leona
 */
public class PruebasFisicasMentalesControl {
    public static PruebasFIsicasMentales ventanaPruebasFIsicasMentales = new PruebasFIsicasMentales();

    public PruebasFisicasMentalesControl() {}
    
    public static void mostrar(){
        ventanaPruebasFIsicasMentales.setVisible(true);
    }
    
    public static void ocultar(){
        ventanaPruebasFIsicasMentales.setVisible(false);
    }
    
    public static void main(String[] args) {
        mostrar();
    }
}
