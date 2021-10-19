public class Ej3 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca un número del 1 al 7");
  int numero = Integer.parseInt(System.console().readLine());
  
  String diaSemana;
  
  switch (numero) {
    
    case 1: 
    diaSemana = "Lunes";
    break;
    
    case 2:
    diaSemana = "Martes";
    break;
    
    case 3:
    diaSemana = "Miércoles";
    break;
    
    case 4:
    diaSemana = "Jueves";
    break;
    
    case 5:
    diaSemana = "Viernes";
    break;
    
    case 6:
    diaSemana = "Sábado";
    break;
    
    case 7:
    diaSemana = "Domingo";
    break;
    
    default:
    diaSemana = "El día que has introducido no es válido";
    
      }
      
    System.out.println("Día " + numero + ": " + diaSemana); 
    
  
  
  
  }
}
