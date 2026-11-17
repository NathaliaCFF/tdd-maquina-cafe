import org.junit.Test;
import static org.junit.Assert.*;

public class TestVaso {

    @Test
    public void debeDevolverVerdaderoSiExistenVasos() {
        Vaso vaso = new Vaso(10, 3);

        boolean resultado = vaso.hasVasos(1);

        assertTrue(resultado);
    }

    @Test
    public void debeDevolverFalsoSiNoExistenVasos() {
        Vaso vaso = new Vaso(10, 3);

        boolean resultado = vaso.hasVasos(11);

        assertFalse(resultado);
    }

    @Test
    public void debeRestarCantidadDeVasos() {
        Vaso vaso = new Vaso(10, 3);

        vaso.giveVasos(1);

        assertEquals(9, vaso.getCantidadVasos());
    }

    @Test
    public void debeDevolverContenidoDelVaso() {
        Vaso vaso = new Vaso(10, 3);

        assertEquals(3, vaso.getContenido());
    }
}