/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.model;

/**
 *
 * @author Leonardo.amaris
 */
class Persona {
    private final String Nombre;
    private int edad;
    private String estadoCivil;
    private int hijos;
    private String dni;

    public Persona(String Nombre, int edad, String estadoCivil, int hijos, String dni) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.hijos = hijos;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
   
}
