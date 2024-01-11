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
        for (int rep = 0; rep < ListadoEquipos.length && ListadoEquipos[rep] != null; rep ++){
            System.out.print(ListadoEquipos[rep].getNombre() + "\t");
            System.out.print(ListadoEquipos[rep].getCiudad() + "\t");
            System.out.print(ListadoEquipos[rep].getNumJugadores() + "\n");
        }
    }

    public int getNumeroEquipos(){
        int contador = 0;

        for (int rep = 0; rep < ListadoEquipos.length; rep ++){

            if (ListadoEquipos[rep] == null){
                break;
            }
            contador ++;
        }
        return contador;
    }

    public Equipo getEquipo(String nombreEquipo){

        Equipo retorno = null;

        if (ListadoEquipos[0] == null) {
            System.out.println("No se han encontrado equipos en la Liga.\nPor favor, introduzca equipos\n");
        }
        else {

            for (int rep = 0; rep < ListadoEquipos.length; rep++) {

                if (Objects.equals(ListadoEquipos[rep].getNombre(), nombreEquipo)) {
                    retorno = ListadoEquipos[rep];
                    break;
                }
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

    public void anadirEquipo(Equipo miEquipo) {

        if (ListadoEquipos[numMaxEquipos - 1] != null){
            System.out.println("La liga esta llena");

        }
        else{
            for (int rep = 0; rep < ListadoEquipos.length; rep ++){

                if (ListadoEquipos[rep] == null) {
                    ListadoEquipos[rep] = miEquipo;
                    System.out.println("Equipo " + miEquipo.getNombre() + " insertado\n");
                    break;
                }

                if (Objects.equals(ListadoEquipos[rep].getCiudad(), miEquipo.getCiudad()) &&
                    Objects.equals(ListadoEquipos[rep].getNombre(), miEquipo.getNombre())){
                         System.out.println("El equipo ya existe");
                         break;
                }
            }
        }
    }
}
