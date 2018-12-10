
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marcos.Barros
 */
public class conexao{
    
    private Connection connection = null;

    public conexao() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        String databaseURL = "jdbc:postgresql://localhost/simulator";
        String usuario = "postgres";
        String senha = "2415";
        String driverName = "org.postgresql.Driver";
        //Carrega o driver        
        Class.forName(driverName).newInstance();
        //Conecta o BD
        connection = DriverManager.getConnection(databaseURL, usuario, senha);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
