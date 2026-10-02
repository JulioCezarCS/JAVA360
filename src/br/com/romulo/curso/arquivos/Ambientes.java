package br.com.romulo.curso.arquivos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ambientes {

    private String chave;
    private String descricao;
    private LocalDateTime dataHora;

    // Formatador para exibição da data
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // Construtor padrão
    public Ambientes() {
    }

    // Construtor completo com dataHora
    public Ambientes(String chave, String descricao, LocalDateTime dataHora) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    // Construtor auxiliar (define a data e hora atual automaticamente)
    public Ambientes(String chave, String descricao) {
        this(chave, descricao, LocalDateTime.now());
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDataHoraFormatada() {
        return (dataHora != null) ? dataHora.format(FORMATO) : "";
    }

    // Formato para salvar no arquivo .txt (chave;descricao;dataHora)
    public String toFileFormat() {
        return chave + ";" + descricao + ";" + getDataHoraFormatada();
    }

    @Override // polimorfismo
    public String toString() {
        return "Chave: " + chave + " | Descrição: " + descricao + " | Registro: " + getDataHoraFormatada();
    }
}