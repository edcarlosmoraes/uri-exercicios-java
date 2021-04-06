import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio31 {
 
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
        float aux = 0;

        if (a < c) {
            aux = a;
            a = c;
            c = aux;
        }
        if (a < b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b < c) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a < b + c && b < a + c && c < a + b) {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (a == b && a != c || b == c && a != b) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else {
            System.out.println("NAO FORMA TRIANGULO");
        }
 
    }
 
}