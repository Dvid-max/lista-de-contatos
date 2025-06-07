package model;

public class Contatos {
    private String nome;
    private String telefone;

    public Contatos(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "Nome: " + nome + "\nTelefone: " + telefone + "\n--------------------";
    }

}
