import java.util.Random;

public class sorteio {
    // Atributs, propriedades, variaveis globais
    //Funções e procedimentos
    //Rotina Principal
public static void main(String[] args) {
    Random gerador = new Random();
    int c = 1;
    while ( c <= 1000) {
        //Ler o número
        int n = 1 + gerador.nextInt(1001);
        c++; // c += 1 ou c = c + 1
        System.out.println(n);
        
    }
    
}

}