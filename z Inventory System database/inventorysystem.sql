-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 25, 2013 at 03:24 PM
-- Server version: 5.5.24-log
-- PHP Version: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `inventorysystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbladditem`
--

CREATE TABLE IF NOT EXISTS `tbladditem` (
  `ItemID` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Description` varchar(40) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `UnitOfMeasure` varchar(10) NOT NULL,
  `Category` varchar(25) NOT NULL,
  `UnitPrice` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbladditem`
--

INSERT INTO `tbladditem` (`ItemID`, `Name`, `Description`, `Quantity`, `UnitOfMeasure`, `Category`, `UnitPrice`) VALUES
('JF023', 'Chippy', 'Small,Red', 25, 'pc', 'Junkfood', '7.00'),
('AB012', 'Colgate', 'smal,white', 55, 'pc', 'Toothpaste', '20.00'),
('DF203', 'Bowow Chow', '1kg', 10, 'sack', 'Dog Food', '50.00'),
('FT234', 'something', 'something', 35, 'pc', 'something', '32.50'),
('zzzzz', 'asdasd', 'asdasd', 5, 'asdasd', 'asas', '45.55');

-- --------------------------------------------------------

--
-- Table structure for table `tblloginuserinfo`
--

CREATE TABLE IF NOT EXISTS `tblloginuserinfo` (
  `LastName` varchar(20) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `MI` varchar(1) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `ContactNum` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Type` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblloginuserinfo`
--

INSERT INTO `tblloginuserinfo` (`LastName`, `FirstName`, `MI`, `Address`, `ContactNum`, `Email`, `Username`, `Password`, `Type`) VALUES
('Ayaay', 'Allan Jay', 'C', 'Tacloban City', '123456', 'mailme@yahoo.com', 'user', 'pass', 'Administrator'),
('asdasd', 'asdasd', 'C', 'asdasd', '23123', 'asdasd@asd.com', 'user1', 'pass1', 'Employee'),
('asdasd', 'asdasd', 'c', 'asdasd', '123123', 'asdad', 'username', 'password', 'Employee'),
('Test', 'Test', 'C', 'Test', '2323', 'Test@gmail.com', 'Owner', 'pass', 'Administrator');

-- --------------------------------------------------------

--
-- Table structure for table `tbltransaction`
--

CREATE TABLE IF NOT EXISTS `tbltransaction` (
  `ItemID` varchar(10) NOT NULL,
  `ItemName` varchar(20) NOT NULL,
  `Date` varchar(20) NOT NULL,
  `Action` varchar(15) NOT NULL,
  `Change` varchar(12) NOT NULL,
  `UnitOfMeasure` varchar(8) NOT NULL,
  `User` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbltransaction`
--

INSERT INTO `tbltransaction` (`ItemID`, `ItemName`, `Date`, `Action`, `Change`, `UnitOfMeasure`, `User`) VALUES
('AB012', 'Colgate', '2013-03-26', 'Increase', '5', 'pc', 'n/a'),
('AB012', 'Colgate', '2013-03-25', 'Increase', '7', 'pc', 'n/a'),
('AB012', 'Colgate', '2013-03-25', 'Decrease', '-7', 'pc', 'n/a'),
('AB012', 'Colgate', '2013-03-25', 'Increase', '45', 'pc', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Increase', '7', 'asdasd', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Decrease', '-39', 'asdasd', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Increase', '7', 'asdasd', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Increase', '23', 'asdasd', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Decrease', '-20', 'asdasd', 'n/a'),
('zzzzz', 'asdasd', '2013-03-25', 'Increase', '3', 'asdasd', 'owner'),
('zzzzz', 'asdasd', '2013-03-25', 'Decrease', '-3', 'asdasd', 'owner');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
