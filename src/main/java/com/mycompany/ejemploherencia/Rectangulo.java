/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploherencia;

/**
 *
 * @author HP
 */
public class Rectangulo extends Figurasgeometricas {
    
    protected double largo;
    protected double ancho;
    
    public Rectangulo(double largo,double ancho){
        
        this.ancho= ancho;
        this.largo= largo;
    }

    @Override
    public double CalcularArea() {
        area=ancho*largo;
        return area;
    }
    
    

}
