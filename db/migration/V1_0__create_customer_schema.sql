CREATE TABLE IF NOT EXISTS `customer` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `firstname` varchar(20),
    `lastname` varchar(20),
    `expone` varchar(255),
    `exptwo` varchar(255),
    `expthree` varchar(255)
    )

    INSERT INTO 'customer' (firstname, lastname, expone, exptwo, expthree)
                       VALUES ('vincent', 'jétorisque', 'Ma première expérience', 'Ma deuxième expérience', 'Ma troisième expérience')