package org.example;

public class SuporteNivel1 extends Suporte {

    public SuporteNivel1(Suporte suporteSuperior) {
        super(suporteSuperior);
        listaProblemas.add(TipoProblemaLogin.getTipoProblemaLogin());
    }

    @Override
    public String getDescricaoNivel() {
        return "Suporte Nível 1";
    }
}
