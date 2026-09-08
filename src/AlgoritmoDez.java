public class AlgoritmoDez {
    public static void main(String[] args) {

        System.out.println("\n--------Média Aritmética--------\n");
        float n1 = Float.parseFloat(IO.readln("\nDigite o primeiro número: "));
        float n2 = Float.parseFloat(IO.readln("\nDigite o segundo número: "));
        float media = (n1 + n2) / 2;
        System.out.println("\nMÉDIA");
        System.out.println("\nResultado: " + media + ".\n");

    }
}
