import java.util.Scanner;

public class parImpar {
    public static String verificarparImpar(int n) {
        if (n % 2 == 0) {
            return "Par";
        }   else {
            return "Impar";
        }
    }

    //função principal


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            n = teclado.nextInt();
            if (n >= 0) {
                System.out.println(verificarparImpar(n));
            }
        } while (n >= 0);
        teclado.close();
    }
}

