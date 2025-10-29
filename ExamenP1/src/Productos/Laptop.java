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
public class Laptop extends Producto  {
    //Atributos
    private String Procesador;
    private String Modelo;
    private int Anio;
    
    //----Sobrecarga de constructores----
    //Constructir vacio
    public Laptop(){
    }
   
    //Contructor con todos los atributos
    public Laptop(String Marca, double Precio,String Procesador,String Modelo, int Anio){
        super(Marca,Precio);    //Llamada al constructor de Producto
        this.Procesador = Procesador;
        this.Modelo = Modelo;
        this.Anio = Anio;
    }
    
    //Mètodos getter y setter
    public String getProcesador(){
        return Procesador;
    }
    
    public void setProcesador(String Procesador){
        this.Procesador = Procesador;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public int getAnio(){
        return Anio;
    }
    
    public void setAnio(int Anio){
        this.Anio = Anio;
    }

    //Sobreescritura del mètodo abstracto para calcular el descuento
    @Override
    public double calcularDescuento() { //Calcula el 25% descuento
        return Precio * 0.25;   //Se usa el atributo de la superclase
        }
    
    @Override
    public double precioFinal() {
        return Precio - calcularDescuento();
    }

     // Método funcional (no abstracto)
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Laptop: ");
        System.out.println("Procesador:" + Procesador);
        System.out.println("Modelo:" + Modelo);
        System.out.println("Anio:" + Anio);
        System.out.println("Descuento: "+ calcularDescuento());
        System.out.println("Precio final: "+ precioFinal());
    }
    
}
