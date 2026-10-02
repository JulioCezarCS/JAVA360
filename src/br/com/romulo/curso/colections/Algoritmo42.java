package br.com.romulo.curso.colections;
import java.util.List;

public class Algoritmo42 {
    public void main() {
        
        // Java 5
        // James Gosling
        // Collections
        // Antes do Java 5 - calça normal
        // A partir do Java 5 - calça Lycra
        // Primeira voz (Bruno): Interface(contrato)
        // Segunda voz (Marrone): Classe(implementa)

        // List<String> nomes = new ArrayList<>();

        List<String> linguagens = List.of("Rust", "Python", "GO", "Java", "C", "C++", "C#");
        for(String linguagem : linguagens) {
            IO.println(linguagem);
        }


    }
}
