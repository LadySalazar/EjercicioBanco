import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CuentaCorrienteTest {
    @Test
    public void determinarTasaInteres(){
	TarjetaDebito tarextra=new TarjetaDebito(1209876, "02/02/2021",597,800000);
        CuentaCorriente cuenta=new CuentaCorriente(4567,tarextra,800000);
        double  d=cuenta.determinarTasaInteres();
        assertEquals(1,d,0);
    }

}