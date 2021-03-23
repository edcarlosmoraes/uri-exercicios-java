import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio28 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);

        int n[] = {digit.nextInt(), digit.nextInt(), digit.nextInt()};
        int a[] = {n[0],n[1], n[2]};
        Arrays.sort(n);
        for (int valor: n){
            System.out.println(valor);
        }
        System.out.println("");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
 
    }
 
}