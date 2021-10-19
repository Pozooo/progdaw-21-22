public class Ej7 {
  public static void main(String[] args) {
  
  String linea1;
  System.out.println("Introduzca la base imponible de la factura");
  linea1 = System.console().readLine();
  float baseImponible;
  baseImponible = Integer.parseInt(linea1);
  
  float iva;
  iva = (float)0.21;
  
  float precioIva;
  precioIva = baseImponible * iva;
  
  float total;
  total = baseImponible + precioIva;
  
  System.out.println("El total de la factura es: " +total+ " euros"); 
  
  }
}
