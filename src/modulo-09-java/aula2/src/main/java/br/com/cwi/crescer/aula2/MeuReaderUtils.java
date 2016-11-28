/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuReaderUtils {
    public static void main(String[] args) throws IOException {

        try (final Scanner scanner = new Scanner(System.in)) {
        System.out.println("digite o nome do arquivo: ");
        String arquivo = scanner.next();
        
        Ler(arquivo);
        
        }
    }
    
    private static boolean Aceitar(final File pathname) {
                return pathname.getName().contains(".txt");
                }
    
    public static void Ler(String nome) throws IOException{
    
        final File file = new File(nome);
            if (file.exists()) {
                
                if(Aceitar(file)){
                
                    try (   
                        final Reader reader = new FileReader(nome);
                        final BufferedReader bufferReader = new BufferedReader(reader);
                    ) {
                    System.out.println("");
                    bufferReader.lines().forEach(System.out::println);
                    System.out.println("");
                    
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("\n Arquivo incompatível");
                }   
            }else{
                System.out.println("\n Arquivo não existe!!");
            }
    }
}
