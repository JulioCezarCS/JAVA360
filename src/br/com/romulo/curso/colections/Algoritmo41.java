package br.com.romulo.curso.colections;
public class Algoritmo41 {
    public void main() {

        // matrizes
        // metriz bidimencional (2D)
        // 2 linhas e 2 colunas = 2x2

        int[][] m = {{ 21, 25 },{ 33, 35 }};

        // i: número da linha horizontal
        // j: número da linha vertical

        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }

        IO.println(soma);

    }
}
