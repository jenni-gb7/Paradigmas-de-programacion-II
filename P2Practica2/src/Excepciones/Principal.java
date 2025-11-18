package Excepciones;

public class Principal {

    public static void main(String[] args) {

        ExcepcionesJava excepcion = new ExcepcionesJava();

        // 1. ArrayIndexOutOfBoundsException
        System.out.println("---- ArrayIndexOutOfBoundsException ----");
        try {
            excepcion.accesoFueraDeRango(new int[]{1, 2, 3}, 5); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.accesoFueraDeRango(new int[]{1, 2, 3}, 1); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 2. StringIndexOutOfBoundsException
        System.out.println("---- StringIndexOutOfBoundsException ----");
        try {
            excepcion.indiceCadenaInvalido("Hola", 10); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.indiceCadenaInvalido("Hola", 2); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 3. NullPointerException
        System.out.println("---- NullPointerException ----");
        try {
            excepcion.referenciaNula(null); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.referenciaNula("Texto"); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 4. NumberFormatException
        System.out.println("---- NumberFormatException ----");
        try {
            excepcion.formatoNumeroInvalido("abc"); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.formatoNumeroInvalido("123"); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 5. ArithmeticException
        System.out.println("---- ArithmeticException ----");
        try {
            excepcion.operacionMatematicaIlegal(10, 0); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.operacionMatematicaIlegal(10, 2); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 6. ClassCastException
        System.out.println("---- ClassCastException ----");
        try {
            excepcion.conversionInvalida(new Object()); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.conversionInvalida(25); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 7. IllegalArgumentException
        System.out.println("---- IllegalArgumentException ----");
        try {
            excepcion.argumentoIlegal(-5); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.argumentoIlegal(10); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 8. NegativeArraySizeException
        System.out.println("---- NegativeArraySizeException ----");
        try {
            excepcion.arregloTamanioNegativo(-3); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.arregloTamanioNegativo(5); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 9. ArrayStoreException
        System.out.println("---- ArrayStoreException ----");
        try {
            excepcion.almacenamientoIncorrecto(
                new String[3],
                123   // Provoca excepción
            );
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.almacenamientoIncorrecto(
                new String[3],
                "Correcto"
            ); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


        // 10. IllegalStateException
        System.out.println("---- IllegalStateException ----");
        try {
            excepcion.estadoIlegal(""); // Provoca excepción
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        try {
            excepcion.estadoIlegal("Activo"); // Correcto
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("----- FIN DEL PROGRAMA -----");
    }
}
