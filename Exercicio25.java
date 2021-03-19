import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio25 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        int codigo = digit.nextInt();
        int qtd = digit.nextInt();
        float total;

        switch (codigo) {
            case 1:
                total = qtd * 4;
                System.out.format("Total: R$ %.2f\n", total);
                break;
            case 2:
                total = (float) (qtd * 4.5);
                System.out.format("Total: R$ %.2f\n", total);
                break;
            case 3:
                total = qtd * 5;
                System.out.format("Total: R$ %.2f\n", total);
                break;
            case 4:
                total = qtd * 2;
                System.out.format("Total: R$ %.2f\n", total);
                break;
            case 5:
                total = (float) (qtd * 1.5);
                System.out.format("Total: R$ %.2f\n", total);
                break;
        }
 
    }
 
}