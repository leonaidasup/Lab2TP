/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.SuperHumanos;
import com.mycompany.superhumanos.view.Menu;
import com.mycompany.superhumanos.model.AlFi;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class MenuControl {
    private static ArrayList <SuperHumanos> listSuperHerores;
    private static ArrayList <SuperHumanos> listaAdmitidos = new ArrayList<>();
    private static ArrayList <SuperHumanos> listaRechazados = new ArrayList<>();
    private static ArrayList <AlFi> listaAlFis = new ArrayList<>();
    private static final Menu ventanaMenu = new Menu();

    public MenuControl() {}  
    
    public static void setListSuperHerores(ArrayList<SuperHumanos> lista) {
        MenuControl.listSuperHerores = lista;
    }
    
    public static void mostrar(){
        ventanaMenu.setVisible(true);
    }
    
    public static void AgregarAction(){
        HumansInputControl.mostrar();
    }
    
    public static void GuerraAction(){
        WarControl.mostrar();
    }
    
    public static void RechazadosAction(){
        System.out.println(listSuperHerores);
        JOptionPane.showMessageDialog(null, "Rechazados");
    }
    
    public static void FormarEscuadronesAction(){
        JOptionPane.showMessageDialog(null, "Escuadrones listos");
    }
    
    public static void AdimitidosDenegadoList(){
        for (SuperHumanos hero : listSuperHerores){
            if (!((hero.getEdad() > 50) || ("casado".equals(hero.getEstadoCivil())) || (hero.getHijos() > 1) || (hero.getSaludMental() > 3) )){
                listaAdmitidos.add(hero);
            } else {
                listaRechazados.add(hero);
            }
        }
    }
    
    public static void AdmitidosAction(){
        System.out.println(listSuperHerores);
        JOptionPane.showMessageDialog(null, "Admitidos");
    }
    
    public static void LlegadaAlFisAction(){
        
        JOptionPane.showMessageDialog(null, "Legada de los AlFis");
    }
    
    public static void MostrarAlFIsAction(){
        JOptionPane.showMessageDialog(null, "AlFis");
    }
    
    public static void main(String[] args) {
        mostrar();
    }
}

