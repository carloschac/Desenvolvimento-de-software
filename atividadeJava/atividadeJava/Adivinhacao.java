package atividadeJava;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        Boolean acerto = false;
        int tentativa = 10;
        int numSorteado = gerador.nextInt(100);
        long adivinha = 0;

        while (tentativa > 0 && acerto == false) {
                System.out.println("Escreva um número");
                 adivinha = teclado.nextLong();

                 if (numSorteado == adivinha) {
                     System.out.println("Você acertou");
                     acerto = true;
                 }
                 else if (adivinha < numSorteado) {
                     --tentativa; 
                     System.out.println("Você escreveu um número muito baixo, tente um número maior. Você tem " + tentativa + "Tentativas restantes.");
                 }
                 else {
                    --tentativa;
                    System.out.println("Você escreveu um número muito alto, tente um número menor. Você tem " + tentativa + " Tentativas restantes.");
                }

                if (tentativa == 0) {
                    System.out.println("Suas tentativas acabaram.");
                }
        }

        teclado.close();
    }
}
