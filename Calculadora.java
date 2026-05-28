public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Iniciada");
        
        // Operaciones del Programador A
        double resultadoSuma = Suma.realizarSuma(10.5, 5.5);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        
        double resultadoResta = Resta.realizarResta(10.5, 5.5);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        
        // Operaciones del Programador B
        double resultadoMulti = Multiplicacion.realizarMultiplicacion(10.5, 2.0);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMulti);
        
        double resultadoDiv = Division.realizarDivision(10.0, 2.0);
        System.out.println("El resultado de la division es: " + resultadoDiv);
    }
}