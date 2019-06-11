import org.sqlite.JDBC;

import java.sql.*;

public class ChangePrice {
    public void sql(String productTitle, String newCost){
        Connection connection;
        final String DB_PATH = "C:\\sqlite\\products.db";
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(JDBC.PREFIX + DB_PATH);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE main.products SET cost = ? WHERE title = ?");
            preparedStatement.setInt(1, Integer.parseInt(newCost));
            preparedStatement.setString(2, productTitle);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

//             ResultSet resultSet = statement.executeQuery("SELECT  * FROM main.products");
//            while (resultSet.next()) {
//                int title = resultSet.findColumn("title");
//                String string = resultSet.getString(title);
//                System.out.println("Name: " + string);
//            }

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT  * FROM main.products");
            while (resultSet.next()) {
                int cost = resultSet.findColumn("cost");
                int value = resultSet.getInt(cost);
                System.out.println("Cost: " + value);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
