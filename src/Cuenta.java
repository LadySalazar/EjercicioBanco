public class Cuenta {
    int identificacionCuenta;
    Tarjeta tarjetas;
    double monto;
    public Cuenta(int identificacionCuenta, Tarjeta tarjetas, double monto) {
        this.identificacionCuenta = identificacionCuenta;
        this.tarjetas = tarjetas;
        this.monto = monto;
    }

}
