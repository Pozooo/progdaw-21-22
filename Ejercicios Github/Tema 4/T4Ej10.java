import java.util.Scanner;
public class T4Ej10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("- - - H O R O S C O P O - - -");

        double mes;
        double dia;

        System.out.print("\n Introduce el mes en el que naciste (en número): ");
        mes = s.nextDouble();

        if ( (mes >12) || (mes<0) ) {
            System.out.println("\n Debes introducir un mes entre (1-12)");
        } else {
            System.out.print("\n Introduce el día en el que naciste: ");
            dia = s.nextDouble();

            if ( (dia >31) || (dia<=0) ) {
                System.out.println("\n Debes introducir un día entre (1-31)");

            } else if ( ( (dia>=22) && (mes==12) ) || ( (dia<=20) && (mes==1) ) ) {
                      System.out.println("\n Eres Capricornio");
            } else if ( ( (dia>=21) && (mes==1) ) || ( (dia<=19) && (mes==2) ) ) {
                      System.out.println("\n Eres Acuario");
            }else if ( ( (dia>=20) && (mes==2) ) || ( (dia<=20) && (mes==3) ) ) {
                      System.out.println("\n Eres Piscis");
            } else if ( ( (dia>=21) && (mes==3) ) || ( (dia<=20) && (mes==4) ) ) {
                      System.out.println("\n Eres Aries");
            } else if ( ( (dia>=21) && (mes==4) ) || ( (dia<=21) && (mes==5) ) ) {
                      System.out.println("\n Eres Tauro");
            } else if ( ( (dia>=22) && (mes==5) ) || ( (dia<=21) && (mes==6) ) ) {
                      System.out.println("\n Eres Géminis");
            } else if ( ( (dia>=22) && (mes==6) ) || ( (dia<=23) && (mes==7) ) ) {
                      System.out.println("\n Eres Cancer");
            } else if ( ( (dia>=24) && (mes==7) ) || ( (dia<=23) && (mes==8) ) ) {
                      System.out.println("\n Eres Leo");
            } else if ( ( (dia>=24) && (mes==8) ) || ( (dia<=23) && (mes==9) ) ) {
                      System.out.println("\n Eres Virgo");
            } else if ( ( (dia>=24) && (mes==9) ) || ( (dia<=23) && (mes==10) ) ) {
                      System.out.println("\n Eres Libra");
            } else if ( ( (dia>=24) && (mes==10) ) || ( (dia<=22) && (mes==11) ) ) {
                      System.out.println("\n Eres Escorpio");
            } else if ( ( (dia>=23) && (mes==11) ) || ( (dia<=21) && (mes==12) ) ) {
                      System.out.println("\n Eres Sagitario");                                                                
            }
        }

    }
}
