package app.projeto.objeto;

public class Representante {
    // o representante da empresa, quem será ligado para atualizaçoes de solicitações ou pode autorizar por email
    private String nome;
    private String telefone;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
