package org.example;

public class SuporteNivel2 extends Suporte {

    public SuporteNivel2(Suporte suporteSuperior) {
        super(suporteSuperior);
        listaProblemas.add(TipoProblemaSistema.getTipoProblemaSistema());
    }

    @Override
    public String getDescricaoNivel() {
        return "Suporte Nível 2";
    }
}

