import org.junit.Test;
import static org.junit.Assert.*;

public class TestCafetera {

    @Test
    public void debeDevolverVerdaderoSiExisteCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(3);

        assertTrue(resultado);
    }

    @Test
    public void debeDevolverFalsoSiNoExisteCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(11);

        assertFalse(resultado);
    }

    @Test
    public void debeRestarCantidadDeCafe() {
        Cafetera cafetera = new Cafetera(10);

        cafetera.giveCafe(3);

        assertEquals(7, cafetera.getCantidadCafe());
    }
}