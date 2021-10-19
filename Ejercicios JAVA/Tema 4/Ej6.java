public class Ej6 {
  public static void main(String[] args) {
  
  System.out.println("Este programa calcula el tiempo que tarda en caer un objeto desde una altura h");
  System.out.println("Introduce la altura h en metros: ");
  int h = Integer.parseInt(System.console().readLine());
  
  System.out.println("El tiempo que tarda en caer el objeto es de: " + (Math.sqrt(2*h/9.81)) + " segundos");
  
  }
}
