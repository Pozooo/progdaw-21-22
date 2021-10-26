public class T4Ej21 {
  public static void main(String[] args) {
  
  String recuperacion;
  
  System.out.println("Introduzca la nota que ha sacado en el primer control");
  double nota1 = Double.parseDouble(System.console().readLine());
  System.out.println("Introduzca la nota que ha sacado en el segundo examen");
  double nota2 = Double.parseDouble(System.console().readLine());
  
  double notamedia = (nota1 + nota2) / 2;
  
  if (notamedia >= 5) {
  System.out.println("Tu nota de programación es: " +notamedia);
  }
  
  else {
    System.out.println("Cuál ha sido el resultado de la recuperación (apto/no apto): ");
    recuperacion = System.console().readLine();
    
    if (recuperacion == "apto") {
      System.out.println("Tu nota de programación es: 5");
    }
    
    if (recuperacion == "no apto") {
      System.out.println("Tu nota de programación es: " +notamedia);
    }
    }
  preguntar por que no funciona el final
  }
}
