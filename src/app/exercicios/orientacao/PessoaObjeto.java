package app.exercicios.orientacao;

import app.exercicios.objeto.Pessoa;

import java.time.LocalDate;

public class PessoaObjeto {
    public static void main(String[] args) {
        Pessoa fabio = new Pessoa();
        Pessoa filipe = new Pessoa();
        fabio.setNome("Fábio");
        fabio.setIdade(23);
        fabio.setNascimento(LocalDate.of(2002, 3, 18));

        filipe.setNome("Filipe");
        filipe.setIdade(22);
        filipe.setNascimento(LocalDate.of(2002, 9, 7));


        filipe.imprimirDados();
        fabio.imprimirDados();

    }
}
