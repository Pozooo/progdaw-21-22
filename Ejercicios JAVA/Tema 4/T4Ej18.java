public class T4Ej18 {
  public static void main(String[] args) {
  
  int x;
  
  System.out.println("Este programa te dice cuál es la primera cifra de un número entero entre el 1 y el 100000");
  x = Integer.parseInt(System.console().readLine());
  
  if (x < 10) {
    System.out.println("La primera cifra es: " +x);
  }
  
  else if ((x >= 10) && (x < 100)) {
    System.out.println("La primera cifra es: " +x / 10);
  }
  
  else if ((x >= 100) && (x < 1000)) {
    System.out.println("La primera cifra es: " +x / 100);
  }
  
  else if ((x >= 1000) && (x < 10000)) {
    System.out.println("La primera cifra es: " +x / 1000);
  }
  
  else if ((x >= 10000) && (x < 100000)) {
    System.out.println("La primera cifra es: " +x / 10000);
  }
  
  else {
    System.out.println("Prueba a introducir otro número que se corresponda con las especificaciones");
  }
  
  }
}
