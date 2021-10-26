import java.util.Scanner;
public class T4Ej23 {
  public static void main(String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  double baseImponible;
  String tipoIva;
  String tipoCod;
  double porcIva;
  double codPro;
  double costeIva;
  double precioIva;
  double descuentoCod;
  double total;
  
  System.out.println("Introduzca la base imponible:");
  baseImponible = s.nextDouble();
  
  System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
  tipoIva = s.next();
  
  porcIva = 0;
  
  switch (tipoIva) {
    
    case "general":
    porcIva = 0.21;
    break;
    
    case "reducido":
    porcIva = 0.1;
    break;
    
    case "superreducido":
    porcIva = 0.04;
    break;
    
    default:
    System.out.println("El tipo de IVA introducido no es correcto");
    
    
    }
  
  System.out.println("Introduzca el código promocional (nopro, mitad, meno5, 5porc):");
  tipoCod = s.next();
  
  costeIva = baseImponible * porcIva;
  precioIva = baseImponible + costeIva;
  
  descuentoCod = 0;
  
  switch (tipoCod) {
    
    case "nopro":
    System.out.println("No se aplica descuento");
    break;
    
    case "mitad":
    descuentoCod = precioIva / 2;
    break;
    
    case "meno5":
    descuentoCod = 5;
    break;
    
    case "5porc":
    descuentoCod = precioIva * 0.05;
    break;
    
    default:
    System.out.println("El código introducido no es válido");
    }
    
    total = precioIva - descuentoCod;
    
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("IVA (" + porcIva + "): " + costeIva);
    System.out.println("Precio con IVA: " +precioIva);
    System.out.println("Código promocional (" + tipoCod + "): -" + descuentoCod);
    System.out.println("Total: " + total);
    
  
  
  }
}
