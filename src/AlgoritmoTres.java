public class AlgoritmoTres {

    void main() {

        int nota1 = Integer.parseInt(IO.readln("\nDigite a primeira nota: "));
        int nota2 = Integer.parseInt(IO.readln("\nDigite a segunda nota: "));
        int nota3 = Integer.parseInt(IO.readln("\nDigite a terceira nota: "));

        double media = (nota1 + nota2 + nota3)/ 3.0;

        IO.println("\nNotas: " + nota1 + ", " + nota2 + " e " + nota3);
        IO.println("\nMédia: " + media);

    }

}
