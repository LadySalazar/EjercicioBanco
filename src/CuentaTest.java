import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CuentaTest {
    @Test
    public void RetirarDinero(){
        TarjetaDebito tarDe=new TarjetaDebito(1014, 90,800000);
        Cuenta cuenta=new Cuenta(1012,tarDe,800000);
        String  d=cuenta.RetirarDinero(200000);
        assertEquals("SE REALIZO EL RETIRO CORRECTAMENTE",d);
    }
    public void ConsultarSaldo(){
        TarjetaDebito tarDe=new TarjetaDebito(1014, 90,800000);
        Cuenta cuenta=new Cuenta(1012,tarDe,800000);
        double  d=cuenta.ConsultarSaldo();
        assertEquals(800000,d,0);
    }

    public void TransferirOtraCuenta(){
        TarjetaDebito tarDeb=new TarjetaDebito(1014, 90,800000);
        Cuenta cuenta=new Cuenta(1000,tarDeb,800000);
        TarjetaDebito tarDeb2=new TarjetaDebito(1012, 91,1000000);
        Cuenta cuenta2=new Cuenta(1233,tarDeb,1000000);
        String  d=cuenta.TransferirOtraCuenta(cuenta2,100000);
        assertEquals("SE REALIZO LA TRANSFERENCIA",d);
    }

}