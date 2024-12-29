/*
SQLyog Community v13.3.0 (64 bit)
MySQL - 10.4.32-MariaDB : Database - studentsko_odmaraliste
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`studentsko_odmaraliste` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `studentsko_odmaraliste`;

/*Table structure for table `rezervacija` */

DROP TABLE IF EXISTS `rezervacija`;

CREATE TABLE `rezervacija` (
  `idRezervacija` bigint(20) NOT NULL AUTO_INCREMENT,
  `popust` double NOT NULL,
  `cenaNakonPopusta` bigint(20) NOT NULL,
  `ukupanIznos` double NOT NULL,
  `napomenaStudenta` varchar(50) NOT NULL,
  `idSluzbenik` bigint(20) DEFAULT NULL,
  `idStudent` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idRezervacija`),
  KEY `idSluzbenik` (`idSluzbenik`),
  KEY `idStudent` (`idStudent`),
  CONSTRAINT `rezervacija_ibfk_1` FOREIGN KEY (`idSluzbenik`) REFERENCES `sluzbenik` (`idSluzbenik`),
  CONSTRAINT `rezervacija_ibfk_2` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idStudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `rezervacija` */

/*Table structure for table `sluzbenik` */

DROP TABLE IF EXISTS `sluzbenik`;

CREATE TABLE `sluzbenik` (
  `idSluzbenik` bigint(20) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) NOT NULL,
  `prezime` varchar(50) NOT NULL,
  `korisnickoIme` varchar(50) NOT NULL,
  `lozinka` varchar(100) NOT NULL,
  PRIMARY KEY (`idSluzbenik`),
  UNIQUE KEY `korisnickoIme` (`korisnickoIme`),
  CONSTRAINT `sluzbenik_ibfk_1` FOREIGN KEY (`idSluzbenik`) REFERENCES `rezervacija` (`idRezervacija`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `sluzbenik` */

/*Table structure for table `sluzbeniksmena` */

DROP TABLE IF EXISTS `sluzbeniksmena`;

CREATE TABLE `sluzbeniksmena` (
  `idSluzbenik` bigint(20) NOT NULL AUTO_INCREMENT,
  `idSmena` bigint(20) NOT NULL,
  `datumSmene` date NOT NULL,
  PRIMARY KEY (`idSluzbenik`,`idSmena`,`datumSmene`),
  KEY `sluzbeniksmena_ibfk_2` (`idSmena`),
  CONSTRAINT `sluzbeniksmena_ibfk_1` FOREIGN KEY (`idSluzbenik`) REFERENCES `sluzbenik` (`idSluzbenik`),
  CONSTRAINT `sluzbeniksmena_ibfk_2` FOREIGN KEY (`idSmena`) REFERENCES `smena` (`idSmena`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `sluzbeniksmena` */

/*Table structure for table `smena` */

DROP TABLE IF EXISTS `smena`;

CREATE TABLE `smena` (
  `idSmena` bigint(20) NOT NULL AUTO_INCREMENT,
  `prostorija` varchar(50) NOT NULL,
  `komentar` varchar(200) NOT NULL,
  PRIMARY KEY (`idSmena`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `smena` */

/*Table structure for table `soba` */

DROP TABLE IF EXISTS `soba`;

CREATE TABLE `soba` (
  `idSoba` bigint(20) NOT NULL AUTO_INCREMENT,
  `tipSobe` int(11) NOT NULL,
  `sprat` int(20) NOT NULL,
  `cena` double NOT NULL,
  PRIMARY KEY (`idSoba`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `soba` */

/*Table structure for table `status` */

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
  `idStatus` bigint(20) NOT NULL AUTO_INCREMENT,
  `godinaStudija` bigint(20) DEFAULT NULL,
  `budzet` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idStatus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `status` */

/*Table structure for table `stavkarezervacije` */

DROP TABLE IF EXISTS `stavkarezervacije`;

CREATE TABLE `stavkarezervacije` (
  `idRezervacije` bigint(20) NOT NULL,
  `rb` bigint(20) NOT NULL,
  `nazivLokacije` varchar(100) NOT NULL,
  `datumVazenjaOd` date NOT NULL,
  `datumVazenjaDo` date NOT NULL,
  `cena` double NOT NULL,
  `iznos` double NOT NULL,
  `idSoba` bigint(20) NOT NULL,
  PRIMARY KEY (`idRezervacije`,`rb`),
  KEY `idSoba` (`idSoba`),
  CONSTRAINT `stavkarezervacije_ibfk_1` FOREIGN KEY (`idRezervacije`) REFERENCES `rezervacija` (`idRezervacija`) ON DELETE CASCADE,
  CONSTRAINT `stavkarezervacije_ibfk_2` FOREIGN KEY (`idSoba`) REFERENCES `soba` (`idSoba`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `stavkarezervacije` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `idStudent` bigint(20) NOT NULL AUTO_INCREMENT,
  `ime` varchar(50) NOT NULL,
  `prezime` varchar(50) NOT NULL,
  `brTelefona` bigint(20) NOT NULL,
  `fakultet` varchar(50) NOT NULL,
  `idStatus` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idStudent`),
  KEY `idStatus` (`idStatus`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`idStatus`) REFERENCES `status` (`idStatus`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `student` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
