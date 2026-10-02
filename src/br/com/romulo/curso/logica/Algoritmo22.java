package br.com.romulo.curso.logica;
public class Algoritmo22 {
    public static void main(String[] args) {

        int contador = 0;
        int parcelas;
        float emprestimo = 0.0f;
        float totalFinanciado = 0.0f;
        boolean conectado = false;
        String usuario;
        String senha;

        do {

            System.out.println("\n------------------");
            usuario = IO.readln("Digite o seu nome: ");
            senha = IO.readln("Digite a sua senha: ");

            contador++;

            if (usuario.equalsIgnoreCase("senai") && senha.equalsIgnoreCase("123")) {

                conectado = true;
                contador = 3;

            } else {

                System.out.println("\nUsuario e/ou senha incorretos, tente novamente.\n");
                System.out.println("\n------------------");
                usuario = IO.readln("Digite o seu nome: ");
                senha = IO.readln("Digite a sua senha: ");

                contador++;

            }

            if (usuario.equalsIgnoreCase("senai") && senha.equalsIgnoreCase("123")) {

                conectado = true;
                contador = 3;

            } else {

                System.out.println("\nsuario e/ou senha incorretos, tente novamente.\n");
                System.out.println("\n------------------");
                usuario = IO.readln("Digite o seu nome: ");
                senha = IO.readln("Digite a sua senha: ");

                contador++;

            }

            if (usuario.equalsIgnoreCase("senai") && senha.equalsIgnoreCase("123")) {

                conectado = true;
                contador = 3;

            } else {

                System.out.println("\nCartão Bloqueado.");
                System.out.println("\nContate o gerente em: www.CadaUmComSeusProblemas.com.br\n");

            }

        } while (contador < 3);

        if (conectado == true) {

            System.out.println("\n------------------------------");
            System.out.println("Bem vindo(a) ao Banco SENATECH");
            System.out.println("-------------------------------\n");

            System.out.println("-----------------------------");
            emprestimo = Float.parseFloat(IO.readln("Digite o valor do empréstimo: "));
            parcelas = Integer.parseInt(IO.readln("Digite a quantidade de meses: "));

            if (emprestimo <= 20000 && parcelas <= 10) {

                totalFinanciado = (emprestimo * 0.01f);
                System.out.println("\nTotal do Empréstimo: " + totalFinanciado);
                System.out.println("\n");

            } else {

                System.out.println("Empréstimo recusado.");

            }

        } else {

            return;

        }

    }

}
