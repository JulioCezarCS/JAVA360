public class Algoritmo13 {
    public static void main(String[] args) {

        System.out.println("\n--------If Else If--------\n");
        int n1 = Integer.parseInt(IO.readln("\nDigite o primeiro número inteiro: "));
        int n2 = Integer.parseInt(IO.readln("\nDigite o segundo número inteiro: "));
        int n3 = Integer.parseInt(IO.readln("\nDigite o terceiro número inteiro: "));

        if (n1 > n2 && n1 > n3) {
            System.out.println("\nO número " + n1 + " é o maior.\n");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("\nO número " + n2 + " é o maior.\n");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("\nO número " + n3 + " é o maior.\n");
        } else {
            System.out.println("\nOs números são iguais.\n");
        }

        if (n1 > n2) {
            System.out.println("\nO número " + n1 + " é o maior.\n");
        } else if (n2 > n3) {
            System.out.println("\nO número " + n2 + " é o maior.\n");
        } else {
            System.out.println("\nOs números são iguais.\n");
        }

    }
}
