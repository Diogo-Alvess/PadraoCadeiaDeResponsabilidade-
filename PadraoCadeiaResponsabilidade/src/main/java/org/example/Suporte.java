package org.example;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList<TipoProblema> listaProblemas = new ArrayList<>();
    private Suporte suporteSuperior;

    public Suporte(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoNivel();

    public String resolverProblema(Requisicao requisicao) {
        if (listaProblemas.contains(requisicao.getTipoProblema())) {
            return getDescricaoNivel();
        } else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverProblema(requisicao);
            } else {
                return "Sem solução";
            }
        }
    }
}
