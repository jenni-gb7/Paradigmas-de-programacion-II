package Excepciones;

public class ExcepcionesJava {

    //Método que provoca un ArrayIndexOutOfBoundsException.
    public void accesoFueraDeRango(int[] arreglo, int indice) {
        System.out.println(arreglo[indice]);
    }

    //Método que provoca un NullPointerException.
    public void referenciaNula(String texto) {
        System.out.println(texto.length()); 
    }

    //Método que provoca un NumberFormatException.
    public void formatoNumeroInvalido(String numero) {
        int valor = Integer.parseInt(numero); 
        System.out.println("Valor convertido: " + valor);
    }

    //Método que provoca un ArithmeticException.
    public void operacionMatematicaIlegal(int a, int b) {
        int resultado = a / b; 
        System.out.println("Resultado: " + resultado);
    }

    //Método que provoca un IllegalArgumentException.
    public void argumentoIlegal(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número no puede ser negativo.");
        }
        System.out.println("Número válido: " + numero);
    }

    //Método que provoca un ClassCastException.
    public void conversionInvalida(Object objeto) {
        Integer numero = (Integer) objeto; 
        System.out.println(numero);
    }

    //Método que provoca un UnsupportedOperationException.
    public void operacionNoSoportada(String texto) {
        throw new UnsupportedOperationException("Operación no permitida con: " + texto);
    }

    //Método que provoca un IllegalStateException.
    public void estadoIlegal(String estado) {
        if (estado == null || estado.isEmpty()) {
            throw new IllegalStateException("El estado es inválido.");
        }
        System.out.println("Estado válido: " + estado);
    }

    //Método que provoca un NegativeArraySizeException.
    public void arregloTamanioNegativo(int tam) {
        int[] arr = new int[tam]; 
        System.out.println("Arreglo creado de tamaño: " + tam);
    }

    //Método que provoca un ArrayStoreException.
    public void almacenamientoIncorrecto(Object[] arreglo, Object valor) {
        arreglo[0] = valor; 
        System.out.println("Elemento almacenado: " + valor);
    }

    //Método que provoca un SecurityException.
    public void violacionSeguridad(String clave) {
        throw new SecurityException("Acceso restringido para: " + clave);
    }

    //Método que provoca un ConcurrentModificationException.
    public void modificacionConcurrente(java.util.List<String> lista, String nuevoValor) {
        for (String s : lista) {
            lista.add(nuevoValor); 
        }
    }

    //Método que provoca un MissingResourceException.
    public void recursoFaltante(String nombreRecurso) {
        java.util.ResourceBundle.getBundle(nombreRecurso); 
    }

    //Método que provoca un StringIndexOutOfBoundsException.
    public void indiceCadenaInvalido(String texto, int indice) {
        System.out.println(texto.charAt(indice));
    }
}
