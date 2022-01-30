import java.sql.*;

public class monDriver {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/madatabase","root","");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
            System.out.println("Insertion d'un nouveau user.");
            statement.executeUpdate("insert into users values('4','georges','hanna')");
            ResultSet res = statement.executeQuery("select * from users");
            while(res.next()){
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
