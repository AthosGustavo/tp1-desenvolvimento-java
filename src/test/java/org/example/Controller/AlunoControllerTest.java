package org.example.Controller;

import org.example.Exceptions.InvalidParameterException;
import org.example.Service.AlunoService;
import org.example.domain.AlunoDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AlunoControllerTest {
  @Mock
  private AlunoService alunoService;
  private AlunoController alunoController;

  @BeforeEach
  public void setup() {
    alunoController = new AlunoController(alunoService);
  }

  private static Stream<Arguments> provideInvalidParametersForAdicionaAlunoController() {
    return Stream.of(
      Arguments.of(null, 20, "Ciência da Computação", 8.5),  // nome é nulo
      Arguments.of("Teste", -1, "Ciência da Computação", 8.5),  // idade é negativa
      Arguments.of("Teste", 20, null, 8.5),  // curso é nulo
      Arguments.of("Teste", 20, "Ciência da Computação", -1.0)  // média é negativa
    );
  }

  @ParameterizedTest
  @MethodSource("provideInvalidParametersForAdicionaAlunoController")
  public void deveRetornarUmaExcecaoParameterInvalidExceptionMetodoAdicionaAlunoController(String nome, int idade, String curso, double media) {
    assertThrows(InvalidParameterException.class, () -> {
      alunoController.adicionaAlunoController(nome, idade, curso, media);
    });
  }


  @Test
  public void deveChamarMetodoAdicionaAlunoControllerVerificaSeAdicionaAlunoServiceFoiChamado() {
    // Arrange
    String nome = "Teste";
    int idade = 20;
    String curso = "Ciência da Computação";
    double media = 8.5;

    // Act
    alunoController.adicionaAlunoController(nome, idade, curso, media);

    // Assert
    verify(alunoService).adicionaAlunoService(new AlunoDTO(nome, idade, curso, media));
  }

  @ParameterizedTest
  @MethodSource("provideInvalidMatriculas")
  public void deveLancarExcecaoQuandoMatriculaInvalida(String matricula) {
    assertThrows(InvalidParameterException.class, () -> {
      alunoController.removeAlunoController(matricula);
    });
  }

  private static Stream<String> provideInvalidMatriculas() {
    return Stream.of(
      "", // matrícula vazia
      "12345", // matrícula com menos de 6 caracteres
      "1234567" // matrícula com mais de 6 caracteres
    );
  }

  @Test
public void deveAlterarNomeAluno() {
    // Arrange
    String matricula = "123456";
    String propriedade = "nome";
    String novoValor = "Novo Nome";
//    AlunoService alunoServiceMock = mock(AlunoService.class);
    AlunoController alunoController = new AlunoController(alunoService);

    // Act
    alunoController.editaAlunoController(matricula, propriedade, novoValor);

    // Assert
    verify(alunoService).editarAlunoService(matricula, propriedade, novoValor);
}

@Test
public void deveAlterarIdadeAluno() {
    // Arrange
    String matricula = "123456";
    String propriedade = "idade";
    String novoValor = "21";
//    AlunoService alunoServiceMock = mock(AlunoService.class);
    AlunoController alunoController = new AlunoController(alunoService);

    // Act
    alunoController.editaAlunoController(matricula, propriedade, novoValor);

    // Assert
    verify(alunoService).editarAlunoService(matricula, propriedade, novoValor);
}

@Test
public void deveAlterarCursoAluno() {
    // Arrange
    String matricula = "123456";
    String propriedade = "curso";
    String novoValor = "Novo Curso";
    //AlunoService alunoServiceMock = mock(AlunoService.class);
    AlunoController alunoController = new AlunoController(alunoService);

    // Act
    alunoController.editaAlunoController(matricula, propriedade, novoValor);

    // Assert
    verify(alunoService).editarAlunoService(matricula, propriedade, novoValor);
}

@Test
public void deveAlterarNotaMediaAluno() {
    // Arrange
    String matricula = "123456";
    String propriedade = "notaMedia";
    String novoValor = "9.5";
    //AlunoService alunoServiceMock = mock(AlunoService.class);
    AlunoController alunoController = new AlunoController(alunoService);

    // Act
    alunoController.editaAlunoController(matricula, propriedade, novoValor);

    // Assert
    verify(alunoService).editarAlunoService(matricula, propriedade, novoValor);
}

}
















