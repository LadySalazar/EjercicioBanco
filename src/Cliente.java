public class Cliente {
    String nombre;
    int identificacion;
    Banco servicio;

    public Cliente(String nombre, int identificacion, Banco servicio) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicio = servicio;
    }
}
