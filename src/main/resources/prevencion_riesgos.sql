CREATE DATABASE  IF NOT EXISTS `prevencion_riesgos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `prevencion_riesgos`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: vps-3491589-x.dattaweb.com    Database: prevencion_riesgos
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.04.4

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Accidentes`
--

DROP TABLE IF EXISTS `Accidentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Accidentes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int DEFAULT NULL,
  `fecha_accidente` date DEFAULT NULL,
  `detalle` text,
  PRIMARY KEY (`id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `Accidentes_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `Usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accidentes`
--

LOCK TABLES `Accidentes` WRITE;
/*!40000 ALTER TABLE `Accidentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `Accidentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Administrativos`
--

DROP TABLE IF EXISTS `Administrativos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Administrativos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `area` varchar(15) NOT NULL,
  `experiencia_previa` varchar(45) DEFAULT NULL,
  `username` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `administrativos_clientes_fk_idx` (`username`),
  CONSTRAINT `Administrativos_Usuarios_nombreUsuario_fk` FOREIGN KEY (`username`) REFERENCES `Usuarios` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Administrativos`
--

LOCK TABLES `Administrativos` WRITE;
/*!40000 ALTER TABLE `Administrativos` DISABLE KEYS */;
INSERT INTO `Administrativos` VALUES (1,'Superusuario','0',NULL),(2,'Aseo','6 meses','joeohe');
/*!40000 ALTER TABLE `Administrativos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Asesorias`
--

DROP TABLE IF EXISTS `Asesorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Asesorias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `detalle` text,
  `profesional_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `profesional_id` (`profesional_id`),
  CONSTRAINT `Asesorias_ibfk_1` FOREIGN KEY (`profesional_id`) REFERENCES `Usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Asesorias`
--

LOCK TABLES `Asesorias` WRITE;
/*!40000 ALTER TABLE `Asesorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `Asesorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Asistentes`
--

DROP TABLE IF EXISTS `Asistentes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Asistentes` (
  `capacitacion_id` int NOT NULL,
  `usuario_id` int NOT NULL,
  PRIMARY KEY (`capacitacion_id`,`usuario_id`),
  KEY `usuario_id` (`usuario_id`),
  CONSTRAINT `Asistentes_ibfk_1` FOREIGN KEY (`capacitacion_id`) REFERENCES `Capacitaciones` (`id`),
  CONSTRAINT `Asistentes_ibfk_2` FOREIGN KEY (`usuario_id`) REFERENCES `Usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Asistentes`
--

LOCK TABLES `Asistentes` WRITE;
/*!40000 ALTER TABLE `Asistentes` DISABLE KEYS */;
/*!40000 ALTER TABLE `Asistentes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Capacitaciones`
--

DROP TABLE IF EXISTS `Capacitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Capacitaciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `detalle` text,
  `rut_cliente` varchar(12) NOT NULL,
  `dia_semana` varchar(9) NOT NULL,
  `hora` varchar(5) NOT NULL,
  `lugar` varchar(45) NOT NULL,
  `duracion` varchar(5) NOT NULL,
  `cant_asistentes` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Capacitaciones`
--

LOCK TABLES `Capacitaciones` WRITE;
/*!40000 ALTER TABLE `Capacitaciones` DISABLE KEYS */;
INSERT INTO `Capacitaciones` VALUES (1,'Cazador de reptilianos','dos de talles','85.369.124-8','Lunes','19:00','Hotel Che ratón','15:00',700),(2,'Cazador','','12455550','Miercoles','09:00','Hotel Marina','74:00',21),(3,'PHP','PHP 2','16.248.925-9','Jueves','08:00','Santiago','01:00',5);
/*!40000 ALTER TABLE `Capacitaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Chequeos`
--

DROP TABLE IF EXISTS `Chequeos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Chequeos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `visita_id` int DEFAULT NULL,
  `detalle` text,
  `estado` enum('Pendiente','Completado') DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `visita_id` (`visita_id`),
  CONSTRAINT `Chequeos_ibfk_1` FOREIGN KEY (`visita_id`) REFERENCES `Visitas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Chequeos`
--

LOCK TABLES `Chequeos` WRITE;
/*!40000 ALTER TABLE `Chequeos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Chequeos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Clientes`
--

DROP TABLE IF EXISTS `Clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Clientes` (
  `IdCliente` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `rut` varchar(12) NOT NULL,
  `edad` int DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `comuna` varchar(45) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `afp` varchar(45) DEFAULT NULL,
  `salud` int DEFAULT NULL,
  PRIMARY KEY (`IdCliente`),
  UNIQUE KEY `RUT_UNIQUE` (`rut`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  KEY `Clientes_usuarios_fk_idx` (`username`),
  CONSTRAINT `Usuarios_Clientes_fk` FOREIGN KEY (`username`) REFERENCES `Usuarios` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clientes`
--

LOCK TABLES `Clientes` WRITE;
/*!40000 ALTER TABLE `Clientes` DISABLE KEYS */;
INSERT INTO `Clientes` VALUES (1,'danymun','15487797-4',35,'Daniela Andrea','Muñoz Roa','Muñoz Roa','Talca','856544433','Habitat',2),(2,'jdlh','19.410.191-7',27,'Joaquin','De la Huerta','calle siempreviva','Springfield','987654321','pobreza',2);
/*!40000 ALTER TABLE `Clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Pagos`
--

DROP TABLE IF EXISTS `Pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Pagos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int DEFAULT NULL,
  `monto` decimal(10,2) DEFAULT NULL,
  `fecha_pago` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_id` (`cliente_id`),
  CONSTRAINT `Pagos_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `Usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Pagos`
--

LOCK TABLES `Pagos` WRITE;
/*!40000 ALTER TABLE `Pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Pagos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Profesionales`
--

DROP TABLE IF EXISTS `Profesionales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Profesionales` (
  `idProfesionales` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(45) DEFAULT NULL,
  `fecha_ingreso` date DEFAULT NULL,
  `username` varchar(100) NOT NULL,
  PRIMARY KEY (`idProfesionales`),
  KEY `Profesionales_Usuarios_fk_idx` (`username`),
  CONSTRAINT `Profesionales_Usuarios_fk` FOREIGN KEY (`username`) REFERENCES `Usuarios` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Profesionales`
--

LOCK TABLES `Profesionales` WRITE;
/*!40000 ALTER TABLE `Profesionales` DISABLE KEYS */;
INSERT INTO `Profesionales` VALUES (1,'Prevencionista','2022-02-02','juenete'),(2,'wick','2023-07-26','jwick');
/*!40000 ALTER TABLE `Profesionales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `tipo` enum('Cliente','Administrativo','Profesional') NOT NULL,
  `nombreUsuario` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`,`nombreUsuario`),
  UNIQUE KEY `nombreUsuario_UNIQUE` (`nombreUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
INSERT INTO `Usuarios` VALUES (1,'Administraidor','Administrativo','admin','1234'),(2,'Juan Perez','Profesional','juanito','12345'),(3,'Juanin Pereira','Profesional','juenete','123456'),(4,'Daniela Muñoz','Cliente','danymun','123456'),(6,'Joel Hernandez','Administrativo','joeohe','123456'),(7,'Joaquin','Cliente','jdlh','1234567'),(8,'john','Profesional','jwick','54321');
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Visitas`
--

DROP TABLE IF EXISTS `Visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Visitas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cliente_id` int DEFAULT NULL,
  `fecha_visita` date DEFAULT NULL,
  `detalle` text,
  `profesional_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cliente_id` (`cliente_id`),
  KEY `profesional_id` (`profesional_id`),
  CONSTRAINT `Visitas_ibfk_1` FOREIGN KEY (`cliente_id`) REFERENCES `Usuarios` (`id`),
  CONSTRAINT `Visitas_ibfk_2` FOREIGN KEY (`profesional_id`) REFERENCES `Usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Visitas`
--

LOCK TABLES `Visitas` WRITE;
/*!40000 ALTER TABLE `Visitas` DISABLE KEYS */;
/*!40000 ALTER TABLE `Visitas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'prevencion_riesgos'
--

--
-- Dumping routines for database 'prevencion_riesgos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-26 22:23:49
