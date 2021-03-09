import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio09 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        double salario_fixo = teclado.nextDouble();
        double vendas = teclado.nextDouble();
        double total_vendas = (vendas *= 0.15) + salario_fixo; 
        System.out.format("TOTAL = R$ %.2f\n", total_vendas);
         
    }
    
}
