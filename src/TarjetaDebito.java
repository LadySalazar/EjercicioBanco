public class TarjetaDebito extends Tarjeta{
    public TarjetaDebito(int identificacionTarjeta, int codigoSeguridad, double monto) {
        super(identificacionTarjeta, codigoSeguridad, monto);
    }
    public double ConsultarSaldo(Cuenta cu){
        return cu.monto;
    }
}
