import java.util.Scanner;

public class calendario {

    // funções e procedimentos
    public static String mostrarNomeMesIf(int mes) {
        String nomeMes = "";
        if (mes == 1) {
            nomeMes = "Janeiro";
        } else if (mes == 2) {
            nomeMes = "Fevereiro";
        }
        else if (mes == 2) {
            nomeMes = "Fevereiro";
        }
        else if (mes == 3) {
            nomeMes = "Março";
        }
        else if (mes == 4) {
            nomeMes = "Abril";
        }
        else if (mes == 5) {
            nomeMes = "Maio";
        }
        else if (mes == 6) {
            nomeMes = "Junho";
        }
        else if (mes == 7) {
            nomeMes = "Julho";
        }
        else if (mes == 9) {
            nomeMes = "Setembro";
        }
        else if (mes == 10) {
            nomeMes = "Outubro";
        }
        else if (mes == 11) {
            nomeMes = "Novembro";
        }
        else if (mes == 12) {
            nomeMes = "Dezembro";
        }
        return nomeMes;
    }
    
    // função principal 
    public static void main(String[] args) {
        //mostrar mensagem para o usuário
        System.out.println("Digite o mês");
        Scanner input = new Scanner(System.in);
        
        //ler número digitado no teclado
        int mes = input.nextInt();

        //Mostrar nome do mês  
         //usando if   
         //usando switch
         System.out.println("Número digitado = " + mes);
        input.close();

    }
}