package com.agendamento.miniagendamento.core.usecases.buscaragendamentoporid;

import com.agendamento.miniagendamento.core.entities.Agendamento;

public interface BuscarAgendamentoPorIdUseCase {

    Agendamento execute(Long id);
}
