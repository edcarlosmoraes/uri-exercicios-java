import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio37 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        double salario = digit.nextDouble();

        if (salario >= 0 && salario <= 2000) {
            System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
            salario = ((salario - 2000) * 0.08);
            System.out.format("R$ %.2f\n", salario);
        } else if (salario > 3000 && salario <= 4500) {
            double ir08 = 1000 * 0.08;
            double ir18 = ((salario - 3000) * 0.18);
            System.out.format("R$ %.2f\n", ir08 + ir18);
        } else if (salario > 4500) {
            double ir08 = 1000 * 0.08;
            double ir18 = 1500 * 0.18;
            double ir28 = (salario - 4500) * 0.28;
            System.out.format("R$ %.2f\n", ir08 + ir18 + ir28);
        }
 
    }
 
}