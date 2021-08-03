import java.sql.*;
import java.lang.Class;

public class JdbcTest {
    // java data base connectivity
    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://@localhost:3306/world";
        String user = "root";
        String pass = "Csk03012@";

        try(Connection connection = DriverManager.getConnection(url, user, pass)) {
            try(Statement statement = connection.createStatement()){
                String sql = "select * from city limit 10";
                try(ResultSet result = statement.executeQuery(sql)){
                    while (result.next()){
                        String database = result.getString("Name");
                        System.out.println(database);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
