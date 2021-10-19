public class Ej2 {
  public static void main(String[] args) {
  
  int hora = Integer.parseInt(System.console().readLine());
  
  if ((hora >= 6) && (hora <= 12)) {
    System.out.println("Buenos días");
  }
  
  if ((hora >= 13) && (hora <= 20)) {
    System.out.println("Buenas tardes");
  }
  
  if ((hora >= 21) && (hora <= 24)) {
    System.out.println("Buenas noches");
  } 
  
  else {
    System.out.println("Lo siento, la hora introducida no es válida");
    
    sin terminar
    
    }
  }
}
