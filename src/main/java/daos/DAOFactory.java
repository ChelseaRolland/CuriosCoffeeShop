package daos;

import connectors.Config;
import modals.Coffee;

public class DAOFactory {
    private static Coffees coffeesDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Coffees getCoffeesDao() {
        if (coffeesDao == null) {
            coffeesDao = new MySQLCoffeesDao(config);
        }
        return coffeesDao;
    }

    public static Users getUsersDao(){
        if (usersDao == null) {
            usersDao = (Users) new MySQLUsersDao(config);
        }
        return usersDao;
    }
}
