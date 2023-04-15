package br.edu.fescfafic.responsabilidade.unica.Main;

import br.edu.fescfafic.responsabilidade.unica.Model.ClienteJuridico;
import br.edu.fescfafic.responsabilidade.unica.Model.Contato;
import br.edu.fescfafic.responsabilidade.unica.Model.Endereco;
import java.time.LocalDate;
import br.edu.fescfafic.responsabilidade.unica.Model.IndicadorInscricaoEstadual;

public class Main {
    public static void main(String[] args) {
        Contato contato= new Contato(
                "123456",
                "edu@gmail.com");

        Endereco endereco = new Endereco("cajazeiras", "qualquer", "qualquer", "qualquer", "16", "0000000", "qualquer");

        ClienteJuridico.contato = new Contato("123456", "edu@gmail.com");

        ClienteJuridico clienteJuridico1 = new ClienteJuridico(true,LocalDate.of(2023,03, 12), contato, endereco, "qualquer", "qualquer", "2158465465",IndicadorInscricaoEstadual.CONT, "265464", "565498");
        System.out.println(clienteJuridico1);


    }

}