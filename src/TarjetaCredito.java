public class TarjetaCredito extends Tarjeta{
    int valorTotal;
    public TarjetaCredito(int identificacionTarjeta, int codigoSeguridad, double monto, int valorTotal) {
        super(identificacionTarjeta, codigoSeguridad, monto);
        this.valorTotal=valorTotal;
        double j=monto;
    }
    public double Consultarcupo (){
        return monto;
    }
    public String ConsultarGasto(){
        String ConsulGasto;
        ConsulGasto= "Ha gastado "+(valorTotal-monto)+" de su Tarjeta de cupo: "+valorTotal;
        return ConsulGasto;
    }
    public boolean PagarTarjeta(Cuenta cu, double montoPago){
    	 boolean res=false;
        if(cu.monto>=montoPago){
            cu.monto= cu.monto-montoPago;
            res=true;
        }else{
            res=false;
        }
        return res;
    }
}
