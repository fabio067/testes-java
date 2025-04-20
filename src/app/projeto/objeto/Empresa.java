package app.projeto.objeto;

public class Empresa {
    //empresa terá por si o nome e o cnpj
    // pertencerá a ela o tipo de sistema(local ou remoto) e o representante da mesma
    private String nome;
    private String cnpj;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
