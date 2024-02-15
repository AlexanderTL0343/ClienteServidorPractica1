/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicaprogramada1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Usuario {
    private int cedula;
    private String nombre;
    private  int dineroTotal;
    private Vehiculo vehiculoPersonal;
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDineroTotal() {
        return dineroTotal;
    }

    public void setDineroTotal(int dineroTotal) {
        this.dineroTotal = dineroTotal;
    }

    public Vehiculo getVehiculoPersonal() {
        return vehiculoPersonal;
    }

    public void setVehiculo(Vehiculo vehiculoPersonal) {
        this.vehiculoPersonal = vehiculoPersonal;
    }
    
    
    
    
    public void ComprarVehiculo(){
        int total;
        String dinero;
        try{
        dinero=JOptionPane.showInputDialog("Digite exactamente el dinero que quiere gastar :");
        total = Integer.parseInt(dinero);
        if (total<=2000&&total>=500){
            String respuesta="si";
            String confirmacion=JOptionPane.showInputDialog("Usted puede comprar un caballo quiere proceder con la compra:");
            if(confirmacion==respuesta){
                System.out.println("La compra del caballo fue exitosa");
                vehiculoPersonal= new Caballo("Caballo Andaluz", 15,"hambriento");
   
            }else{
                System.out.println("La compra se a cancelado");
            }      
        }
        if (total>2000&&total<=50000){
            String respuesta="si";
            String confirmacion=JOptionPane.showInputDialog("Usted puede comprar un automovil quiere proceder con la compra:");
            if(confirmacion==respuesta){
                System.out.println("La compra del caballo fue exitosa");
                vehiculoPersonal= new Automovil("Audi", 2019, "R8 Spider", 5204);

            }else{
                System.out.println("La compra se a cancelado");
            }    
        }
        if (total>=50000){
            String respuesta="si";
            String confirmacion=JOptionPane.showInputDialog("Usted puede comprar un avion quiere proceder con la compra:");
            if(confirmacion==respuesta){
                System.out.println("La compra del avion fue exitosa");
                vehiculoPersonal = new Avion("Bombardier", 2018, 33 , 2);
                
            }else{
                System.out.println("La compra se a cancelado");
            }
        }
        }catch(HeadlessException | NumberFormatException e){
            System.out.println("Introduzca un valor valido");
        }
      
    }
     public void ManejarVehiculo(){
         String respuesta1="caballo";
         String respuesta2="avion";
         String respuesta3="automovil";
         try{
         
         

         String car=JOptionPane.showInputDialog("Indique que vehiculo posee");
         if(car==respuesta1){
              Caballo cliente = new Caballo("", 0, "");
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Aumentar Velocidad \n2.Disminuir velocidad \n3.frenar\n4.alarma\n5.salir"));
            switch (menu) {
                case 1:
                   cliente.aumentarVelocidad();
                    break;
                case 2:
                cliente.disminuirVelocidad();
                    break;
                case 3:
                    cliente.frenar();
                    
                    break;
                case 4:
                    cliente.encenderAlarma();
                    break;
                    
                default:
                    break OUTER;
        
            }}
         }
          if(car==respuesta2){
              Avion cliente = new Avion("", 0, 0, 0);
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Aumentar Velocidad \n2.Disminuir velocidad \n3.frenar\n4.alarma\n5.salir"));
            switch (menu) {
                case 1:
                   cliente.aumentarVelocidad();
                    break;
                case 2:
                cliente.disminuirVelocidad();
                    break;
                case 3:
                    cliente.frenar();
                    
                    break;
                case 4:
                    cliente.encenderAlarma();
                    break;
                    
                default:
                    break OUTER;
        
            }}
         }
           if(car==respuesta3){
              Automovil cliente = new Automovil("", 0, "", 0);
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Aumentar Velocidad \n2.Disminuir velocidad \n3.frenar\n4.alarma\n5.salir"));
            switch (menu) {
                case 1:
                   cliente.aumentarVelocidad();
                    break;
                case 2:
                cliente.disminuirVelocidad();
                    break;
                case 3:
                    cliente.frenar();
                    
                    break;
                case 4:
                    cliente.encenderAlarma();
                    break;
                    
                default:
                    break OUTER;
        
            }}
         }
         }catch(HeadlessException | NumberFormatException e){
            System.out.println("Introduzca un valor valido");
        }
     }
      public void IngresoDeDatos(){
          String id;
          this.nombre=JOptionPane.showInputDialog("Ingrese su nombre");
          id=JOptionPane.showInputDialog("Ingrese su Cedula");
          this.cedula=Integer.parseInt(id);
      
      }
    
    
    
    
}
