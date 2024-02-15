/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada1;

/**
 *
 * @author User
 */
public class Avion extends Vehiculo {
    private String marca; 
    private int año;
    private int tamanio;  
    private int numeroDeMotores;

    public Avion(String marca, int año, int tamanio, int numeroDeMotores) {
        this.marca = marca;
        this.año = año;
        this.tamanio = tamanio;
        this.numeroDeMotores = numeroDeMotores;
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

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getNumeroDeMotores() {
        return numeroDeMotores;
    }

    public void setNumeroDeMotores(int numeroDeMotores) {
        this.numeroDeMotores = numeroDeMotores;
    }
    
    

    @Override
    public void aumentarVelocidad() {
                System.out.println("el Avion esta disminuyendo la velocidad");

    }

    @Override
    public void disminuirVelocidad() {
                System.out.println("el Avion esta disminuyendo la velocidad");

    }

    @Override
    public void frenar() {
                System.out.println("El Avion ha frenado");

    }

    @Override
    public void encenderAlarma() {
                System.out.println("el Avion emite sonidos durante 10 segundos");

    }
    
    

   
    
}
