package daos;

import com.mysql.cj.jdbc.Driver;
import connectors.Config;
import modals.Coffee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class MySQLCoffeesDao implements Coffees{
    private Connection connection = null;

    public MySQLCoffeesDao (Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }






    @Override
    List<Coffee> all(){
        List<Coffee> allcoffees;
        return allcoffees;
    };

    @Override
    Long insert (Coffee coffee){
        return 0L;
    };
}
