package com.agendamento.miniagendamento.core.usecases.atualizaragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;
import com.agendamento.miniagendamento.core.gateway.AgendamentoGateway;

import java.time.LocalDateTime;

public class AtualizarAgendamentoUseCaseImpl implements  AtualizarAgendamentoUseCase{

    private final AgendamentoGateway agendamentoGateway;

    public AtualizarAgendamentoUseCaseImpl(AgendamentoGateway agendamentoGateway) {
        this.agendamentoGateway = agendamentoGateway;
    }

    @Override
    public Agendamento execute(Agendamento agendamento) {
        Agendamento existente = agendamentoGateway.buscaObrigatoria(agendamento.getId());

        Agendamento atualizado = existente.toBuilder()
                .id(existente.getId())
                .titulo(existente.getTitulo())
                .descricao(existente.getDescricao())
                .dataInicio(existente.getDataInicio())
                .dataFim(existente.getDataFim())
                .status(existente.getStatus())
                .usuario(existente.getUsuario())
                .criadoEm(existente.getCriadoEm())
                .atualizadoEm(LocalDateTime.now())
                .build();

        return agendamentoGateway.atualizarAgendamento(atualizado);
    }
}
