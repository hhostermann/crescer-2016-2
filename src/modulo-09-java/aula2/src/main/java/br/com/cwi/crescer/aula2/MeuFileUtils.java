/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuFileUtils {
    
    public static void main(String a[]) throws IOException {

        try (final Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite o comando desejado: ");
            String comando = scanner.next();

            if (comando.equalsIgnoreCase("mk")) {
                System.out.println("Digite o nome do arquivo que deseja criar: ");
                String nome = scanner.next();
                Criar(nome);
            }
            if (comando.equalsIgnoreCase("rm")) {

                System.out.println("Digite o nome do arquivo que deseja excluir: ");
                String nome = scanner.next();
                Excluir(nome);
            }
            if (comando.equalsIgnoreCase("ls")) {
                System.out.println("Digite o nome do arquivo que deseja procurar: ");
                String nome = scanner.next();
                Procura(nome);
            }
            if (comando.equalsIgnoreCase("mv")) {
                System.out.println("Digite o nome do arquivo a ser movido: ");
                String nome = scanner.next();
                System.out.println("Digite o nome do arquivo que receberá: ");
                String novoNome = scanner.next();

                Mover(nome, novoNome);
            }
        }
    }

    private static void Criar(String nome) {

        try {
            final File file = new File(nome);

            if (file.exists()) {
                System.out.println("Já existe um arquivo com esse nome.");
                System.out.println(file.getAbsolutePath());
            } else {
                file.createNewFile();
                System.out.println("Arquivo Criado com Sucesso.");
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    private static void Excluir(String nome) {

        try {
            final File file = new File(nome);
            if (file.exists()) {
                new File(nome).delete();
                System.out.println("Arquivo " +nome+ " excluido");
            } else {
                System.out.println("Não encontrado.");
            }

        } catch (Exception e) {

        }

    }

    private static void Procura(String nome) {

        try {
            final String path;

            final File file = new File(nome);
            
            if (file.isDirectory()) {
                System.out.println("Arquivos no diretório procurado: \n");
                final File[] list = new File(nome).listFiles();

                if (list.length > 0) {
                    for (int i = 0; i < list.length; i++) {
                        System.out.println(list[i]);
                    }
                }
            }
            
            if (file.isFile()) {
                path = "C:\\Users\\henrique.ostermann\\crescer-2016-2\\src\\modulo-09-java\\aula2" + nome;
                System.out.println("diretório do arquivo: " + path);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void Mover(String nome, String novoNome) throws FileNotFoundException, IOException {
    
        final File file = new File(nome);
        final File file2 = new File(novoNome);
        
        if(file.isDirectory() || file2.isDirectory())
            System.out.println("Arquivo inválido.");
        
        if (file.isFile() && file2.isFile()) {
           
        FileInputStream dentro = new FileInputStream(file);
        FileOutputStream fora = new FileOutputStream(file2);
        
        byte[] buffer = new byte[1024];
        int length;
        
        while((length = dentro.read(buffer)) > 0 ){
            fora.write(buffer, 0 , length);
        }
            System.out.println("Arquivo movido com sucesso.");
        dentro.close();
        fora.close();
        
        Excluir(nome);
        
        }else{
            System.out.println("");
        }
    }
}
