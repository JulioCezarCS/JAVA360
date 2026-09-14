public class Algoritmo21 {
    public static void main(String[] args) {

        // dentro do for some o vetor e calcule a média final

        int soma = 0;

        int[] vetor = { 45, 67, 89, 34, 23, 56, 78, 98, 45, 34 };

        for (int percorra : vetor) {
            soma += percorra;
        }

        IO.println("\nSoma de todos os elementos do vetor: " + soma);

        IO.println("\nMédia entre os elementos do vetor: " + (soma / 10.0));

    }
}
