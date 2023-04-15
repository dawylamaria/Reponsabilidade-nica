package br.edu.fescfafic.responsabilidade.unica.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

abstract class Cliente {
    public UUID id;

    public boolean clienteAtivo;

    public LocalDate cadastradoEm;

    public static Contato contato;

    public static Endereco endereco;

    public Cliente(boolean clienteAtivo, LocalDate cadastradoEm, Contato contato, Endereco endereco) {
        this.id = UUID.randomUUID();
        this.clienteAtivo = clienteAtivo;
        this.cadastradoEm = cadastradoEm;
        this.contato = contato;
        this.endereco = endereco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isClienteAtivo() {
        return clienteAtivo;
    }

    public void setClienteAtivo(boolean clienteAtivo) {
        this.clienteAtivo = clienteAtivo;
    }

    public LocalDate getCadastradoEm() {
        return cadastradoEm;
    }

    public void setCadastradoEm(LocalDate cadastradoEm) {
        this.cadastradoEm = cadastradoEm;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastradoEm=" + cadastradoEm +
                ", contato=" + contato +
                ", endereco=" + endereco +
                '}';
    }
}
