-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Ago 07, 2015 alle 12:29
-- Versione del server: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `appunti`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `autori`
--

CREATE TABLE IF NOT EXISTS `autori` (
  `ID_AUTORE` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` text NOT NULL,
  `COGNOME` text NOT NULL,
  `ID_SITO` int(11) NOT NULL,
  PRIMARY KEY (`ID_AUTORE`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Dump dei dati per la tabella `autori`
--

INSERT INTO `autori` (`ID_AUTORE`, `NOME`, `COGNOME`, `ID_SITO`) VALUES
(1, 'Francesco', 'Pasturenzi', 1),
(2, 'Silvia', 'Clerico', 1),
(11, 'Angela', 'Clerico', 11),
(12, 'FraBean', 'PastuBean', 1),
(13, 'Marco', 'Tito', 12),
(14, 'Francesco', 'Pasturenzi', 32),
(17, 'Antonio', 'Gianfreda', 17),
(18, 'Antonio', 'Gianfreda', 18),
(19, 'Antonio', 'Gianfreda', 19);

-- --------------------------------------------------------

--
-- Struttura della tabella `notes`
--

CREATE TABLE IF NOT EXISTS `notes` (
  `ID_NOTE` int(11) NOT NULL AUTO_INCREMENT,
  `NOTE` text NOT NULL,
  `ID_AUTORE` int(11) NOT NULL,
  PRIMARY KEY (`ID_NOTE`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=49 ;

--
-- Dump dei dati per la tabella `notes`
--

INSERT INTO `notes` (`ID_NOTE`, `NOTE`, `ID_AUTORE`) VALUES
(1, 'E'' stato inserito un nuovo esempio di Spring+JDBC all''interno del sito', 1),
(2, 'E'' stato inserito un aggiornamento su Spring', 1),
(6, 'nota2', 11),
(5, 'nota1', 11),
(7, 'nota creata con Spring', 1),
(8, 'nota creata con Spring', 1),
(9, 'nota3', 13),
(10, 'nota4', 13),
(11, 'nota5', 14),
(12, 'nota6', 14),
(18, 'nota6', 14),
(17, 'nota5', 14),
(19, 'nota5', 17),
(20, 'nota6', 17),
(21, 'nota5', 18),
(22, 'nota6', 18),
(23, 'nota5', 19),
(24, 'nota6', 19),
(25, 'nota5', 14),
(26, 'nota6', 14),
(27, 'nota5', 14),
(28, 'nota6', 14),
(29, 'nota5', 14),
(30, 'nota6', 14),
(31, 'nota5', 14),
(32, 'nota6', 14),
(33, 'nota5', 14),
(34, 'nota6', 14),
(35, 'nota5', 14),
(36, 'nota6', 14),
(37, 'nota5', 14),
(38, 'nota6', 14),
(39, 'nota5', 14),
(40, 'nota6', 14),
(41, 'nota5', 14),
(42, 'nota6', 14),
(43, 'nota5', 14),
(44, 'nota6', 14),
(45, 'nota5', 14),
(46, 'nota6', 14),
(47, 'nota5', 14),
(48, 'nota6', 14);

-- --------------------------------------------------------

--
-- Struttura della tabella `siti`
--

CREATE TABLE IF NOT EXISTS `siti` (
  `ID_SITO` int(11) NOT NULL AUTO_INCREMENT,
  `DOMINIO` text NOT NULL,
  `TIPOLOGIA` text NOT NULL,
  PRIMARY KEY (`ID_SITO`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Dump dei dati per la tabella `siti`
--

INSERT INTO `siti` (`ID_SITO`, `DOMINIO`, `TIPOLOGIA`) VALUES
(1, 'appuntivari.net', 'Di Tutto'),
(2, 'pastuweb.com', 'Personale'),
(11, 'www.angelaclerico.it', 'personale'),
(12, 'www.marcotito.it', 'personale'),
(13, 'www.Antonio.it', 'personale'),
(16, 'www.Antonio.it', 'personale'),
(17, 'www.Antonio.it', 'personale'),
(18, 'www.Antonio.it', 'personale'),
(19, 'www.Antonio.it', 'personale'),
(20, 'www.Antonio.it', 'personale'),
(21, 'www.Antonio.it', 'personale'),
(22, 'www.Antonio.it', 'personale'),
(23, 'www.Antonio.it', 'personale'),
(24, 'www.Antonio.it', 'personale'),
(25, 'www.Antonio.it', 'personale'),
(26, 'www.Antonio.it', 'personale'),
(27, 'www.Antonios.it', 'personales'),
(28, 'www.Antonios.it', 'personales'),
(29, 'asas', 'ssssssssssss'),
(30, 'www.Antonios.it', 'personales'),
(31, 'www.Antonios.it', 'personales'),
(32, 'www.pastuweb.it', 'personale'),
(33, 'asas', 'as'),
(34, 'ciao', 'ciao');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
