package atividadeJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int f = teclado.nextInt();
        teclado.close();

        long num1 = 0, num2 = 1;

        if (f == 0) {
            System.out.println("O n-ésimo número é 0");
        }
        else if (f == 1) {
            System.out.println("O n-ésimo número é 1");
        }
        else if (f < 0) {
            System.out.println("Insira um número positivo");
        }
        else {
            for (int i = f; i > 0; i--) {
                System.out.println(num1 + " ");

               long num3 = num1 + num2;
               num1 = num2;
               num2 = num3;

            }
            System.out.println("O n-ésimo número é este.");
        }
    }
}
