package app.exercicios.objeto;

public class Professor {
    private String nome;
    private String materia;
    Seminario[] seminario;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
