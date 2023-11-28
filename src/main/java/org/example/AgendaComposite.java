package org.example;

import java.util.ArrayList;
import java.util.List;
// Classe representando uma composição de contatos na agenda
public class AgendaComposite implements AgendaComponent {
    private List<AgendaComponent> contatos = new ArrayList<>();
    // Adiciona um contato à lista de contatos
    public void adicionarContato(AgendaComponent contato) {
        contatos.add(contato);
    }
    // Remove um contato da lista de contatos
    public void removerContato(AgendaComponent contato) {
        contatos.remove(contato);
    }
    // Implementação da operação para chamar a operação em cada componente
    @Override
    public void operacao() {
        for (AgendaComponent contato : contatos) {
            contato.operacao();
        }
    }
}
