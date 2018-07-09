import org.sqlite.JDBC;

import java.sql.*;

public class SqliteFiller {
    private final String DB_PATH = "C:\\sqlite\\products.db";
    public void sql(){
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(JDBC.PREFIX + DB_PATH);
            Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM main.products");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO main.products (id, prodid, title, cost) VALUES (?,?,?,?)");
            for (int i = 1; i <= 10; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setInt(2, i);
                preparedStatement.setString(3, "товар" + Integer.toString(i));
                preparedStatement.setInt(4, i * 10);
                preparedStatement.addBatch();
                preparedStatement.executeBatch();
            }

            ResultSet resultSet = statement.executeQuery("SELECT  * FROM main.products");
            while (resultSet.next()) {
                int title = resultSet.findColumn("title");
                String string = resultSet.getString(title);
                System.out.println("Name: " + string);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
