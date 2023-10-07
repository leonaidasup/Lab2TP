/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.SuperHumanos;
import com.mycompany.superhumanos.view.Menu;
import com.mycompany.superhumanos.model.AlFi;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class MenuControl {
    private static ArrayList <SuperHumanos> listSuperHerores;
    private static List <SuperHumanos> listSuperHeroresEscuadron1;
    private static List <SuperHumanos> listSuperHeroresEscuadron2;
    private static final ArrayList <SuperHumanos> listaAdmitidos = new ArrayList<>();
    private static final ArrayList <SuperHumanos> listaRechazados = new ArrayList<>();
    private static ArrayList <AlFi> listaAlFis = new ArrayList<>();
    private static final Menu ventanaMenu = new Menu();

    public MenuControl() {}  
    
    public static void setListSuperHerores(ArrayList<SuperHumanos> lista) {
        MenuControl.listSuperHerores = lista;
    }
    
    public static void setlistaAlFis(ArrayList <AlFi> listaAlFis){
        MenuControl.listaAlFis = listaAlFis;
    }
    
    public static void mostrar(){
        ventanaMenu.setVisible(true);
    }
    
    public static void AgregarAction(){
        HumansInputControl.mostrar();
    }
    
    public static void GuerraAction(){
        WarControl.setListSuperHerores1(listSuperHeroresEscuadron1);
        WarControl.setListSuperHerores2(listSuperHeroresEscuadron2);
        WarControl.setListaAlFis(listaAlFis);
        WarControl.mostrar();
    }
    
    public static void FormarEscuadronesAction(){
        int tam = listaAdmitidos.size();
        if (tam >= 20){
            listSuperHeroresEscuadron1 = listaAdmitidos.subList(0,10);
            listSuperHeroresEscuadron2 =listaAdmitidos.subList(10, tam-1);
            JOptionPane.showMessageDialog(null, "Escuadrones listos");
        } else {
            JOptionPane.showMessageDialog(null, "Faltan " + (20 - tam) + " superHeroes.");
        }
        
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
    
    public static void mostrarLista(ArrayList list){
        String txt = "";
        for (Object item: list){
            txt = txt + item.toString() + "\n" ;
        }
        JOptionPane.showMessageDialog(null, txt);
    }
    
    public static void AdmitidosAction(){
        mostrarLista(listaAdmitidos);
    }
    
    public static void RechazadosAction(){
        if (!listaRechazados.isEmpty()){
            mostrarLista(listaRechazados);
        } else {
            JOptionPane.showMessageDialog(null, "No hay Super Heroes rechazados.");
        }
    }
    
    public static void LlegadaAlFisAction(){
        while (true) {
            int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Altura de los AlFis:"));
            if (altura > 10){
                listaAlFis.add(new AlFi(altura));
            }
            if (listaAlFis.size() == 10){
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Llegada de los AlFis");
    }
    
    public static void MostrarAlFIsAction(){
        mostrarLista(listaAlFis);
    }
    
    public static void main(String[] args) {
        mostrar();
    }
}

