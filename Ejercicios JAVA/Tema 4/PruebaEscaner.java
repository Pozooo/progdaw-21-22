import java.util.Scanner;

public class PruebaEscaner {
  public static void main(String[] args) {
    Scanner x = new Scanner (System.in);
    
    String s;
    int a;
    float b;
    
    System.out.print("Veamos cómo captura datos Scanner: entero flotante string: ");
    a = x.nextInt();
    b = x.nextFloat();
    x.nextLine();
    System.out.print("Ahora un string");
    s = "antes";
    s = s+x.nextLine();
    s = s+"después";
    
    System.out.print("Ahora debería acabar el programa");
    System.out.println("Datos capturados: ");
    System.out.println(a);
    System.out.println(b);
    System.out.println(s);
    
    }
  }
