public class Liga {
    private String Pais;
    private final int numMaxEquipos = 20;
    private Equipo[] ListadoEquipos;

    public Liga(String Pais){
        this.Pais = Pais;
        Equipo[] ListadoEquipo = new Equipo[numMaxEquipos];
    }

    public void mostrarlistadoEquipos(){
        for (int rep = 0; rep < ListadoEquipos.length; rep ++){
            System.out.println(ListadoEquipos[rep].getNombre() + "\t" +
                               ListadoEquipos[rep].getCiudad() + "\t" +
                               ListadoEquipos[rep].getNumJugadores());
        }
    }

    public int getNumeroEquipos(){
        return ListadoEquipos.length;
    }

    public Equipo getEquipo(String nombreEquipo){
        Equipo retorno = null;

        for (int rep = 0; rep < ListadoEquipos.length; rep ++){
            if(ListadoEquipos[rep].getNombre() == nombreEquipo){
                retorno = ListadoEquipos[rep];
            }
        }
        if (retorno != null){
            return retorno;
        }
        else{
            return null;
        }

    }

    public String getPais(){
        return Pais;
    }

    public void anadirEquipo(Equipo equipo) {
        if (ListadoEquipos.length < numMaxEquipos) {
            ListadoEquipos[ListadoEquipos.length + 1] = equipo;
            // cambiar
            System.out.println("Equipo temp insertado");
        }
        else{
            System.out.println("La liga esta llena");
        }
    }
}
