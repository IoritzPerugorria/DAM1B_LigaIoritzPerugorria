import java.util.Objects;

public class Liga {
    private String Pais;
    private final int numMaxEquipos = 20;
    private Equipo[] ListadoEquipos;

    public Liga(String Pais){
        this.Pais = Pais;
        ListadoEquipos = new Equipo[numMaxEquipos];
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
            if(Objects.equals(ListadoEquipos[rep].getNombre(), nombreEquipo)){
                retorno = ListadoEquipos[rep];
                break;
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
        for (int rep = 0; rep < ListadoEquipos.length; rep ++)
        if (ListadoEquipos[rep] == null) {
            ListadoEquipos[rep] = equipo;
            System.out.println("Equipo " + equipo.getNombre() + " insertado\n");
            break;
        }
        else{
            System.out.println("La liga esta llena\n");
        }
    }
}
