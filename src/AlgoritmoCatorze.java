public class AlgoritmoCatorze {
    public static void main(String[] args) {
        
        System.out.println("\n--------Menu--------\n");
        System.out.println("\n---- Digite '1' para iniciar\n");
        System.out.println("\n---- Digite '2' para ver vidas restantes\n");
        System.out.println("\n---- Digite '3' para finalizar o jogo\n");
        int numero = Integer.parseInt(IO.readln("\nNúmero: "));

        switch (numero) {
            case 1: System.out.println("\nJogo iniciado.\n"); break;
            case 2: System.out.println("\nVocê tem 10 corações restantes.\n"); break;
            case 3: System.out.println("\nGame Over!\n"); break;
            default: System.out.println("\nNúmero inválido.\n");
        }
    }
}
