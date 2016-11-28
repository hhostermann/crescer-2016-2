/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuCalendarioUtil {
    static final String pattern = "dd/MM/yyyy";
    static final DateFormat dateFormat = new SimpleDateFormat(pattern);
    static final Calendar calendar = Calendar.getInstance();
    
    public static void main(String[] args) {

        try (final Scanner scanner = new Scanner(System.in)) {
            int cont = 0;
            String data;
            do {
                data = "";
                System.out.println("Informe uma data: ");
                data = scanner.nextLine();

                System.out.println("");
                System.out.println("1 - Retornar dia da semana de nascimento");
                System.out.println("2 - Retornar tempo decorrido até a data atual");
                System.out.println("4 - sair");
                System.out.print("\n Digite a opção desejada: ");
                cont = scanner.nextInt();
                if (cont < 1 || cont > 2 && cont != 9) {
                    cont = 0;
                }

                switch (cont) {
                    case 1: {
                        System.out.println("");
                        buscaSemNascimento(data);
                        break;
                    }
                    case 2: {
                        System.out.println("");
                        calculaTempoDecorrido(data);
                        break;
                    }
                }

            } while (cont != 4);

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public static void buscaSemNascimento(String data) throws ParseException {
        String[] semana = {"", "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        Date dataNasc = dateFormat.parse(data);
        calendar.setTime(dataNasc);
        System.out.println("Semana de nascimento: " + semana[calendar.get(Calendar.DAY_OF_WEEK)]);
    }
    public static Date transformaDate(String dataEntrada) throws ParseException{
        Date data = dateFormat.parse(dataEntrada);
        return data;
    }
    public static void calculaTempoDecorrido(String dataEntrada) throws ParseException {
        Date data = transformaDate(dataEntrada);
        long diferenca = new Date().getTime() - data.getTime();
        calendar.setTime(new Date(diferenca));

        System.out.println("Tempo decorrido: " + 
                           (calendar.get(Calendar.YEAR) - 1970) +" ano(s), " +
                            calendar.get(Calendar.MONTH) + " mese(s), " + 
                            calendar.get(Calendar.DAY_OF_MONTH) + " dia(s).");
    }
    
}

