package Java.A1111.View;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOne {
    public static void main(String[] args) {
        /** Conexão com banco de dados Postgres */
        try {
            String driverType = "jdbc";
            String driverName = "postgresql";
            String host = "localhost";
            int port = 5432;
            String database = "postgres";
            String user = "postgres";
            String password = "admin";

            String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);
            Connection connection = DriverManager.getConnection(connectionString, user, password);

            /** Statement - executar query */
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM cidade";
            statement.execute(query);
            /** ResultSet - guardar resultado da query */
            ResultSet result = statement.getResultSet();

            /**
             * Percorre os resultados, a cada entrada guarda o valor nas variáveis e exibe
             * na tela
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