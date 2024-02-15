/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada1;

/**
 *
 * @author User
 */
public class Automovil extends Vehiculo {
    private String marca; 
    private int año;
    private String modelo;  
    private int tamañoDelMotor;

    public Automovil(String marca, int año, String modelo, int tamañoDelMotor) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.tamañoDelMotor = tamañoDelMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamañoDelMotor() {
        return tamañoDelMotor;
    }

    public void setTamañoDelMotor(int tamañoDelMotor) {
        this.tamañoDelMotor = tamañoDelMotor;
    }
    
    

    @Override
    public void aumentarVelocidad() {
       System.out.println("el Automovil esta disminuyendo la velocidad");

    }

    @Override
    public void disminuirVelocidad() {
        System.out.println("el Automovil esta disminuyendo la velocidad");

    }

    @Override
    public void frenar() {
        System.out.println("El Automovil ha frenado");

    }

    @Override
    public void encenderAlarma() {
        System.out.println("el Automovil ha encendido la alarma y emite sonidos durante 10 segundos");

    }
    


    
}

