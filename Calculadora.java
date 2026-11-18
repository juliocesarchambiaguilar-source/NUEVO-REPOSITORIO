public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) dividendo / divisor;
    }
}
