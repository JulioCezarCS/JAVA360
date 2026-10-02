package br.com.romulo.curso.colections;
import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {
    public static void main(String[] args) {

        // ArrayList implementa (lista)
        // HashMap implementa Map (chave -> valor)
        // HashSet implementa Set (conjunto)
        // LinkedList implementa Queue (fila)

        List<String> frutas = new ArrayList<>(); // <> = generics

        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");

        IO.println("Primeira fruta: " + frutas.get(0));

        frutas.set(1, "Uvas");

        for(String fruta : frutas) {
            IO.println("Elemento: " + fruta);
        }

        IO.println("Total de frutas: " + frutas.size());

        frutas.remove("Mamão");

        IO.println("Total de frutas: " + frutas.size());

        IO.println("Lista" + frutas);

        frutas.remove(1);

        IO.println("Lista: " + frutas);

    }
}
