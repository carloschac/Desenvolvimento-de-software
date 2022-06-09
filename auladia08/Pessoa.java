package auladia08;

import java.util.HashMap;
import java.util.Map;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private Map<String, String> telefones;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.telefones = new HashMap<String, String>();
    }
    @Override
    public String toString() {
        return String.format("Nome: %s; Idade: %d; Peso: %.2f; Altura: %.2f", nome, idade, peso, altura);
    }
    @Override
    public int compareTo(Pessoa o) {
        
        if (this.idade > o.idade) {
            return 1;
        } else if (this.idade < o.idade) {
            return -1;
        }
        return 0;
    }

    public Map<String, String> getTelefones() {
        return telefones;

    }
}
