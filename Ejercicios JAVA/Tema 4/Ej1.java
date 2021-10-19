public class Ej1 {
  public static void main(String[] args) {
  
  System.out.println("Por favor, introduzca un día de la semana: ");
  int diaSemana = Integer.parseInt(System.console().readLine());
  
  String asignatura;
  
  switch (diaSemana) {
  
  case 1:
  asignatura = "Lenguaje de marcas";
  break;
  
  case 2:
  asignatura = "Entornos de desarrollo";
  break;
  
  case 3:
  asignatura = "Lenguaje de marcas";
  break;
  
  case 4:
  asignatura = "Entornos de desarrollo";
  break;
  
  case 5:
  asignatura = "Formación y orientación laboral";
  break;
  
  default:
  asignatura = "No existe ese día o no hay clase";
  
    }
  
  System.out.println("Día " + diaSemana + " toca: " + asignatura);
  
  }
}
