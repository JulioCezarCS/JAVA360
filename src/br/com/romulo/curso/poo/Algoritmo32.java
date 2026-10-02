package br.com.romulo.curso.poo;

public class Algoritmo32 {
    public void mostrarSalaEco1(String nome) {
        IO.println("Quem ousa entrar na Sala do Eco?");
        IO.println("Ah... " + nome + " Eu esperava por você!");
    }

    public String mostrarSalaEco(String nome) {
        String res = "Quem ousa entrar na Sala do Eco?";
        String resNome = "Ah... " + nome + " Eu esperava por você!";
        return res + "\n" + resNome;
    }
}
