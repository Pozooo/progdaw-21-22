public class T4Ej7 {
  public static void main(String[] args) {
  
  System.out.println("Este programa calcula la media aritmética de 3 notas");
  
  System.out.println("Por favor, introduzca una nota");
  float nota1 = Float.parseFloat(System.console().readLine());
  
  System.out.println("Por favor, introduzca otra nota");
  float nota2 = Float.parseFloat(System.console().readLine());
  
  System.out.println("Por favor, introduzca una última nota");
  float nota3 = Float.parseFloat(System.console().readLine());
  
  System.out.println("La media aritmética de las notas introducidas es: " + ((nota1 + nota2 + nota3) / 3));
  
  }
}
