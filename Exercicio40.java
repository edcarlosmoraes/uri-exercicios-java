import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio40 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        List<Double> numeros = new ArrayList<>();

        int total = 0;

        numeros.add(digit.nextDouble());
        numeros.add(digit.nextDouble());
        numeros.add(digit.nextDouble());
        numeros.add(digit.nextDouble());
        numeros.add(digit.nextDouble());
        numeros.add(digit.nextDouble());

        for (Double numero : numeros) {
            if (numero > 0) {
                total++;
            }
        }
        System.out.println(total + " valores positivos");
 
    }
 
}