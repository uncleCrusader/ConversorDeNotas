public class Usuario{
    private String nombreUsuario;
    //de momento se va a crear un usario para despues cumpla la funcion de almacenar la info de este
    //info: Su nombre, contrasenia, notas ingresadas y transformadas.
    private int cantidadDeNotas;
    private int notasTransformadas;

    public Usuario(String nombreUsuario, int cantidadDeNotas) {
        this.nombreUsuario = nombreUsuario;
        this.cantidadDeNotas = cantidadDeNotas;
    }

    public Usuario(String nombreUsuario, int cantidadDeNotas, int notasTransformadas) {
        this.nombreUsuario = nombreUsuario;
        this.cantidadDeNotas = cantidadDeNotas;
        this.notasTransformadas = notasTransformadas;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCantidadDeNotas() {
        return cantidadDeNotas;
    }

    public void setCantidadDeNotas(int cantidadDeNotas) {
        this.cantidadDeNotas = cantidadDeNotas;
    }

    public int getNotasTransformadas() {
        return notasTransformadas;
    }

    public void setNotasTransformadas(int notasTransformadas) {
        this.notasTransformadas = notasTransformadas;
    }
}