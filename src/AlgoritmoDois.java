public class AlgoritmoDois {

    void main() {

        IO.println("\nSeja bem vindo ao Java 360");
        String usuario = IO.readln("\nQual o seu nome? ");
        IO.println("\nOlá, " + usuario + ", seja bem vindo!\n");

        // int estrelas = 0; // mais rápido, porém, não tem métodos
        // Integer.parseInt(valor para conversão); // Integer é uma classe
        // Integer = Classe Wrappers

        int estrelas = 0;
        IO.println("\nQuem criou o Java? ");
        IO.println("\n1 - James Gosling");
        IO.println("\n2 - Bill Gates");
        IO.println("\n3 - Steve Jobs");
        IO.println("\n4 - Mark Zuckerberg");
        int resp = Integer.parseInt(IO.readln("\nDigite o número: "));

        if (resp == 1) {
            IO.println("\nParabéns, você acertou!");
            estrelas = estrelas + 1;
        } else {
            IO.println("\nVocê errou!");
        }
        IO.println("Você obteve " + estrelas + " estrelas.\n");

    }

}
