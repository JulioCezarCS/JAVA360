package br.com.romulo.curso.colections;
public class Algoritmo47 {
    public static void main(String[] args) {

        // Faça um vetor que armazene 10 valores inteiros
        // Imprimir a média desses valores

        int[] numeros = new int[10];

        int numero = 0;

        double soma = 0.0;

        double media = 0.0;

        for (int i = 0; i < numeros.length; i++) {
            numero = Integer.parseInt(IO.readln("Digite o número: "));
            numeros[i] = numero;
            soma += numero;
        }

        media = soma / numeros.length;

        IO.println("Soma: " + soma);

        IO.println("Média: " + media);

    }
}