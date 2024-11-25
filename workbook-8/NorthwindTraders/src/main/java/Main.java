import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql//localhost:3306/northwind",
                "root","P@ssw0rd");

        Statement statement = connection.createStatement();
        String query = "SELECT ProductName FROM products;";

        ResultSet result = statement.executeQuery(query);
        System.out.println(result);

        connection.close();



    }
}
