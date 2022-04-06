package atividadeJava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo aqui");

        int num = teclado.nextInt();
        int fat, val;
        teclado.close();


        if (n == 0) {

            System.out.println("O resultado do fatorial é 1.");
        }else if (n > 0) {
            val = n;
            fat = n;

            while (n > 1) {
                fat = fat*(n-1);
                n--;
            }
            System.out.println("O valor fatorial de " + val + " é " + fat);
        }
       
    }
}