/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuWriterUtils {
    
    public static void main(String[] args) throws IOException {

        List<String> lista = new ArrayList<>();
        String conteudo = "", arquivo;
        
        try (final Scanner scanner = new Scanner(System.in)) {
        System.out.println("digite o nome do arquivo de destino: ");
        arquivo = scanner.nextLine();
        
        System.out.println("digite 0 para sair da escrita do conteudo");
        
        do{
            System.out.println("Escreva novo conteudo ");
            conteudo = scanner.nextLine();
            
            if(!conteudo.contains("0")){
                lista.add(conteudo);
            }
            
        }while(!conteudo.contains("0"));
        
        Escrever(arquivo, lista);
        }
    }
    
    private static boolean accept(final File pathname) {
                return pathname.getName().contains(".txt");
                }
    
    public static void Escrever(String nome, List<String> lista) throws IOException{
    
        final File file = new File(nome);
            if (file.exists()) {
                
                if(accept(file)){
                
                    try (
                        final Writer writer = new FileWriter(nome, true);
                        final BufferedWriter bufferedWriter = new BufferedWriter(writer);
                    ) {
                        for (String item : lista) {
                            bufferedWriter.newLine();
                            bufferedWriter.append(item); 
                        }
                        bufferedWriter.flush();
                        System.out.println("Dados adicionados.");
                               
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    
                }else{
                    System.out.println("Arquivo não pode ser reescrito.");
                }   
            }else{
                System.out.println("Arquivo não foi encontrado.");
            }
    }
}
