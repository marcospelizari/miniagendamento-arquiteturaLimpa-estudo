package com.agendamento.miniagendamento.core.usecases.cancelaragendamento;

import com.agendamento.miniagendamento.core.entities.Agendamento;

public interface CancelarAgendamentoUseCase {

    Agendamento execute(Long id);
}
