import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio35 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);

        String t1 = digit.nextLine();
        String t2 = digit.nextLine();
        String t3 = digit.nextLine();
        
        if (t1.equals("vertebrado") && t2.equals("ave") && t3.equals("carnivoro")) {
            System.out.println("aguia");
        } else if (t1.equals("vertebrado") && t2.equals("ave") && t3.equals("onivoro")) {
            System.out.println("pomba");
        } else if (t1.equals("vertebrado") && t2.equals("mamifero") && t3.equals("onivoro")) {
            System.out.println("homem");
        } else if (t1.equals("vertebrado") && t2.equals("mamifero") && t3.equals("herbivoro")) {
            System.out.println("vaca");
        } else if (t1.equals("invertebrado") && t2.equals("inseto") && t3.equals("hematofago")) {
            System.out.println("pulga");
        } else if (t1.equals("invertebrado") && t2.equals("inseto") && t3.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (t1.equals("invertebrado") && t2.equals("anelideo") && t3.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (t1.equals("invertebrado") && t2.equals("anelideo") && t3.equals("onivoro")) {
            System.out.println("minhoca");
        }
 
    }
 
}