import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio21 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        int dinheiro = (int)(digit.nextDouble()*100);
        int n100 = 0;
        int n50 = 0;
        int n20 = 0;
        int n10 = 0;
        int n5 = 0;
        int n2 = 0;
        int n1 = 0;
        int n050 = 0;
        int n025 = 0;
        int n010 = 0;
        int n005 = 0;
        int n001 = 0;
        
        do {
            if (dinheiro >= 100_00) {
                dinheiro -= 100_00;
                n100++;
            } else if (dinheiro >= 50_00) {
                dinheiro -= 50_00;
                n50++;
            } else if (dinheiro >= 20_00) {
                dinheiro -= 20_00;
                n20++;
            } else if (dinheiro >= 10_00) {
                dinheiro -= 10_00;
                n10++;
            } else if (dinheiro >= 5_00) {
                dinheiro -= 5_00;
                n5++;
            } else if (dinheiro >= 2_00) {
                dinheiro -= 2_00;
                n2++;
            } else if (dinheiro >= 1_00) {
                dinheiro -= 1_00;
                n1++;
            } else if (dinheiro >= 50) {
                dinheiro -= 50;
                n050++;
            } else if (dinheiro >= 25) {
                dinheiro -= 25;
                n025++;
            } else if (dinheiro >= 10) {
                dinheiro -= 10;
                n010++;
            } else if (dinheiro >= 5) {
                dinheiro -= 5;
                n005++;
            } else if (dinheiro >= 1) {
                dinheiro -= 1;
                n001++;
            }
            
        } while (dinheiro >= 1);
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(n1 + " moeda(s) de R$ 1.00");
        System.out.println(n050 + " moeda(s) de R$ 0.50");
        System.out.println(n025 + " moeda(s) de R$ 0.25");
        System.out.println(n010 + " moeda(s) de R$ 0.10");
        System.out.println(n005 + " moeda(s) de R$ 0.05");
        System.out.println(n001 + " moeda(s) de R$ 0.01");
    }
 
}