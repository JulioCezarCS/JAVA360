package br.com.romulo.curso.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Algoritmo55 {

    // <> = Generics - Para definir a interface Map com a classe concreta HashMap
    private static Map<String, Ambientes> ambientes = new HashMap<>();
    private static final String NOME_ARQUIVO = "ambientes.txt";
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {

        // Carrega dados salvos anteriormente no arquivo .txt
        carregarDoArquivo();

        // Carga inicial padrão (caso o arquivo esteja vazio)
        if (ambientes.isEmpty()) {
            ambientes.put("F07", new Ambientes("F07", "Laboratório de Programação Java"));
            ambientes.put("B03", new Ambientes("B03", "Sala de aula padrão"));
            ambientes.put("G09", new Ambientes("G09", "Oficina de Lanternagem e pintura"));
            salvarNoArquivo();
        }

        int opcao = 0;

        // Loop do-while com o menu de opções em janela Swing
        do {
            String menu = "=== CADASTRO DE DICIONÁRIO DE AMBIENTES ===\n\n"
                    + "1 - Cadastrar Ambiente\n"
                    + "2 - Listar Ambientes\n"
                    + "3 - Pesquisar Ambiente\n"
                    + "4 - Alterar Ambiente\n"
                    + "5 - Excluir Ambiente\n"
                    + "6 - Sair\n\n"
                    + "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (entrada == null) {
                // Se o usuário clicar em Cancelar ou Fechar a janela
                opcao = 6;
            } else {
                try { // tentar converter a entrada do usuário
                    opcao = Integer.parseInt(entrada.trim());

                    switch (opcao) {
                        case 1:
                            cadastrar();
                            break;
                        case 2:
                            listar();
                            break;
                        case 3:
                            pesquisar();
                            break;
                        case 4:
                            alterar();
                            break;
                        case 5:
                            excluir();
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "😊 - Encerrando o sistema!", "Encerramento",
                                    JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida! Digite um número entre 1 e 6.",
                                    "Aviso", JOptionPane.WARNING_MESSAGE);
                    }

                } catch (NumberFormatException e) {
                    // erro ao tentar converter valor não numérico
                    JOptionPane.showMessageDialog(null,
                            "😜 " + e.getMessage() + " -> Valor inválido. Digite um número de opção!", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                    opcao = 0;
                } finally {
                    // conclusão que executa a cada iteração do menu
                    if (opcao == 6) {
                        System.out.println("Sessão finalizada com sucesso.");
                    }
                }
            }

        } while (opcao != 6);
    }

    private static void cadastrar() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente (ex: F07, B03, G09):", "Cadastrar",
                JOptionPane.QUESTION_MESSAGE);
        if (chave == null || chave.trim().isEmpty())
            return;
        chave = chave.trim().toUpperCase();

        // Verifica se a chave já existe no Map
        if (ambientes.containsKey(chave)) {
            JOptionPane.showMessageDialog(null, "A chave '" + chave + "' já está cadastrada!", "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição do ambiente:", "Cadastrar",
                JOptionPane.QUESTION_MESSAGE);
        if (descricao == null || descricao.trim().isEmpty())
            return;

        // Cria o novo ambiente e insere no HashMap (chave -> objeto Ambientes)
        Ambientes novo = new Ambientes(chave, descricao.trim());
        ambientes.put(chave, novo);

        salvarNoArquivo();
        JOptionPane.showMessageDialog(null, "Ambiente registrado com sucesso!", "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static void listar() {
        if (ambientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum ambiente cadastrado.", "Lista de Ambientes",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder lista = new StringBuilder();
        lista.append("=== LISTA DE AMBIENTES CADASTRADOS ===\n\n");

        // Mantém apenas este laço que percorre chave e valor diretamente
        for (String chave : ambientes.keySet()) {
            Ambientes a = ambientes.get(chave);
            lista.append(chave).append(" -> ").append(a).append("\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString(), "Ambientes Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void pesquisar() {
        String busca = JOptionPane.showInputDialog(null, "Digite a chave para pesquisar:", "Pesquisar",
                JOptionPane.QUESTION_MESSAGE);
        if (busca == null || busca.trim().isEmpty())
            return;
        busca = busca.trim().toUpperCase();

        Ambientes encontrado = ambientes.get(busca);

        if (encontrado != null) {
            JOptionPane.showMessageDialog(null, "Encontrado: " + busca + " -> " + encontrado, "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave: " + busca + " não encontrada.", "Não Encontrado",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private static void alterar() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente que deseja alterar:", "Alterar",
                JOptionPane.QUESTION_MESSAGE);
        if (chave == null || chave.trim().isEmpty())
            return;
        chave = chave.trim().toUpperCase();

        Ambientes ambiente = ambientes.get(chave);

        if (ambiente != null) {
            String novaDescricao = JOptionPane.showInputDialog(null,
                    "Descrição atual: " + ambiente.getDescricao() + "\nDigite a nova descrição:", "Alterar",
                    JOptionPane.QUESTION_MESSAGE);
            if (novaDescricao == null || novaDescricao.trim().isEmpty())
                return;

            ambiente.setDescricao(novaDescricao.trim());
            ambiente.setDataHora(LocalDateTime.now());

            salvarNoArquivo();
            JOptionPane.showMessageDialog(null, "Ambiente alterado com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave: " + chave + " não encontrada para alteração.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void excluir() {
        String chave = JOptionPane.showInputDialog(null, "Digite a chave do ambiente que deseja excluir:", "Excluir",
                JOptionPane.QUESTION_MESSAGE);
        if (chave == null || chave.trim().isEmpty())
            return;
        chave = chave.trim().toUpperCase();

        if (ambientes.containsKey(chave)) {
            ambientes.remove(chave);
            salvarNoArquivo();
            JOptionPane.showMessageDialog(null, "Ambiente removido com sucesso!", "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Chave: " + chave + " não encontrada.", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Grava todo o HashMap no arquivo .txt utilizando FileWriter e
    // Try-With-Resources
    private static void salvarNoArquivo() {
        try (FileWriter fw = new FileWriter(NOME_ARQUIVO, false);
                PrintWriter pw = new PrintWriter(fw)) {

            for (Ambientes a : ambientes.values()) {
                pw.println(a.toFileFormat());
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar no arquivo: " + e.getMessage(), "Erro I/O",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // Lê o arquivo .txt e repopula o HashMap na inicialização do programa
    private static void carregarDoArquivo() {
        try (FileReader fr = new FileReader(NOME_ARQUIVO);
                BufferedReader br = new BufferedReader(fr)) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    String chave = partes[0];
                    String descricao = partes[1];
                    LocalDateTime dataHora = LocalDateTime.parse(partes[2], FORMATO);

                    Ambientes a = new Ambientes(chave, descricao, dataHora);
                    ambientes.put(chave, a);
                }
            }

        } catch (IOException e) {
            // Se o arquivo não existir na primeira execução, o programa inicia normalmente
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados salvos: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}