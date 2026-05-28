public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora Iniciada");
        
        // Probando la funcionalidad de la rama Division
        double resultadoDiv = Division.realizarDivision(10.0, 2.0);
        System.out.println("El resultado de la division es: " + resultadoDiv);
    }
}