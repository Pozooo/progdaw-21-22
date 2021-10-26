import java.util.Scanner; 
public class T4Ej25 {
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  int altura;
  int anchura;
  String escudo;
  double area;
  double escudosi = 2.50;
  double escudono = 0.00;
  double gastosEnvio = 3.25;
  double total;
  
  System.out.println("Introduzca la altura de la bandera en cm");
  altura = s.nextInt();
  
  System.out.println("Introduzca la anchura en cm");
  anchura = s.nextInt();
  
  System.out.println("¿Quiere escudo bordado (s/n)?");
  escudo = s.next();
  
  double precioEscudo = 0;
  
  if (escudo.equals("s")) {
    precioEscudo = 2.50;
  }
  
  else if (escudo.equals("n")) {
    precioEscudo = 0;
  }
  
  else {
    System.out.println("Introduzca una opción correcta");
  }
  
  area = altura * anchura;
  
  System.out.println("Gracias, aquí tiene el desglose de su compra:");
  System.out.println("Bandera de " + area + "cm2: " + area / 100 + " \u20AC");
  
  if (escudo.equals("s")) {
    System.out.println("Con escudo: " +precioEscudo + " \u20AC");
  }
  
  else if (escudo.equals("n")) {
    System.out.println("Sin escudo: " +precioEscudo + " \u20AC");
  }
  
  else {
    System.out.println("Introduzca una opción válida");
  }
  
  System.out.println("Gastos de envío: " +gastosEnvio + " \u20AC");
  
  total = (area/100 + precioEscudo + gastosEnvio);
  
  System.out.println("Total: " +total + " \u20AC");
  
  
  
  }
}
