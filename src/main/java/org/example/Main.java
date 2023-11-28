package org.example;

import org.example.AgendaComposite;
import org.example.Contato;


public class Main {
    public static void main(String[] args) {
        // Criando objetos individuais (Contatos)
        Contato contato1 = new Contato("Alice", 25, 165);
        Contato contato2 = new Contato("Bob", 30, 180);

        // Criando o composto (AgendaComposite)
        AgendaComposite agendaComposite = new AgendaComposite();

        // Adicionando contatos à agendaComposite
        agendaComposite.adicionarContato(contato1);
        agendaComposite.adicionarContato(contato2);

        // Executando operação na agendaComposite (imprimir detalhes)
        agendaComposite.operacao();
    }
}

