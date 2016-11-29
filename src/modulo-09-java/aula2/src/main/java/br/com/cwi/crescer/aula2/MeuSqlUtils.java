/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author henrique.ostermann
 */
public class MeuSqlUtils {

    public static void main(String[] args) throws IOException {
        String arq;
        try (final Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o Arquivo:");
            arq = scanner.nextLine();
            Exportar(arq);
        }
    }

    public static void Exportar(String arq) {
        final File file = new File(arq);
        if (file.exists()) {
            if (AceitaCSV(file)) {
                try (final Writer escrever = new FileWriter(arq, true);
                        final BufferedWriter bufferedWriter = new BufferedWriter(escrever);) {
                    for (Pessoa item : EncontrarTodos()) {
                        String dados = item.getIdPessoa() + ";" + item.getNmPessoa();
                        bufferedWriter.newLine();
                        bufferedWriter.append(dados);
                    }
                    bufferedWriter.flush();
                    System.out.println("Dados Guardados");
                } catch (IOException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println("Arquivo não localizado");
            }
        } else {
            System.out.println("Arquivo não localizado");
        }
    }

    public static void Importar(String arq) throws IOException {
        final File file = new File(arq);
        if (file.exists()) {
            if (AceitaCSV(file)) {
                try (final BufferedReader bufferReader = new BufferedReader(new FileReader(arq))) {
                    String linha = null;
                    List<Pessoa> list = new ArrayList<>();
                    while ((linha = bufferReader.readLine()) != null) {
                        String[] coluna = linha.split(";");
                        Pessoa pessoa = new Pessoa(Long.parseLong(coluna[0]), coluna[1]);
                        list.add(pessoa);
                    }
                    SalvarBanco(list);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Arquivo não localizado");
            }
        } else {
            System.out.println("Arquivo não localizado");
        }

    }

    private static boolean AceitaCSV(final File pathname) {
        return pathname.getName().contains(".csv");
    }

    public static List<Pessoa> EncontrarTodos() {
        final String query = "SELECT O FROM OSTERMANN O";
        try (final Connection connection = ConnectionUtils.getConnection();
                final Statement statement = connection.createStatement();
                final ResultSet resultSet = statement.executeQuery(query);) {
            List<Pessoa> list = new ArrayList<>();
            while (resultSet.next()) {
                final Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa(resultSet.getLong("id_pessoa"));
                pessoa.setNmPessoa(resultSet.getString("nm_pessoa"));
                list.add(pessoa);
            }
            return list;
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }
        return null;
    }

    private static void SalvarBanco(List<Pessoa> list) {
        for (int i = 0; i < list.size(); i++) {
            final String inserir = "INSERT INTO OSTERMANN(" + "ID_PESSOA, NM_PESSOA)" + "VALUES(?, ?)";
            try (final Connection connection = ConnectionUtils.getConnection();
                    final PreparedStatement prepredStatement = connection.prepareStatement(inserir)) {
                prepredStatement.setLong(1, list.get(i).getIdPessoa());
                prepredStatement.setString(2, list.get(i).getNmPessoa());
                prepredStatement.executeUpdate();
                System.out.println("Salvo");
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
            }
        }
    }

    private static boolean aceitar(final File patchname) {
        return patchname.getName().contains(".sql");
    }

    public static void Executar(String arq) throws IOException {
        final File file = new File(arq);
        String string = "";
        if (file.exists()) {
            if (aceitar(file)) {
                try (final Reader reader = new FileReader(arq);
                        final BufferedReader bufferReader = new BufferedReader(reader);) {
                    Object[] object = bufferReader.lines().toArray();
                    for (Object objeto : object) {
                        string += objeto;
                    }
                    if (string.contains("SELECT")) {
                        try (final Connection connection = ConnectionUtils.getConnection();
                                final Statement statement = connection.createStatement();
                                final ResultSet resultSet = statement.executeQuery(string)) {
                            System.out.println("ID \t NOME");
                            while (resultSet.next()) {
                                final long id = resultSet.getLong("ID_PESSOA");
                                final String nome = resultSet.getString("NM_PESSOA");
                                System.out.format("%s \t %s", id, nome);
                            }
                        } catch (SQLException e) {
                            System.err.format("SQLException: %s", e);
                        }
                    } else {
                        try (final Connection connection = ConnectionUtils.getConnection();
                                final Statement statement = connection.createStatement()) {
                            statement.executeUpdate(string);
                        } catch (SQLException e) {
                            System.err.format("SQLException: %s", e);
                        }
                    }

                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            }
        }
    }

}