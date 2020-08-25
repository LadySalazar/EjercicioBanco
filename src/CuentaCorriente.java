public class CuentaCorriente extends Cuenta{
    double Intereses;
    public CuentaCorriente(int identificacionCuenta, Tarjeta tarjetaseta, double monto) {
        super(identificacionCuenta, tarjetaseta, monto);

    }
    public double DeterminarTasaInteres(){
        Intereses=Math.pow((1+0.3),(30/360));
        return Intereses;
    }

}
