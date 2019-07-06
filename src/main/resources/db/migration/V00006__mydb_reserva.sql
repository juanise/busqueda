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
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `id_tarjeta_embarque` int(11) NOT NULL,
  `fecha_de_reserva` date NOT NULL,
  `embarque_prioritario` tinyint(4) NOT NULL,
  `factura_de_equipaje` tinyint(4) NOT NULL,
  `numero_asiento` varchar(45) NOT NULL,
  `estado_reserva` enum('pendiente','cancelado','confirmada') NOT NULL DEFAULT 'pendiente',
  `costo_total_reserva` int(11) NOT NULL,
  `fk_pasajero_id_pasajero` int(11) NOT NULL,
  `fk_idvuelo_ida` int(11) NOT NULL,
  `fk_idvuelo_vuelta` int(11) NOT NULL,
  `fk_idagencia` int(11) NOT NULL,
  PRIMARY KEY (`id_tarjeta_embarque`),
  KEY `fk_reserva_pasajero1_idx` (`fk_pasajero_id_pasajero`),
  KEY `fk_reserva_vuelo1_idx` (`fk_idvuelo_ida`),
  KEY `fk_reserva_vuelo2_idx` (`fk_idvuelo_vuelta`),
  KEY `fk_reserva_agencia_de_viajes1_idx` (`fk_idagencia`),
  CONSTRAINT `fk_reserva_agencia_de_viajes1` FOREIGN KEY (`fk_idagencia`) REFERENCES `agencia_de_viajes` (`idagencia`),
  CONSTRAINT `fk_reserva_pasajero1` FOREIGN KEY (`fk_pasajero_id_pasajero`) REFERENCES `pasajero` (`id_pasajero`),
  CONSTRAINT `fk_reserva_vuelo1` FOREIGN KEY (`fk_idvuelo_ida`) REFERENCES `vuelo` (`idvuelo`),
  CONSTRAINT `fk_reserva_vuelo2` FOREIGN KEY (`fk_idvuelo_vuelta`) REFERENCES `vuelo` (`idvuelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (12345,'2019-06-04',1,1,'6C','cancelado',2000,1234,8799,8799,1);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
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
