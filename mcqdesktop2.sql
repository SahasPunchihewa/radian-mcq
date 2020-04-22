-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2020 at 07:20 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mcqdesktop2`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `No` int(11) NOT NULL,
  `UName` text NOT NULL,
  `Pass` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `No` int(11) NOT NULL,
  `ans` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `No` int(11) NOT NULL,
  `USName` text NOT NULL,
  `Session` int(11) NOT NULL,
  `Answer` int(11) NOT NULL,
  `Correct` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `No` int(11) NOT NULL,
  `Name` text,
  `Sess` int(11) NOT NULL,
  `MCQ` text NOT NULL,
  `IMG` longblob,
  `One` text NOT NULL,
  `Two` text NOT NULL,
  `Three` text NOT NULL,
  `Four` text NOT NULL,
  `Five` text NOT NULL,
  `RNo` int(11) DEFAULT NULL,
  `RsNo` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `stat`
--

CREATE TABLE `stat` (
  `No` int(11) NOT NULL,
  `Corr` int(11) NOT NULL,
  `Sess` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`No`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`No`,`RsNo`),
  ADD UNIQUE KEY `No` (`No`),
  ADD UNIQUE KEY `RsNo` (`RsNo`);

--
-- Indexes for table `stat`
--
ALTER TABLE `stat`
  ADD PRIMARY KEY (`No`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
