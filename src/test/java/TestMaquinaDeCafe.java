import org.junit.Test;
import static org.junit.Assert.*;

public class TestMaquinaDeCafe {

    @Test
    public void debeSeleccionarVasoPequeno() {
        Vaso vasosPequenos = new Vaso(10, 3);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasosPequenos(vasosPequenos);

        Vaso resultado = maquina.getTipoVaso("pequeno");

        assertSame(vasosPequenos, resultado);
    }

    @Test
    public void debeSeleccionarVasoMediano() {
        Vaso vasosMedianos = new Vaso(10, 5);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasosMedianos(vasosMedianos);

        Vaso resultado = maquina.getTipoVaso("mediano");

        assertSame(vasosMedianos, resultado);
    }

    @Test
    public void debeSeleccionarVasoGrande() {
        Vaso vasosGrandes = new Vaso(10, 7);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setVasosGrandes(vasosGrandes);

        Vaso resultado = maquina.getTipoVaso("grande");

        assertSame(vasosGrandes, resultado);
    }

    @Test
    public void debeAvisarSiNoHayVasos() {
        Vaso vasos = new Vaso(0, 3);
        MaquinaDeCafe maquina = new MaquinaDeCafe();

        String resultado = maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals("No hay Vasos", resultado);
    }

    @Test
    public void debeAvisarSiNoHayCafe() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(0);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);

        String resultado = maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals("No hay Cafe", resultado);
    }

    @Test
    public void debeAvisarSiNoHayAzucar() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(0);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);

        String resultado = maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals("No hay Azucar", resultado);
    }
    @Test
    public void debeDevolverFelicitacionesAlServirCafe() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(20);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);

        String resultado = maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals("Felicitaciones", resultado);
    }
    @Test
    public void debeDescontarVasosAlServirCafe() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(20);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);

        maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals(9, vasos.getCantidadVasos());
    }
    @Test
    public void debeDescontarCafeAlServir() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(20);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);

        maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals(97, cafetera.getCantidadCafe());
    }
    @Test
    public void debeDescontarAzucarAlServir() {
        Vaso vasos = new Vaso(10, 3);
        Cafetera cafetera = new Cafetera(100);
        Azucarero azucarero = new Azucarero(20);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.setCafetera(cafetera);
        maquina.setAzucarero(azucarero);

        maquina.getVasoDeCafe(vasos, 1, 2);

        assertEquals(18, azucarero.getCantidadAzucar());
    }
}