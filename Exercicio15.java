import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio15 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        double p1 [] = {digit.nextDouble(), digit.nextDouble()};
        double p2 [] = {digit.nextDouble(), digit.nextDouble()};
        double distancia = Math.sqrt( Math.pow(p2[0]-p1[0],2) + Math.pow(p2[1]-p1[1],2));
        System.out.printf("%.4f\n", distancia);
    }
 
}