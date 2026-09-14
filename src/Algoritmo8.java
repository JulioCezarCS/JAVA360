public class Algoritmo8 {
    public static void main(String[] args) {

        System.out.println("\n--------Produto entre dois números inteiros--------\n");
        int n1 = Integer.parseInt(IO.readln("\nDigite o primeiro número: "));
        int n2 = Integer.parseInt(IO.readln("\nDigite o segundo número: "));
        int produto = n1 * n2;
        System.out.println("\nO produto entre os dois números é " + produto + ".\n");
    }
}
