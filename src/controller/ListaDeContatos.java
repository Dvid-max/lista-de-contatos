package controller;

import model.Contatos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContatos {
     List<Contatos> lista_de_contatos = new ArrayList<>();

    public  void adicionarContato(Contatos contato){
        lista_de_contatos.add(contato);
        System.out.println("model.Contatos adicionados com sucesso!");
    }

    public void listarContato(){
        int i = 0;
        if (lista_de_contatos.isEmpty()){
            System.out.println("Lista Vazia");
        }else {
            for(Contatos contato : lista_de_contatos){
                System.out.println((++i) + "." + contato);
            }
        }
    }

    public Contatos buscarContatoPorNome(String nome) {
        for (Contatos contato : lista_de_contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void removerContato(String nome) {
        for (int i = 0; i < lista_de_contatos.size(); i++) {
            if (lista_de_contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                lista_de_contatos.remove(i);
                System.out.println("Contato removido com sucesso!");
                return;
            }
        }
        System.out.println("Contato não encontrado");
    }


}
