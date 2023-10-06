/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.AlFi;
import com.mycompany.superhumanos.model.SuperHumanos;
import com.mycompany.superhumanos.view.War;
import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class WarControl {
    private ArrayList <SuperHumanos> listSuperHerores;
    private ArrayList <AlFi> listaAlFis;
    public War ventanaWar = new War();

    public WarControl(ArrayList<SuperHumanos> listSuperHerores, ArrayList<AlFi> listaAlFis) {
        this.listSuperHerores = listSuperHerores;
        this.listaAlFis = listaAlFis;
    }
 
    public void mostrar(){
        this.ventanaWar.setVisible(true);
    }
    
    public void ocultar(){
        this.ventanaWar.setVisible(false);
    }
    
}
