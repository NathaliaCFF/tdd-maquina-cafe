import org.junit.Test;
import static org.junit.Assert.*;

public class TestAzucarero {

    @Test
    public void debeDevolverVerdaderoSiExisteAzucar() {
        Azucarero azucarero = new Azucarero(10);

        boolean resultado = azucarero.hasAzucar(2);

        assertTrue(resultado);
    }

    @Test
    public void debeDevolverFalsoSiNoExisteAzucar() {
        Azucarero azucarero = new Azucarero(10);

        boolean resultado = azucarero.hasAzucar(11);

        assertFalse(resultado);
    }

    @Test
    public void debeRestarCantidadDeAzucar() {
        Azucarero azucarero = new Azucarero(10);

        azucarero.giveAzucar(2);

        assertEquals(8, azucarero.getCantidadAzucar());
    }
}