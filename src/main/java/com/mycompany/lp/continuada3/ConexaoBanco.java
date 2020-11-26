package com.mycompany.lp.continuada3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/Continuada3?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "123";
  
    public static void main(String[] args) {
        ConexaoBanco conexao = new ConexaoBanco();
        Connection conn = conexao.getConnection();
        conexao.desconectar(conn);
    }
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("conectado ao mysql");
        } catch (ClassNotFoundException | SQLException ex) {
           throw new RuntimeException("Erro na conexão:", ex);
        }
        return conn;
    }
    
    public void desconectar(Connection conn){
        try {
            if(conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Desconectou do banco de dados.");
            }
        } catch (SQLException e) {
            System.out.println("Nao conectado ao banco");
        }
    }            

}
