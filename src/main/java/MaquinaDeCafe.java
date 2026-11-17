public class MaquinaDeCafe {

    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Cafetera cafetera;
    private Azucarero azucarero;

    public void setVasosPequenos(Vaso vasosPequenos) {
        this.vasosPequenos = vasosPequenos;
    }

    public void setVasosMedianos(Vaso vasosMedianos) {
        this.vasosMedianos = vasosMedianos;
    }

    public void setVasosGrandes(Vaso vasosGrandes) {
        this.vasosGrandes = vasosGrandes;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucarero = azucarero;
    }

    public Vaso getTipoVaso(String tipo) {
        if ("mediano".equals(tipo)) {
            return vasosMedianos;
        }

        if ("grande".equals(tipo)) {
            return vasosGrandes;
        }

        return vasosPequenos;
    }

    public String getVasoDeCafe(
            Vaso vaso, int cantidadVasos, int cantidadAzucar) {

        if (!vaso.hasVasos(cantidadVasos)) {
            return "No hay Vasos";
        }

        int cafeNecesario = vaso.getContenido() * cantidadVasos;

        if (!cafetera.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }

        if (!azucarero.hasAzucar(cantidadAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadAzucar);

        return "Felicitaciones";
    }
}