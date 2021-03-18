import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio23 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        double A = digit.nextDouble();
        double B = digit.nextDouble();
        double C = digit.nextDouble();
        double delta = (Math.pow(B, 2)) - 4 * (A * C);
        double R1 = (-B + (Math.sqrt(delta))) / (2 * A);
        double R2 = (-B - (Math.sqrt(delta))) / (2 * A);

        if ((Math.sqrt(delta) >= 0)&& A != 0) {
            System.out.format("R1 = %.5f\n", R1);
            System.out.format("R2 = %.5f\n", R2);
        } else {
            System.out.println("Impossivel calcular");
        }
 
    }
 
}