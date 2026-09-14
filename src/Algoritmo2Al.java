public class Algoritmo2Al {

    void main() {
        IO.println("\nQuem ousa entrar na Sala do Eco?");
        String nome = IO.readln();
        IO.println("\nAh... " + nome + ". Eu esperava por você.");

        IO.println("\nQuantos algoritmos você já venceu?");
        String resposta = IO.readln();
        // int total = resposta +1; isso não soma
        int total = Integer.parseInt(resposta);
        IO.println("Só mais " + (360 - total) + " pela frente.");

    }
}
