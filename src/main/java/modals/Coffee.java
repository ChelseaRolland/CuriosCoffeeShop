package modals;

public class Coffee {
    private long id;
    private long userId;
    private String roastType;
    private String name;
    private String countryOrigin;
    private String description;

    //Constructors

    //ANYTHING
    public Coffee (){}

    //INSERT
    public Coffee (long aUserId, String aRoastType, String aName, String aCountryOrigin, String aDescription) {
        this.userId = aUserId;
        this.roastType = aRoastType;
        this.name = aName;
        this.countryOrigin = aCountryOrigin;
        this.description = aDescription;
    }

    //SELECT
    public Coffee (long aId, long aUserId, String aRoastType, String aName, String aCountryOrigin, String aDescription) {
        this.id = aId;
        this.userId = aUserId;
        this.roastType = aRoastType;
        this.name = aName;
        this.countryOrigin = aCountryOrigin;
        this.description = aDescription;
    }

    //GETTERS & SETTERS

    public long getId() {
        return this.id;
    }

    public void setId(long aId) {
        this.id = aId;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long aUserId) {
        this.userId = aUserId;
    }

    public String getRoastType(){
        return this.roastType;
    }

    public void setRoastType(String aRoastType) {
        this.roastType = aRoastType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public String getCountryOrigin() {
        return this.countryOrigin;
    }

    public void setCountryOrigin(String aCountryOrigin) {
        this.countryOrigin = aCountryOrigin;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }
}
