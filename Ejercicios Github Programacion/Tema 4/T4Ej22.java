import java.util.Scanner;
public class T4Ej22 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  String DiaSemana;
  int horas;
  int minutos;
  int dianumero;
  int minutostotal;
  int minutosactuales;
  
  
  System.out.println("Introduzca un día de la semana de lunes a viernes");
  DiaSemana = s.nextLine();
  
  switch (DiaSemana) {
    
    case "lunes":
    dianumero = 1;
    break;
    
    case "martes":
    dianumero = 2;
    break;
    
    case "miércoles":
    dianumero = 3;
    break;
    
    case "jueves":
    dianumero = 4;
    break;
    
    case "viernes":
    dianumero = 5;
    break;
    
    default:
    System.out.println("El día introducdo no es correcto");
    
  }
  
  System.out.println("A continuación introduzca la hora y minutos");
  
  System.out.println("Hora");
  horas = s.nextInt();
  
  System.out.println("Minutos");
  minutos = s.nextInt();
  
  minutostotal = (4 * 24 * 60) + (15 * 60);
  minutosactuales = (dianumero * 24 * 60) + minutos;
  
  System.out.println("Faltan " + (minutostotal - minutosactuales) + " para el fin de semana");
  
  
  }
}
