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
            //  tengo que verificar mas adelante si esto es asi asi
            System.out.println(ListadoEquipos[rep]);
        }
    }

    public int getNumeroEquipos(){
        return ListadoEquipos.length;
    }

    public Equipo getEquipo(String nombreEquipo){
        for (int rep = 0; rep < ListadoEquipos.length; rep ++){
            if(ListadoEquipos[rep].getNombre() == nombreEquipo){
                return ListadoEquipos[rep];
            }
        }
        System.out.println("ERROR: no se ha encontrado el equipo.");
        return null; // cambiarlo mas adelante
    }

    public String getPais(){
        return Pais;
    }

    public void añadirEquipo(Equipo equipo) {
        if (ListadoEquipos.length < numMaxEquipos) {
            ListadoEquipos[ListadoEquipos.length + 1] = equipo;
        }
    }
}
