public class Algoritmo3Al {
    void main() {
        int chave = Integer.parseInt(IO.readln("Digite o número da chave: "));

        if (chave == 7) {
            IO.println("\nA porta verde-água se abre.");
        } else {
            IO.println("\nA porta cobre se abre.");
        }

        String classe = IO.readln("\nEscolha: guerreiro, mago, paladino ou clérigo.");

        if (classe.equals("guerreiro")) {
            IO.println("A porta escudo se abre.");
        } else if (classe.equals("mago")) {
            IO.println("A porta livro se abre");
        } else if (classe.equals("paladino")) {
            IO.println("A porta chave se abre.");
        } else {
            IO.println("A porta espada se abre, por padrão.");
        }

        int nivel = Integer.parseInt(IO.readln("Nível: "));
        boolean temChave = IO.readln("Tem a chave? (sim/não): ").equals("sim");

        if (nivel >= 5 && temChave) {
            IO.println("O guardião se curva. Pode passar.");
        } else {
            IO.println("O guardião nega com a cabeça.");
        }

    }
}
