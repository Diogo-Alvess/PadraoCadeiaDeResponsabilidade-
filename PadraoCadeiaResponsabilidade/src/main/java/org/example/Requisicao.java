package org.example;

public class Requisicao {
    private TipoProblema tipoProblema;

    public Requisicao(TipoProblema tipoProblema) {
        this.tipoProblema = tipoProblema;
    }

    public TipoProblema getTipoProblema() {
        return tipoProblema;
    }
}
