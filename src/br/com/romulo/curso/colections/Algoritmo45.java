package br.com.romulo.curso.colections;
import java.util.List;

public class Algoritmo45 {
    public static void main(String[] args) {

        // Java collections
        // Java 5
        
        /*
         * List (Interface) ---> ArrayList(Classe Implementa)
         */

        List<String> tarefas = List.of("teste de mesa", "algoritmos", "POO");

        // singular - elemento
        // plural - coleção

        for (String tarefa : tarefas) {
            IO.println(tarefa);
        }

    }
}
