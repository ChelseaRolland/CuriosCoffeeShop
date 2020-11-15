package daos;
import modals.User;

public interface Users {
    User findByUsername(String username);
    Long insert (User user);
}
