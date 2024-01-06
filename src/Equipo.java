public class Equipo {
    private String Nombre;
    private String Ciudad;
    private final int numMaxJugadores = 22;
    private Jugador[] listaJugadores;

    public Equipo(String Nombre, String Ciudad){
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        Jugador[] listaJugadores = new Jugador[numMaxJugadores];
    }

    public String getNombre(){
        return this.Nombre;
    }

    public String getCiudad(){
        return this.Ciudad;
    }

    public int getNumJugadores(){
        return listaJugadores.length;
    }

    public void monstrarlistaJugadores(){
        for (int rep = 0; rep < listaJugadores.length; rep ++){
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
        if (getNumJugadores() >= numMaxJugadores){
            listaJugadores[getNumJugadores() + 1] = jugador;

        }
        else{
            System.out.println("El equipo esta lleno");
        }
    }

    public void venderJugador(String nombreJugador){
        // tengo que comprobar que todo funcione bien
        for (int rep = 0; rep < listaJugadores.length; rep ++){

            if (listaJugadores[rep].getNombre() == nombreJugador){

                for (int pos = rep; pos < listaJugadores.length; pos ++){
                    listaJugadores[pos] = listaJugadores[pos + 1];
                }
            }
                // el valor a lo mejor no esta bien. comprobar.
            if (rep == listaJugadores.length){
                System.out.println("ERROR: No se ha encontrado ningun jugador con ese nombre.\nAsegurese que el nombre este bien escrito.");
            }
        }
    }
}
