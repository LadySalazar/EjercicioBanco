public class Prestamo {
    int identificacion;
    String especificacionesPrestamo;
    double monto;
    Cliente cliente;

    public Prestamo(int identificacion, String especificacionesPrestamo, double monto,Cliente cliente) {
        this.identificacion = identificacion;
        this.especificacionesPrestamo = especificacionesPrestamo;
        this.monto = monto;
        this.cliente=cliente;
    }
    public void RealizarPrestamo(Cliente cli){

    }

}
