import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Exercicio41 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner digit = new Scanner(System.in);
        String diaStr = digit.nextLine();
        String horaStr = digit.nextLine();
        String diaStr2 = digit.nextLine();
        String horaStr2 = digit.nextLine();
        
        int dia1 = Integer.parseInt(diaStr.substring(4));
        String horaArr[] = horaStr.split(" : ");
        int hora1 = Integer.parseInt(horaArr[0]);
        int minuto1 = Integer.parseInt(horaArr[1]);
        int segundo1 = Integer.parseInt(horaArr[2]);
        
        minuto1 *= 60;
        hora1 *= 3600;
        dia1 *= 86400;
        int tot1 = segundo1 + minuto1 + hora1 + dia1;
        
        int dia2 = Integer.parseInt(diaStr2.substring(4));
        String horaArr2[] = horaStr2.split(" : ");
        int hora2 = Integer.parseInt(horaArr2[0]);
        int minuto2 = Integer.parseInt(horaArr2[1]);
        int segundo2 = Integer.parseInt(horaArr2[2]);

        minuto2 *= 60;
        hora2 *= 3600;
        dia2 *= 86400;
        int tot2 = segundo2 + minuto2 + hora2 + dia2;
        
        
        int dif = tot2 - tot1;
        System.out.println(dif / 86400 + " dia(s)");
        System.out.println((dif % 86400) / 3600 + " hora(s)");
        System.out.println(((dif % 86400) % 3600) / 60 + " minuto(s)");
        System.out.println(((dif % 86400) % 3600) % 60 + " segundo(s)");
 
    }
 
}