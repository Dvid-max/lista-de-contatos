package view;

import model.Contatos;

import java.util.Scanner;

import controller.ListaDeContatos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int resposta = -1;

        Scanner sc = new Scanner(System.in);
        ListaDeContatos lista = new ListaDeContatos();

        do {

            System.out.println("---------------------------------------------------------------");
            System.out.println("                    AGENDA TELEFÔNICA                          ");
            System.out.println("---------------------------------------------------------------");
            System.out.println("Digite '1' para cadastrar contatos");
            System.out.println("Digite '2' para listar contatos");
            System.out.println("Digite '3' para remover contatos");
            System.out.println("Digite '4' para pesquisar contatos");

            resposta = sc.nextInt();
            sc.nextLine();
            switch (resposta) {
                case 1:
                    System.out.println("CADASTRO DE CONTATOS");
                    System.out.println("nome: ");
                    String nome = sc.nextLine();
                    System.out.println("telefone: ");
                    String telefone = sc.nextLine();

                    Contatos contato = new Contatos(nome, telefone );
                    lista.adicionarContato(contato);
                    break;
                case 2:
                    System.out.println("LISTA DE CONTATOS");
                    System.out.println("---------------------");
                    lista.listarContato();
                    break;
                case 3:
                    System.out.println("REMOVER CONTATO");
                    System.out.println("Digite o nome do contato");
                    String nome_removido = sc.nextLine();
                    lista.removerContato(nome_removido);
                    break;
                case 4:
                    System.out.println("PESQUISAR CONTATO");
                    System.out.println("Digite o nome do contato");
                    String nome_pesquisado = sc.nextLine();

                    Contatos resultado = lista.buscarContatoPorNome(nome_pesquisado);
                    if (resultado != null) {
                        System.out.println(resultado);
                    }else {
                        System.out.println("Contato não encotrado");
                    }
                break;
            }

        }while (resposta != 0);
        }

}