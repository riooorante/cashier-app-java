-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 17, 2023 at 09:06 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_produk`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabel_produk`
--

CREATE TABLE `tabel_produk` (
  `ID` int(11) NOT NULL,
  `nama_produk` text NOT NULL,
  `harga_produk` int(11) NOT NULL,
  `jumlah_produk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tabel_produk`
--

INSERT INTO `tabel_produk` (`ID`, `nama_produk`, `harga_produk`, `jumlah_produk`) VALUES
(1, 'Kecap ABC', 12000, 10),
(2, 'Minyak Goreng', 30000, 20),
(4, 'Beras 1 KG', 25000, 25),
(5, 'Telur ', 2500, 199),
(6, 'Tepung Kompas', 20000, 40),
(16, 'Minyak Telon', 3000, 115),
(17, 'Shampo', 10000, 12),
(18, 'Sabun', 1200, 17),
(19, 'Kecap Asin', 20000, 31),
(22, 'Galon Aqua', 30000, 10),
(23, 'Indomie Goreng', 3000, 100),
(24, 'Indomie Cabe Ijo', 3000, 124),
(25, 'Masako Bumbu', 1000, 80),
(28, 'Gula', 12000, 118);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabel_produk`
--
ALTER TABLE `tabel_produk`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabel_produk`
--
ALTER TABLE `tabel_produk`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
