package br.com.romulo.curso.poo;

public class Gato extends Animal {

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        IO.println("Wyskas para Gatos!");
    }

    @Override
    public void tocarSom() {
        IO.println("Tocando miaumiau.mp3" + super.getArquivoSom());
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
