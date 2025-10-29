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
public class Camisa extends Producto {
    //  Atributos
    private String Talla;
    private String Color;
    
    //----Sobrecarga de constructores----
    //Constructor vacio
    public Camisa(){
    }
    
    //Cosntructores
    public Camisa(String Marca, double Precio, String Talla, String Color){
        super(Marca,Precio);
        this.Talla = Talla;
        this.Color = Color;
    }

    //Mètodos getter y setter
    public String getTalla(){
        return Talla;
    }
    
    public void setTalla(String Talla){
        this.Talla = Talla;
    }
    
    public String getColor(){
        return Color;
    }
    
    public void setColor(String Color){
        this.Color = Color;
    }
    
    //Sobreescritura del mètodo abstracto para calcular el descuento
    @Override
    public double calcularDescuento() { //Calcula el 10% descuento
        return Precio * 0.1;    //Se usa el atributo de la superclase
    }
    
     @Override
    public double precioFinal() {
        return Precio - calcularDescuento();
    }
    
    // Método funcional (no abstracto)
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Camisa:");
        System.out.println("Talla:"+ Talla);
        System.out.println("Color:" + Color);
        System.out.println("Descuento: "+ calcularDescuento());
        System.out.println("Precio final: "+ precioFinal());
    
    }

    
    //Definir clase interna
    public class Etiqueta{
        public String generarTexto(){
            return "Etiqueta:\nMarca: " + Marca + "\nColor: " + Color + "\nTalla: " + Talla + "\nPrecio final: $" + precioFinal();
                    
            }
    }
}
