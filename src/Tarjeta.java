public class Tarjeta {

    int identificacionTarjeta;
    int codigoSeguridad;
    double monto;

    public Tarjeta(int identificacionTarjeta, int codigoSeguridad, double monto) {
        this.identificacionTarjeta = identificacionTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.monto = monto;
    }
    public String RealizarCompra(double valor){
        String RepuestaCompra=null;
        if (monto>valor){
            monto=monto-valor;
            RepuestaCompra="LA COMPRA FUE REALIZADA";
        }else{
            if (monto<valor){
                RepuestaCompra="LA COMPRA NO FUE REALIZADA, SALDO INSIFICIENTE";
            }
        }
        return RepuestaCompra;
    }
}
