/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.insumos;

/**
 *
 * @author PUPY
 */
public class Insumos {
    //Atributos
    private String Marca;
    private int Codigo;
    private String Garantia;
    private float Cantidad;
    private float Precio;
    private String Descripcion;
    private String Color;
    private String Medida;
    private float Peso;
    private String Estado;
    private String Caracteristicas;
    private String Material;
    private String VidaUtil;

     //Costructores
    public Insumos(String Marca, int Codigo, String Garantia, float Cantidad, float Precio, String Descripcion, String Color, String Medida, float Peso, String Estado, String Caracteristicas, String Material, String VidaUtil) {
        this.Marca = Marca;
        this.Codigo = Codigo;
        this.Garantia = Garantia;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Color = Color;
        this.Medida = Medida;
        this.Peso = Peso;
        this.Estado = Estado;
        this.Caracteristicas = Caracteristicas;
        this.Material = Material;
        this.VidaUtil = VidaUtil;
    }

    public Insumos() {
        this.Marca = "";
        this.Codigo = 0;
        this.Garantia = "";
        this.Cantidad = 0;
        this.Precio = 0;
        this.Descripcion = "";
        this.Color = "";
        this.Medida = "";
        this.Peso = 0;
        this.Estado = "";
        this.Caracteristicas = "";
        this.Material = "";
        this.VidaUtil = "";  
    }

    //Getters y Setters
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public float getCantidad() {
        return Cantidad;
    }

    public void setCantidad(float Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getVidaUtil() {
        return VidaUtil;
    }

    public void setVidaUtil(String VidaUtil) {
        this.VidaUtil = VidaUtil;
    }
    
    //Metodos Propios:
   public float calcularCantidad(float Cantidad){
       return this.Cantidad - Cantidad;
       
   } 
   
    public boolean VerificarPeso(float Peso){
       return Peso<=20;
       
   }
    
    public String toString(){
       return "Marca: " + Marca + "|Codigo: " + Codigo + 
               "|Garantia: " + Garantia + "|Cantidad: " + Cantidad + "|Precio: " + Precio + 
               "|Descripcion: " + Descripcion + "|Color: " + Color + 
               "|Medidas: " + Medida + "|Peso: " + Peso + 
               "|estado: " + Estado + "|caracteristicas: " + Caracteristicas + 
               "|Material: " + Material + "|vida util: " + VidaUtil;
   }
    
    private String Color(String Color){
        boolean bandera = false;
        final String [] arreglo = {"rojo","verde","amarillo","marron","azul","gris","negro","blanco","celeste","morado","rosa","naranja","verde claro","lima","bordo","dorado","celeste","cian","azul marino","verde oscuro"};
        for (int i = 0; i < 20; i++){
            if (Color == arreglo[i]){
                bandera = true;
                
            }
        }
        
        if(bandera){
            return Color;
        }else{
            return "Color no existente";
            
        }
    }
}
