public class CuentaAhorro extends Cuenta{

    int cobroAdmisionAnual;
    int cuotaManejo;

    public CuentaAhorro(int identificacionCuenta, Tarjeta tarjetaseta, double monto, int cobroAdmisionAnual, int cuotaManejo) {
        super(identificacionCuenta, tarjetaseta, monto);
        this.cobroAdmisionAnual = cobroAdmisionAnual;
        this.cuotaManejo = cuotaManejo;
    }

}
