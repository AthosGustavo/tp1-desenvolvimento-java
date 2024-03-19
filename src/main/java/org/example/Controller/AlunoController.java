package org.example.Controller;
import org.example.Exceptions.InvalidParameterException;
import org.example.Service.AlunoService;
import org.example.domain.Aluno;
import org.example.domain.AlunoDTO;

public class AlunoController {
    private AlunoService alunoService;
    public AlunoController(AlunoService alunoService){
        this.alunoService = alunoService;
    }
    public boolean adicionaAlunoController(String nome, int idade, String curso, double media){

        if(nome == null || nome.isEmpty() || nome ==""){
            throw new InvalidParameterException(InvalidParameterException.argumentoInvalidoMetodoAdicionaAluno("Nome inválido"));
        }
        if(idade <= 0 || idade < 18){
            throw new InvalidParameterException(InvalidParameterException.argumentoInvalidoMetodoAdicionaAluno("Idade inválida"));
        }
        if(curso == null || curso.isEmpty()){
            throw new InvalidParameterException(InvalidParameterException.argumentoInvalidoMetodoAdicionaAluno("Curso inválido"));
        }
        if(media <= 0.0 || media > 10.0){
            throw new InvalidParameterException(InvalidParameterException.argumentoInvalidoMetodoAdicionaAluno("Média inválida"));
        }

        AlunoDTO alunoDTO = new AlunoDTO(nome,idade,curso,media);
        return this.alunoService.adicionaAlunoService(alunoDTO);
    };

    public String removeAlunoController(String matricula){
        if(matricula == null || matricula.length() < 6 || matricula.length() > 6){
            throw new InvalidParameterException(InvalidParameterException.argumentoInvalidoMetodoRemoveAluno());
        }
        return this.alunoService.removeAlunoService(matricula);
    }

    public void exibeListaAlunosController(){
        this.alunoService.exibeListaAlunosService();
    }

    public String editaAlunoController(String matricula, String propriedade, String novoValor){
        return this.alunoService.editarAlunoService(matricula, propriedade, novoValor);
    }
}
