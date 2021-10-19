public class T4Ej14 {
  public static void main(String[] args) {
  
  System.out.println("Introduzca un número");
  int numero = Integer.parseInt(System.console().readLine());
  
  float resto1;
  float resto2;
  
  resto1 = numero % 2;
  resto2 = numero % 5;
  
  if (resto1 == 0) {
    System.out.println("El número introducido es par");
  }
  
  if (resto1 != 0) {
    System.out.println("El número introducido es impar");
  }
  
  if (resto2 == 0) {
    System.out.println("El número introducido es divisible entre 5");
  }
  
  if (resto2 != 0) {
    System.out.println("El número introducido no es divisible entre 5");
  }
  
  }
}
