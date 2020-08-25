public class TarjetaCredito extends Tarjeta{
    public TarjetaCredito(int identificacionTarjeta, int codigoSeguridad, double monto) {
        super(identificacionTarjeta, codigoSeguridad, monto);
        double j=monto;
    }
    public double Consultarcupo (){

        return 0;
    }
    public String ConsultarGasto(Cuenta cu){

        return null;
    }
    public boolean PagarTarjeta(Cuenta cu, double montoPago){

        return false;
    }
}
