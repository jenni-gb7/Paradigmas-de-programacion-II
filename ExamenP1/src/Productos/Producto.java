/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

//Declaraciòn de clase abstracta
public abstract class Producto implements Vendible {
    //Atributos  publicos para acceder a el directamente.
   public String Marca;
    public double Precio;   
    
    //----Sobrecarga de constructores----
    //Constructor vacio
    public Producto(){
    }
    
    //Constructor de la super clase
    public Producto(String Marca, double Precio){
        this.Marca = Marca;
        this.Precio = Precio;
    }
    
    //Mètodos getter y setter
    public String getMarca(){
        return Marca;
    }
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    
    //Mètodo abstracto para calcular el descuento
    public abstract double calcularDescuento();
   
   
   // Método funcional (no abstracto)
    public void mostrarInfo() {
    }
    
    //Implementaciòn de la interfaz Vendible
    @Override
    public double precioFinal(){
         System.out.println("Precio final:");
         return Precio - calcularDescuento();
    }
}


