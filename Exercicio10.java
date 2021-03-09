import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio10 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner teclado = new Scanner(System.in);
        int codigo_peca1 = teclado.nextInt();
        int qtd_peca1 = teclado.nextInt();
        double valor_peca1 = teclado.nextDouble();
        int codigo_peca2 = teclado.nextInt();
        int qtd_peca2 = teclado.nextInt();
        double valor_peca2 = teclado.nextDouble();
        double total = (qtd_peca1 * valor_peca1) + (qtd_peca2 * valor_peca2); 
        System.out.format("VALOR A PAGAR: R$ %.2f\n", total);
 
    }
 
}