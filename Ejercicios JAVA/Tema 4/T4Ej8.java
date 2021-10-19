public class T4Ej8 {
  public static void main(String[] args) {
  System.out.println("Este programa calcula la media aritmética de 3 notas y te dice tu notificación en el boletín");
  
  System.out.println("Por favor, introduzca una nota");
  float nota1 = Float.parseFloat(System.console().readLine());
  
  System.out.println("Por favor, introduzca otra nota");
  float nota2 = Float.parseFloat(System.console().readLine());
  
  System.out.println("Por favor, introduzca una última nota");
  float nota3 = Float.parseFloat(System.console().readLine());
  
  float notafinal = ((nota1 + nota2 + nota3) / 3);
  
  if (notafinal <= 10) {
  System.out.println("La media aritmética de las notas introducidas es: " + notafinal);
  }
  
  if (notafinal < 5) {
    System.out.println("Tu calificación es: insuficiente");
  }
  
  if ((notafinal >=5) && (notafinal < 6)) {
    System.out.println("Tu calificación es: suficiente");
  }
  
  if ((notafinal >= 6) && (notafinal < 7)) {
    System.out.println("Tu calificación es: bien");
  }
  
  if ((notafinal >= 7) && (notafinal < 9)) {
    System.out.println("Tu calificación es: notable");
  }
  
  if ((notafinal >= 9) && (notafinal <= 10)) {
    System.out.println("Tu calificación es: sobresaliente");
  }
  else {
    System.out.println("Lo siento, las notas que has introducido son inválidas");
  }
  
  }
}
