-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Ago 07, 2015 alle 12:28
-- Versione del server: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `wellness`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `ruolo`
--

CREATE TABLE IF NOT EXISTS `ruolo` (
  `id_ruolo` int(11) NOT NULL AUTO_INCREMENT,
  `ruolo` varchar(20) NOT NULL,
  `descrizione` text NOT NULL,
  PRIMARY KEY (`id_ruolo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Struttura della tabella `utente`
--

CREATE TABLE IF NOT EXISTS `utente` (
  `id_utente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `cognome` varchar(40) NOT NULL,
  `cellulare` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `sesso` varchar(1) NOT NULL,
  `altezza` int(11) NOT NULL,
  `peso` int(11) NOT NULL,
  `username` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`id_utente`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dump dei dati per la tabella `utente`
--

INSERT INTO `utente` (`id_utente`, `nome`, `cognome`, `cellulare`, `telefono`, `sesso`, `altezza`, `peso`, `username`, `email`, `password`) VALUES
(1, 'fra', 'pastu', '2323', '1313', '1', 130, 89, 'fra', 'fra', 'asas'),
(2, 'paolo', 'paolo', '1234', '12345', '1', 123, 123, 'paolo', 'paolo', 'paolo'),
(3, 'rew', 'fewd', 'rewd', 'fd', '1', 21, 12, 'fdsf', 'vsdc', 'sdcx');

-- --------------------------------------------------------

--
-- Struttura della tabella `utente_ruoli`
--

CREATE TABLE IF NOT EXISTS `utente_ruoli` (
  `id_utente` int(11) NOT NULL,
  `id_ruolo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
