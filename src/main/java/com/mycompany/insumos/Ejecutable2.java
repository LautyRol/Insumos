/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insumos;

/**
 *
 * @author PUPY
 */
public class Ejecutable2 {
     public static void main(String[] args){
        //Crear una insumo con los valores por defecto:
        Insumos p1 = new Insumos();
        //Asignar los valores de los atributos del insumo:
        p1.setMarca("Tv");
        p1.setCodigo(542);
        p1.setGarantia("16 meses");
        p1.setCantidad(1);
        p1.setPrecio(45000);
        p1.setDescripcion("smart tv");
        p1.setColor("negro");
        p1.setMedida("1mx2mx12cm");
        p1.setPeso(10);
        p1.setEstado("nuevo");
        p1.setCaracteristicas("televisor");
        p1.setMaterial("plastico y metal");
        p1.setVidaUtil("10 año");
         //Crear un insumo con valores enviados como parámetros:
        Insumos p2 = new Insumos("tablet",5633,"12 meses",4,15000,"tablet para juegos",
                "gris","35x20x2cm",3,"nuevo","tablet","plastico","2 años");
        //Mostrar el estado de los insumos:
        System.out.println("Insumo p1: " + p1.toString());
        System.out.println("Insumo p2: " + p2.toString());
        if(p1.VerificarPeso(1)){
            System.out.println("El peso de su producto esta en lo normal");
            
        }
        
        //Muestra la cantidad que lleva del producto 1:
        System.out.println("La cantidad que lleva del producto 1 es la siguiente: " + p1.calcularCantidad(6));
        
        
        
        
    
}
}