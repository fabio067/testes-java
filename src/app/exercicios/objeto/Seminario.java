package app.exercicios.objeto;

public class Seminario {
    private String titulo;
    private Local local = new Local();
    private Estudante[] estudantes;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local, Estudante[] estudantes) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
