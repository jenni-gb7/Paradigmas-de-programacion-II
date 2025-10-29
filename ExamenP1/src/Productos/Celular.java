/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 *
 * @author Jenni
 */
//Declaraciòn de subclase
public class Celular extends Producto {
    //Atributos
    private int Anio;
    private String Color;
    private String Modelo;
    
    //----Sobrecarga de constructores----
    //Constructor vacio
    public Celular(){
    }
    
    //Constructor con todos los atributos
    public Celular(String Marca, double Precio,int Anio,String Color, String Modelo){
        super(Marca,Precio);
        this.Anio = Anio;
        this.Color = Color;
        this.Modelo = Modelo;
    }
    //Mètodos getter y setter
    public int getAnio(){
        return Anio;
    }
    
    public void setAnio(int Anio){
        this.Anio = Anio;
    }
    
    public String getColor(){
        return Color;
    }
    
    public void setColor(String Color){
        this.Color = Color;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }

    //Sobreescritura del mètodo abstracto para calcular el descuento
    @Override
    public double calcularDescuento() { //Calcula el 50% descuento
        return Precio * 0.50;   //Se usa el atributo de la superclase
    }
    
    @Override
    public double precioFinal() {
        return Precio - calcularDescuento();
    }
    
    // Método funcional (no abstracto)
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Celular:");
        System.out.println("Anio:"+ Anio);
        System.out.println("Color:" + Color);
        System.out.println("Modelo:" + Modelo);
        System.out.println("Descuento: "+ calcularDescuento());
        System.out.println("Precio final: "+ precioFinal());
    }
}
