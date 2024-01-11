public class Jugador {
    private String Nombre;
    private String Nacionalidad;
    private int edad;
    private String Posicion;
    private boolean Lesionado;

    public Jugador(String Nombre, String Nacionalidad, int edad, String Posicion){
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.edad = edad;
        this.Posicion = Posicion;
        this.Lesionado = false;
    }

    public String getNombre(){
        return Nombre;
    }
    public String getNacionalidad(){
        return Nacionalidad;
    }
    public int getEdad(){
        return edad;
    }
    public String getPosicion(){
        return Posicion;
    }
    public boolean getLesionado(){
        return Lesionado;
    }
    public void Lesionarse(){
        Lesionado = true;
    }
    public void Recuperarse(){
        Lesionado = false;
    }
}
