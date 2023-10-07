/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.AlFi;
import com.mycompany.superhumanos.model.SuperHumanos;
import com.mycompany.superhumanos.view.War;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author leona
 */
public class WarControl {
    private static List <SuperHumanos> listSuperHerores1;
    private static List <SuperHumanos> listSuperHerores2;
    private static List <AlFi> listaAlFis;
    public static War ventanaWar = new War();
    public static Random rand = new Random();

    public WarControl() {}

    public static void setListSuperHerores1(List<SuperHumanos> listSuperHerores1) {
        WarControl.listSuperHerores1 = listSuperHerores1;
    }

    public static void setListSuperHerores2(List<SuperHumanos> listSuperHerores2) {
        WarControl.listSuperHerores2 = listSuperHerores2;
    }

    public static void setListaAlFis(List<AlFi> listaAlFis) {
        WarControl.listaAlFis = listaAlFis;
    }

    public static void setVentanaWar(War ventanaWar) {
        WarControl.ventanaWar = ventanaWar;
    }
 
    public static void mostrar(){
        JScrollPane Area1 = (JScrollPane) ventanaWar.getContentPane().getComponent(3);
        JTextArea textArea1 = (JTextArea) Area1.getViewport().getView();
        if (!(listSuperHerores1.isEmpty())){     
            textArea1.setText(mostrarLista(listSuperHerores1));
        } else {
            textArea1.setText(mostrarLista(listSuperHerores2));
        }
        
        JScrollPane Area2 = (JScrollPane) ventanaWar.getContentPane().getComponent(7);
        JTextArea textArea2 = (JTextArea) Area2.getViewport().getView();
        textArea2.setText(mostrarLista(listaAlFis));
        ventanaWar.setVisible(true);
    }
    
    public static void ocultar(){
        ventanaWar.setVisible(false);
    }
    
    public static String mostrarLista(List list){
        String txt = "";
        for (Object item: list){
            txt = txt + item.toString() + "\n" ;
        }
        return txt;
    }
    
    public static void CombateAction(){
        int puntoAlfis = rand.nextInt(11);
        int puntoSuper = rand.nextInt(11);
        if (listSuperHerores1.isEmpty() && listSuperHerores2.isEmpty()){
            JOptionPane.showMessageDialog(null, "Los AlFis ganaron la guerra.");
        } else if (listaAlFis.isEmpty()){
            JOptionPane.showMessageDialog(null, "Los SuperHeroes ganaron la guerra.");
        } else {
            if (puntoSuper >= puntoAlfis){
                    listaAlFis.remove(0);
                    JOptionPane.showMessageDialog(null, "Gana super Heroe.");
            } else {
                if (!listSuperHerores1.isEmpty()){
                    listSuperHerores1.remove(0);
                    JOptionPane.showMessageDialog(null, "Gana AlFis.");
                }
            }
        }
    }
    
    public static void SiguienteCombateAction(){
    }
    
    public static void MostrarCaidosAction(){
    }
}
