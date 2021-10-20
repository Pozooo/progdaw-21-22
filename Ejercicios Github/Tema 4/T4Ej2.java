public class T4Ej2 {
    public static void main(String[] args) {
        int hora;
        System.out.print("¿Que hora es? (introduce solo la hora, ejemplo: 17): ");
        hora = Integer.parseInt(System.console().readLine());
    
        if ( (hora >= 6) && (hora <= 12) ) {
            System.out.println("\n ¡Buenos días!");
        } else if ( (hora >=13 ) && ( hora <= 20 ) ) {
                System.out.println("\n ¡Buenas tardes!");
            } else if ( ( ( hora >=21 ) && ( hora <= 23 ) ) || ( hora >= 0 ) && ( hora <=5 ) ) {
                    System.out.println("\n ¡Buenas noches!");
			} else {
				System.out.println("\n Hora no valida");
			} 
    }
}
