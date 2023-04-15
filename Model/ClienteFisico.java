package br.edu.fescfafic.responsabilidade.unica.Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class ClienteFisico extends Cliente{
    public String nomeCompleto;

    public String apelido;

    protected String cpf;

    protected String rg;

    protected String emissor;

    public String sexo;

    public Date dataNascimento;

    public ClienteFisico(boolean clienteAtivo, LocalDate cadastradoEm, Contato contato, Endereco endereco, String nomeCompleto, String apelido, String cpf, String rg, String emissor, String sexo, Date dataNascimento) {
        super(clienteAtivo, cadastradoEm, contato, endereco);
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", apelido='" + apelido + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", emissor='" + emissor + '\'' +
                ", sexo='" + sexo + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", id=" + id +
                ", clienteAtivo=" + clienteAtivo +
                ", cadastradoEm=" + cadastradoEm +
                '}';
    }
}
