/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superhumanos.model;

/**
 *
 * @author Leonardo.amaris
 */
public class SuperHumanos extends Persona implements Poderes{
    private final String superNombre;
    private final int Fuerza;
    private final boolean visionCalor;
    private final boolean visionRayorX;
    private final int saludMental;
    public SuperHumanos(String superNombre, int poderFuerza, boolean visionCalor, boolean visionRayorX, String Nombre, int edad, String estadoCivil, int hijos, String dni, int saludMental) {
        super(Nombre, edad, estadoCivil, hijos, dni);
        this.superNombre = superNombre;
        this.Fuerza = poderFuerza;
        this.visionCalor = visionCalor;
        this.visionRayorX = visionRayorX;
        this.saludMental = saludMental;
    }

    public String getSuperNombre() {
        return superNombre;
    }

    public int getFuerza() {
        return Fuerza;
    }

    public boolean isVisionCalor() {
        return visionCalor;
    }

    public boolean isVisionRayorX() {
        return visionRayorX;
    }

    public int getSaludMental() {
        return saludMental;
    }

    @Override
    public String Fuerza() {
        return "Fuerza";
    }

    @Override
    public String VisionCalor() {
        return "VisionCalor";
    }

    @Override
    public String VisionRayosX() {
        return "Vision Rayos X";
    }

    @Override
    public String toString() {
        return "SuperNombre=" + superNombre + ", Fuerza=" + Fuerza + ", visionCalor=" + visionCalor + ", visionRayorX=" + visionRayorX;
    } 
}
