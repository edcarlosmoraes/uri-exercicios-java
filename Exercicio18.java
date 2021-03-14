import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio18 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        int dinheiro = digit.nextInt();
        int n100 = 0;
        int n50 = 0;
        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;
        
        System.out.println(dinheiro);
        do {
            if (dinheiro >= 100) {
                dinheiro -= 100;
                n100++;
            } else if (dinheiro >= 50) {
                dinheiro -= 50;
                n50++;
            } else if (dinheiro >= 20) {
                dinheiro -= 20;
                n20++;
            } else if (dinheiro >= 10) {
                dinheiro -= 10;
                n10++;
            } else if (dinheiro >= 5) {
                dinheiro -= 5;
                n5++;
            } else if (dinheiro >= 2) {
                dinheiro -= 2;
                n2++;
            } else if (dinheiro >= 1) {
                dinheiro -= 1;
                n1++;
            }
        } while (dinheiro != 0);

        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
 
    }
 
}