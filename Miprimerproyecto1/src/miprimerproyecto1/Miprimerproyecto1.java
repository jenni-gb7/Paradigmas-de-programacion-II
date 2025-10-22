package miprimerproyecto1;

//Importaciòn de la libreria
import java.util.Scanner;

/**
 *
 * @author Jenni
 */
public class Miprimerproyecto1 {
     //atributos
    private String nombre;
    private int edad;

    //métodos
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
}
     public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
}
    
    public void mostrarInformacion(){
        System.out.println("Hola mundo");
}
    
     
    public void mostrarInformacion(String nombre){  //sobreescritura
        System.out.println("Hola al mundo de:" +nombre);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        
        //Instancia de un objeto
       Miprimerproyecto1 proyecto1 = new   Miprimerproyecto1();
       proyecto1.mostrarInformacion();
       
       String nombre;
       //Instanciando clase
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese su nombre:");
       nombre = entrada.nextLine();
       proyecto1.setNombre(nombre);
       //proyecto1.getNombre();
       
       
       
       String nombredelObjeto = proyecto1.getNombre();
       System.out.println("Su nombre es:"+nombredelObjeto);
       System.out.println("Su nombre es:"+proyecto1.getNombre());
       
       proyecto1.mostrarInformacion();
       proyecto1.mostrarInformacion(nombre);
        
    }
    
}

