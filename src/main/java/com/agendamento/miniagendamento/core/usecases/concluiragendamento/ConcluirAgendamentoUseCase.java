package com.agendamento.miniagendamento.core.usecases.concluiragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;

public interface ConcluirAgendamentoUseCase {

    Agendamento execute(Long id);
}
