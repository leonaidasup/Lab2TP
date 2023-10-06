/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.view.HumansInput;
import com.mycompany.superhumanos.model.SuperHumanos;
import java.util.ArrayList;

/**
 *
 * @author Leonardo.amaris
 */
public class HumansInputControl {
    public static ArrayList<SuperHumanos> listSuperHumanos = new ArrayList<>();
    public static HumansInput ventanaHumansInput = new HumansInput();
    
    public HumansInputControl() {}
    
    public static void mostrar(){
        ventanaHumansInput.setVisible(true);
    }
    
    public static void GuardarAction(String superNombre, int poderFuerza, boolean visionCalor, boolean visionRayorX, String Nombre, int edad, String estadoCivil, int hijos, String dni, int SaludMental){
        listSuperHumanos.add(new SuperHumanos(superNombre, poderFuerza, visionCalor, visionRayorX, Nombre, edad, estadoCivil, hijos, dni, SaludMental));
    }
    
    public static void CerrarAction(){
        ventanaHumansInput.setVisible(false);
        MenuControl.setListSuperHerores(listSuperHumanos);
        MenuControl.AdimitidosDenegadoList();
    }
}
