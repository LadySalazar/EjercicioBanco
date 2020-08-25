import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TarjetaDebitoTest {
    @Test
    public void consultarSaldo(){
        TarjetaDebito tar=new TarjetaDebito(1014, 98,500000);
        Cuenta cuenta=new Cuenta(1000,tar,800000);
        double d=tar.ConsultarSaldo(cuenta);
        assertEquals(800000,d,0);
    }
}