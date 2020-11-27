package com.mycompany.lp.continuada3;

import java.sql.*;

public class DadosBanco {
    static ConexaoBanco conexao = new ConexaoBanco();

    public static void cadastrar(String nome, String escola, String materia, String professor, String tipo) {
        try {
            Connection conn = ConexaoBanco.getConnection();
            
            PreparedStatement query = conn.prepareStatement("insert into alunos(nome,escola,materia,professor,tipo) values (?,?,?,?,?)");
            query.setString(1, nome);
            query.setString(2, escola);
            query.setString(3, materia);
            query.setString(4, professor);
            query.setString(5, tipo);
            query.execute();

            conexao.desconectar(conn);
            System.out.println("cadastrado");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("erro ao cadastrar");
        }
    }
    
//    public static void main(String[] args) {
//        cadastrar("alexandre", "emef julio", "port", "Paulo", "fundamental");
//    }
//    public static void consultarPorAluno(String nome) {
//        try {
//            Connection conn = ConexaoBanco.getConnection();
//
//            
//        } catch (Exception e) {
//            
//        }
//    }
}
