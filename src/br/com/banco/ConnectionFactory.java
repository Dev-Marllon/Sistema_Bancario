package br.com.banco;
import  java.sql.Connection;
import  java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL = "jdcb :mysql://localhost:3306/sistema_bancario?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO= "root";
    private static final String SENHA = "";

    public static Connection getConnection(){

        try{
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectou !");
            return conexao;

        }catch (Exception e) {
            System.out.println("Erro !"+ e.getMessage());
            throw new RuntimeException(e);
        }


    }
}
