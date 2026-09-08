public class AlgoritmoSeis {
    public static void main(String[] args) {

        IO.println("\nOlá! Apresente-se, por favor.\n");

        String nome = IO.readln("Digite seu nome: ");
        String endereco = IO.readln("Digite seu endereço: ");
        String telefone = IO.readln("Digite seu telefone: ");

        System.out.println("\nPrazer em te conhecer, " + nome);
        System.out.println("Eu conheço " + endereco);
        System.out.println("Só pra confirmar, no seu número " + telefone + " tem WhatsApp?");
        IO.println("\nAté breve.\n");
    }
}
