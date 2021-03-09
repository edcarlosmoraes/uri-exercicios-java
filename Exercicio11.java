import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio11 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        double raio = digit.nextDouble();
        double volume = ( 4.0 / 3)* 3.14159 * Math.pow(raio, 3);
        System.out.format("VOLUME = %.3f\n", volume); 
 
    }
 
}