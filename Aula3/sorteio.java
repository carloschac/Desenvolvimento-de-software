import java.util.Random;

public class sorteio {
    // Atributs, propriedades, variaveis globais
    //Funções e procedimentos
    //Rotina Principal
public static void main(String[] args) {
    Random gerador = new Random();
    int c = 1;
    int maior = 0;
    int menor = 0;
    int soma = 0;
    while ( c <= 1000) {
        //Ler o número
        int n = 1 + gerador.nextInt(100);
        soma += n; // soma + soma = n
        if (c ==1) {
            maior = n;
            menor = n;
        }
            
            if (n > maior) {
                maior = n;
            }

            if (n < menor) {
                menor = n;
            }
        c++; // c += 1 ou c = c + 1
        System.out.println("Sua nota maior é: " + maior);
        System.out.println("Sua nota menor é: " + menor);
        System.out.println("A soma das notas é: " + soma);


    }


    }
    
   
}
