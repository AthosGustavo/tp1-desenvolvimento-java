package org.example.domain;
import java.util.Random;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private double notaMedia;

    private String matricula;

    // Construtor
    public Aluno(AlunoDTO alunoDTO) {
        this.nome = alunoDTO.nome();
        this.idade = alunoDTO.idade();
        this.curso = alunoDTO.curso();
        this.notaMedia = alunoDTO.media();
        this.matricula = geraMatricula();
    }

    public String geraMatricula(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String matriculaGerada = "";
        for(int i = 0; i < 6; i++){
            int numeroAleatorio = random.nextInt(10);
            stringBuilder.append(numeroAleatorio);
        }
        return stringBuilder.toString();
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    @Override
    public String toString() {
        return
          "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", curso='" + curso + '\'' +
            ", notaMedia=" + notaMedia + '\'' +
            ", matricula=" + matricula;

    }
}
