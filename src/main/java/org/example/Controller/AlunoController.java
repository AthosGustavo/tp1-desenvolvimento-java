package org.example.Controller;
import org.example.Service.AlunoService;
import org.example.domain.Aluno;
import org.example.domain.AlunoDTO;

public class AlunoController {
    private AlunoService alunoService;
    public AlunoController(){
        this.alunoService = new AlunoService();
    }
    public void adicionaAlunoController(String nome, int idade, String curso, double media){
        AlunoDTO alunoDTO = new AlunoDTO(nome,idade,curso,media);
        this.alunoService.adicionaAlunoService(alunoDTO);
    };

    public String removeAlunoController(String matricula){
        return this.alunoService.removeAlunoService(matricula);
    }

    public void exibeListaAlunosController(){
        this.alunoService.exibeListaAlunosService();
    }
    public String editaAlunoController(String matricula, String propriedade, String novoValor){
        return this.alunoService.editarAlunoService(matricula, propriedade, novoValor);
    }
}
