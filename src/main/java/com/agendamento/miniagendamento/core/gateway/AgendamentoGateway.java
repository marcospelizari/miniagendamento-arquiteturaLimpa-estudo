package com.agendamento.miniagendamento.core.gateway;

import com.agendamento.miniagendamento.core.entities.Agendamento;

public interface AgendamentoGateway {

    Agendamento criarAgendamento(Agendamento agendamento);
    Agendamento buscarAgendamentoPorId(Long id);
    Agendamento atualizarAgendamento(Agendamento agendamento);
    Agendamento cancelarAgendamento(Long id);
    Agendamento concluirAgendamento(Long id);

}
