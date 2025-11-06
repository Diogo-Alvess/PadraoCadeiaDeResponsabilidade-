package org.example;

public class TipoProblemaServidor extends TipoProblema {
    private static final TipoProblemaServidor tipoProblemaServidor = new TipoProblemaServidor();
    private TipoProblemaServidor() {}
    public static TipoProblemaServidor getTipoProblemaServidor() {
        return tipoProblemaServidor;
    }
}
