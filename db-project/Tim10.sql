-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 23, 2015 at 08:37 PM
-- Server version: 5.5.43-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Tim10`
--

-- --------------------------------------------------------

--
-- Table structure for table `Dokumenti`
--

CREATE TABLE IF NOT EXISTS `Dokumenti` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Naziv` varchar(45) DEFAULT NULL,
  `Opis` varchar(45) DEFAULT NULL,
  `VrstaDokumenta_Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`,`VrstaDokumenta_Id`),
  KEY `fk_Dokumenti_VrstaDokumenta1_idx` (`VrstaDokumenta_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `Klijent`
--

CREATE TABLE IF NOT EXISTS `Klijent` (
  `Id` int(11) NOT NULL DEFAULT '0',
  `Naziv` varchar(45) DEFAULT NULL,
  `Opis` varchar(200) DEFAULT NULL,
  `Adresa` varchar(45) DEFAULT NULL,
  `Telefon` varchar(20) DEFAULT NULL,
  `Fax` varchar(20) DEFAULT NULL,
  `Tip` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Klijent_has_Preduzece`
--

CREATE TABLE IF NOT EXISTS `Klijent_has_Preduzece` (
  `Klijent_Id` int(11) NOT NULL,
  `Preduzece_IdPreduzece` int(11) NOT NULL,
  PRIMARY KEY (`Klijent_Id`,`Preduzece_IdPreduzece`),
  KEY `fk_Klijent_has_Preduzece_Preduzece1_idx` (`Preduzece_IdPreduzece`),
  KEY `fk_Klijent_has_Preduzece_Klijent1_idx` (`Klijent_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `KontniOkvir`
--

CREATE TABLE IF NOT EXISTS `KontniOkvir` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `BrojKonta` mediumtext NOT NULL,
  `Naziv` mediumtext NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=824 ;

--
-- Dumping data for table `KontniOkvir`
--

INSERT INTO `KontniOkvir` (`Id`, `BrojKonta`, `Naziv`) VALUES
(1, '0', 'unijeti...'),
(2, '2', 'unijeti...'),
(3, '3', 'unijeti...'),
(4, '4', 'unijeti...'),
(5, '5', 'unijeti...'),
(6, '6', 'unijeti...'),
(7, '7', 'unijeti...'),
(8, '8', 'unijeti...'),
(9, '9', 'unijeti...'),
(10, '10', 'unijeti...'),
(11, '11', 'unijeti...'),
(12, '12', 'unijeti...'),
(13, '13', 'unijeti...'),
(14, '14', 'unijeti...'),
(15, '15', 'unijeti...'),
(16, '16', 'unijeti...'),
(17, '17', 'unijeti...'),
(18, '18', 'unijeti...'),
(19, '19', 'unijeti...'),
(20, '20', 'unijeti...'),
(21, '21', 'unijeti...'),
(22, '22', 'unijeti...'),
(23, '23', 'unijeti...'),
(24, '24', 'unijeti...'),
(25, '25', 'unijeti...'),
(26, '26', 'unijeti...'),
(27, '27', 'unijeti...'),
(28, '28', 'unijeti...'),
(29, '29', 'unijeti...'),
(30, '30', 'unijeti...'),
(31, '31', 'unijeti...'),
(32, '32', 'unijeti...'),
(33, '33', 'unijeti...'),
(34, '34', 'unijeti...'),
(35, '35', 'unijeti...'),
(36, '36', 'unijeti...'),
(37, '37', 'unijeti...'),
(38, '38', 'unijeti...'),
(39, '39', 'unijeti...'),
(40, '40', 'unijeti...'),
(41, '41', 'unijeti...'),
(42, '42', 'unijeti...'),
(43, '43', 'unijeti...'),
(44, '44', 'unijeti...'),
(45, '45', 'unijeti...'),
(46, '46', 'unijeti...'),
(47, '47', 'unijeti...'),
(48, '48', 'unijeti...'),
(49, '49', 'unijeti...'),
(50, '50', 'unijeti...'),
(51, '51', 'unijeti...'),
(52, '52', 'unijeti...'),
(53, '53', 'unijeti...'),
(54, '54', 'unijeti...'),
(55, '55', 'unijeti...'),
(56, '56', 'unijeti...'),
(57, '57', 'unijeti...'),
(58, '58', 'unijeti...'),
(59, '59', 'unijeti...'),
(60, '60', 'unijeti...'),
(61, '61', 'unijeti...'),
(62, '62', 'unijeti...'),
(63, '63', 'unijeti...'),
(64, '64', 'unijeti...'),
(65, '65', 'unijeti...'),
(66, '66', 'unijeti...'),
(67, '67', 'unijeti...'),
(68, '68', 'unijeti...'),
(69, '69', 'unijeti...'),
(70, '70', 'unijeti...'),
(71, '71', 'unijeti...'),
(72, '72', 'unijeti...'),
(73, '73', 'unijeti...'),
(74, '74', 'unijeti...'),
(75, '75', 'unijeti...'),
(76, '76', 'unijeti...'),
(77, '77', 'unijeti...'),
(78, '78', 'unijeti...'),
(79, '79', 'unijeti...'),
(80, '80', 'unijeti...'),
(81, '81', 'unijeti...'),
(82, '82', 'unijeti...'),
(83, '83', 'unijeti...'),
(84, '84', 'unijeti...'),
(85, '85', 'unijeti...'),
(86, '86', 'unijeti...'),
(87, '87', 'unijeti...'),
(88, '88', 'unijeti...'),
(89, '89', 'unijeti...'),
(90, '90', 'unijeti...'),
(91, '91', 'unijeti...'),
(92, '92', 'unijeti...'),
(93, '93', 'unijeti...'),
(94, '94', 'unijeti...'),
(95, '95', 'unijeti...'),
(96, '96', 'unijeti...'),
(97, '97', 'unijeti...'),
(98, '98', 'unijeti...'),
(99, '99', 'unijeti...'),
(100, '100', 'unijeti...'),
(101, '101', 'unijeti...'),
(102, '102', 'unijeti...'),
(103, '103', 'unijeti...'),
(104, '104', 'unijeti...'),
(105, '105', 'unijeti...'),
(106, '106', 'unijeti...'),
(107, '107', 'unijeti...'),
(108, '108', 'unijeti...'),
(109, '109', 'unijeti...'),
(110, '110', 'unijeti...'),
(111, '111', 'unijeti...'),
(112, '112', 'unijeti...'),
(113, '113', 'unijeti...'),
(114, '114', 'unijeti...'),
(115, '115', 'unijeti...'),
(116, '116', 'unijeti...'),
(117, '117', 'unijeti...'),
(118, '118', 'unijeti...'),
(119, '119', 'unijeti...'),
(120, '120', 'unijeti...'),
(121, '121', 'unijeti...'),
(122, '122', 'unijeti...'),
(123, '123', 'unijeti...'),
(124, '124', 'unijeti...'),
(125, '125', 'unijeti...'),
(126, '126', 'unijeti...'),
(127, '127', 'unijeti...'),
(128, '128', 'unijeti...'),
(129, '129', 'unijeti...'),
(130, '130', 'unijeti...'),
(131, '131', 'unijeti...'),
(132, '132', 'unijeti...'),
(133, '133', 'unijeti...'),
(134, '134', 'unijeti...'),
(135, '135', 'unijeti...'),
(136, '136', 'unijeti...'),
(137, '137', 'unijeti...'),
(138, '138', 'unijeti...'),
(139, '139', 'unijeti...'),
(140, '140', 'unijeti...'),
(141, '141', 'unijeti...'),
(142, '142', 'unijeti...'),
(143, '143', 'unijeti...'),
(144, '144', 'unijeti...'),
(145, '145', 'unijeti...'),
(146, '146', 'unijeti...'),
(147, '147', 'unijeti...'),
(148, '148', 'unijeti...'),
(149, '149', 'unijeti...'),
(150, '150', 'unijeti...'),
(151, '151', 'unijeti...'),
(152, '152', 'unijeti...'),
(153, '153', 'unijeti...'),
(154, '154', 'unijeti...'),
(155, '155', 'unijeti...'),
(156, '156', 'unijeti...'),
(157, '157', 'unijeti...'),
(158, '158', 'unijeti...'),
(159, '159', 'unijeti...'),
(160, '160', 'unijeti...'),
(161, '161', 'unijeti...'),
(162, '162', 'unijeti...'),
(163, '163', 'unijeti...'),
(164, '164', 'unijeti...'),
(165, '165', 'unijeti...'),
(166, '166', 'unijeti...'),
(167, '167', 'unijeti...'),
(168, '168', 'unijeti...'),
(169, '169', 'unijeti...'),
(170, '170', 'unijeti...'),
(171, '171', 'unijeti...'),
(172, '172', 'unijeti...'),
(173, '173', 'unijeti...'),
(174, '174', 'unijeti...'),
(175, '175', 'unijeti...'),
(176, '176', 'unijeti...'),
(177, '177', 'unijeti...'),
(178, '178', 'unijeti...'),
(179, '179', 'unijeti...'),
(180, '180', 'unijeti...'),
(181, '181', 'unijeti...'),
(182, '182', 'unijeti...'),
(183, '183', 'unijeti...'),
(184, '184', 'unijeti...'),
(185, '185', 'unijeti...'),
(186, '186', 'unijeti...'),
(187, '187', 'unijeti...'),
(188, '188', 'unijeti...'),
(189, '189', 'unijeti...'),
(190, '190', 'unijeti...'),
(191, '191', 'unijeti...'),
(192, '192', 'unijeti...'),
(193, '193', 'unijeti...'),
(194, '194', 'unijeti...'),
(195, '195', 'unijeti...'),
(196, '196', 'unijeti...'),
(197, '197', 'unijeti...'),
(198, '198', 'unijeti...'),
(199, '199', 'unijeti...'),
(200, '200', 'unijeti...'),
(201, '201', 'unijeti...'),
(202, '202', 'unijeti...'),
(203, '203', 'unijeti...'),
(204, '204', 'unijeti...'),
(205, '205', 'unijeti...'),
(206, '206', 'unijeti...'),
(207, '207', 'unijeti...'),
(208, '208', 'unijeti...'),
(209, '209', 'unijeti...'),
(210, '210', 'unijeti...'),
(211, '211', 'unijeti...'),
(212, '212', 'unijeti...'),
(213, '213', 'unijeti...'),
(214, '214', 'unijeti...'),
(215, '215', 'unijeti...'),
(216, '216', 'unijeti...'),
(217, '217', 'unijeti...'),
(218, '218', 'unijeti...'),
(219, '219', 'unijeti...'),
(220, '220', 'unijeti...'),
(221, '221', 'unijeti...'),
(222, '222', 'unijeti...'),
(223, '223', 'unijeti...'),
(224, '224', 'unijeti...'),
(225, '225', 'unijeti...'),
(226, '226', 'unijeti...'),
(227, '227', 'unijeti...'),
(228, '228', 'unijeti...'),
(229, '229', 'unijeti...'),
(230, '230', 'unijeti...'),
(231, '231', 'unijeti...'),
(232, '232', 'unijeti...'),
(233, '233', 'unijeti...'),
(234, '234', 'unijeti...'),
(235, '235', 'unijeti...'),
(236, '236', 'unijeti...'),
(237, '237', 'unijeti...'),
(238, '238', 'unijeti...'),
(239, '239', 'unijeti...'),
(240, '240', 'unijeti...'),
(241, '241', 'unijeti...'),
(242, '242', 'unijeti...'),
(243, '243', 'unijeti...'),
(244, '244', 'unijeti...'),
(245, '245', 'unijeti...'),
(246, '246', 'unijeti...'),
(247, '247', 'unijeti...'),
(248, '248', 'unijeti...'),
(249, '249', 'unijeti...'),
(250, '250', 'unijeti...'),
(251, '251', 'unijeti...'),
(252, '252', 'unijeti...'),
(253, '253', 'unijeti...'),
(254, '254', 'unijeti...'),
(255, '255', 'unijeti...'),
(256, '256', 'unijeti...'),
(257, '257', 'unijeti...'),
(258, '258', 'unijeti...'),
(259, '259', 'unijeti...'),
(260, '260', 'unijeti...'),
(261, '261', 'unijeti...'),
(262, '262', 'unijeti...'),
(263, '263', 'unijeti...'),
(264, '264', 'unijeti...'),
(265, '265', 'unijeti...'),
(266, '266', 'unijeti...'),
(267, '267', 'unijeti...'),
(268, '268', 'unijeti...'),
(269, '269', 'unijeti...'),
(270, '270', 'unijeti...'),
(271, '271', 'unijeti...'),
(272, '272', 'unijeti...'),
(273, '273', 'unijeti...'),
(274, '274', 'unijeti...'),
(275, '275', 'unijeti...'),
(276, '276', 'unijeti...'),
(277, '277', 'unijeti...'),
(278, '278', 'unijeti...'),
(279, '279', 'unijeti...'),
(280, '280', 'unijeti...'),
(281, '281', 'unijeti...'),
(282, '282', 'unijeti...'),
(283, '283', 'unijeti...'),
(284, '284', 'unijeti...'),
(285, '285', 'unijeti...'),
(286, '286', 'unijeti...'),
(287, '287', 'unijeti...'),
(288, '288', 'unijeti...'),
(289, '289', 'unijeti...'),
(290, '290', 'unijeti...'),
(291, '291', 'unijeti...'),
(292, '292', 'unijeti...'),
(293, '293', 'unijeti...'),
(294, '294', 'unijeti...'),
(295, '295', 'unijeti...'),
(296, '296', 'unijeti...'),
(297, '297', 'unijeti...'),
(298, '298', 'unijeti...'),
(299, '299', 'unijeti...'),
(300, '300', 'unijeti...'),
(301, '301', 'unijeti...'),
(302, '302', 'unijeti...'),
(303, '303', 'unijeti...'),
(304, '304', 'unijeti...'),
(305, '305', 'unijeti...'),
(306, '306', 'unijeti...'),
(307, '307', 'unijeti...'),
(308, '308', 'unijeti...'),
(309, '309', 'unijeti...'),
(310, '310', 'unijeti...'),
(311, '311', 'unijeti...'),
(312, '312', 'unijeti...'),
(313, '313', 'unijeti...'),
(314, '314', 'unijeti...'),
(315, '315', 'unijeti...'),
(316, '316', 'unijeti...'),
(317, '317', 'unijeti...'),
(318, '318', 'unijeti...'),
(319, '319', 'unijeti...'),
(320, '320', 'unijeti...'),
(321, '321', 'unijeti...'),
(322, '322', 'unijeti...'),
(323, '323', 'unijeti...'),
(324, '324', 'unijeti...'),
(325, '325', 'unijeti...'),
(326, '326', 'unijeti...'),
(327, '327', 'unijeti...'),
(328, '328', 'unijeti...'),
(329, '329', 'unijeti...'),
(330, '330', 'unijeti...'),
(331, '331', 'unijeti...'),
(332, '332', 'unijeti...'),
(333, '333', 'unijeti...'),
(334, '334', 'unijeti...'),
(335, '335', 'unijeti...'),
(336, '336', 'unijeti...'),
(337, '337', 'unijeti...'),
(338, '338', 'unijeti...'),
(339, '339', 'unijeti...'),
(340, '340', 'unijeti...'),
(341, '341', 'unijeti...'),
(342, '342', 'unijeti...'),
(343, '343', 'unijeti...'),
(344, '344', 'unijeti...'),
(345, '345', 'unijeti...'),
(346, '346', 'unijeti...'),
(347, '347', 'unijeti...'),
(348, '348', 'unijeti...'),
(349, '349', 'unijeti...'),
(350, '350', 'unijeti...'),
(351, '351', 'unijeti...'),
(352, '352', 'unijeti...'),
(353, '353', 'unijeti...'),
(354, '354', 'unijeti...'),
(355, '355', 'unijeti...'),
(356, '356', 'unijeti...'),
(357, '357', 'unijeti...'),
(358, '358', 'unijeti...'),
(359, '359', 'unijeti...'),
(360, '360', 'unijeti...'),
(361, '361', 'unijeti...'),
(362, '362', 'unijeti...'),
(363, '363', 'unijeti...'),
(364, '364', 'unijeti...'),
(365, '365', 'unijeti...'),
(366, '366', 'unijeti...'),
(367, '367', 'unijeti...'),
(368, '368', 'unijeti...'),
(369, '369', 'unijeti...'),
(370, '370', 'unijeti...'),
(371, '371', 'unijeti...'),
(372, '372', 'unijeti...'),
(373, '373', 'unijeti...'),
(374, '374', 'unijeti...'),
(375, '375', 'unijeti...'),
(376, '376', 'unijeti...'),
(377, '377', 'unijeti...'),
(378, '378', 'unijeti...'),
(379, '379', 'unijeti...'),
(380, '380', 'unijeti...'),
(381, '381', 'unijeti...'),
(382, '382', 'unijeti...'),
(383, '383', 'unijeti...'),
(384, '384', 'unijeti...'),
(385, '385', 'unijeti...'),
(386, '386', 'unijeti...'),
(387, '387', 'unijeti...'),
(388, '388', 'unijeti...'),
(389, '389', 'unijeti...'),
(390, '390', 'unijeti...'),
(391, '391', 'unijeti...'),
(392, '392', 'unijeti...'),
(393, '393', 'unijeti...'),
(394, '394', 'unijeti...'),
(395, '395', 'unijeti...'),
(396, '396', 'unijeti...'),
(397, '397', 'unijeti...'),
(398, '398', 'unijeti...'),
(399, '399', 'unijeti...'),
(400, '400', 'unijeti...'),
(401, '401', 'unijeti...'),
(402, '402', 'unijeti...'),
(403, '403', 'unijeti...'),
(404, '404', 'unijeti...'),
(405, '405', 'unijeti...'),
(406, '406', 'unijeti...'),
(407, '407', 'unijeti...'),
(408, '408', 'unijeti...'),
(409, '409', 'unijeti...'),
(410, '410', 'unijeti...'),
(411, '411', 'unijeti...'),
(412, '412', 'unijeti...'),
(413, '413', 'unijeti...'),
(414, '414', 'unijeti...'),
(415, '415', 'unijeti...'),
(416, '416', 'unijeti...'),
(417, '417', 'unijeti...'),
(418, '418', 'unijeti...'),
(419, '419', 'unijeti...'),
(420, '420', 'unijeti...'),
(421, '421', 'unijeti...'),
(422, '422', 'unijeti...'),
(423, '423', 'unijeti...'),
(424, '424', 'unijeti...'),
(425, '425', 'unijeti...'),
(426, '426', 'unijeti...'),
(427, '427', 'unijeti...'),
(428, '428', 'unijeti...'),
(429, '429', 'unijeti...'),
(430, '430', 'unijeti...'),
(431, '431', 'unijeti...'),
(432, '432', 'unijeti...'),
(433, '433', 'unijeti...'),
(434, '434', 'unijeti...'),
(435, '435', 'unijeti...'),
(436, '436', 'unijeti...'),
(437, '437', 'unijeti...'),
(438, '438', 'unijeti...'),
(439, '439', 'unijeti...'),
(440, '440', 'unijeti...'),
(441, '441', 'unijeti...'),
(442, '442', 'unijeti...'),
(443, '443', 'unijeti...'),
(444, '444', 'unijeti...'),
(445, '445', 'unijeti...'),
(446, '446', 'unijeti...'),
(447, '447', 'unijeti...'),
(448, '448', 'unijeti...'),
(449, '449', 'unijeti...'),
(450, '450', 'unijeti...'),
(451, '451', 'unijeti...'),
(452, '452', 'unijeti...'),
(453, '453', 'unijeti...'),
(454, '454', 'unijeti...'),
(455, '455', 'unijeti...'),
(456, '456', 'unijeti...'),
(457, '457', 'unijeti...'),
(458, '458', 'unijeti...'),
(459, '459', 'unijeti...'),
(460, '460', 'unijeti...'),
(461, '461', 'unijeti...'),
(462, '462', 'unijeti...'),
(463, '463', 'unijeti...'),
(464, '464', 'unijeti...'),
(465, '465', 'unijeti...'),
(466, '466', 'unijeti...'),
(467, '467', 'unijeti...'),
(468, '468', 'unijeti...'),
(469, '469', 'unijeti...'),
(470, '470', 'unijeti...'),
(471, '471', 'unijeti...'),
(472, '472', 'unijeti...'),
(473, '473', 'unijeti...'),
(474, '474', 'unijeti...'),
(475, '475', 'unijeti...'),
(476, '476', 'unijeti...'),
(477, '477', 'unijeti...'),
(478, '478', 'unijeti...'),
(479, '479', 'unijeti...'),
(480, '480', 'unijeti...'),
(481, '481', 'unijeti...'),
(482, '482', 'unijeti...'),
(483, '483', 'unijeti...'),
(484, '484', 'unijeti...'),
(485, '485', 'unijeti...'),
(486, '486', 'unijeti...'),
(487, '487', 'unijeti...'),
(488, '488', 'unijeti...'),
(489, '489', 'unijeti...'),
(490, '490', 'unijeti...'),
(491, '491', 'unijeti...'),
(492, '492', 'unijeti...'),
(493, '493', 'unijeti...'),
(494, '494', 'unijeti...'),
(495, '495', 'unijeti...'),
(496, '496', 'unijeti...'),
(497, '497', 'unijeti...'),
(498, '498', 'unijeti...'),
(499, '499', 'unijeti...'),
(500, '500', 'unijeti...'),
(501, '501', 'unijeti...'),
(502, '502', 'unijeti...'),
(503, '503', 'unijeti...'),
(504, '504', 'unijeti...'),
(505, '505', 'unijeti...'),
(506, '506', 'unijeti...'),
(507, '507', 'unijeti...'),
(508, '508', 'unijeti...'),
(509, '509', 'unijeti...'),
(510, '510', 'unijeti...'),
(511, '511', 'unijeti...'),
(512, '512', 'unijeti...'),
(513, '513', 'unijeti...'),
(514, '514', 'unijeti...'),
(515, '515', 'unijeti...'),
(516, '516', 'unijeti...'),
(517, '517', 'unijeti...'),
(518, '518', 'unijeti...'),
(519, '519', 'unijeti...'),
(520, '520', 'unijeti...'),
(521, '521', 'unijeti...'),
(522, '522', 'unijeti...'),
(523, '523', 'unijeti...'),
(524, '524', 'unijeti...'),
(525, '525', 'unijeti...'),
(526, '526', 'unijeti...'),
(527, '527', 'unijeti...'),
(528, '528', 'unijeti...'),
(529, '529', 'unijeti...'),
(530, '530', 'unijeti...'),
(531, '531', 'unijeti...'),
(532, '532', 'unijeti...'),
(533, '533', 'unijeti...'),
(534, '534', 'unijeti...'),
(535, '535', 'unijeti...'),
(536, '536', 'unijeti...'),
(537, '537', 'unijeti...'),
(538, '538', 'unijeti...'),
(539, '539', 'unijeti...'),
(540, '540', 'unijeti...'),
(541, '541', 'unijeti...'),
(542, '542', 'unijeti...'),
(543, '543', 'unijeti...'),
(544, '544', 'unijeti...'),
(545, '545', 'unijeti...'),
(546, '546', 'unijeti...'),
(547, '547', 'unijeti...'),
(548, '548', 'unijeti...'),
(549, '549', 'unijeti...'),
(550, '550', 'unijeti...'),
(551, '551', 'unijeti...'),
(552, '552', 'unijeti...'),
(553, '553', 'unijeti...'),
(554, '554', 'unijeti...'),
(555, '555', 'unijeti...'),
(556, '556', 'unijeti...'),
(557, '557', 'unijeti...'),
(558, '558', 'unijeti...'),
(559, '559', 'unijeti...'),
(560, '560', 'unijeti...'),
(561, '561', 'unijeti...'),
(562, '562', 'unijeti...'),
(563, '563', 'unijeti...'),
(564, '564', 'unijeti...'),
(565, '565', 'unijeti...'),
(566, '566', 'unijeti...'),
(567, '567', 'unijeti...'),
(568, '568', 'unijeti...'),
(569, '569', 'unijeti...'),
(570, '570', 'unijeti...'),
(571, '571', 'unijeti...'),
(572, '572', 'unijeti...'),
(573, '573', 'unijeti...'),
(574, '574', 'unijeti...'),
(575, '575', 'unijeti...'),
(576, '576', 'unijeti...'),
(577, '577', 'unijeti...'),
(578, '578', 'unijeti...'),
(579, '579', 'unijeti...'),
(580, '580', 'unijeti...'),
(581, '581', 'unijeti...'),
(582, '582', 'unijeti...'),
(583, '583', 'unijeti...'),
(584, '584', 'unijeti...'),
(585, '585', 'unijeti...'),
(586, '586', 'unijeti...'),
(587, '587', 'unijeti...'),
(588, '588', 'unijeti...'),
(589, '589', 'unijeti...'),
(590, '590', 'unijeti...'),
(591, '591', 'unijeti...'),
(592, '592', 'unijeti...'),
(593, '593', 'unijeti...'),
(594, '594', 'unijeti...'),
(595, '595', 'unijeti...'),
(596, '596', 'unijeti...'),
(597, '597', 'unijeti...'),
(598, '598', 'unijeti...'),
(599, '599', 'unijeti...'),
(600, '600', 'unijeti...'),
(601, '601', 'unijeti...'),
(602, '602', 'unijeti...'),
(603, '603', 'unijeti...'),
(604, '604', 'unijeti...'),
(605, '605', 'unijeti...'),
(606, '606', 'unijeti...'),
(607, '607', 'unijeti...'),
(608, '608', 'unijeti...'),
(609, '609', 'unijeti...'),
(610, '610', 'unijeti...'),
(611, '611', 'unijeti...'),
(612, '612', 'unijeti...'),
(613, '613', 'unijeti...'),
(614, '614', 'unijeti...'),
(615, '615', 'unijeti...'),
(616, '616', 'unijeti...'),
(617, '617', 'unijeti...'),
(618, '618', 'unijeti...'),
(619, '619', 'unijeti...'),
(620, '620', 'unijeti...'),
(621, '621', 'unijeti...'),
(622, '622', 'unijeti...'),
(623, '623', 'unijeti...'),
(624, '624', 'unijeti...'),
(625, '625', 'unijeti...'),
(626, '626', 'unijeti...'),
(627, '627', 'unijeti...'),
(628, '628', 'unijeti...'),
(629, '629', 'unijeti...'),
(630, '630', 'unijeti...'),
(631, '631', 'unijeti...'),
(632, '632', 'unijeti...'),
(633, '633', 'unijeti...'),
(634, '634', 'unijeti...'),
(635, '635', 'unijeti...'),
(636, '636', 'unijeti...'),
(637, '637', 'unijeti...'),
(638, '638', 'unijeti...'),
(639, '639', 'unijeti...'),
(640, '640', 'unijeti...'),
(641, '641', 'unijeti...'),
(642, '642', 'unijeti...'),
(643, '643', 'unijeti...'),
(644, '644', 'unijeti...'),
(645, '645', 'unijeti...'),
(646, '646', 'unijeti...'),
(647, '647', 'unijeti...'),
(648, '648', 'unijeti...'),
(649, '649', 'unijeti...'),
(650, '650', 'unijeti...'),
(651, '651', 'unijeti...'),
(652, '652', 'unijeti...'),
(653, '653', 'unijeti...'),
(654, '654', 'unijeti...'),
(655, '655', 'unijeti...'),
(656, '656', 'unijeti...'),
(657, '657', 'unijeti...'),
(658, '658', 'unijeti...'),
(659, '659', 'unijeti...'),
(660, '660', 'unijeti...'),
(661, '661', 'unijeti...'),
(662, '662', 'unijeti...'),
(663, '663', 'unijeti...'),
(664, '664', 'unijeti...'),
(665, '665', 'unijeti...'),
(666, '666', 'unijeti...'),
(667, '667', 'unijeti...'),
(668, '668', 'unijeti...'),
(669, '669', 'unijeti...'),
(670, '670', 'unijeti...'),
(671, '671', 'unijeti...'),
(672, '672', 'unijeti...'),
(673, '673', 'unijeti...'),
(674, '674', 'unijeti...'),
(675, '675', 'unijeti...'),
(676, '676', 'unijeti...'),
(677, '677', 'unijeti...'),
(678, '678', 'unijeti...'),
(679, '679', 'unijeti...'),
(680, '680', 'unijeti...'),
(681, '681', 'unijeti...'),
(682, '682', 'unijeti...'),
(683, '683', 'unijeti...'),
(684, '684', 'unijeti...'),
(685, '685', 'unijeti...'),
(686, '686', 'unijeti...'),
(687, '687', 'unijeti...'),
(688, '688', 'unijeti...'),
(689, '689', 'unijeti...'),
(690, '690', 'unijeti...'),
(691, '691', 'unijeti...'),
(692, '692', 'unijeti...'),
(693, '693', 'unijeti...'),
(694, '694', 'unijeti...'),
(695, '695', 'unijeti...'),
(696, '696', 'unijeti...'),
(697, '697', 'unijeti...'),
(698, '698', 'unijeti...'),
(699, '699', 'unijeti...'),
(700, '700', 'unijeti...'),
(701, '701', 'unijeti...'),
(702, '702', 'unijeti...'),
(703, '703', 'unijeti...'),
(704, '704', 'unijeti...'),
(705, '705', 'unijeti...'),
(706, '706', 'unijeti...'),
(707, '707', 'unijeti...'),
(708, '708', 'unijeti...'),
(709, '709', 'unijeti...'),
(710, '710', 'unijeti...'),
(711, '711', 'unijeti...'),
(712, '712', 'unijeti...'),
(713, '713', 'unijeti...'),
(714, '714', 'unijeti...'),
(715, '715', 'unijeti...'),
(716, '716', 'unijeti...'),
(717, '717', 'unijeti...'),
(718, '718', 'unijeti...'),
(719, '719', 'unijeti...'),
(720, '720', 'unijeti...'),
(721, '721', 'unijeti...'),
(722, '722', 'unijeti...'),
(723, '723', 'unijeti...'),
(724, '724', 'unijeti...'),
(725, '725', 'unijeti...'),
(726, '726', 'unijeti...'),
(727, '727', 'unijeti...'),
(728, '728', 'unijeti...'),
(729, '729', 'unijeti...'),
(730, '730', 'unijeti...'),
(731, '731', 'unijeti...'),
(732, '732', 'unijeti...'),
(733, '733', 'unijeti...'),
(734, '734', 'unijeti...'),
(735, '735', 'unijeti...'),
(736, '736', 'unijeti...'),
(737, '737', 'unijeti...'),
(738, '738', 'unijeti...'),
(739, '739', 'unijeti...'),
(740, '740', 'unijeti...'),
(741, '741', 'unijeti...'),
(742, '742', 'unijeti...'),
(743, '743', 'unijeti...'),
(744, '744', 'unijeti...'),
(745, '745', 'unijeti...'),
(746, '746', 'unijeti...'),
(747, '747', 'unijeti...'),
(748, '748', 'unijeti...'),
(749, '749', 'unijeti...'),
(750, '750', 'unijeti...'),
(751, '751', 'unijeti...'),
(752, '752', 'unijeti...'),
(753, '753', 'unijeti...'),
(754, '754', 'unijeti...'),
(755, '755', 'unijeti...'),
(756, '756', 'unijeti...'),
(757, '757', 'unijeti...'),
(758, '758', 'unijeti...'),
(759, '759', 'unijeti...'),
(760, '760', 'unijeti...'),
(761, '761', 'unijeti...'),
(762, '762', 'unijeti...'),
(763, '763', 'unijeti...'),
(764, '764', 'unijeti...'),
(765, '765', 'unijeti...'),
(766, '766', 'unijeti...'),
(767, '767', 'unijeti...'),
(768, '768', 'unijeti...'),
(769, '769', 'unijeti...'),
(770, '770', 'unijeti...'),
(771, '771', 'unijeti...'),
(772, '772', 'unijeti...'),
(773, '773', 'unijeti...'),
(774, '774', 'unijeti...'),
(775, '775', 'unijeti...'),
(776, '776', 'unijeti...'),
(777, '777', 'unijeti...'),
(778, '778', 'unijeti...'),
(779, '779', 'unijeti...'),
(780, '780', 'unijeti...'),
(781, '781', 'unijeti...'),
(782, '782', 'unijeti...'),
(783, '783', 'unijeti...'),
(784, '784', 'unijeti...'),
(785, '785', 'unijeti...'),
(786, '786', 'unijeti...'),
(787, '787', 'unijeti...'),
(788, '788', 'unijeti...'),
(789, '789', 'unijeti...'),
(790, '790', 'unijeti...'),
(791, '791', 'unijeti...'),
(792, '792', 'unijeti...'),
(793, '793', 'unijeti...'),
(794, '794', 'unijeti...'),
(795, '795', 'unijeti...'),
(796, '796', 'unijeti...'),
(797, '797', 'unijeti...'),
(798, '798', 'unijeti...'),
(799, '799', 'unijeti...'),
(800, '800', 'unijeti...'),
(801, '801', 'unijeti...'),
(802, '802', 'unijeti...'),
(803, '803', 'unijeti...'),
(804, '804', 'unijeti...'),
(805, '805', 'unijeti...'),
(806, '806', 'unijeti...'),
(807, '807', 'unijeti...'),
(808, '808', 'unijeti...'),
(809, '809', 'unijeti...'),
(810, '810', 'unijeti...'),
(811, '811', 'unijeti...'),
(812, '812', 'unijeti...'),
(813, '813', 'unijeti...'),
(814, '814', 'unijeti...'),
(815, '815', 'unijeti...'),
(816, '816', 'unijeti...'),
(817, '817', 'unijeti...'),
(818, '818', 'unijeti...'),
(819, '819', 'unijeti...'),
(820, '820', 'unijeti...'),
(821, '0', 'unijeti...'),
(822, '0', 'unijeti...'),
(823, '0', 'unijeti...');

-- --------------------------------------------------------

--
-- Table structure for table `KontniPlan`
--

CREATE TABLE IF NOT EXISTS `KontniPlan` (
  `IdKontniPlan` int(11) NOT NULL,
  `Naziv` varchar(45) DEFAULT NULL,
  `DatumKreiranja` datetime DEFAULT NULL,
  `PoslovnaGodina` int(11) DEFAULT NULL,
  `Preduzece_IdPreduzece` int(11) NOT NULL,
  PRIMARY KEY (`IdKontniPlan`),
  KEY `fk_KontniPlan_Preduzece1_idx` (`Preduzece_IdPreduzece`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `KontniPlan`
--

INSERT INTO `KontniPlan` (`IdKontniPlan`, `Naziv`, `DatumKreiranja`, `PoslovnaGodina`, `Preduzece_IdPreduzece`) VALUES
(1, 'Moj kontni planic', '2015-05-05 00:00:00', 2014, 1);

-- --------------------------------------------------------

--
-- Table structure for table `KontniPlan_has_KontniOkvir`
--

CREATE TABLE IF NOT EXISTS `KontniPlan_has_KontniOkvir` (
  `KontniPlan_IdKontniPlan` int(11) NOT NULL,
  `KontniOkvir_Id` int(11) NOT NULL,
  PRIMARY KEY (`KontniPlan_IdKontniPlan`,`KontniOkvir_Id`),
  KEY `fk_KontniPlan_has_KontniOkvir_KontniOkvir1_idx` (`KontniOkvir_Id`),
  KEY `fk_KontniPlan_has_KontniOkvir_KontniPlan1_idx` (`KontniPlan_IdKontniPlan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `KontniPlan_has_KontniOkvir`
--

INSERT INTO `KontniPlan_has_KontniOkvir` (`KontniPlan_IdKontniPlan`, `KontniOkvir_Id`) VALUES
(1, 10),
(1, 11);

-- --------------------------------------------------------

--
-- Table structure for table `Korisnik`
--

CREATE TABLE IF NOT EXISTS `Korisnik` (
  `Id` int(11) NOT NULL,
  `Ime` varchar(20) DEFAULT NULL,
  `Prezime` varchar(20) DEFAULT NULL,
  `KorisnickoIme` varchar(12) DEFAULT NULL,
  `Lozinka` varchar(10) DEFAULT NULL,
  `Adresa` varchar(45) DEFAULT NULL,
  `JMBG` int(13) NOT NULL,
  `Telefon` int(11) DEFAULT NULL,
  `Fax` int(11) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `KorisnikTipovi_Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Ime_UNIQUE` (`Ime`),
  KEY `fk_Korisnik_KorisnikTipovi_idx` (`KorisnikTipovi_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Korisnik`
--

INSERT INTO `Korisnik` (`Id`, `Ime`, `Prezime`, `KorisnickoIme`, `Lozinka`, `Adresa`, `JMBG`, `Telefon`, `Fax`, `Email`, `KorisnikTipovi_Id`) VALUES
(1, 'Faruk', 'Mustafic', 'tms1337', '44253432', 'Jana 2', NULL, NULL, NULL, NULL, 1),
(2, 'Nejra', 'Pasic', 'nejrich', 'bilosta', 'Jana 3', NULL, NULL, NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `KorisnikTipovi`
--

CREATE TABLE IF NOT EXISTS `KorisnikTipovi` (
  `Id` int(11) NOT NULL,
  `Naziv` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `KorisnikTipovi`
--

INSERT INTO `KorisnikTipovi` (`Id`, `Naziv`) VALUES
(1, 'Administrator'),
(2, 'Racunovodja');

-- --------------------------------------------------------

--
-- Table structure for table `Nalozi`
--

CREATE TABLE IF NOT EXISTS `Nalozi` (
  `Id` int(11) NOT NULL,
  `DatumKnjizenja` datetime DEFAULT NULL,
  `Status` bit(1) DEFAULT NULL,
  `Nalozicol` varchar(45) DEFAULT NULL,
  `Preduzece_IdPreduzece` int(11) NOT NULL,
  `Korisnik_Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_Nalozi_Preduzece1_idx` (`Preduzece_IdPreduzece`),
  KEY `fk_Nalozi_Korisnik1_idx` (`Korisnik_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Preduzece`
--

CREATE TABLE IF NOT EXISTS `Preduzece` (
  `IdPreduzece` int(11) NOT NULL,
  `Naziv` varchar(45) DEFAULT NULL,
  `Opis` varchar(45) DEFAULT NULL,
  `Adresa` varchar(45) DEFAULT NULL,
  `Telefon` varchar(20) DEFAULT NULL,
  `Fax` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IdPreduzece`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Preduzece`
--

INSERT INTO `Preduzece` (`IdPreduzece`, `Naziv`, `Opis`, `Adresa`, `Telefon`, `Fax`) VALUES
(1, 'ocb', 'lajk', NULL, NULL, NULL),
(2, 'super-preduzece', 'superrr', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `StavkeNaloga`
--

CREATE TABLE IF NOT EXISTS `StavkeNaloga` (
  `Id` int(11) NOT NULL,
  `Naziv` varchar(45) DEFAULT NULL,
  `DatumKreiranja` datetime DEFAULT NULL,
  `Duguje` decimal(18,2) DEFAULT NULL,
  `Potrazuje` decimal(18,2) DEFAULT NULL,
  `Nalozi_Id` int(11) NOT NULL,
  `Dokumenti_Id` int(11) NOT NULL,
  `Dokumenti_VrstaDokumenta_Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `fk_StavkeNaloga_Nalozi1_idx` (`Nalozi_Id`),
  KEY `fk_StavkeNaloga_Dokumenti1_idx` (`Dokumenti_Id`,`Dokumenti_VrstaDokumenta_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `VrstaDokumenta`
--

CREATE TABLE IF NOT EXISTS `VrstaDokumenta` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Naziv` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Dokumenti`
--
ALTER TABLE `Dokumenti`
  ADD CONSTRAINT `fk_Dokumenti_VrstaDokumenta1` FOREIGN KEY (`VrstaDokumenta_Id`) REFERENCES `VrstaDokumenta` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Klijent_has_Preduzece`
--
ALTER TABLE `Klijent_has_Preduzece`
  ADD CONSTRAINT `fk_Klijent_has_Preduzece_Klijent1` FOREIGN KEY (`Klijent_Id`) REFERENCES `Klijent` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Klijent_has_Preduzece_Preduzece1` FOREIGN KEY (`Preduzece_IdPreduzece`) REFERENCES `Preduzece` (`IdPreduzece`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `KontniPlan`
--
ALTER TABLE `KontniPlan`
  ADD CONSTRAINT `fk_KontniPlan_Preduzece1` FOREIGN KEY (`Preduzece_IdPreduzece`) REFERENCES `Preduzece` (`IdPreduzece`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `KontniPlan_has_KontniOkvir`
--
ALTER TABLE `KontniPlan_has_KontniOkvir`
  ADD CONSTRAINT `fk_KontniPlan_has_KontniOkvir_KontniPlan1` FOREIGN KEY (`KontniPlan_IdKontniPlan`) REFERENCES `KontniPlan` (`IdKontniPlan`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_KontniPlan_has_KontniOkvir_KontniOkvir1` FOREIGN KEY (`KontniOkvir_Id`) REFERENCES `KontniOkvir` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Korisnik`
--
ALTER TABLE `Korisnik`
  ADD CONSTRAINT `fk_Korisnik_KorisnikTipovi` FOREIGN KEY (`KorisnikTipovi_Id`) REFERENCES `KorisnikTipovi` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `Nalozi`
--
ALTER TABLE `Nalozi`
  ADD CONSTRAINT `fk_Nalozi_Preduzece1` FOREIGN KEY (`Preduzece_IdPreduzece`) REFERENCES `Preduzece` (`IdPreduzece`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Nalozi_Korisnik1` FOREIGN KEY (`Korisnik_Id`) REFERENCES `Korisnik` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `StavkeNaloga`
--
ALTER TABLE `StavkeNaloga`
  ADD CONSTRAINT `fk_StavkeNaloga_Nalozi1` FOREIGN KEY (`Nalozi_Id`) REFERENCES `Nalozi` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_StavkeNaloga_Dokumenti1` FOREIGN KEY (`Dokumenti_Id`, `Dokumenti_VrstaDokumenta_Id`) REFERENCES `Dokumenti` (`Id`, `VrstaDokumenta_Id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
