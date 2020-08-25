public class Cuenta {
    int identificacionCuenta;
    Tarjeta tarjetas;
    double monto;
    public Cuenta(int identificacionCuenta, Tarjeta tarjetas, double monto) {
        this.identificacionCuenta = identificacionCuenta;
        this.tarjetas = tarjetas;
        this.monto = monto;
    }
    public void Consignar (double consignacion){
    }
    public String RetirarDinero(double retiro){
    return null;
    }
    public double ConsultarSaldo (){
        return 0;
    }
    public String TransferirOtraCuenta (Cuenta cun, Cliente cli, double cifra){
        return null;
    }
}
