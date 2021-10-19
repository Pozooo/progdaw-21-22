public class Ej5 {
  public static void main(String[] args) {
  
  System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
  
  System.out.println("Por favor, introduzca el valor de a: ");
  float a = Float.parseFloat(System.console().readLine());
  
  System.out.println("Ahora introduce el valor de b: ");
  float b = Float.parseFloat(System.console().readLine());
  
  System.out.println("x es igual a: " + (-b / a));
  
  }
}
