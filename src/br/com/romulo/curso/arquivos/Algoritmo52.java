package br.com.romulo.curso.arquivos;
import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public static void main(String[] args) {

        int r = 0;

        do {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

            // amanhã - manipular aqui..
            IO.println("Digite uma dúvida: ");
            String duvida = IO.readln();

            String carimbo = LocalDateTime.now().format(formato); // dia, mes, ano, hora, minuto, segundo

            try (FileWriter arquivo = new FileWriter("registro.txt", true)) {

                arquivo.write("[" + carimbo + "]" + duvida + "\n");
                IO.println("Registrado: [" + carimbo + "] " + duvida);
                IO.println("Deseja registrar nova mensagem?  1 - sim | 0 - não");
                r = Integer.parseInt(IO.readln());

            } catch (IOException e) {
                IO.print("Erro ao registrar a dúvida " + e.getMessage());
            }

            IO.println("adicionar msg:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());

        } while (r == 1);

    }

}
