import java.util.Objects;

public class Equipo {
    private String Nombre;
    private String Ciudad;
    private final int numMaxJugadores = 22;
    private Jugador[] listaJugadores;

    public Equipo(String Nombre, String Ciudad){
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        listaJugadores = new Jugador[numMaxJugadores];
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getCiudad(){
        return this.Ciudad;
    }

    public int getNumJugadores(){
        int contador = 0;
        for (int rep = 0; rep < listaJugadores.length; rep ++){
            if (listaJugadores[rep] == null){
                break;
            }
            contador ++;
        }
        return contador;
    }

    public void monstrarlistaJugadores(){
        for (int rep = 0; rep < getNumJugadores(); rep ++){
            System.out.print(listaJugadores[rep].getNombre() + "\t" +
                    listaJugadores[rep].getPosicion() + "\t" +
                    listaJugadores[rep].getEdad() + "\t" +
                    listaJugadores[rep].getNacionalidad() + "\t");
            if (listaJugadores[rep].getLesionado()){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    public void adquirirJugador (Jugador jugador){
        if (getNumJugadores() < numMaxJugadores){
            listaJugadores[getNumJugadores()] = jugador;

        }
        else{
            System.out.println("El equipo esta lleno");
        }
    }

    public void venderJugador(String nombreJugador){
        // tengo que comprobar que todo funcione bien
        for (int rep = 0; rep < listaJugadores.length; rep ++){

            if (Objects.equals(listaJugadores[rep].getNombre(), nombreJugador)){

                for (int pos = rep; pos < listaJugadores.length - 1; pos ++){
                    listaJugadores[pos] = listaJugadores[pos + 1];
                }
                listaJugadores[listaJugadores.length - 1] = null;
                System.out.println("Jugador vendido");
                break;
            }
            // el valor a lo mejor no esta bien. comprobar.
            if (rep == listaJugadores.length){
                System.out.println("El jugador no existe");
            }
        }
    }
}
