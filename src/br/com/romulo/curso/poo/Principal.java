package br.com.romulo.curso.poo;

public class Principal {
    void main() {
        Algoritmo31 objeto = new Algoritmo31();
        /* classe obj at op construtor */

        IO.println(objeto.getAloMundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        objeto2.mostrarSalaEco("JP Max Plus");
        String nome = null;
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSalaEco("Maria Eduarda"));
        // JOptionPane.showMessageDialog();

        Algoritmo33 objeto4 = new Algoritmo33();
        objeto4.inserirChave(5);
        IO.println(objeto4.retornarChave());
        IO.println(objeto4.abrirPorta());

        Algoritmo34 alg34 = new Algoritmo34();
        alg34.setPrimeiroNumero(10);
        alg34.setSegundoNumero(5);
        IO.println(alg34.getSegundoNumero());

        Algoritmo35 alg35 = new Algoritmo35();
        alg35.setModelo("BYD Song Plus");
        alg35.setPlaca("abc1234");
        alg35.setCavalos("1700");
        IO.println(alg35.getModelo());
        IO.println(alg35.getPlaca());
        IO.println(alg35.getCavalos());

    }

}
