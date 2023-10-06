/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.model;

/**
 *
 * @author leona
 */
public class AlFi {
    public final int tamano;

    public AlFi(int tamano) {
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "AlFi tamaño = " + tamano;
    }

}
