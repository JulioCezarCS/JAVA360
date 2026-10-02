package br.com.romulo.curso.poo;
public class Algoritmo34 {
    
    // encapsulamento
    // public - private - protected - package
    // public: todo mundo acessa
    // private: apenas a classe acessa
    // protected: apenas classes autorizadas acessam
    // package: apenas na mesma pasta

    private int primeiroNumero; // atributo
    private int segundoNumero;

    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
    public int getSegundoNumero() {
        return segundoNumero;
    }

}
