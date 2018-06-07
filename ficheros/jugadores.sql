-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2018 a las 10:24:31
-- Versión del servidor: 10.1.32-MariaDB
-- Versión de PHP: 5.6.36

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jugadores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugadores`
--

CREATE TABLE `jugadores` (
  `nif` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `altura` varchar(20) NOT NULL,
  `equipo` varchar(20) NOT NULL,
  `golesMarcados` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `jugadores`
--

INSERT INTO `jugadores` (`nif`, `nombre`, `fecha`, `altura`, `equipo`, `golesMarcados`) VALUES
('123F', 'BALE', '1998-08-15', '182', '0', '15'),
('124F', 'INIESTA', '1979-08-15', '183', '1', '7'),
('125F', 'BALE2', '1996-08-15', '182', '0', '1'),
('126F', 'JOAQUIN3', '1998-08-15', '182', '2', '5'),
('127F', 'INIESTA1', '1969-08-15', '183', '1', '3'),
('128F', 'BALE4', '1996-08-15', '182', '0', '5'),
('129F', 'INIESTA2', '1999-08-15', '183', '1', '0'),
('134F', 'JOAQUIN5', '1996-08-15', '182', '2', '2'),
('224F', 'INIESTA9', '1999-08-15', '183', '1', '2'),
('325F', 'BALE9', '1996-08-15', '182', '0', '1'),
('423F', 'BALE8', '1998-08-15', '182', '0', '5'),
('424F', 'JOAQUIN2', '1999-08-15', '183', '2', '0'),
('524F', 'INIESTA5', '1999-08-15', '183', '1', '4'),
('625F', 'JOAQUIN7', '1996-08-15', '182', '2', '6'),
('724F', 'INIESTA', '1999-08-15', '183', '1', '10'),
('825F', 'BALE2', '1996-08-15', '182', '0', '15'),
('923F', 'JOAQUIN3', '1998-08-15', '182', '2', '5');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `jugadores`
--
ALTER TABLE `jugadores`
  ADD PRIMARY KEY (`nif`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
