package org.example;
// Classe representando um objeto individual na agenda
public class Contato implements AgendaComponent {
    private String nome;
    private int idade;
    private float altura;
    public Contato(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    // Implementação da operação para imprimir detalhes do contat
    @Override
    public void operacao() {
        System.out.println("Contato: Nome=" + nome + ", Idade=" + idade + ", Altura=" + altura);
    }
}

