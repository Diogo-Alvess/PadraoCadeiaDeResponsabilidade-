package org.example;

public class SuporteEspecialista extends Suporte {

    public SuporteEspecialista(Suporte suporteSuperior) {
        super(suporteSuperior);
        listaProblemas.add(TipoProblemaServidor.getTipoProblemaServidor());
    }

    @Override
    public String getDescricaoNivel() {
        return "Especialista";
    }
}
