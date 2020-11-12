USE coffeeShop_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS coffees;

# TRUNCATE coffees;
# TRUNCATE users;

CREATE TABLE IF NOT EXISTS users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS coffees (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    roast_type VARCHAR(200) NOT NULL,
    name VARCHAR(250) NOT NULL,
    country_origin VARCHAR(200) NOT NULL DEFAULT 'N/A',
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);

