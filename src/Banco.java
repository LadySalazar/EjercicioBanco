public class Banco {

    Cuenta cuentas[];
    Prestamo prestamos[];

    public Banco(Cuenta[] cuentas, Prestamo[] prestamos) {
        this.cuentas = cuentas;
        this.prestamos = prestamos;
    }
}
