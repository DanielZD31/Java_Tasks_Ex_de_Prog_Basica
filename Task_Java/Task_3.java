/* 
 * Task 3 — Contagem de 1 até 5
 * 
 * Enunciado:
Faça uma contagem de 1 até 5, mostrando cada número em uma linha.
 */

public class Task_3 {
    public static void main(String[] args){
        System.out.println("=".repeat(50));
        System.out.println("Contagem de 1 até 5 pelo for: ");
        /* Fazendo pelo for */
        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("=".repeat(50));
        System.out.println("Contagem de 1 até 5 pelo while: ");
        /* Fazendo pelo while */ 
        int a = 1;
        while (a <= 5){
            System.out.println(a);
            a++;
        }
        System.out.println("=".repeat(50));
        System.out.println("Contagem de 1 até 5 pelo do while: ");
        /* Fazendo pelo do while */
        int b = 1;
        do{
            System.out.println(b);
            b++;
        }while(b <= 5);
        System.out.println("=".repeat(50));
    }
}
