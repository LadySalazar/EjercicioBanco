public class CuentaCorriente extends Cuenta{
    double Intereses;
    public CuentaCorriente(int identificacionCuenta, Tarjeta tarjetaseta, double monto, double intereses) {
        super(identificacionCuenta, tarjetaseta, monto);
        Intereses = intereses;
    }
    public double DeterminarTasaInteres(){
        return 0;
    }

}
