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
        monto=monto+consignacion;
    }
    public String RetirarDinero(double retiro){
        String resp="NO HAY DINERO SUFICIENTE";
        if(retiro>monto){
            resp="NO HAY DINERO SUFICIENTE";
        }else{
            monto=monto-retiro;
            resp="SE REALIZO EL RETIRO CORRECTAMENTE";
        }
        return resp;
    }
    public double ConsultarSaldo (){
        return monto;
    }
    public String TransferirOtraCuenta (Cuenta cun, double cifra){
        String resp="NO TIENE SUFICIENTE DINERO PARA REALIZAR ESTA ACCION";
        if(monto<cifra){
            resp="NO TIENE SUFICIENTE DINERO PARA REALIZAR ESTA ACCION";
        }else{
            resp="SE REALIZO LA TRANSFERENCIA";
            monto=monto-cifra;
            cun.monto= cun.monto+cifra;
        }
        return resp;
    }
}
