package com.agendamento.miniagendamento.core.usecases.buscaragendamentoporid;

import com.agendamento.miniagendamento.core.entities.Agendamento;
import com.agendamento.miniagendamento.core.gateway.AgendamentoGateway;

public class BuscarAgendamentoPorIdUseCaseImpl implements BuscarAgendamentoPorIdUseCase{

    private final AgendamentoGateway agendamentoGateway;

    public BuscarAgendamentoPorIdUseCaseImpl(AgendamentoGateway agendamentoGateway) {
        this.agendamentoGateway = agendamentoGateway;
    }

    @Override
    public Agendamento execute(Long id) {
        Agendamento agendamento = agendamentoGateway.buscaObrigatoria(id);

        return agendamento;
    }
}
