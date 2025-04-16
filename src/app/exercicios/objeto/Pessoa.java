package app.exercicios.objeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private int idade;
    private LocalDate nascimento;

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
        // Formatador de data para exibir no formato dia/mês/ano
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nascimento: " + getNascimento().format(formatar));
    }
    
}
