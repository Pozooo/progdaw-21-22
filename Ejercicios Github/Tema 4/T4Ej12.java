public class T4Ej12 {
  public static void main(String[] args) {
  
  System.out.println("Este programa muestra un cuestionario al que deberás responder con <<sí>> o <<no>>");
  
  int nota;
  nota = 0;
  
  System.out.println("1. ¿Es Pascal un lenguaje de programación?");
  String respuesta1 = System.console().readLine();
  
  if (respuesta1.equals("sí")) {
    nota += 1;
  }
  System.out.println("Tu nota final es: " + nota);
  
  sin terminar pero es básicamente repetir el mismo sistema todo el rato
  
  }
}
