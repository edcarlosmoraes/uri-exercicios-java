import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio13 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        int A = digit.nextInt();
        int B = digit.nextInt();
        int C = digit.nextInt();
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorABC =(maiorAB + C + Math.abs(maiorAB - C)) / 2;
        System.out.println(maiorABC + " eh o maior");
 
    }
 
}