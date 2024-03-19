package org.example.Service;
import org.example.domain.Aluno;
import org.example.domain.AlunoDTO;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AlunoService {


    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public boolean adicionaAlunoService(AlunoDTO alunoDTO){
        Aluno aluno = new Aluno(alunoDTO);
        return listaDeAlunos.add(aluno);
    };
    public String removeAlunoService(String matricula){

        Iterator<Aluno> iterator = listaDeAlunos.iterator();
        String mensagem = "";
        while (iterator.hasNext()) {
            Aluno aluno = iterator.next();

            if (aluno.getMatricula().equals(matricula)) {
                iterator.remove();
                mensagem = String.format("O aluno %s de matrícula %s foi removido.",aluno.getNome(), aluno.getMatricula());
            }
        }
        return mensagem;
    }

    public void exibeListaAlunosService(){
        for(Aluno aluno : listaDeAlunos){
            System.out.println(aluno.toString());
        }
    }

    public String editarAlunoService(String matricula, String propriedade, String novoValor){
        Aluno editarAluno = null;
        String mensagem = "";
        for(Aluno aluno: listaDeAlunos){
            if(aluno.getMatricula().equals(matricula)){
                editarAluno = aluno;
            }
        }

        if(propriedade.equalsIgnoreCase("nome")){
            editarAluno.setNome(novoValor);
            mensagem = String.format("A propriedade %s do aluno de matrícula %s foi alterada.",propriedade,matricula);
        }
        if(propriedade.equalsIgnoreCase("idade")){
            editarAluno.setIdade(Integer.parseInt(novoValor));
            mensagem = String.format("A propriedade %s do aluno de matrícula %s foi alterada.",propriedade,matricula);
        }
        if(propriedade.equalsIgnoreCase("curso")){
            editarAluno.setCurso(novoValor);
            mensagem = String.format("A propriedade %s do aluno de matrícula %s foi alterada.",propriedade,matricula);
        }
        if(propriedade.equalsIgnoreCase("notaMedia")){
            editarAluno.setNotaMedia(Double.parseDouble(novoValor));
            mensagem = String.format("A propriedade %s do aluno de matrícula %s foi alterada.",propriedade,matricula);
        }
        return mensagem;
    }

}
