CREATE TABLE users (
    id INT NOT NULL PRIMARY KEY,
    login VARCHAR DEFAULT NULL,
    password VARCHAR DEFAULT NULL,
    firstname VARCHAR DEFAULT NULL,
    lastname VARCHAR DEFAULT NULL,
    email VARCHAR DEFAULT NULL,
    phone_nb VARCHAR DEFAULT NULL
);

INSERT INTO users (id, login, password, firstname, lastname, email, phone_nb)
VALUES
    (1, 'ianis', '123', 'ianis', 'joliet', 'ianis.joliet@gmail.com', '0700000000'),
    (2, 'admin', '123', 'admin', 'admin', 'admin@gmail.com', '0700000000');