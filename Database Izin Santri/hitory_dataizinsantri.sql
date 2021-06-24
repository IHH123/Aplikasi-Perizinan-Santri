-- MariaDB dump 10.17  Distrib 10.4.11-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: izinsantri
-- ------------------------------------------------------
-- Server version	10.4.11-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminlogin` (
  `No` int(225) NOT NULL AUTO_INCREMENT,
  `Nama` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Hak_Akses` varchar(100) NOT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` VALUES (1,'Priambodo Hadi','123Pri','test12','admin'),(2,'Joko Mulyono','JokoGan13','Joko134','admin'),(3,'Mirna Muthia','SiMirna13','Mirna12','super admin'),(4,'Teuku Umar','Teu1338ti','Teuku3009','super admin');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history`
--

DROP TABLE IF EXISTS `history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `history` (
  `Nama` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Waktu` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  PRIMARY KEY (`Nama`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history`
--

LOCK TABLES `history` WRITE;
/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` VALUES ('Izzuddin Hanan','2020-12-08','2020-12-08 00:42:48');
/*!40000 ALTER TABLE `history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history_dataizinsantri`
--

DROP TABLE IF EXISTS `history_dataizinsantri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `history_dataizinsantri` (
  `Nama akun` varchar(100) NOT NULL,
  `NIS` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Tanggal izin` varchar(100) NOT NULL,
  `Alasan izin` varchar(100) NOT NULL,
  `Batas tanggal izin` varchar(100) NOT NULL,
  `Tanggal kepulangan` varchar(100) NOT NULL,
  PRIMARY KEY (`NIS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history_dataizinsantri`
--

LOCK TABLES `history_dataizinsantri` WRITE;
/*!40000 ALTER TABLE `history_dataizinsantri` DISABLE KEYS */;
INSERT INTO `history_dataizinsantri` VALUES ('Mirna Muthia','01234','Raisha Khalisha','25/11/2020','Sakit','26/11/2020','26/11/2020'),('Priambodo Hadi','03212','Tsamarah Insyirah','23/01/2020','Izin sakit','24/11/2020','30/12/2020');
/*!40000 ALTER TABLE `history_dataizinsantri` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabel_dataizinsantri`
--

DROP TABLE IF EXISTS `tabel_dataizinsantri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabel_dataizinsantri` (
  `Akun login` varchar(100) NOT NULL,
  `NIS` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Tanggal izin` varchar(100) NOT NULL,
  `Alasan izin` varchar(100) NOT NULL,
  `Batas tanggal izin` varchar(100) NOT NULL,
  PRIMARY KEY (`NIS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabel_dataizinsantri`
--

LOCK TABLES `tabel_dataizinsantri` WRITE;
/*!40000 ALTER TABLE `tabel_dataizinsantri` DISABLE KEYS */;
INSERT INTO `tabel_dataizinsantri` VALUES ('Mirna Muthia','0020020','Yuda','23/12/2020','Sakit','25/12/2020'),('Priambodo Hadi','0233','Alisa','20/12/2020','Sakit','19/12/2020'),('Mirna Muthia','02341','Izzuddin Hanan ','27/11/2020','Menengok orang tua di rumah','23/11/2020'),('Mirna Muthia','089878','Miftahul Falah','21/11/2020','Izin keluar','22/11/2020'),('Mirna Muthia','08988989','Izzuddin Hanan','23/11/2020','Izin sakit','24/11/2020'),('Mirna Muthia','239098','Muhammad Afdhal','23/11/2020','Izin acara keluarga','25/11/2020');
/*!40000 ALTER TABLE `tabel_dataizinsantri` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-23  9:28:54
