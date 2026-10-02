package br.com.romulo.curso.colections;
public class Algoritmo44 {
    public static void main(String[] args) {

        double[][] notas = {
            {100, 80, 40, 30},
            {78, 87, 55, 90},
            {67, 78, 34, 53},
            {90, 100, 56, 96}
        };

        for(int i = 0; i < notas.length; i++) {
            for(int j = 0; j < notas[i].length; j++) {
                IO.println(notas[i][j]);
            }
        }

    }
}
