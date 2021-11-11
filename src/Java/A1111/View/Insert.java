package Java.A1111.View;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        /** Conexão com banco de dados Postgres */
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "admin");

            /** Statement - executar query */
            Statement statement = connection.createStatement();
            String query = "INSERT INTO cidade(nome, id_estado) VALUES('Montes Claros', 1)";
            statement.execute(query, statement.RETURN_GENERATED_KEYS); // Retorna o id gerado
            /** GerenatedKeys - Pega os ID'S/chaves gerados no INSERT */
            ResultSet ids = statement.getGeneratedKeys();
            /**
             * Percorre enquanto houverem id's e pega o primeiro (último gerado). No banco,
             * os ids sempre começam em 1
             */
            while (ids.next()) {
                int id = ids.getInt(1);
                System.out.println(id);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
