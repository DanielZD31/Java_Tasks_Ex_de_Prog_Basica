/* 
 *  Task 5 — Calcular a média de 3 notas
 * 
 * Enunciado:
Solicite 3 notas ao usuário (valores de 0 a 10).
Calcule a média das notas e exiba o resultado.
 * 
 */

import java.util.Scanner;
import java.util.Locale;
public class Task_5 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US); /* Definindo o padrão de localização */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite suas notas, pode usar vírgula ou ponto: ");
        double nota1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
        double nota2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
        double nota3 = Double.parseDouble(scanner.nextLine().replace(",", "."));
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A sua média é " + " = " + media);

        scanner.close();
    }
}
