package Productos;

// Librería para entrada de datos
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Objetos con setters
        Laptop laptop1 = new Laptop();
        laptop1.setMarca("Lenovo");
        laptop1.setPrecio(12000);
        laptop1.setProcesador("Ryzen 5");
        laptop1.setModelo("ThinkPad X1");
        laptop1.setAnio(2023);

        Camisa camisa1 = new Camisa();
        camisa1.setMarca("H&M");
        camisa1.setPrecio(400);
        camisa1.setTalla("L");
        camisa1.setColor("Azul");
     

        Celular celular1 = new Celular();
        celular1.setMarca("Apple");
        celular1.setPrecio(25000);
        celular1.setModelo("iPhone 13");
        celular1.setColor("Rosa");
        celular1.setAnio(2022);

        // Objetos con constructores
        Laptop laptop2 = new Laptop("HP", 1500, "Intel i7", "Pavilion", 2022);
        Camisa camisa2 = new Camisa("Zara", 500, "M", "Rosa");
        Celular celular2 = new Celular("Samsung", 10000, 2023, "Negro", "Galaxy A54");

        // Mostrar información
        System.out.println("\n--- Productos con setters ---");
        laptop1.mostrarInfo();
        System.out.println("\n");
        camisa1.mostrarInfo();
        System.out.println("\n");
        celular1.mostrarInfo();

        System.out.println("\n--- Productos con constructores ---");
        laptop2.mostrarInfo();
        System.out.println("\n");
        camisa2.mostrarInfo();
        System.out.println("\n");
        celular2.mostrarInfo();

        // Mostrar atributos con getters
        System.out.println("\n--- Atributos individuales ---");
        System.out.println("Laptop1 - Procesador: " + laptop1.getProcesador() + ", Modelo: " + laptop1.getModelo());
        System.out.println("Camisa1 - Color: " + camisa1.getColor() + ", Talla: " + camisa1.getTalla());
        System.out.println("Celular1 - Modelo: " + celular1.getModelo() + ", Anio: " + celular1.getAnio());

        // Instanciar clase interna
        Camisa.Etiqueta etiqueta = camisa2.new Etiqueta();
        System.out.println("\n--- Etiqueta generada ---");
        System.out.println(etiqueta.generarTexto());
        
        System.out.println("\n--- Solicita al usuario ---");
        ///// Crear objeto Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Capturar datos para Laptop
        System.out.println("--- Registro de Laptop ---");
        System.out.print("Marca: ");
        String marcaLaptop = entrada.nextLine();

        System.out.print("Precio: ");
        double precioLaptop = entrada.nextDouble(); entrada.nextLine();

        System.out.print("Procesador: ");
        String procesador = entrada.nextLine();

        System.out.print("Modelo: ");
        String modeloLaptop = entrada.nextLine();

        System.out.print("Anio: ");
        int anioLaptop = entrada.nextInt(); entrada.nextLine();

        // Crear objeto Laptop con constructor
        Laptop laptopUsuario = new Laptop(marcaLaptop, precioLaptop, procesador, modeloLaptop, anioLaptop);

        // Capturar datos para Camisa
        System.out.println("\n--- Registro de Camisa ---");
        System.out.print("Marca: ");
        String marcaCamisa = entrada.nextLine();

        System.out.print("Precio: ");
        double precioCamisa = entrada.nextDouble(); entrada.nextLine();

        System.out.print("Talla: ");
        String talla = entrada.nextLine();

        System.out.print("Color: ");
        String colorCamisa = entrada.nextLine();

        // Crear objeto Camisa con constructor
        Camisa camisaUsuario = new Camisa(marcaCamisa, precioCamisa, talla, colorCamisa);

        // Capturar datos para Celular
        System.out.println("\n--- Registro de Celular ---");
        System.out.print("Marca: ");
        String marcaCelular = entrada.nextLine();

        System.out.print("Precio: ");
        double precioCelular = entrada.nextDouble(); entrada.nextLine();

        System.out.print("Modelo: ");
        String modeloCelular = entrada.nextLine();

        System.out.print("Color: ");
        String colorCelular = entrada.nextLine();

        System.out.print("Anio: ");
        int anioCelular = entrada.nextInt(); entrada.nextLine();

        // Crear objeto Celular con constructor
        Celular celularUsuario = new Celular(marcaCelular, precioCelular, anioCelular, colorCelular, modeloCelular);

        // Mostrar información de cada producto
        System.out.println("\n--- Informacion de Laptop ---");
        laptopUsuario.mostrarInfo();

        System.out.println("\n--- Informacion de Camisa ---");
        camisaUsuario.mostrarInfo();

        System.out.println("\n--- Informacion de Celular ---");
        celularUsuario.mostrarInfo();

        // Mostrar etiqueta de la camisa 
        Camisa.Etiqueta etiquetaUsuario = camisaUsuario.new Etiqueta();
        System.out.println("\n--- Etiqueta de la camisa ---");
        System.out.println(etiquetaUsuario.generarTexto());
        // Cerrar el Scanner
        entrada.close();
  
    }
}
