public class Ej6 {
  public static void main(String[] args) {
  
  String linea1;
  System.out.println("Introduzca la base del triángulo en centímetros");
  linea1 = System.console().readLine();
  float base;
  base = Integer.parseInt(linea1);
  
  String linea2;
  System.out.println("Introduzca la altura del triángulo en centímetros");
  linea2 = System.console().readLine();
  float altura;
  altura = Integer.parseInt(linea2);
  
  float basexaltura;
  basexaltura = base * altura;
  
  float area;
  area = basexaltura / 2;
  
  
  System.out.println("Según las medidas introducidas, el área del triángulo es: " +area+ " m2");
  
  }
}
