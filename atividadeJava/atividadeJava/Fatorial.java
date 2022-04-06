package atividadeJava;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo aqui");

        int num = teclado.nextInt();
        teclado.close();

        if (num >= 0) {
            while (num > 0) {
                num = num*(num-1)*1;
                num--;
                System.out.println(num);
            }
        }

        else {
            System.out.println("O número informado não é posítivo tente novamente");
        }

        if (num == 0) {
            System.out.println("O resultado do fatorial é um (1).");
        }
    }
}
