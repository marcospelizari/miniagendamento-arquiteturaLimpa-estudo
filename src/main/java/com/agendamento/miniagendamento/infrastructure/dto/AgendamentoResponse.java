package com.agendamento.miniagendamento.infrastructure.dto;

import com.agendamento.miniagendamento.core.enums.StatusAgendamento;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public record AgendamentoResponse(
        Long id,
        String titulo,
        String descricao,
        LocalDateTime dataInicio,
        LocalDateTime dataFim,
        StatusAgendamento status,
        String usuario,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm
) {
}
