public class EjemploIfVariante2  {
  public static void main(String[] args) {
  
  int n;
  int resto;
  
  System.out.print("¿Cuál es la capital de Kiribati? ");
  
  String respuesta = System.console().readLine();
  
  if (respuesta.equals("Tarawa")) {
    System.out.println("La respuesta es correcta!");
  } else {
    
    if (respuesta.equals("tarawa")) {
      System.out.println("¡La respuesa es correcta! (aun empezando con minúscula)");
    } else {
      System.out.println("Lo siento, la respuesta es incorrecta. ");
   
      }
    }
  }
}
