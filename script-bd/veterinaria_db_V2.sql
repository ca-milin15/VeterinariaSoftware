-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-03-2020 a las 04:38:27
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria_db`
--
CREATE DATABASE IF NOT EXISTS `veterinaria_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `veterinaria_db`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carnet`
--

CREATE TABLE `carnet` (
  `id` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `id` int(11) NOT NULL,
  `servicioId` int(11) NOT NULL,
  `mascotaId` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecarnet`
--

CREATE TABLE `detallecarnet` (
  `id` int(11) NOT NULL,
  `carnetId` int(11) NOT NULL,
  `productoId` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalledisponibilidad`
--

CREATE TABLE `detalledisponibilidad` (
  `id` int(11) NOT NULL,
  `disponibilidadId` int(11) NOT NULL,
  `horaInicio` datetime NOT NULL,
  `horaFinal` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `disponibilidad`
--

CREATE TABLE `disponibilidad` (
  `id` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `recursoVeterinariaId` int(11) NOT NULL,
  `servicioId` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historiaclinica`
--

CREATE TABLE `historiaclinica` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `historia` varchar(500) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

CREATE TABLE `mascota` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `usuarioId` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `historiaClinicaId` int(11) NOT NULL,
  `razaId` int(11) NOT NULL,
  `carnetId` int(11) NOT NULL,
  `tipoMascotaId` int(11) NOT NULL,
  `peso` float NOT NULL,
  `altura` float NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombreProducto` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `raza`
--

CREATE TABLE `raza` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recursoveterinaria`
--

CREATE TABLE `recursoveterinaria` (
  `id` int(11) NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `usuarioId` int(11) DEFAULT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recursoveterinariaasignado`
--

CREATE TABLE `recursoveterinariaasignado` (
  `id` int(11) NOT NULL,
  `servicioId` int(11) NOT NULL,
  `recursoVeterinariaId` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `tipoServicio` int(11) NOT NULL,
  `tarifaId` int(11) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarifa`
--

CREATE TABLE `tarifa` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `valor` float NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipomascota`
--

CREATE TABLE `tipomascota` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipomascota`
--

INSERT INTO `tipomascota` (`id`, `nombre`, `fechaCreacion`, `fechaActualizacion`, `usuarioCreacionId`) VALUES
(1, 'Canino', '2020-03-05 00:00:00', '2020-03-05 00:00:00', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiposervicio`
--

CREATE TABLE `tiposervicio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaActualizacion` datetime NOT NULL,
  `usuarioCreacionId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `apellidos`, `direccion`, `fechaCreacion`, `fechaActualizacion`, `usuarioCreacionId`) VALUES
(1, 'Juan', 'Quintero', 'Calle 1', '2020-03-05 00:00:00', '2020-03-05 00:00:00', 2),
(2, 'Jorge', 'Diaz', 'Calle9', '2020-03-05 00:00:00', '2020-03-05 00:00:00', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carnet`
--
ALTER TABLE `carnet`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`id`),
  ADD KEY `servicioId` (`servicioId`),
  ADD KEY `mascotaId` (`mascotaId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `detallecarnet`
--
ALTER TABLE `detallecarnet`
  ADD PRIMARY KEY (`id`),
  ADD KEY `carnetId` (`carnetId`),
  ADD KEY `productoId` (`productoId`);

--
-- Indices de la tabla `detalledisponibilidad`
--
ALTER TABLE `detalledisponibilidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `disponibilidadId` (`disponibilidadId`);

--
-- Indices de la tabla `disponibilidad`
--
ALTER TABLE `disponibilidad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `recursoVeterinariaId` (`recursoVeterinariaId`),
  ADD KEY `servicioId` (`servicioId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioId` (`usuarioId`),
  ADD KEY `historiaClinicaId` (`historiaClinicaId`),
  ADD KEY `razaId` (`razaId`),
  ADD KEY `tipoMascotaId` (`tipoMascotaId`),
  ADD KEY `carnetId` (`carnetId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `raza`
--
ALTER TABLE `raza`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `recursoveterinaria`
--
ALTER TABLE `recursoveterinaria`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioId` (`usuarioId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `recursoveterinariaasignado`
--
ALTER TABLE `recursoveterinariaasignado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `servicioId` (`servicioId`),
  ADD KEY `recursoVeterinariaId` (`recursoVeterinariaId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tarifaId` (`tarifaId`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `tipomascota`
--
ALTER TABLE `tipomascota`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuarioCreacionId` (`usuarioCreacionId`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carnet`
--
ALTER TABLE `carnet`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `detalledisponibilidad`
--
ALTER TABLE `detalledisponibilidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `disponibilidad`
--
ALTER TABLE `disponibilidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mascota`
--
ALTER TABLE `mascota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `raza`
--
ALTER TABLE `raza`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `recursoveterinaria`
--
ALTER TABLE `recursoveterinaria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `recursoveterinariaasignado`
--
ALTER TABLE `recursoveterinariaasignado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tarifa`
--
ALTER TABLE `tarifa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tipomascota`
--
ALTER TABLE `tipomascota`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `cita_ibfk_1` FOREIGN KEY (`servicioId`) REFERENCES `servicio` (`id`),
  ADD CONSTRAINT `cita_ibfk_2` FOREIGN KEY (`mascotaId`) REFERENCES `mascota` (`id`),
  ADD CONSTRAINT `cita_ibfk_3` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `detallecarnet`
--
ALTER TABLE `detallecarnet`
  ADD CONSTRAINT `detallecarnet_ibfk_1` FOREIGN KEY (`carnetId`) REFERENCES `carnet` (`id`),
  ADD CONSTRAINT `detallecarnet_ibfk_2` FOREIGN KEY (`productoId`) REFERENCES `producto` (`id`);

--
-- Filtros para la tabla `detalledisponibilidad`
--
ALTER TABLE `detalledisponibilidad`
  ADD CONSTRAINT `detalledisponibilidad_ibfk_1` FOREIGN KEY (`disponibilidadId`) REFERENCES `disponibilidad` (`id`);

--
-- Filtros para la tabla `disponibilidad`
--
ALTER TABLE `disponibilidad`
  ADD CONSTRAINT `disponibilidad_ibfk_1` FOREIGN KEY (`recursoVeterinariaId`) REFERENCES `recursoveterinaria` (`id`),
  ADD CONSTRAINT `disponibilidad_ibfk_2` FOREIGN KEY (`servicioId`) REFERENCES `servicio` (`id`),
  ADD CONSTRAINT `disponibilidad_ibfk_3` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `historiaclinica`
--
ALTER TABLE `historiaclinica`
  ADD CONSTRAINT `historiaclinica_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `mascota`
--
ALTER TABLE `mascota`
  ADD CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`usuarioId`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `mascota_ibfk_2` FOREIGN KEY (`historiaClinicaId`) REFERENCES `historiaclinica` (`id`),
  ADD CONSTRAINT `mascota_ibfk_3` FOREIGN KEY (`razaId`) REFERENCES `raza` (`id`),
  ADD CONSTRAINT `mascota_ibfk_4` FOREIGN KEY (`tipoMascotaId`) REFERENCES `tipomascota` (`id`),
  ADD CONSTRAINT `mascota_ibfk_5` FOREIGN KEY (`carnetId`) REFERENCES `carnet` (`id`),
  ADD CONSTRAINT `mascota_ibfk_6` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `raza`
--
ALTER TABLE `raza`
  ADD CONSTRAINT `raza_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `recursoveterinaria`
--
ALTER TABLE `recursoveterinaria`
  ADD CONSTRAINT `recursoveterinaria_ibfk_1` FOREIGN KEY (`usuarioId`) REFERENCES `usuario` (`id`),
  ADD CONSTRAINT `recursoveterinaria_ibfk_2` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `recursoveterinariaasignado`
--
ALTER TABLE `recursoveterinariaasignado`
  ADD CONSTRAINT `recursoveterinariaasignado_ibfk_1` FOREIGN KEY (`servicioId`) REFERENCES `servicio` (`id`),
  ADD CONSTRAINT `recursoveterinariaasignado_ibfk_2` FOREIGN KEY (`recursoVeterinariaId`) REFERENCES `recursoveterinaria` (`id`),
  ADD CONSTRAINT `recursoveterinariaasignado_ibfk_3` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `servicio_ibfk_1` FOREIGN KEY (`tarifaId`) REFERENCES `tarifa` (`id`),
  ADD CONSTRAINT `servicio_ibfk_2` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `tarifa`
--
ALTER TABLE `tarifa`
  ADD CONSTRAINT `tarifa_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `tipomascota`
--
ALTER TABLE `tipomascota`
  ADD CONSTRAINT `tipomascota_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `tiposervicio`
--
ALTER TABLE `tiposervicio`
  ADD CONSTRAINT `tiposervicio_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`usuarioCreacionId`) REFERENCES `usuario` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
