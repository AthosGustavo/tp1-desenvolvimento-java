package org.example.Service;
import org.example.Exceptions.InvalidParameterException;
import org.example.domain.Aluno;
import org.example.domain.AlunoDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AlunoServiceTest {


  @Mock
  private AlunoService alunoService;
  private AlunoDTO alunoDTO;
  private Aluno aluno;

  @BeforeEach
  public void setup() {
    this.alunoDTO = new AlunoDTO("athos", 22, "ads",  8.5);
    this.aluno = new Aluno(this.alunoDTO);

  }

  @Test
  public void verifyDeveRetornarTrueParaRemoverAluno() {
    // Arrange
    String matricula = aluno.getMatricula();
    alunoService.adicionaAlunoService(alunoDTO);

    alunoService.removeAlunoService(matricula);

    verify(alunoService).removeAlunoService(matricula);

  }

  @Test
  public void verifyDeveRetornarTrueParaAdicionaAlunoService(){
    alunoService.adicionaAlunoService(alunoDTO);
    verify(alunoService).adicionaAlunoService(alunoDTO);
  }



}