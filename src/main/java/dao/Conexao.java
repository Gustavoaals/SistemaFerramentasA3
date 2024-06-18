package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe responsável por estabelecer a conexão com o banco de dados
public class Conexao {

    // Método estático para obter a conexão com o banco de dados
    public static Connection getConnection() {
        Connection connection = null; // Instância da conexão
        try {
            // Carregamento do JDBC Driver
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            // Configurar a conexão 
            String server = "localhost"; // Endereço do servidor MySQL
            String database = "sistemaemprestimoa3"; // Nome do banco de dados
            String url = "jdbc:mysql://" + server + ":3306/" + database +
                         "?useTimezone=true&serverTimezone=UTC"; // URL de conexão com o banco de dados
            String user = "root"; // Usuário do banco de dados
            String password = "root"; // Senha do banco de dados

            // Conectando...
            connection = DriverManager.getConnection(url, user, password);
            
            // Testando a conexão
            if (connection != null) {
                System.out.println("Status: Conectado!"); // Se a conexão for bem-sucedida, exibe "Conectado!"
            } else {
                System.out.println("Status: NÃO CONECTADO!"); // Se a conexão falhar, exibe "NÃO CONECTADO!"
            }
            
            return connection; // Retorna a conexão estabelecida
            
        } catch (ClassNotFoundException e) { // Exceção lançada se o driver JDBC não for encontrado
            System.out.println("O driver não foi encontrado."); // Exibe uma mensagem de erro
            e.printStackTrace(); // Imprime o rastreamento do erro
            return null; // Retorna nulo
        } catch (SQLException e) { // Exceção lançada se ocorrer um erro durante a conexão com o banco de dados
            System.out.println("Não foi possível conectar ao banco de dados."); // Exibe uma mensagem de erro
            e.printStackTrace(); // Imprime o rastreamento do erro
            return null; // Retorna nulo
        }
    } 
}
