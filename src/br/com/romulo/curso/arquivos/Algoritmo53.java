package br.com.romulo.curso.arquivos;

import java.util.HashMap;
import java.util.Map;

public class Algoritmo53 {
    void main() {

        // dicionário Aurélio
        // chave - valor
        // manga - "fruta tropical"
        // teclado - "instrumento musical"
        // Java - "Arquipélogo na Indonésia"
        // JSON - (chave, valor) - JavaScript
        // Dictionary (obsoleto) - Java Legado
        // <> = Generics - Para definir qualquer tipo <T>
        // Toda classe herda de object

        Map<String,Estudante> estudantes = new HashMap<>();

        IO.println("Java Doctor - Escola de Programação");

        Estudante e1 = new Estudante("JP", "ADS", 2025);
        estudantes.put("MAT-1223", e1);

        Estudante e2 = new Estudante("Elias", "Ciência da Computação", 2023);
        estudantes.put("MAT-1224", e2);

        Estudante e3 = new Estudante("Daniel", "Publicidade e propaganda", 2016);
        estudantes.put("MAT-1225", e3);

        Estudante e4 = new Estudante("Cassio", "ADS", 2015);
        estudantes.put("MAT-1226", e4);

        Estudante e5 = new Estudante("Natália", "Ciência da Computação", 2026);
        estudantes.put("MAT-1227", e5);

        Estudante e6 = new Estudante("Maria Eduarda", "ADS", 2023);
        estudantes.put("MAT-1228", e6);

        Estudante e7 = new Estudante("Julio Cezar", "TSI", 2028);
        estudantes.put("MAT-1229", e7);

        Estudante e8 = new Estudante("Gabriel1", "Autodidata", 2026);
        estudantes.put("MAT-1230", e8);

        Estudante e9 = new Estudante("Fabio Pio", "Marketing", 2026);
        estudantes.put("MAT-1231", e9);

        Estudante e10 = new Estudante("Carlos", "ADS", 2026);
        estudantes.put("MAT-1232", e10);

        Estudante e11 = new Estudante("Gabriel2", "Engenharia de Software", 2028);
        estudantes.put("MAT-1233", e11);

        Estudante e12 = new Estudante("Thalita", "ADS", 2026);
        estudantes.put("MAT-1234", e12);

        estudantes.put("MAT-1235", new Estudante("Rômulo", "GTI", 2012));

        for (Estudante e : estudantes.values()) {
            IO.println(e);
        }

        for (String matricula : estudantes.keySet()) {
            Estudante e = estudantes.get(matricula);
            IO.println(matricula + " -> " + e);
        }

        IO.println("Digite a matricula: ");
        String busca = IO.readln();
        Estudante encontrado = estudantes.get(busca);

        if (encontrado != null) {
            IO.println("Encontrado: " + busca + " -> " + encontrado);
        } else {
            IO.println("Matricula: " + busca + " não encontrada.");
        }

    }
}
