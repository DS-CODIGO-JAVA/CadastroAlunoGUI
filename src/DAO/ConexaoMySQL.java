package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMySQL {
    public static Connection getConnection(){
        try {
            String URL = "jdbc:mysql://localhost:3306/cadastro";
            String user = "root";
            String password = "";
            return DriverManager.getConnection(URL, user, password);
        }catch (Exception e){
            throw new RuntimeException("Erro de conexão: " + e.getMessage());
        }
    }
}
