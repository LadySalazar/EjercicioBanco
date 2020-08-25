import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TarjetaTest {
    @Test
    public void RealizarCompra(){
        String R;
        Tarjeta t =new Tarjeta(1014,98,500000);
        R=t.RealizarCompra(200000);
        assertEquals("LA COMPRA FUE REALIZADA",R);
    }
}