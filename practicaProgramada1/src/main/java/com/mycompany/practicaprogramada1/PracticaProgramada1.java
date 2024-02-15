/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaprogramada1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PracticaProgramada1 {

    public static void main(String[] args) {
        Usuario cliente = new Usuario();
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Ingrese sus datos \n2.comprar vehiculo \n3.manejar el vehiculo\n4.Salir"));
            switch (menu) {
                case 1:
                   cliente.IngresoDeDatos();
                    break;
                case 2:
                cliente.ComprarVehiculo();
                    break;
                case 3:
                    cliente.ManejarVehiculo();
                    break;
                    
                default:
                    break OUTER;
        
            }}
    }
}
        
    
    
    
 

    

   