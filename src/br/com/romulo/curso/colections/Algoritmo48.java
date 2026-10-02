package br.com.romulo.curso.colections;
public class Algoritmo48 {
    /*
     * matriz quadrada:
     * 20, 50, 80
     * 45, 60, 90
     * 45, 67, 89
     * 
     * mostre apenas os valores da diagonal principal
     */

    public static void main(String[] args) {

        double[][] vetorQ = {
                { 20, 50, 80 },
                { 45, 60, 90 },
                { 45, 67, 89 }
        };

        for (int i = 0; i < vetorQ.length; i++) {
            IO.println(vetorQ[i][i]);
        }

    }
}
