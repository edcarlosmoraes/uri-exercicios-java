import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio29 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        float a = digit.nextFloat();
        float b = digit.nextFloat();
        float c = digit.nextFloat();

        if (a < b + c && b < a + c && c < a + b) {
            float p = a + b + c;
            System.out.println("Perimetro = " + p);
        } else {
            float t = ((a + b) * c) / 2;
            System.out.println("Area = " + t);
        }
 
    }
 
}