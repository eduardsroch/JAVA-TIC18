
public class Calculadora {
    
    public int soma(int a, int b) {
        return a + b;
    }
    
    public int subtracao(int a, int b) {
        return a - b;
    }
    
    public int multiplicacao(int a, int b) {
        return a * b;
    }
    
    public int divisaoInteira(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
    
    public float divisaoFloat(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        try {
            System.out.println(calculadora.divisaoInteira(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
