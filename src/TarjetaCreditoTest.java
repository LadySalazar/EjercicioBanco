import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TarjetaCreditoTest {
    @Test
    public void consultarSaldo(){
        TarjetaCredito tar=new TarjetaCredito(1014, 98,500000,1000000);
        String d=tar.ConsultarGasto();
        assertEquals("Ha gastado 500000.0 de su Tarjeta de cupo: 1000000",d);
    }
    public void pagarTarjeta(){
        TarjetaCredito ta=new TarjetaCredito(1014, 98,800000,2000000);
        TarjetaCredito tar=new TarjetaCredito(12345, 99,500000,1000000);
        Cuenta cuenta=new Cuenta(4567,ta,800000);
        boolean d=tar.PagarTarjeta(cuenta, 200000);
        assertEquals(true,d);
    }

}