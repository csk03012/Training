package JDBC;
import java.sql.*;

public class ReadEmployee {
    public static void main(String[] args) {
        String url = "jdbc:mysql://@localhost:3306/Employee";
        String user = "root";
        String pass = "Csk03012@";
        try(Connection connection = DriverManager.getConnection(url, user, pass)) {
            try(Statement statement = connection.createStatement()){
                String sql = "SELECT * FROM Employee_Details ORDER BY Age";
                try(ResultSet result = statement.executeQuery(sql)) {
                    while (result.next()){
                        int id = result.getInt(1);
                        String name = result.getString(2);
                        int age = result.getInt(3);
                        String team = result.getString(4);
                        String discipline = result.getString(5);
                        int year = result.getInt(6);

                        Employee employee = new Employee(id, name, age, team, discipline, year);
                        System.out.println(employee.toString());
                    }
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
