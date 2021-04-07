import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio32 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        int t1 = digit.nextInt();
        int t2 = digit.nextInt();
        
        
        if (t1 >= t2){
            int dur = (24 - t1) + t2;
            System.out.println("O JOGO DUROU " + dur + " HORA(S)");
        } else {
            int dur = t2 - t1;
            System.out.println("O JOGO DUROU " + dur + " HORA(S)");
        }
 
    }
 
}