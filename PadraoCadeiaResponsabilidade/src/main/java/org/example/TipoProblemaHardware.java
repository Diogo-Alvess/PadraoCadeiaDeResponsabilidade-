package org.example;


public class TipoProblemaHardware extends TipoProblema {
    private static final TipoProblemaHardware tipoProblemaHardware = new TipoProblemaHardware();
    private TipoProblemaHardware() {}
    public static TipoProblemaHardware getTipoProblemaHardware() {
        return tipoProblemaHardware;
    }
}
