import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio05 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner teclado = new Scanner(System.in);
         double a = teclado.nextDouble();
         double b = teclado.nextDouble();
         double media_a = (a / 10) * 3.5;
         double media_b = (b / 10) * 7.5;
         double media = ((media_a + media_b) / 11) * 10;
         System.out.format("MEDIA = %.5f\n", media);
 
    }
 
}