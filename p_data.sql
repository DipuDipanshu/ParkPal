-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2017 at 12:37 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `COTS`
--

-- --------------------------------------------------------

--
-- Table structure for table `p_data`
--

CREATE TABLE `p_data` (
  `verifykey` int(11) NOT NULL,
  `number` text NOT NULL,
  `floor` int(11) NOT NULL,
  `slot` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_data`
--

INSERT INTO `p_data` (`verifykey`, `number`, `floor`, `slot`) VALUES
(1, '1415', 1, 7),
(2, '1231', 1, 7),
(3, '6572', 2, 6),
(4, ' 6GDGL86', 2, 4),
(5, '9976', 1, 21),
(6, ' 6GDGL86', 2, 4),
(7, '9966', 1, 27);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `p_data`
--
ALTER TABLE `p_data`
  ADD PRIMARY KEY (`verifykey`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `p_data`
--
ALTER TABLE `p_data`
  MODIFY `verifykey` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
