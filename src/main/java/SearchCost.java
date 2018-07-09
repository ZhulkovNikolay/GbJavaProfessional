import org.sqlite.JDBC;

import java.sql.*;

public class SearchCost {
    public void sql(String productTitle){
        Connection connection;
        final String DB_PATH = "C:\\sqlite\\products.db";
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(JDBC.PREFIX + DB_PATH);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM main.products WHERE products.title = ?");

            preparedStatement.setString(1, productTitle);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String title = resultSet.getString("title");
                int cost = resultSet.getInt("cost");
                System.out.println("\nцена выбранного товара: "+ title + " = " + cost);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
