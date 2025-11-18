package com.agendamento.miniagendamento.core.gateway;

import com.agendamento.miniagendamento.core.entities.Agendamento;

import java.util.Optional;

public interface AgendamentoGateway {

    Agendamento criarAgendamento(Agendamento agendamento);
    Optional<Agendamento> buscarAgendamentoPorId(Long id);
    Agendamento atualizarAgendamento(Agendamento agendamento);
    Agendamento cancelarAgendamento(Long id);
    Agendamento concluirAgendamento(Long id);
    default Agendamento buscaObrigatoria(Long id) {
        return buscarAgendamentoPorId(id)
                .orElseThrow(() -> new  IllegalArgumentException("Agendamento não encontrado"));
    }
}
