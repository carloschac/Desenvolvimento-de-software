package auladia08;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // instancar um List de pessoa

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        //adicionar objetos na lista
        pessoas.add(new Pessoa("João", 25, 78, 1.76));
        pessoas.add(new Pessoa("Pedro", 48, 120, 1.73));
        pessoas.add(new Pessoa("Francieli", 33, 65, 1.62));
        pessoas.add(new Pessoa("Diogo", 15, 59, 1.69));
        pessoas.add(new Pessoa("Natasha", 23, 53, 1.56));

        //foreach + print
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        //ordenação
        System.out.println("\n --------- ORDENAÇÃO ---------- \n");

        Collections.sort(pessoas);

        // foreach + print

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        //criar nova pessoa
        
        Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        p.getTelefones().put("residencial", "41 3264-3273");
        p.getTelefones().put("comercial", "41 3763-4756");
        p.getTelefones().put("celular", "41 99861-5310");

        System.out.printf("Telefone Celular: %s", p.getTelefones().get("celular"));
    }
}
