package org.example;

public class TipoProblemaSistema extends TipoProblema {
    private static final TipoProblemaSistema tipoProblemaSistema = new TipoProblemaSistema();
    private TipoProblemaSistema() {}
    public static TipoProblemaSistema getTipoProblemaSistema() {
        return tipoProblemaSistema;
    }
}
