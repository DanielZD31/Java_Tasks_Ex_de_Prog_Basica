
/* 
 * Task 2 — Somar dois números
 * 
 * Enunciado:
Peça para o usuário digitar dois números inteiros. Depois, exiba a soma desses números.
 */

import java.util.Scanner;   /* Importando a biblioteca Scanner: responsável por
 */
public class Task_2 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;

        System.out.println("A soma  de " + num1 + " + " + num2 + " = " + num3);

        scanner.close();

    }
}
