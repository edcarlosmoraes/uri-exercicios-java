import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio34 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        double s = digit.nextDouble();
        
        if (s >= 0 && s <= 400) {
            double ns = (s * 0.15) + s;
            System.out.format("Novo salario: %.2f\n", ns);
            System.out.format("Reajuste ganho: %.2f\n", (s * 0.15));
            System.out.println("Em percentual: 15 %");
        } else if (s > 400 && s <= 800) {
            double ns = (s * 0.12) + s;
            System.out.format("Novo salario: %.2f\n", ns);
            System.out.format("Reajuste ganho: %.2f\n", (s * 0.12));
            System.out.println("Em percentual: 12 %");
        } else if (s > 800 && s <= 1200) {
            double ns = (s * 0.10) + s;
            System.out.format("Novo salario: %.2f\n", ns);
            System.out.format("Reajuste ganho: %.2f\n", (s * 0.10));
            System.out.println("Em percentual: 10 %");
        } else if (s > 1200 && s <= 2000) {
            double ns = (s * 0.07) + s;
            System.out.format("Novo salario: %.2f\n", ns);
            System.out.format("Reajuste ganho: %.2f\n", (s * 0.07));
            System.out.println("Em percentual: 7 %");
        } else if (s > 2000) {
            double ns = (s * 0.04) + s;
            System.out.format("Novo salario: %.2f\n", ns);
            System.out.format("Reajuste ganho: %.2f\n", (s * 0.04));
            System.out.println("Em percentual: 4 %");
        }
 
    }
 
}