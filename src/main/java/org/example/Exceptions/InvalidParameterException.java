package org.example.Exceptions;

public class InvalidParameterException extends IllegalArgumentException {
  public InvalidParameterException(String msg){
    super(msg);
  }

  public static String argumentoInvalidoMetodoAdicionaAluno(String msg){
    return msg;
  }
  public static String argumentoInvalidoMetodoRemoveAluno(){
    return "Matrícula inválida";
  }

}
