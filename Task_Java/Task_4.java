/* 
 * Task 4 — Descobrir se um número é positivo, negativo ou zero
 * 
 * Enunciado:
Peça um número para o usuário.
Depois, informe se o número é positivo, negativo ou zero.
 */

import java.util.Scanner;
public class Task_4 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println(num + " é um número positivo.");
        }else if(num < 0){
            System.out.println(num + " é um número negativo.");
        }else{
            System.out.println(num + " é o número 0.");
        }

        scanner.close();
    }
}
