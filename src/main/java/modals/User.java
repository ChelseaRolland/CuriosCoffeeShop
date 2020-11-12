package modals;

import org.mindrot.jbcrypt.BCrypt;
import util.Password;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;

    //Constructors

    //ANYTHING
    public User() {}

    //SELECT
    public User(long aId, String aUsername, String aEmail, String aPassword) {
        this.id = aId;
        this.username = aUsername;
        this.email = aEmail;
        this.password = aPassword;
    }

    //INSERT
    public User (String aUsername, String aEmail, String aPassword) {
        this.username = aUsername;
        this.email = aEmail;
        this.setPassword(aPassword);
    }

    //Getters & Setters

    public long getId() {
        return this.id;
    }

    public void setId(long aId) {
        this.id = aId;
    }

    public String getUsername (){
        return this.username;
    }

    public void setUsername (String aUsername) {
        this.username = aUsername;
    }

    public String getEmail () {
        return this.email;
    }

    public void setEmail(String aEmail) {
        this.email = aEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String aPassword){
        this.password = Password.hash(aPassword);
    }
}
