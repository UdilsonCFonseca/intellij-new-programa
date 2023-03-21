package Cadastro.io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clienteDAO {
    private Connection conexao;

    // Método para conectar ao banco de dados
    public void conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/meubanco";
        String usuario = "root";
        String senha = "senha";
        conexao = DriverManager.getConnection(url, usuario, senha);
    }

    // Método para desconectar do banco de dados
    public void desconectar() throws SQLException {
        conexao.close();
    }

    // Método para inserir um cliente no banco de dados
    public void inserirCliente() throws SQLException {
        inserirCliente(null);
    }

    // Método para inserir um cliente no banco de dados
    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO clientes (cpf, nomeCompleto, dataNascimento, email)";
    }
}
