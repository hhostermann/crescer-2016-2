/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author henrique.ostermann
 */
public class Run {

    public static void main(String[] args) throws SQLException {
        final String query = "SELECT * FROM PESSOA";
        try (
            final Connection connection = ConnectionUtils.getConnection();
            final Statement statement = connection.createStatement();) {
               try (final ResultSet resultSet = statement.executeQuery(query)) {
                   while(resultSet.next()){
                       final long idPessoa = resultSet.getLong("ID_PESSOA");
                       final String nmPessoa = resultSet.getString("NM_PESSOA");
                       
                       System.out.format("ID:%s NOME:%s\n",idPessoa, nmPessoa);
                   }
        } catch (SQLException e) {
        }
            } catch (final SQLException e) {
                System.err.format("SQLException: %s", e);
            }
    }
}
