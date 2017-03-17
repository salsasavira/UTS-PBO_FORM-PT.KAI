-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 17, 2017 at 04:03 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_kereta`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('', ''),
('', ''),
('defgh', 'defrgth'),
('', ''),
('Admin', 'Admin'),
('Salsabilla', 'absen30');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `nama_pemesan` text NOT NULL,
  `ID` varchar(10) NOT NULL,
  `stasiun_awal` text NOT NULL,
  `stasiun_tujuan` text NOT NULL,
  `tanggal` date NOT NULL,
  `jenis_kereta` text NOT NULL,
  `waktu` varchar(10) NOT NULL,
  `tduduk` varchar(10) NOT NULL,
  `harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`nama_pemesan`, `ID`, `stasiun_awal`, `stasiun_tujuan`, `tanggal`, `jenis_kereta`, `waktu`, `tduduk`, `harga`) VALUES
('Salsabilla', '12345', 'Malang', 'Semarang', '2017-03-01', 'Bisnis', '2017-03-01', 'Gerbong 4', '160.000'),
('Savira', '49837', 'Blitar', 'Solo', '2017-02-14', 'Bisnis', '2017-02-14', 'Gerbong 1', '150.000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
