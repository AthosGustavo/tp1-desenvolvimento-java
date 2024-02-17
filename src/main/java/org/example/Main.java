package org.example;
public class Main {
    public static void main(String[] args) {


            // Exemplo de utilização da classe Aluno
            Aluno aluno1 = new Aluno("João", 20, "Engenharia", 8.5);
            Aluno aluno2 = new Aluno("Maria", 22, "Ciências da Computação", 5.8);

            // Exibindo informações dos alunos
            System.out.println("Aluno 1:");
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("Idade: " + aluno1.getIdade());
            System.out.println("Curso: " + aluno1.getCurso());
            System.out.println("Nota Média: " + aluno1.getNotaMedia());
            System.out.println("Status: " + aluno1.getStatus());

            System.out.println("\nAluno 2:");
            System.out.println("Nome: " + aluno2.getNome());
            System.out.println("Idade: " + aluno2.getIdade());
            System.out.println("Curso: " + aluno2.getCurso());
            System.out.println("Nota Média: " + aluno2.getNotaMedia());
            System.out.println("Status: " + aluno2.getStatus());

    }
}