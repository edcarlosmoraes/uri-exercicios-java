import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio33 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        int t1 = digit.nextInt();
        int m1 = digit.nextInt();
        int t2 = digit.nextInt();
        int m2 = digit.nextInt();
        int toti = (t1 * 60) + m1;
        int totf = (t2 * 60) + m2;

        if (toti < totf) {
            int durmt = totf - toti;
            int durh = durmt / 60;
            int durm = durmt % 60;
            System.out.println("O JOGO DUROU " + durh + " HORA(S) E " + durm + " MINUTO(S)");
        } else if (toti > totf){
            int durmt = (1440 - toti) + totf;
            int durh = durmt / 60;
            int durm = durmt % 60;
            System.out.println("O JOGO DUROU " + durh + " HORA(S) E " + durm + " MINUTO(S)");
        } else{
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
 
    }
 
}