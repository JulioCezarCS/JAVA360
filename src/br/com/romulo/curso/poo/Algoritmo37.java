package br.com.romulo.curso.poo;
public class Algoritmo37 {

    void main() {
        /*
         * Exemplo didático
         * - Herança
         * - super()
         * - Redefinição do Construtor
         * - Polimorfismo
         * - Sobrescrita(override)
         * - Sobrecarga
         */

        Cachorro c = new Cachorro("Rex", "auau.mp3");
        IO.println("Nome: " + c.getNome());
        c.comer();
        c.tocarSom();

        Gato g = new Gato("Juliano", "miau.mp3");
        IO.println("Nome: " + g.getNome());
        g.comer();
        g.tocarSom();

    }
}
