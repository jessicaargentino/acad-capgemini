import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTwo {
    public static void main(String[] args) {
        /** Conexão com banco de dados Postgres */
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "admin");

            /** Statement - executar query */
            Statement statement = connection.createStatement();
            statement.execute("SELECT * FROM cidade");
            /** ResultSet - guardar resultado da query */
            ResultSet result = statement.getResultSet();

            /**
             * Percorre os resultados, a cada entrada guarda o valor na variável e exibe na
             * tela
             */
            while (result.next()) {
                int id = result.getInt("id");
                String nome = result.getString("nome");
                int id_estado = result.getInt("id_estado");
                System.out.printf("ID: %d | Nome: %s | ID Estado: %d\n", id, nome, id_estado);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
