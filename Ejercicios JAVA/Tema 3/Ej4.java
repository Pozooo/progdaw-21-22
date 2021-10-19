public class Ej4 {
  public static void main(String[] args) {
  
  String linea1;
  System.out.println("Introduzca un número");
  linea1 = System.console().readLine();
  float numero1;
  numero1=Integer.parseInt(linea1);
  
  String linea2;
  System.out.println("Introduzca otro número");
  linea2 = System.console().readLine();
  float numero2;
  numero2=Integer.parseInt(linea2);
  
  float suma;
  suma = numero1 + numero2;
  System.out.println("La suma de los dos números introducidos es: " +suma);
  
  float resta;
  resta = numero1 - numero2;
  System.out.println("La resta de los dos números introducidos es: " +resta); 
  
  float producto;
  producto = numero1 * numero2;
  System.out.println("El producto de los dos números introducidos es: " +producto);
  
  float cociente;
  cociente = numero1 /numero2;
  System.out.println("El cociente de los dos números introducidos es: " +cociente);
  
  
  }
}
