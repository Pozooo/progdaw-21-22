public class T4Ej19 {
  public static void main(String[] args) {
  
  int x;
  
  System.out.println("Este programa nos dice cuantos dígitos tiene el número introducido (se permiten números de hasta 5 cifras");
  x = Integer.parseInt(System.console().readLine());
  
  if ((x < 10) && (x > -10)) {
    System.out.println("Este número tiene 1 dígito");
  }
  
  else if (((x >= 10) && (x < 100) || (x <= -10) && (x > -100))) {
    System.out.println("Este número tiene 2 dígitos");
  }
  
  else if (((x >= 100) && (x < 1000) || (x <= -100) && (x > -1000))) {
    System.out.println("Este número tiene 3 dígitos");
  }
  
  else if (((x >= 1000) && (x < 10000) || (x <= -1000) && (x > -10000))) {
    System.out.println("Este número tiene 4 dígitos");
  }
  
  else if (((x >= 10000) && (x < 100000) || (x <= -10000) && (x > -100000))) {
    System.out.println("Este número tiene 5 dígitos");
  }
  
  else {
    System.out.println("Prueba a introducir otro número que se corresponda con las especificaciones");
  }
  
  }
}
