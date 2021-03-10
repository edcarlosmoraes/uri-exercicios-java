import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio12 {
 
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
        double triangulo = (A * C) / 2;
        double circulo = 3.14159 * Math.pow(C, 2);
        double trapezio = ((A + B) * C) / 2;
        double quadrado = Math.pow(B, 2);
        double retangulo = A * B;
        System.out.format("TRIANGULO: %.3f\n", triangulo);
        System.out.format("CIRCULO: %.3f\n", circulo);
        System.out.format("TRAPEZIO: %.3f\n", trapezio);
        System.out.format("QUADRADO: %.3f\n", quadrado);
        System.out.format("RETANGULO: %.3f\n", retangulo);
 
    }
 
}