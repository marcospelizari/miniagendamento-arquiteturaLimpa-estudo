package com.agendamento.miniagendamento.core.entities;

import com.agendamento.miniagendamento.core.enums.StatusAgendamento;

import java.time.LocalDateTime;
import java.util.Objects;

public class Agendamento {

    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private StatusAgendamento status;
    private String usuario;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    private Agendamento(Builder builder) {
        this.id = builder.id;
        this.titulo = builder.titulo;
        this.descricao = builder.descricao;
        this.dataInicio = builder.dataInicio;
        this.dataFim = builder.dataFim;
        this.status = builder.status;
        this.usuario = builder.usuario;
        this.criadoEm = builder.criadoEm;
        this.atualizadoEm = builder.atualizadoEm;
    }

    public Long getId() {return id;}

    public String getTitulo() {return titulo;}

    public String getDescricao() {return descricao;}

    public LocalDateTime getDataInicio() {return dataInicio;}

    public LocalDateTime getDataFim() {return dataFim;}

    public StatusAgendamento getStatus() {return status;}

    public String getUsuario() {return usuario;}

    public LocalDateTime getCriadoEm() {return criadoEm;}

    public LocalDateTime getAtualizadoEm() {return atualizadoEm;}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Builder toBuilder() {
        return new Builder()
                .id(this.id)
                .titulo(this.titulo)
                .descricao(this.descricao)
                .dataInicio(this.dataInicio)
                .dataFim(this.dataFim)
                .status(this.status)
                .usuario(this.usuario)
                .criadoEm(this.criadoEm)
                .atualizadoEm(this.atualizadoEm);
    }

    public static class Builder {
        private Long id;
        private String titulo;
        private String descricao;
        private LocalDateTime dataInicio;
        private LocalDateTime dataFim;
        private StatusAgendamento status;
        private String usuario;
        private LocalDateTime criadoEm;
        private LocalDateTime atualizadoEm;

        public Builder id(Long id) {this.id = id; return this;}

        public Builder titulo(String titulo) {this.titulo = titulo; return this;}

        public Builder descricao(String descricao) {this.descricao = descricao; return this;}

        public Builder dataInicio(LocalDateTime dataInicio) {this.dataInicio = dataInicio; return this;}

        public Builder dataFim(LocalDateTime dataFim) {this.dataFim = dataFim; return this;}

        public Builder status( StatusAgendamento status) {this.status = status; return this;}

        public Builder usuario(String usuario) {this.usuario = usuario; return this;}

        public Builder criadoEm(LocalDateTime criadoEm) {this.criadoEm = criadoEm; return this;}

        public Builder atualizadoEm(LocalDateTime atualizadoEm) {this.atualizadoEm = atualizadoEm; return this;}

        public Agendamento build() {
            return new Agendamento(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
