package br.edu.fescfafic.responsabilidade.unica.Model;

import java.time.LocalDate;

public class ClienteJuridico extends Cliente{
    public String razaoSocial;

    public String nomeFantasia;

    public String cnpj;

    public String indicadorInscricaoEstatual;

    public String inscricaoEstadual;

    public String inscricaoMunicipal;

    public ClienteJuridico(boolean clienteAtivo, LocalDate cadastradoEm, Contato contato, Endereco endereco, String razaoSocial, String nomeFantasia, String cnpj, String indicadorInscricaoEstatual, String inscricaoEstadual, String inscricaoMunicipal) {
        super(clienteAtivo, cadastradoEm, contato, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.indicadorInscricaoEstatual = indicadorInscricaoEstatual;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIndicadorInscricaoEstatual() {
        return indicadorInscricaoEstatual;
    }

    public void setIndicadorInscricaoEstatual(String indicadorInscricaoEstatual) {
        this.indicadorInscricaoEstatual = indicadorInscricaoEstatual;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", indicadorInscricaoEstatual=" + indicadorInscricaoEstatual +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", inscricaoMunicipal='" + inscricaoMunicipal + '\'' +
                ", id=" + id +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastradoEm=" + cadastradoEm +
                '}';
    }
}
