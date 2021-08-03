package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EmployeeTableUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://@localhost:3306/Employee";
        String user = "root";
        String pass = "Csk03012@";

        try(Connection connection = DriverManager.getConnection(url, user, pass)) {
            try(Statement statement = connection.createStatement()){
                String sql1 = "CREATE TABLE Employee_Details" +
                        "(ID INTEGER NOT NULL, " +
                        "Name VARCHAR(255), " +
                        "Age INTEGER NOT NULL, " +
                        "Team VARCHAR(255), " +
                        "Discipline VARCHAR(255), " +
                        "Year INTEGER, " +
                        "PRIMARY KEY (ID))";

                statement.executeUpdate(sql1);

                List<Employee> list = EmployeeTable.table();
                for(int i=1; i<=list.size(); i++){
                    Employee employee = list.get(i-1);
                    String sql2 = "INSERT INTO Employee_Details VALUES" + employee.toString();
                    statement.executeUpdate(sql2);
                }
                System.out.println("Table Update Done");
            }



        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
