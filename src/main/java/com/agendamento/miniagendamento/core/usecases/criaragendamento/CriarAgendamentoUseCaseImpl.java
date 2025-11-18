package com.agendamento.miniagendamento.core.usecases.criaragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;
import com.agendamento.miniagendamento.core.gateway.AgendamentoGateway;

public class CriarAgendamentoUseCaseImpl implements CriarAgendamentoUseCase {

    private final AgendamentoGateway agendamentoGateway;

    public CriarAgendamentoUseCaseImpl(AgendamentoGateway agendamentoGateway) {
        this.agendamentoGateway = agendamentoGateway;
    }

    @Override
    public Agendamento execute(Agendamento agendamento) {
        return agendamentoGateway.criarAgendamento(agendamento);
    }
}
