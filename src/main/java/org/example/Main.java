package org.example;

import org.example.Controller.AlunoController;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Entrando no programa");
    Scanner scanner = new Scanner(System.in);
    boolean teste = true;
    AlunoController alunoController = new AlunoController();

    while(teste) {
      System.out.println("1 para:Cadastrar um aluno");
      System.out.println("2 para:Remover um aluno");
      System.out.println("3 para:Editar um aluno");
      System.out.println("4 para:Exibir todos os alunos");
      System.out.println("0 para:Sair do programa\n");
      System.out.printf("Digite um número:");
      int numeroDigitado = scanner.nextInt();


      switch (numeroDigitado) {
        case 1:
          System.out.printf("Digite o nome do aluno:");
          String nome = scanner.next();
          System.out.printf("Digite a idade do aluno:");
          int idade = scanner.nextInt();
          scanner.nextLine();
          System.out.printf("Digite o curso do aluno:");
          String curso = scanner.nextLine();
          System.out.printf("Digite a média do aluno:");
          double media = scanner.nextDouble();
          scanner.nextLine();
          System.out.println("==============================");
          System.out.println("\nAluno adicionado com sucesso!\n");
          System.out.println("==============================");

          alunoController.adicionaAlunoController(nome, idade, curso, media);
          break;
        case 2:
          System.out.printf("Digite a matrícula do aluno:");
          String matriculaDigitadaRemover = scanner.next();
          String resultAdicionarAluno = alunoController.removeAlunoController(matriculaDigitadaRemover);
          System.out.println("\n");
          System.out.println("===========================================================");
          System.out.println(resultAdicionarAluno);
          System.out.println("===========================================================");
          System.out.println("\n");
          break;
        case 3:
          System.out.printf("Digite a matrícula do aluno que você deseja editar:");
          String matriculaDigitadaEditar = scanner.next();
          System.out.println("Digite o nome da propriedade que você deseja editar");
          System.out.printf("Digite em maiúsculo: NOME, IDADE, CURSO, NOTAMEDIA:");
          String propriedadeDigitada = scanner.next();
          scanner.nextLine();
          System.out.printf("Digite o novo valor:");
          String novoValor = scanner.nextLine();
          String resultEditarAluno = alunoController.editaAlunoController(matriculaDigitadaEditar, propriedadeDigitada, novoValor);
          System.out.println("\n");
          System.out.println("===========================================================");
          System.out.println(resultEditarAluno);
          System.out.println("===========================================================");
          System.out.println("\n");
          break;
        case 4:
          System.out.println("================== LISTA DE ALUNOS =====================");
          alunoController.exibeListaAlunosController();
          System.out.println("========================================================");
          break;

        case 0:
          System.out.println("========================");
          System.out.println("Programa finalizado");
          System.out.println("========================");
          teste = false;

      }
    }


  }
}