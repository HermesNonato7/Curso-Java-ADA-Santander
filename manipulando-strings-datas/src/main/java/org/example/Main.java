package org.example;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Olá, {nome}. Hoje é {dia-da-semana}. Bom dia!

        String nome = "Hermes";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        // System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); # Alternativa código de baixo
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá!";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

        System.out.println("");


        // Trecho de comparação entre Strings

        String nomeOutro = "Hermes";
        //System.out.println(nome.equals(nomeOutro));

        if (nome == nomeOutro) {
            System.out.println("Mesmo nome.");
        } else {
            System.out.println("Erro ao digitar o nome!");
        }
        // System.out.println(nome.equalsIgnoreCase(nomeOutro));

    }
}