package br.com.romulo.curso.poo;

public class Cachorro extends Animal {

    // no processo de herança o construtor não é herdado
    // tem que ser redefinido no filho

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        IO.println("Ração Camil para cães");
    }

    @Override
    public void tocarSom() {
        IO.println("Tocando auau.mp3");
    }

    @Override
    public void chegarCedo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chegarCedo'");
    }

    @Override
    public void amarParaSempre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'amarParaSempre'");
    }

    @Override
    public void naoTerRazao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'naoTerRazao'");
    }
    
}
