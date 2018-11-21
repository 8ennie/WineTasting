DROP TABLE wine_test_db.USER; 
DROP TABLE wine_test_db.STAND; 

CREATE TABLE USER (
    ID int NOT NULL AUTO_INCREMENT,
    USERNAME varchar(255),
    PW varchar(255),
    PRIMARY KEY (ID)
);

INSERT INTO USER (USERNAME, PW)
VALUES ("Satan", "666"), ("nrbn", "666"), ("a", "a"), ("asd", "123"), ("nrbn", "36"), ("bwmn", "");

CREATE TABLE STAND (
    ID int NOT NULL AUTO_INCREMENT,
    standName varchar(255),    
	standLocation varchar(255),
	standOwner varchar(255),
    
    PRIMARY KEY (ID)
);

INSERT INTO STAND(standName, standLocation, standOwner)
VALUES ("Gudulas Weine", 1, "Gudula"), ("Max Weine", 2 ,"Max");