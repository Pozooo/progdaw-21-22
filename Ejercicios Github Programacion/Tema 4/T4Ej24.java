import java.util.Scanner;
public class T4Ej24 {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  
  int cargo;
  int diasViaje;
  int estadoCiv;
  int sueldo;
  int dietas;
  int sueldoBruto;
  double irpf;
  double total;
  
  
  System.out.println("1- Programador junior");
  System.out.println("2-Programador senior");
  System.out.println("3-Jefe de proyecto");
  System.out.println("Introduzca el cargo del empleado:");
  
  cargo = s.nextInt();
  sueldo = 0;
  
  switch (cargo) {
    
    case 1:
    sueldo = 950;
    break;
    
    case 2:
    sueldo = 1200;
    break;
    
    case 3:
    sueldo = 1600;
    break;
    
    default:
    System.out.print("Prueba a introducir un número correcto");
  }
  
  System.out.println("Introduzca los días que ha estado de viaje visitando clientes durante el mes");
  
  diasViaje = s.nextInt();
  dietas = 0;
  
  if (diasViaje <= 31) {
    dietas = diasViaje * 30;
  }
  
  else {
    System.out.println("Prueba a introducir un número de días correcto");
  }
  
  System.out.println("Introduzca su estado civil (1-Soltero, 2-Casado)");
  
  estadoCiv = s.nextInt();
  sueldoBruto = (sueldo + dietas);
  
  irpf = 0;
  
  if (estadoCiv == 1) {
    irpf = sueldoBruto * 0.25;
    }
    else if (estadoCiv == 2) { 
      irpf = sueldoBruto * 0.2;
    }
    
    else {
      System.out.println("Prueba a introducir un número correcto");
    }
  
  total = (sueldoBruto - irpf);
  
  System.out.println("-------------------------------------");
  System.out.println("Sueldo Base: " +sueldo);
  System.out.println("Dietas ("+diasViaje +" días): " +dietas);
  System.out.println("-------------------------------------");
  System.out.println("Suedo Bruto: " +sueldoBruto);
  System.out.println("Retención IRPF: " +irpf);
  System.out.println("-------------------------------------");
  System.out.println("Sueldo neto: " +total);
  
  
  
  
  }
}
