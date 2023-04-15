package br.edu.fescfafic.responsabilidade.unica.Model;

public class Contato {
    public String numeroDeContato;

    public String email;

    public Contato(String numeroDeContato, String email){
        this.numeroDeContato = numeroDeContato;
        this.email = email;
    }
    public String getNumeroDeContato(){
        return numeroDeContato;
    }
    public void setNumeroDeContato(String numeroDeContato){
        this.numeroDeContato = numeroDeContato;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

}

