/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.view.War;

/**
 *
 * @author leona
 */
public class WarControl {
    
    public static War ventanaWar = new War();

    public WarControl() {}
    
    public static void mostrar(){
        ventanaWar.setVisible(true);
    }
    
    public static void ocultar(){
        ventanaWar.setVisible(false);
    }
    
    public static void main(String[] args) {
        mostrar();
    }
    
}
