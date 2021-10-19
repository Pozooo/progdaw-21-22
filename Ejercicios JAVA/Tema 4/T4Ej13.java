public class T4Ej13 {
  public static void main(String[] args) {
  
  System.out.println("Este programa ordena los tres números enteros que introduzcas de menor a mayor");
  
  System.out.println("Por favor introduzca un número");
  int a = Integer.parseInt(System.console().readLine());
  System.out.println("Por favor introduzca otro número");
  int b = Integer.parseInt(System.console().readLine());
  System.out.println("Por favor introduzca un último número");
  int c = Integer.parseInt(System.console().readLine());
  
  int mayor;
  int menor;
  int medio;
  
  if ((a > b) && (a > c)) {
    mayor = a;
  }
  
  if ((b > a) && (b > c)) {
    mayor = b;
  }
  
  else {
    mayor = c;
  }
  
  if ((a < b) && (a < c)) {
    menor = a;
  }
  
  if ((b < a) && (b < c)) {
    menor = b;
  }
  
  else {
    menor = c;
  }
  
  
  medio = (a + b + c) - (mayor + menor);
  
  System.out.println("El orden de menor a mayor de los números introducidos es: " );
  System.out.println(menor);
  System.out.println(medio);
  System.out.println(mayor);
  
  no funciona bien
  
  }
}
