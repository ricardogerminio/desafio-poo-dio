package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private LocalDate data;
    DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data.format(dateTimeFormatterBR) +
                '}';
    }
}
