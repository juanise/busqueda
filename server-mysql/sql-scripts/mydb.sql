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

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

--
-- Table structure for table `aeropuerto`
--

DROP TABLE IF EXISTS `aeropuerto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aeropuerto` (
  `ident` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `elevation_ft` float NOT NULL,
  `continent` varchar(45) NOT NULL,
  `iso_country` varchar(45) NOT NULL,
  `iso_region` varchar(45) NOT NULL,
  `municipality` varchar(45) NOT NULL,
  `gps_code` varchar(45) NOT NULL,
  `iata_code` varchar(45) NOT NULL,
  `local_code` varchar(45) NOT NULL,
  `coordinates` varchar(45) NOT NULL,
  `elevacion_ft` float DEFAULT NULL,
  PRIMARY KEY (`ident`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aeropuerto`
--

LOCK TABLES `aeropuerto` WRITE;
/*!40000 ALTER TABLE `aeropuerto` DISABLE KEYS */;
INSERT INTO `aeropuerto` VALUES ('00A','heliport','Total Rf Heliport',11,'NA','US','US-PA','Bensalem','00A','None','00A','-74.93360137939453, 40.07080078125',NULL),('00A222 ',' Airport ',' Total Rf Heliport ',11,' NAS ',' USS ',' USS-PA ',' NEW_AIRPORT ','00A222 ',' null ','00A222 ','-74.93360137939453, 40.07080078125',NULL),('00AA','small_airport','Aero B Ranch Airport',3435,'NA','US','US-KS','Leoti','00AA','None','00AA','-101.473911, 38.704022',NULL),('00AK','small_airport','Lowell Field',450,'NA','US','US-AK','Anchor Point','00AK','None','00AK','-151.695999146, 59.94919968',NULL),('00AL','small_airport','Epps Airpark',820,'NA','US','US-AL','Harvest','00AL','None','00AL','-86.77030181884766, 34.86479949951172',NULL),('00AR','closed','Newport Hospital & Clinic Heliport',237,'NA','US','US-AR','Newport','None','None','None','-91.254898, 35.6087',NULL),('00AS','small_airport','Fulton Airport',1100,'NA','US','US-OK','Alex','00AS','None','00AS','-97.8180194, 34.9428028',NULL),('00AZ','small_airport','Cordes Airport',3810,'NA','US','US-AZ','Cordes','00AZ','None','00AZ','-112.16500091552734, 34.305599212646484',NULL),('00CA','small_airport','Goldstone /Gts/ Airport',3038,'NA','US','US-CA','Barstow','00CA','None','00CA','-116.888000488, 35.350498199499995',NULL),('00CL','small_airport','Williams Ag Airport',87,'NA','US','US-CA','Biggs','00CL','None','00CL','-121.763427, 39.427188',NULL),('00CN','heliport','Kitchen Creek Helibase Heliport',3350,'NA','US','US-CA','Pine Valley','00CN','None','00CN','-116.4597417, 32.7273736',NULL),('00CO','closed','Cass Field',4830,'NA','US','US-CO','Briggsdale','None','None','None','-104.344002, 40.622202',NULL),('00FA','small_airport','Grass Patch Airport',53,'NA','US','US-FL','Bushnell','00FA','None','00FA','-82.21900177001953, 28.64550018310547',NULL),('00FD','heliport','Ringhaver Heliport',25,'NA','US','US-FL','Riverview','00FD','None','00FD','-82.34539794921875, 28.846599578857422',NULL),('00FL','small_airport','River Oak Airport',35,'NA','US','US-FL','Okeechobee','00FL','None','00FL','-80.96920013427734, 27.230899810791016',NULL),('00GA','small_airport','Lt World Airport',700,'NA','US','US-GA','Lithonia','00GA','None','00GA','-84.06829833984375, 33.76750183105469',NULL),('00GE','heliport','Caffrey Heliport',957,'NA','US','US-GA','Hiram','00GE','None','00GE','-84.73390197753906, 33.88420104980469',NULL),('00HI','heliport','Kaupulehu Heliport',43,'NA','US','US-HI','Kailua/Kona','00HI','None','00HI','-155.980233, 19.832715',NULL),('00ID','small_airport','Delta Shores Airport',2064,'NA','US','US-ID','Clark Fork','00ID','None','00ID','-116.21399688720703, 48.145301818847656',NULL),('00IG','small_airport','Goltl Airport',3359,'NA','US','US-KS','McDonald','00IG','None','00IG','-101.395994, 39.724028',NULL),('00II','heliport','Bailey Generation Station Heliport',600,'NA','US','US-IN','Chesterton','00II','None','00II','-87.122802734375, 41.644500732421875',NULL),('00IL','small_airport','Hammer Airport',840,'NA','US','US-IL','Polo','00IL','None','00IL','-89.5604019165039, 41.97840118408203',NULL),('00IN','heliport','St Mary Medical Center Heliport',634,'NA','US','US-IN','Hobart','00IN','None','00IN','-87.2605972290039, 41.51139831542969',NULL),('00IS','small_airport','Hayenga\'s Cant Find Farms Airport',820,'NA','US','US-IL','Kings','00IS','None','00IS','-89.1229019165039, 40.02560043334961',NULL),('00KS','small_airport','Hayden Farm Airport',1100,'NA','US','US-KS','Gardner','00KS','None','00KS','-94.93049621582031, 38.72779846191406',NULL),('00KY','small_airport','Robbins Roost Airport',1265,'NA','US','US-KY','Stanford','00KY','None','00KY','-84.61969757080078, 37.409400939941406',NULL),('00LA','heliport','Shell Chemical East Site Heliport',15,'NA','US','US-LA','Gonzales','00LA','None','00LA','-90.980833, 30.191944',NULL),('00LL','heliport','Ac & R Components Heliport',600,'NA','US','US-IL','Chatham','00LL','None','00LL','-89.70559692382812, 39.66529846191406',NULL),('00LS','small_airport','Lejeune Airport',12,'NA','US','US-LA','Esterwood','00LS','None','00LS','-92.42939758300781, 30.13629913330078',NULL),('00MD','small_airport','Slater Field',45,'NA','US','US-MD','Federalsburg','00MD','None','00MD','-75.75379943847656, 38.75709915161133',NULL),('00MI','heliport','Dow Chemical Heliport',588,'NA','US','US-MI','Ludington','00MI','None','00MI','-86.41670227050781, 43.94940185546875',NULL),('00MN','small_airport','Battle Lake Municipal Airport',1365,'NA','US','US-MN','Battle Lake','00MN','None','00MN','-95.70030212402344, 46.29999923706055',NULL),('00MO','small_airport','Cooper Flying Service Airport',970,'NA','US','US-MO','Alba','00MO','None','00MO','-94.412399291992, 37.202800750732',NULL),('00MT','closed','Sands Ranch Airport',2600,'NA','US','US-MT','Havre','None','None','None','-109.705002, 48.537498',NULL),('00N','small_airport','Bucks Airport',105,'NA','US','US-NJ','Bridgeton','00N','None','00N','-75.1852035522461, 39.473201751708984',NULL),('00NC','small_airport','North Raleigh Airport',348,'NA','US','US-NC','Louisburg','00NC','None','00NC','-78.37139892578125, 36.085201263427734',NULL),('00NJ','heliport','Colgate-Piscataway Heliport',78,'NA','US','US-NJ','New Brunswick','00NJ','None','00NJ','-74.47460174560547, 40.52090072631836',NULL),('00NK','seaplane_base','Cliche Cove Seaplane Base',96,'NA','US','US-NY','Beekmantown','00NK','None','00NK','-73.3698057, 44.8118612',NULL),('00NY','small_airport','Weiss Airfield',1000,'NA','US','US-NY','West Bloomfield','00NY','None','00NY','-77.49970245361328, 42.90010070800781',NULL),('00OH','small_airport','Exit 3 Airport',785,'NA','US','US-OH','Wauseon','00OH','None','00OH','-84.14219665527344, 41.59090042114258',NULL),('00OI','heliport','Miami Valley Hospital Heliport',905,'NA','US','US-OH','Dayton','00OI','None','00OI','-84.1874008178711, 39.74530029296875',NULL),('00OK','small_airport','Gull Bay Landing Airport',960,'NA','US','US-OK','Sandsprings','00OK','None','00OK','-96.217693, 36.198598',NULL),('00OR','heliport','Steel Systems Heliport',195,'NA','US','US-OR','Salem','00OR','None','00OR','-123.12999725341797, 44.932899475097656',NULL),('00PA','heliport','R J D Heliport',402,'NA','US','US-PA','Coatesville','00PA','None','00PA','-75.74690246582031, 39.94889831542969',NULL),('00PN','small_airport','Ferrell Field',1301,'NA','US','US-PA','Mercer','00PN','None','00PN','-80.211111, 41.2995',NULL),('00PS','closed','Thomas Field',815,'NA','US','US-PA','Loysville','None','None','None','-77.365303, 40.3778',NULL),('00S','small_airport','Mc Kenzie Bridge State Airport',1620,'NA','US','US-OR','Mc Kenzie Bridge','00S','None','00S','-122.088996887, 44.183200836199994',NULL),('00SC','small_airport','Flying O Airport',150,'NA','US','US-SC','Sumter','00SC','None','00SC','-80.26719665527344, 34.0093994140625',NULL),('00SD','small_airport','Homan Field',1590,'NA','US','US-SD','Gary','00SD','None','00SD','-96.498897, 44.809158',NULL),('00TA','heliport','Sw Region Faa Heliport',598,'NA','US','US-TX','Fort Worth','00TA','None','00TA','-97.30580139160156, 32.826900482177734',NULL),('00TE','heliport','Tcjc-Northeast Campus Heliport',600,'NA','US','US-TX','Fort Worth','00TE','None','00TE','-97.18949890136719, 32.847599029541016',NULL),('00TN','small_airport','Ragsdale Road Airport',1100,'NA','US','US-TN','Manchester','00TN','None','00TN','-85.95359802246094, 35.515899658203125',NULL),('00TS','small_airport','Alpine Range Airport',670,'NA','US','US-TX','Everman','00TS','None','00TS','-97.24199676513672, 32.607601165771484',NULL),('00TX','closed','San Jacinto Methodist Hospital Heliport',19,'NA','US','US-TX','Baytown','None','None','None','-94.980201, 29.7377',NULL),('00UT','closed','Clear Creek Ranch Airport',6138,'NA','US','US-UT','Kanab','None','None','None','-112.821998, 37.247799',NULL),('00VA','small_airport','Vaughan Airport',551,'NA','US','US-VA','Alton','00VA','None','00VA','-78.9991684, 36.57600021',NULL),('00VI','small_airport','Groundhog Mountain Airport',2680,'NA','US','US-VA','Hillsville','00VI','None','00VI','-80.49949645996094, 36.663299560546875',NULL),('00W','small_airport','Lower Granite State Airport',719,'NA','US','US-WA','Colfax','00W','None','00W','-117.44300079346, 46.673500061035',NULL),('00WA','small_airport','Howell Airport',150,'NA','US','US-WA','Longbranch','00WA','None','00WA','-122.77200317382812, 47.17839813232422',NULL),('00WI','small_airport','Northern Lite Airport',860,'NA','US','US-WI','Waupaca','00WI','None','00WI','-89.05010223388672, 44.304298400878906',NULL),('00WN','small_airport','Hawks Run Airport',2900,'NA','US','US-WA','Asotin','00WN','None','00WN','-117.2490005493164, 46.25',NULL),('00WV','small_airport','Lazy J. Aerodrome',2060,'NA','US','US-WV','Beverly','00WV','None','00WV','-79.86609649658203, 38.82889938354492',NULL),('00WY','heliport','Mountain View Regional Hospital Heliport',5210,'NA','US','US-WY','Casper','00WY','None','00WY','-106.224443, 42.840361',NULL),('00XS','small_airport','L P Askew Farms Airport',3110,'NA','US','US-TX','O\'Donnell','00XS','None','00XS','-101.93399810791016, 33.03340148925781',NULL),('01A','small_airport','Purkeypile Airport',1950,'NA','US','US-AK','Purkeypile','01A','None','01A','-152.27000427246094, 62.943599700927734',NULL),('01AK','heliport','Providence Seward Medical Center Heliport',120,'NA','US','US-AK','Seward','01AK','None','01AK','-149.446249008, 60.105873975399994',NULL),('01AL','small_airport','Ware Island Airport',344,'NA','US','US-AL','Clanton','01AL','None','01AL','-86.51390075683594, 32.94599914550781',NULL),('01AR','heliport','Community Hospital of De Queen Heliport',400,'NA','US','US-AR','De Queen','01AR','None','01AR','-94.35489654541016, 34.047298431396484',NULL),('01AZ','heliport','Yat Heliport',3300,'NA','US','US-AZ','Camp Verde','01AZ','None','01AZ','-111.86499786376953, 34.60810089111328',NULL),('01C','closed','Grant Airport',815,'NA','US','US-MI','Grant','01C','None','01C','-85.775001525879, 43.341701507568',NULL),('01CA','heliport','Lugo Substation Heliport',3733,'NA','US','US-CA','Hesperia','01CA','None','01CA','-117.370058745, 34.368240591699994',NULL),('01CL','small_airport','Swansboro Country Airport',2594,'NA','US','US-CA','Placerville','01CL','None','01CL','-120.73400115966797, 38.79990005493164',NULL),('01CO','heliport','St Vincent General Hospital Heliport',10175,'NA','US','US-CO','Leadville','01CO','None','01CO','-106.24600219726562, 39.24530029296875',NULL),('01CT','heliport','Berlin Fairgrounds Heliport',60,'NA','US','US-CT','Berlin','01CT','None','01CT','-72.72750091552734, 41.62730026245117',NULL),('01FA','small_airport','Rybolt Ranch Airport',55,'NA','US','US-FL','Orlando','01FA','None','01FA','-81.14420318603516, 28.589399337768555',NULL),('01FD','heliport','Advent Health Altamonte Springs Heliport',86,'NA','US','US-FL','Altamonte Springs','01FD','None','01FD','-81.3697, 28.666639',NULL),('01FL','small_airport','Cedar Knoll Flying Ranch Airport',19,'NA','US','US-FL','Geneva','01FL','None','01FL','-81.1592025756836, 28.78190040588379',NULL),('01GA','heliport','Medical Center Heliport',319,'NA','US','US-GA','Columbus','01GA','None','01GA','-84.9791030883789, 32.47930145263672',NULL),('01GE','small_airport','The Farm Airport',375,'NA','US','US-GA','Wrightsville','01GE','None','01GE','-82.77110290527344, 32.674400329589844',NULL),('01IA','small_airport','Stender Airport',725,'NA','US','US-IA','Maysville','01IA','None','01IA','-90.74130249023438, 41.66109848022461',NULL),('01ID','small_airport','Lava Hot Springs Airport',5268,'NA','US','US-ID','Lava Hot Springs','01ID','None','01ID','-112.031998, 42.6082',NULL),('01II','small_airport','Myers Field',950,'NA','US','US-IN','Lizton','01II','None','01II','-86.50669860839844, 39.8849983215332',NULL),('01IN','heliport','Community Hospital Heliport',890,'NA','US','US-IN','Anderson','01IN','None','01IN','-85.69580078125, 40.13090133666992',NULL),('01IS','small_airport','William E. Koenig Airport',670,'NA','US','US-IL','Dow','01IS','None','01IS','-90.31819915771484, 39.01620101928711',NULL),('01J','small_airport','Hilliard Airpark',59,'NA','US','US-FL','Hilliard','01J','None','01J','-81.90570068359375, 30.68630027770996',NULL),('01K','small_airport','Caldwell Municipal Airport',1157,'NA','US','US-KS','Caldwell','01K','None','01K','-97.5864028930664, 37.03609848022461',NULL),('01KS','small_airport','Flying N Ranch Airport',1485,'NA','US','US-KS','Lost Springs','01KS','None','01KS','-97.00330352783203, 38.54059982299805',NULL),('01KY','heliport','Lourdes Hospital Heliport',419,'NA','US','US-KY','Paducah','01KY','None','01KY','-88.64689636230469, 37.051700592041016',NULL),('01LA','small_airport','Barham Airport',90,'NA','US','US-LA','Oak Ridge','01LA','None','01LA','-91.77369689941406, 32.638999938964844',NULL),('01LL','small_airport','Schumaier Restricted Landing Area',555,'NA','US','US-IL','Pinckneyville','01LL','None','01LL','-89.46389770507812, 38.12580108642578',NULL),('01LS','small_airport','Country Breeze Airport',125,'NA','US','US-LA','Slaughter','01LS','None','01LS','-91.07740020751953, 30.70599937438965',NULL),('01MA','heliport','Compaq Andover Heliport',140,'NA','US','US-MA','Andover','01MA','None','01MA','-71.18009948730469, 42.625099182128906',NULL);
/*!40000 ALTER TABLE `aeropuerto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agencia_de_viajes`
--

DROP TABLE IF EXISTS `agencia_de_viajes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agencia_de_viajes` (
  `idagencia` int(11) NOT NULL,
  `codigo_agencia` varchar(45) NOT NULL,
  PRIMARY KEY (`idagencia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agencia_de_viajes`
--

LOCK TABLES `agencia_de_viajes` WRITE;
/*!40000 ALTER TABLE `agencia_de_viajes` DISABLE KEYS */;
INSERT INTO `agencia_de_viajes` VALUES (1,'VAL001'),(2,'MAD002'),(3,'BAR003'),(4,'SEV004');
/*!40000 ALTER TABLE `agencia_de_viajes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avion`
--

DROP TABLE IF EXISTS `avion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `avion` (
  `idavion` int(11) NOT NULL,
  `max_capacidad_de_pasajeros` int(11) NOT NULL,
  `max_capacidad_de_pasajero` int(11) DEFAULT NULL,
  PRIMARY KEY (`idavion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avion`
--

LOCK TABLES `avion` WRITE;
/*!40000 ALTER TABLE `avion` DISABLE KEYS */;
INSERT INTO `avion` VALUES (10010,100,NULL),(10020,90,NULL),(10030,60,NULL),(10040,12,NULL);
/*!40000 ALTER TABLE `avion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasajero`
--

DROP TABLE IF EXISTS `pasajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pasajero` (
  `id_pasajero` int(11) NOT NULL,
  `dni_pasaporte` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido_paterno` varchar(45) NOT NULL,
  `apellido_materno` varchar(45) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_pasajero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasajero`
--

LOCK TABLES `pasajero` WRITE;
/*!40000 ALTER TABLE `pasajero` DISABLE KEYS */;
INSERT INTO `pasajero` VALUES (1234,'y5678j','ALBERTO','VILLARROEL','RIVERA',NULL),(1942,'y7784j','JAVIER','SEVILLA','SANCHO',NULL),(5678,'y1234j','WILMER','MOINA','RIVERA',NULL),(9123,'Y3219J','MANOLO','SANCHEZ','FLORES',NULL);
/*!40000 ALTER TABLE `pasajero` ENABLE KEYS */;
UNLOCK TABLES;

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
  `estado_vuelo` tinyint(4) NOT NULL DEFAULT '0',
  `fk_aeropuerto_origen` varchar(45) NOT NULL,
  `fk_aeropuerto_destino` varchar(45) NOT NULL,
  `fk_avion_idavion` int(11) NOT NULL,
  `tipo_de_vuelo` tinyint(1) NOT NULL,
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
INSERT INTO `vuelo` 
VALUES (1238,'2006-06-20','2006-06-20','123',50,1,'00A','00AA',10010,0),
(3456,'2009-06-20','2009-06-20','124',100,1,'00AA','00A',10010,0),
(8799,'2010-06-20','2010-06-20','126',80,1,'00A','00A',10010,0),
(9807,'2010-06-20','2010-06-20','125',100,1,'00A','00A',10010,0);
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

-- Dump completed on 2019-06-17 14:07:28
