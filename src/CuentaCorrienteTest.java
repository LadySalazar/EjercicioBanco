import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CuentaCorrienteTest {
    @Test
    public void determinarTasaInteres(){
        TarjetaDebito tarDe=new TarjetaDebito(1014, 98,800000);
        CuentaCorriente cuenta=new CuentaCorriente(1000,tarDe,800000);
        double  d=cuenta.DeterminarTasaInteres();
        assertEquals(1,d,0);
    }

}