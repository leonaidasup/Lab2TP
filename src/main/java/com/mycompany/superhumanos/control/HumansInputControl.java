/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.view.HumansInput;

/**
 *
 * @author Leonardo.amaris
 */
public class HumansInputControl {
    
    public static HumansInput ventana = new HumansInput();

    public HumansInputControl() {}
    
    public void mostrar(){
        ventana.setVisible(true);
    }
    
    public void ocultar(){
        ventana.setVisible(false);
    }
    
    
}
