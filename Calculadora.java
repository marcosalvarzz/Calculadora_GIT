public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Iniciada");
        
        // Probando la funcionalidad de la rama Suma
        double resultadoSuma = Suma.realizarSuma(10.5, 5.5);
        System.out.println("El resultado de la suma es: " + resultadoSuma);

        double resultadoResta = Resta.realizarResta(10.5, 5.5);
        System.out.println("El resultado de la resta es: " + resultadoResta);
    }
}