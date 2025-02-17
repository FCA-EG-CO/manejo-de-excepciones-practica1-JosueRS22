import java.util.Scanner;

public class VerficarPar {  
    public static class NumeroImparException extends Exception {
        public NumeroImparException(String mensaje) {
            super(mensaje);
        }
    }

    public static void verificarPar(int numero) throws NumeroImparException {
        if (numero % 2 != 0) {
            throw new NumeroImparException("Número impar.");
        } else {
            System.out.println("Número par.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        try {
            verificarPar(numero);  
        } catch (NumeroImparException e) {
            System.out.println(e.getMessage());
        }
    }
}
