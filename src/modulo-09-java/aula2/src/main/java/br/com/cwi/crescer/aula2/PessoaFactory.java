/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author henrique.ostermann
 */
public class PessoaFactory {

    public static void main(String[] args) {
        final String ddl = "CREATE TABLE OSTERMANN ("
                + " ID_PESSOA NUMBER(19,0) NOT NULL, "
                + " NM_PESSOA VARCHAR2(50) NOT NULL, "
                + " PRIMARY KEY (ID_PESSOA) "
                + ")";
        try (
                final Connection connection = ConnectionUtils.getConnection();
                final Statement statement = connection.createStatement();
            ) 
        {
            statement.executeUpdate(ddl);
            
        } catch (final SQLException e) {
            System.err.format("SQLException: %s", e);
        }

    }

}
