public class Ej5 {
  public static void main(String[] args) {
  
  String linea1;
  System.out.println("Introduzca la base del rectángulo en centímetros");
  linea1 = System.console().readLine();
  int base;
  base = Integer.parseInt(linea1);
  
  String linea2;
  System.out.println("Introduzca la altura del rectángulo en centímetros");
  linea2 = System.console().readLine();
  int altura;
  altura = Integer.parseInt(linea2);
  
  int area;
  area = base * altura;
  
  System.out.println("Según las medidas introducidas, el área del rectángulo es: " +area+ " m2");
  
  }
}
