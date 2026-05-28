public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Iniciada");
        
        // Probando la funcionalidad de la rama Multiplicacion
        double resultadoMulti = Multiplicacion.realizarMultiplicacion(10.5, 2.0);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMulti);
    }
}