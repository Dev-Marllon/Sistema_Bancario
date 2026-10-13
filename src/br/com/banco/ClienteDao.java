package br.com.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {

    public void cadastrar(Cliente cliente){

        String sql = "INSERT INTO cliente (nome, cpf, email, telefone) VALUES (?, ?, ?, ?)";

        try (Connection conexao = ConnectionFactory.getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefone());

            stmt.executeUpdate();

            System.out.println("Cliente cadastrado com sucesso!");

        }catch (SQLException e){
            System.out.println("Erro ao cadastrar cliente:"+ e.getMessage());

        }

    }
}
