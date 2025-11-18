package com.agendamento.miniagendamento.core.usecases.cancelaragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;
import com.agendamento.miniagendamento.core.gateway.AgendamentoGateway;

public class CancelarAgendamentoUseCaseImpl implements CancelarAgendamentoUseCase {

    private final AgendamentoGateway agendamentoGateway;

    public CancelarAgendamentoUseCaseImpl(AgendamentoGateway agendamentoGateway) {
        this.agendamentoGateway = agendamentoGateway;
    }

    @Override
    public Agendamento execute(Long id) {
        Agendamento existente = agendamentoGateway.buscaObrigatoria(id);

        return agendamentoGateway.cancelarAgendamento(id);
    }
}
