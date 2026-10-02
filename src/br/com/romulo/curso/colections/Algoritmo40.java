package br.com.romulo.curso.colections;
public class Algoritmo40 {
    public void main() {

        /*
         * vetor - matriz unidimensional
         * acadêmico - programação simples
         * 
         * tabela - matriz bidimensional
         * banco de dados, planilha Excel
         * 
         * 3D - matriz tridimensional
         * Cinema, desenhos, animações, games(GTA 6, Minecraft)
         */

        // vetor ou matriz unidimensional
        int[] notas = { 7, 9, 5, 10, 6 };
        int maior = notas[0];
        IO.println(maior);

        for(int i = 1; i < notas.length; i++) {
            if(notas[i] > maior) {
                maior = notas[i];
            }
        }

        IO.println("Maior nota: " + maior);

    }
}
