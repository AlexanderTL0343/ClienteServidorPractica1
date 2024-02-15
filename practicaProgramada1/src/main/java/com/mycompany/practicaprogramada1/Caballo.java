/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada1;

/**
 *
 * @author User
 */
public class Caballo extends Vehiculo{
    private String raza; 
    private int edad;
    private String nivelDeHambre;

    public Caballo(String raza, int edad, String nivelDeHambre) {
        this.raza = raza;
        this.edad = edad;
        this.nivelDeHambre = nivelDeHambre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNivelDeHambre() {
        return nivelDeHambre;
    }

    public void setNivelDeHambre(String nivelDeHambre) {
        this.nivelDeHambre = nivelDeHambre;
    }
    

    @Override
    public void aumentarVelocidad() {
        System.out.println("el caballo esta Aumentando la velocidad");

    }

    @Override
    public void disminuirVelocidad() {
        System.out.println("el caballo esta disminuyendo la velocidad");

    }

    @Override
    public void frenar() { 
        System.out.println("El caballo ha frenado");
    }

    @Override
    public void encenderAlarma() {
        System.out.println("el caballo emite sonidos durante 10 segundos");
    }
    
    

    
    
    
}
