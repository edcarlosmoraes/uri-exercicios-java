import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio08 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int horas = teclado.nextInt();
        float vlr_hora = teclado.nextFloat();
        float salario = horas * vlr_hora;
        System.out.println("NUMBER = " + num);
        System.out.format("SALARY = U$ %.2f\n", salario);
 
    }
 
}