public class Ej12 {
  public static void main(String[] args) {
  
  String linea1;
  System.out.println("Introduce la nota del primer examen");
  linea1 = System.console().readLine();
  float nota1;
  nota1 = Float.parseFloat(linea1);
  
  String linea2;
  System.out.println("Introduzca la nota que desea obtener en la evaluación");
  linea2 = System.console().readLine();
  float nota2;
  nota2 = Float.parseFloat(linea2);
  
  float nota1f;
  nota1f = nota1 * (float)0.4;
  
  float notafalta;
  notafalta = nota2 - nota1f;
  
  float notafinal;
  notafinal = (notafalta * 10) /6;
  
  System.out.println("La nota que debes sacar en el segundo examen es: " +notafinal);
  
  }
}
