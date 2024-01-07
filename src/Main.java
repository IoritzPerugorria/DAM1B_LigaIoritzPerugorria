import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private static Liga liga;

    public static void main(String[] args) {

        System.out.println("Empieze creando una liga:\n");
        System.out.println("Inserte el país de la liga:");

        liga = new Liga(scanner.nextLine());

        System.out.println("MENU DE LA LIGA\n" +
                "1- Insertar Equipo\n" +
                "2- Insertar Jugador\n" +
                "3-Ver equipos de la liga\n" +
                "4- Ver jugadores de un equipo\n" +
                "5- Vender jugador\n" +
                "6- Salir");

        int imput = 0;

        while (imput != 6) {

            imput = scanner.nextInt();

            switch (imput) {
                case 1:
                    InsertarEquipo();
                    break;

                case 2:
                    Insertarjugador();
                    break;

                case 3:
                    VerLiga();
                    break;

                case 4:
                    verJugadores();
                    break;

                case 5:
                    venderJugador();
                    break;

                case 6:
                    break;

            }

        }
    }


    public static void InsertarEquipo() {
        String nombre;
        String ciudad;

        System.out.println("Inserte el nombre del equipo:");
        nombre = scanner.nextLine();

        System.out.println("Inserte la ciudad del equipo.");
        ciudad = scanner.nextLine();

        System.out.println("Creando Equipo...");
        // cambiar nombre de clase
        Equipo equipo = new Equipo(nombre, ciudad);

        System.out.println("Insertando Equipo...");

        liga.anadirEquipo(equipo);
    }

    public static void Insertarjugador() {
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
        Equipo equipo = liga.getEquipo(scanner.nextLine());

        if (equipo == null) {
            System.out.println("El equipo indicado no existe");
        } else {
            System.out.println("Indique el nombre del jugador");
            String nombre = scanner.nextLine();

            System.out.println("Indique la nacionalidad del jugador:");
            String nac = scanner.nextLine();

            System.out.println("Indique la edad del jugador:");
            int edad = scanner.nextInt();

            String pos = "a";
            while (pos != "POR" && pos != "DEF" && pos != "CTC" && pos != "DEL") {
                System.out.println("Indique la posición del jugador:\n" +
                        "(Valores validos: DEL, CTC, DEF, POR)");
                pos = scanner.nextLine();
                if (pos != "POR" && pos != "DEF" && pos != "CTC" && pos != "DEL") {
                    System.out.println("Posicion no valida.");
                }
            }

            System.out.println("Creando jugador...:");
            Jugador jugador = new Jugador(nombre, nac, edad, pos);

            System.out.println("Insertando jugador...");
            equipo.adquirirJugador(jugador);

            System.out.println("Jugador" + nombre + "insertado en " + equipo.getNombre()); // cambiar
        }

    }

    public static void VerLiga() {
        System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
        System.out.println("EQUIPO \tCIUDAD \tNUMERO JUGADORES");
        liga.mostrarlistadoEquipos();
        System.out.println("*********************************************************");
    }

    public static void verJugadores() {
        System.out.println("Introduce el nombre del equipo de los jugadores que se desea visualizar");
        Equipo equipo = liga.getEquipo(scanner.nextLine());

        System.out.println("********* Osasuna ****************************");
        System.out.println("NOMBRE" + "\t" + "POSICIÓN" + "\t" + "EDAD" + "\t" + "NAC" + "\t" + "LESIONADO");
        equipo.monstrarlistaJugadores();
        System.out.println("*********************************************");
    }

    public static void venderJugador() {
        System.out.println("Inserte el nombre del equipo donde quiere vender el jugador:");
        Equipo equipo = liga.getEquipo(scanner.nextLine());

        System.out.println("Inserte el nombre del jugador:");
        String jugador = equipo.getNombre();

        System.out.println("Vendiendo jugador...");
        equipo.venderJugador(jugador);
    }

}
