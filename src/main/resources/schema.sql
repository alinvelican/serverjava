


DROP TABLE IF EXISTS zboruri;

CREATE TABLE zboruri (
                             zbor_id        INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
                             sursa                   VARCHAR(255) NOT NULL,
                             destinatie           VARCHAR(255) NOT NULL,
                             ora_plecare          INT  NOT NULL,
                             ziua_plecare          INT   NOT NULL,
                             durata                 INT NOT NULL ,
                             loc_disp               INT NOT NULL );




INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (1, 'Bucuresti', 'Timisoara', 12, 22,3,5);



INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (2, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (3, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (4, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (5, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (6, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (7, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (8, 'Bucuresti', 'Timisoara', 12, 22,3,5);
INSERT INTO zboruri ( zbor_id,sursa, destinatie, ora_plecare, ziua_plecare,durata,loc_disp)
VALUES (9, 'Bucuresti', 'Timisoara', 12, 22,3,5);
