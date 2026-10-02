package br.com.romulo.curso.arquivos;

public class Algoritmo54 {
    public static void main(String[] args) {

        // Toda classe começa com letra maiúscula
        // pacote == packge(separar as coisas por assunto)
        // silogismo
        // premissa 1: todos os homens são mortais
        // premissa 2: Sócrates é um homem
        // conclusão: Sócrates é mortal

        IO.println("\nPremissa 1: número par é divisivel por 2");
        int n = Integer.parseInt(IO.readln("\nDigite um número inteiro: "));

        if (n % 2 == 0) { 
            IO.println("\nPremissa 2: se o resto da divisao é 0 o número é par.");
            IO.println("\nConclusão: o número " + n + " é par.\n");
        } else {
            IO.println("\nPremissa 2: se o resto da divisao é 0 o número é par.");
            IO.println("\nConclusão: o número " + n + " é ímpar.\n");
        }

    }
}
