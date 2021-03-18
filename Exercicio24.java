import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio24 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner digit = new Scanner(System.in);
        double numero = digit.nextDouble();
        
        if ((numero >= 0)&&(numero <=25)){
            System.out.println("Intervalo [0,25]");
        } else if ((numero > 25)&&(numero <=50)){
            System.out.println("Intervalo (25,50]");
        } else if ((numero > 50)&&(numero <=75)){
            System.out.println("Intervalo (50,75]");
        } else if ((numero > 75)&&(numero <=100)){
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
 
    }
 
}