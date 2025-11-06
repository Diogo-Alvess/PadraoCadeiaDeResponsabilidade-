package org.example;

public class TipoProblemaLogin extends TipoProblema {
    private static final TipoProblemaLogin tipoProblemaLogin = new TipoProblemaLogin();
    private TipoProblemaLogin() {}
    public static TipoProblemaLogin getTipoProblemaLogin() {
        return tipoProblemaLogin;
    }
}
