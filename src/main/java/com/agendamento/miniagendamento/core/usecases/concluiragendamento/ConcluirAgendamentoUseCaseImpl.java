package com.agendamento.miniagendamento.core.usecases.concluiragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;
import com.agendamento.miniagendamento.core.gateway.AgendamentoGateway;

public class ConcluirAgendamentoUseCaseImpl implements ConcluirAgendamentoUseCase {

    private final AgendamentoGateway agendamentoGateway;

    public ConcluirAgendamentoUseCaseImpl(AgendamentoGateway agendamentoGateway) {
        this.agendamentoGateway = agendamentoGateway;
    }

    @Override
    public Agendamento execute(Long id) {
        Agendamento agendamento = agendamentoGateway.buscaObrigatoria(id);

        return agendamentoGateway.concluirAgendamento(id);
    }
}
