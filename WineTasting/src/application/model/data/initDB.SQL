DROP TABLE wine_test_db.USER; 

CREATE TABLE USER (
    ID int NOT NULL AUTO_INCREMENT,
    USERNAME varchar(255),
    PW varchar(255),
    PRIMARY KEY (ID)
);

INSERT INTO USER (USERNAME, PW)
VALUES ("Satan", "666"), ("nrbn", "666"), ("a", "a"), ("asd", "123"), ("nrbn", "36"), ("bwmn", "");