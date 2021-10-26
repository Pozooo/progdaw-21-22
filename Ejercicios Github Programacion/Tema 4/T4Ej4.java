public class T4Ej4 {
    public static void main(String[] args) {
        int horas;
        int resultado;
        int dinextra;
        int extra;
        System.out.print("¿Cuantas horas has trabajado esta semana?: ");
        horas = Integer.parseInt(System.console().readLine());
        if (( horas<=40)) {
             resultado = horas*12;
        } else {
            extra = horas - 40;
            dinextra = extra * 16;
            resultado = (40*12)+dinextra;
        }
        System.out.println("\n Esta semana has trabajado " + horas + " horas, y has ganado " + resultado + "€" );

    }
}
