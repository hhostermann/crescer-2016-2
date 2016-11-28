/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula1;

import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuStringUtil {
    public static void main(String[] args) {

        try (final Scanner scanner = new Scanner(System.in)) {
            int cont = 0;
            String frase;
            do {
                
                System.out.println("");
                System.out.println("Informe a frase ou palavra: ");
                frase = scanner.nextLine();
                
                if (StringVazia(frase)) {
                    cont = 0;
                }
                
                System.out.println("");
                System.out.println("1 - Contar quantidade de vogais\n");
                System.out.println("2 - Inverter frase\n");
                System.out.println("3 - Indentificar palindromo\n");
                System.out.println("4 - sair\n");
                System.out.print("\n Digite a opção desejada: ");
                cont = scanner.nextInt();
                // se opcao invalida não entra em nenhum caso
                if (cont < 1 || cont > 3 && cont != 4) {
                    cont = 0;
                }

                switch (cont) {
                    case 1: {
                        System.out.println("");
                        System.out.println(QuantidadeVogais(frase) + " vogais nessa frase.");
                        break;
                    }
                    case 2: {
                        System.out.println("");
                        System.out.println("Frase invertida: " + invertePalavra(frase));
                        break;
                    }
                    case 3: {
                        System.out.println("");
                        indentificaPalindromo(frase);
                        break;
                    }
                }
            } while (cont != 4);
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public static int QuantidadeVogais(String palavraInserida) {
        int tamanho = palavraInserida.length();
        String palavra = palavraInserida.toUpperCase();
        int cont = 0;
        for (int i = 0; i < tamanho; i++) {
            if (palavra.charAt(i) == 'A' || palavra.charAt(i) == 'E'
                    || palavra.charAt(i) == 'I' || palavra.charAt(i) == 'O'
                    || palavra.charAt(i) == 'U') {
                cont++;
            }
        }

        return cont;
    }
    
    public static String invertePalavra(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }

    public static String ConcatenaEnum(Estados[] estados) {

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < estados.length; i++) {
            buffer.append(estados[i].getNome()).append(", ");
        }
        buffer.deleteCharAt(buffer.toString().trim().length() - 1);

        return buffer.toString();
    }


    private static void indentificaPalindromo(String frase) {
        String fraseSemEspaco = frase.replaceAll(" ", "");
        String palavraInvertida = invertePalavra(fraseSemEspaco);
        if(palavraInvertida.equals(fraseSemEspaco)){
            System.out.println("");
            System.out.println("A palavra "+frase+ " é um PALINDROMO");
        }else{
            System.out.println("");
            System.out.println("A palavra "+frase+ " NÃO é um PALINDROMO");;
        }
    }
    private static boolean StringVazia(String frase) {

        if (frase == null || frase.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

