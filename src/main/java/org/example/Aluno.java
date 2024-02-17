package org.example;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double notaMedia;

    // Construtor
    public Aluno(String nome, int idade, String curso, double notaMedia) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Método que retorna um status com base na nota média
    public String getStatus() {
        if (notaMedia >= 7.0) {
            return "Aprovado";
        } else if (notaMedia >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
