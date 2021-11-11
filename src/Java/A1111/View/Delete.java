package Java.A1111.View;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        /** Conexão com banco de dados Postgres */
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "admin");

            /** Statement - executar query */
            Statement statement = connection.createStatement();
            String query = "DELETE FROM cidade WHERE id = 1";
            statement.execute(query);
            /** UpdateCount - retorna a quantidade de linhas afetadas no UPDATE */
            int linesAffecteds = statement.getUpdateCount();
            System.out.println(linesAffecteds);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
