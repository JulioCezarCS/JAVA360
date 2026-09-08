public class AlgoritmoDoze {
    public static void main(String[] args) {

        System.out.println("\n--------Ímpar ou Par?--------\n");
        int numero = Integer.parseInt(IO.readln("\nDigite um número inteiro: "));
        if (numero % 2 == 0) {
            System.out.println("\nO Número " + numero + " é Par.\n");
        } else {
            System.out.println("\nO Número " + numero + " é Ímpar.\n");
        }
    }
}
