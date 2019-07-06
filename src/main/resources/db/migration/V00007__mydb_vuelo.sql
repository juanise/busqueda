-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `vuelo`
--

DROP TABLE IF EXISTS `vuelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vuelo` (
  `idvuelo` int(11) NOT NULL,
  `fecha_de_salida` date NOT NULL,
  `fecha_de_llegada` date NOT NULL,
  `tarjeta_embarque` varchar(45) NOT NULL,
  `tarifas` float NOT NULL COMMENT 'Cuando se cree un vuelo, se realizá un count de la tabla asientos para saber la capacidad\n\nSelect count (*) from asientos where avion_vuelo_idvuelo = avion_idavion',
  `estado_del_vuelo` tinyint(4) NOT NULL DEFAULT '0',
  `fk_aeropuerto_origen` varchar(45) NOT NULL,
  `fk_aeropuerto_destino` varchar(45) NOT NULL,
  `fk_avion_idavion` int(11) NOT NULL,
  `tipo_de_vuelo` tinyint(1) NOT NULL,
  `tarjeta_de_embarque` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idvuelo`),
  KEY `fk_vuelo_aeropuerto1_idx` (`fk_aeropuerto_origen`),
  KEY `fk_vuelo_aeropuerto2_idx` (`fk_aeropuerto_destino`),
  KEY `fk_vuelo_avion1_idx` (`fk_avion_idavion`),
  CONSTRAINT `fk_vuelo_aeropuerto1` FOREIGN KEY (`fk_aeropuerto_origen`) REFERENCES `aeropuerto` (`ident`),
  CONSTRAINT `fk_vuelo_aeropuerto2` FOREIGN KEY (`fk_aeropuerto_destino`) REFERENCES `aeropuerto` (`ident`),
  CONSTRAINT `fk_vuelo_avion1` FOREIGN KEY (`fk_avion_idavion`) REFERENCES `avion` (`idavion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo`
--

LOCK TABLES `vuelo` WRITE;
/*!40000 ALTER TABLE `vuelo` DISABLE KEYS */;
INSERT INTO `vuelo` VALUES (1238,'2006-06-20','2006-06-20','123',50,1,'00A','00AA',10010,0,NULL),(3456,'2009-06-20','2009-06-20','124',100,1,'00AA','00A',10010,0,NULL),(8799,'2010-06-20','2010-06-20','126',80,1,'00A','00A',10010,0,NULL),(9807,'2010-06-20','2010-06-20','125',100,1,'00A','00A',10010,0,NULL);
/*!40000 ALTER TABLE `vuelo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-06 17:31:27
