-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: poudb
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.13-MariaDB

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
-- Table structure for table `pou`
--

DROP TABLE IF EXISTS `pou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pou` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dinero` int(11) DEFAULT NULL,
  `valorHambre` int(11) DEFAULT NULL,
  `valorSalud` int(11) DEFAULT NULL,
  `valorEnergia` int(11) DEFAULT NULL,
  `valorFelicidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pou`
--

LOCK TABLES `pou` WRITE;
/*!40000 ALTER TABLE `pou` DISABLE KEYS */;
INSERT INTO `pou` VALUES (1,382983,58,25,50,65);
/*!40000 ALTER TABLE `pou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `costo` int(11) DEFAULT NULL,
  `valorHambre` int(11) DEFAULT NULL,
  `valorSalud` int(11) DEFAULT NULL,
  `valorEnergia` int(11) DEFAULT NULL,
  `valorFelicidad` int(11) DEFAULT NULL,
  `seccion` enum('COCINA','CUARTO','LABORATORIO') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'hamburguesa',100,20,-5,-10,-5,'COCINA'),(2,'sushi',250,25,-10,-10,-5,'COCINA'),(3,'filete',300,30,-15,-15,5,'COCINA'),(4,'huevo',90,15,5,0,-10,'COCINA'),(5,'manzana',65,15,15,5,-10,'COCINA'),(6,'rosquilla',120,-15,-25,25,10,'COCINA'),(7,'pocionAmor',220,-15,-15,-10,15,'LABORATORIO'),(8,'pocionEnergia',280,-10,5,25,-20,'LABORATORIO'),(9,'pocionFelicidad',250,-10,-15,5,30,'LABORATORIO'),(10,'pocionesMixtas',500,15,15,15,-15,'LABORATORIO'),(11,'pocionSalud',300,5,30,-15,-15,'LABORATORIO'),(12,'superPocion',400,13,13,13,13,'LABORATORIO'),(13,'pou',0,-10,0,0,5,'CUARTO'),(14,'poubot',0,0,-10,0,15,'CUARTO'),(15,'pouespacial',0,0,0,-10,15,'CUARTO'),(16,'pougalactico',0,0,0,-15,20,'CUARTO'),(17,'pougotico',0,0,-15,0,20,'CUARTO'),(18,'pouvon',0,-15,0,0,25,'CUARTO');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registroInventario`
--

DROP TABLE IF EXISTS `registroInventario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registroInventario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idProducto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_producto_registroInventario_idx` (`idProducto`),
  CONSTRAINT `fk_producto_registroInventario` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registroInventario`
--

LOCK TABLES `registroInventario` WRITE;
/*!40000 ALTER TABLE `registroInventario` DISABLE KEYS */;
INSERT INTO `registroInventario` VALUES (1,1,98),(2,2,107),(3,3,93),(4,4,84),(5,5,98),(6,6,96),(7,7,95),(8,8,98),(9,9,97),(10,10,96),(11,11,98),(12,12,92),(13,13,1),(14,14,1),(15,15,1),(16,16,1),(17,17,1),(18,18,1);
/*!40000 ALTER TABLE `registroInventario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-30 19:33:20
