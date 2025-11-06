package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequisicaoTest {

    SuporteEspecialista especialista;
    SuporteNivel2 nivel2;
    SuporteNivel1 nivel1;

    @BeforeEach
    void setUp() {
        especialista = new SuporteEspecialista(null);
        nivel2 = new SuporteNivel2(especialista);
        nivel1 = new SuporteNivel1(nivel2);
    }

    @Test
    void deveRetornarNivel1ParaProblemaLogin() {
        assertEquals("Suporte Nível 1",
                nivel1.resolverProblema(new Requisicao(TipoProblemaLogin.getTipoProblemaLogin())));
    }

    @Test
    void deveRetornarNivel2ParaProblemaSistema() {
        assertEquals("Suporte Nível 2",
                nivel1.resolverProblema(new Requisicao(TipoProblemaSistema.getTipoProblemaSistema())));
    }

    @Test
    void deveRetornarEspecialistaParaProblemaServidor() {
        assertEquals("Especialista",
                nivel1.resolverProblema(new Requisicao(TipoProblemaServidor.getTipoProblemaServidor())));
    }

    @Test
    void deveRetornarSemSolucaoParaProblemaHardware() {
        assertEquals("Sem solução",
                nivel1.resolverProblema(new Requisicao(TipoProblemaHardware.getTipoProblemaHardware())));
    }
}
