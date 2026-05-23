package model;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public void  setNome() {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void  setMatricula() {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void  setCurso() {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Maatrícula: " + matricula + " | Curso: " + curso;
    }
}
