import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio26 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        float n1 = digit.nextFloat();
        float n2 = digit.nextFloat();
        float n3 = digit.nextFloat();
        float n4 = digit.nextFloat();
        float media = ((n1 / 10) * 2) + ((n2 / 10) * 3) + ((n3 / 10) * 4) + ((n4 / 10) * 1);

        if (media >= 7) {
            System.out.format("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5) {
            System.out.format("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        } else {
            float ne = digit.nextFloat();
            float mediaf = (ne + media) / 2;
            if (mediaf >= 5) {
                System.out.format("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + ne);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + mediaf);
            } else {
                System.out.format("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + ne);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + mediaf);
            }
        }
 
    }
 
}