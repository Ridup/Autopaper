/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.6.36 : Database - auto_paper
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`auto_paper` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `auto_paper`;

/*Table structure for table `courses_info` */

DROP TABLE IF EXISTS `courses_info`;

CREATE TABLE `courses_info` (
  `COURSE_ID` int(3) NOT NULL AUTO_INCREMENT COMMENT '课程（知识点）ID',
  `GRADE` char(3) DEFAULT NULL COMMENT '年级',
  `GRADE_NAME` varchar(64) DEFAULT NULL COMMENT '年级名称',
  `COURSE` char(10) DEFAULT NULL COMMENT '学科',
  `COURSE_NAME` varchar(128) DEFAULT NULL COMMENT '学科名称',
  `VERSION` char(3) DEFAULT NULL COMMENT '学科版本',
  `VERSION_NAME` varchar(64) DEFAULT NULL COMMENT '学科版本名称',
  `CHAPTER` char(3) DEFAULT NULL COMMENT '章节',
  `CHAPTER_NAME` varchar(64) DEFAULT NULL COMMENT '章节名称',
  `POINT` char(3) DEFAULT NULL COMMENT '知识点',
  `POINT_NAME` varchar(10240) DEFAULT NULL COMMENT '知识点名称',
  PRIMARY KEY (`COURSE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=367 DEFAULT CHARSET=utf8;

/*Data for the table `courses_info` */

insert  into `courses_info`(`COURSE_ID`,`GRADE`,`GRADE_NAME`,`COURSE`,`COURSE_NAME`,`VERSION`,`VERSION_NAME`,`CHAPTER`,`CHAPTER_NAME`,`POINT`,`POINT_NAME`) values 
(259,'G07','初一','shuxue','数学','V01','人教版','T01','第1章 数学','P01','拼音拼音拼音'),
(260,'G07','初一','yuwen','语文','V01','人教版','T01','第1章 语文','P01','拼音拼音拼音'),
(261,'G07','初一','yingyu','英语','V01','人教版','T01','第1章 英语','P01','拼音拼音拼音'),
(262,'G07','初一','wuli','物理','V01','人教版','T01','第1章 物理','P01','拼音拼音拼音'),
(263,'G07','初一','huaxue','化学','V01','人教版','T01','第1章 化学','P01','拼音拼音拼音'),
(264,'G07','初一','dili','地理','V01','人教版','T01','第1章 地理','P01','拼音拼音拼音'),
(265,'G07','初一','shengwu','生物','V01','人教版','T01','第1章 生物','P01','拼音拼音拼音'),
(266,'G07','初一','lishi','历史','V01','人教版','T01','第1章 历史','P01','拼音拼音拼音'),
(267,'G07','初一','zhengzhi','政治','V01','人教版','T01','第1章 政治','P01','拼音拼音拼音'),
(268,'G07','初一','shuxue','数学','V01','人教版','T02','第2章 数学2','P01','拼音拼音拼音'),
(269,'G07','初一','yuwen','语文','V01','人教版','T02','第2章 语文2','P01','拼音拼音拼音'),
(270,'G07','初一','yingyu','英语','V01','人教版','T02','第2章 英语2','P01','拼音拼音拼音'),
(271,'G07','初一','wuli','物理','V01','人教版','T02','第2章 物理2','P01','拼音拼音拼音'),
(272,'G07','初一','huaxue','化学','V01','人教版','T02','第2章 化学2','P01','拼音拼音拼音'),
(273,'G07','初一','dili','地理','V01','人教版','T02','第2章 地理2','P01','拼音拼音拼音'),
(274,'G07','初一','shengwu','生物','V01','人教版','T02','第2章 生物2','P01','拼音拼音拼音'),
(275,'G07','初一','lishi','历史','V01','人教版','T02','第2章 历史2','P01','拼音拼音拼音'),
(276,'G07','初一','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P01','拼音拼音拼音'),
(277,'G07','初一','shuxue','数学','V01','人教版','T02','第2章 数学2','P02','拼音拼音拼音'),
(278,'G07','初一','yuwen','语文','V01','人教版','T02','第2章 语文2','P02','拼音拼音拼音'),
(279,'G07','初一','yingyu','英语','V01','人教版','T02','第2章 英语2','P02','拼音拼音拼音'),
(280,'G07','初一','wuli','物理','V01','人教版','T02','第2章 物理2','P02','拼音拼音拼音'),
(281,'G07','初一','huaxue','化学','V01','人教版','T02','第2章 化学2','P02','拼音拼音拼音'),
(282,'G07','初一','dili','地理','V01','人教版','T02','第2章 地理2','P02','拼音拼音拼音'),
(283,'G07','初一','shengwu','生物','V01','人教版','T02','第2章 生物2','P02','拼音拼音拼音'),
(284,'G07','初一','lishi','历史','V01','人教版','T02','第2章 历史2','P02','拼音拼音拼音'),
(285,'G07','初一','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P02','拼音拼音拼音'),
(286,'G07','初一','shuxue','数学','V02','北师大版','T01','第1章 数学','P01','拼音拼音拼音'),
(287,'G07','初一','yuwen','语文','V02','北师大版','T01','第1章 语文','P01','拼音拼音拼音'),
(288,'G07','初一','yingyu','英语','V02','北师大版','T01','第1章 英语','P01','拼音拼音拼音'),
(289,'G07','初一','wuli','物理','V02','北师大版','T01','第1章 物理','P01','拼音拼音拼音'),
(290,'G07','初一','huaxue','化学','V02','北师大版','T01','第1章 化学','P01','拼音拼音拼音'),
(291,'G07','初一','dili','地理','V02','北师大版','T01','第1章 地理','P01','拼音拼音拼音'),
(292,'G07','初一','shengwu','生物','V02','北师大版','T01','第1章 生物','P01','拼音拼音拼音'),
(293,'G07','初一','lishi','历史','V02','北师大版','T01','第1章 历史','P01','拼音拼音拼音'),
(294,'G07','初一','zhengzhi','政治','V02','北师大版','T01','第1章 政治','P01','拼音拼音拼音'),
(295,'G08','初二','shuxue','数学','V01','人教版','T01','第1章 数学','P01','拼音拼音拼音'),
(296,'G08','初二','yuwen','语文','V01','人教版','T01','第1章 语文','P01','拼音拼音拼音'),
(297,'G08','初二','yingyu','英语','V01','人教版','T01','第1章 英语','P01','拼音拼音拼音'),
(298,'G08','初二','wuli','物理','V01','人教版','T01','第1章 物理','P01','拼音拼音拼音'),
(299,'G08','初二','huaxue','化学','V01','人教版','T01','第1章 化学','P01','拼音拼音拼音'),
(300,'G08','初二','dili','地理','V01','人教版','T01','第1章 地理','P01','拼音拼音拼音'),
(301,'G08','初二','shengwu','生物','V01','人教版','T01','第1章 生物','P01','拼音拼音拼音'),
(302,'G08','初二','lishi','历史','V01','人教版','T01','第1章 历史','P01','拼音拼音拼音'),
(303,'G08','初二','zhengzhi','政治','V01','人教版','T01','第1章 政治','P01','拼音拼音拼音'),
(304,'G08','初二','shuxue','数学','V01','人教版','T02','第2章 数学2','P01','拼音拼音拼音'),
(305,'G08','初二','yuwen','语文','V01','人教版','T02','第2章 语文2','P01','拼音拼音拼音'),
(306,'G08','初二','yingyu','英语','V01','人教版','T02','第2章 英语2','P01','拼音拼音拼音'),
(307,'G08','初二','wuli','物理','V01','人教版','T02','第2章 物理2','P01','拼音拼音拼音'),
(308,'G08','初二','huaxue','化学','V01','人教版','T02','第2章 化学2','P01','拼音拼音拼音'),
(309,'G08','初二','dili','地理','V01','人教版','T02','第2章 地理2','P01','拼音拼音拼音'),
(310,'G08','初二','shengwu','生物','V01','人教版','T02','第2章 生物2','P01','拼音拼音拼音'),
(311,'G08','初二','lishi','历史','V01','人教版','T02','第2章 历史2','P01','拼音拼音拼音'),
(312,'G08','初二','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P01','拼音拼音拼音'),
(313,'G08','初二','shuxue','数学','V01','人教版','T02','第2章 数学2','P02','拼音拼音拼音'),
(314,'G08','初二','yuwen','语文','V01','人教版','T02','第2章 语文2','P02','拼音拼音拼音'),
(315,'G08','初二','yingyu','英语','V01','人教版','T02','第2章 英语2','P02','拼音拼音拼音'),
(316,'G08','初二','wuli','物理','V01','人教版','T02','第2章 物理2','P02','拼音拼音拼音'),
(317,'G08','初二','huaxue','化学','V01','人教版','T02','第2章 化学2','P02','拼音拼音拼音'),
(318,'G08','初二','dili','地理','V01','人教版','T02','第2章 地理2','P02','拼音拼音拼音'),
(319,'G08','初二','shengwu','生物','V01','人教版','T02','第2章 生物2','P02','拼音拼音拼音'),
(320,'G08','初二','lishi','历史','V01','人教版','T02','第2章 历史2','P02','拼音拼音拼音'),
(321,'G08','初二','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P02','拼音拼音拼音'),
(322,'G08','初二','shuxue','数学','V02','北师大版','T01','第1章 数学','P01','拼音拼音拼音'),
(323,'G08','初二','yuwen','语文','V02','北师大版','T01','第1章 语文','P01','拼音拼音拼音'),
(324,'G08','初二','yingyu','英语','V02','北师大版','T01','第1章 英语','P01','拼音拼音拼音'),
(325,'G08','初二','wuli','物理','V02','北师大版','T01','第1章 物理','P01','拼音拼音拼音'),
(326,'G08','初二','huaxue','化学','V02','北师大版','T01','第1章 化学','P01','拼音拼音拼音'),
(327,'G08','初二','dili','地理','V02','北师大版','T01','第1章 地理','P01','拼音拼音拼音'),
(328,'G08','初二','shengwu','生物','V02','北师大版','T01','第1章 生物','P01','拼音拼音拼音'),
(329,'G08','初二','lishi','历史','V02','北师大版','T01','第1章 历史','P01','拼音拼音拼音'),
(330,'G08','初二','zhengzhi','政治','V02','北师大版','T01','第1章 政治','P01','拼音拼音拼音'),
(331,'G09','初三','shuxue','数学','V01','人教版','T01','第1章 数学','P01','拼音拼音拼音'),
(332,'G09','初三','yuwen','语文','V01','人教版','T01','第1章 语文','P01','拼音拼音拼音'),
(333,'G09','初三','yingyu','英语','V01','人教版','T01','第1章 英语','P01','拼音拼音拼音'),
(334,'G09','初三','wuli','物理','V01','人教版','T01','第1章 物理','P01','拼音拼音拼音'),
(335,'G09','初三','huaxue','化学','V01','人教版','T01','第1章 化学','P01','拼音拼音拼音'),
(336,'G09','初三','dili','地理','V01','人教版','T01','第1章 地理','P01','拼音拼音拼音'),
(337,'G09','初三','shengwu','生物','V01','人教版','T01','第1章 生物','P01','拼音拼音拼音'),
(338,'G09','初三','lishi','历史','V01','人教版','T01','第1章 历史','P01','拼音拼音拼音'),
(339,'G09','初三','zhengzhi','政治','V01','人教版','T01','第1章 政治','P01','拼音拼音拼音'),
(340,'G09','初三','shuxue','数学','V01','人教版','T02','第2章 数学2','P01','拼音拼音拼音'),
(341,'G09','初三','yuwen','语文','V01','人教版','T02','第2章 语文2','P01','拼音拼音拼音'),
(342,'G09','初三','yingyu','英语','V01','人教版','T02','第2章 英语2','P01','拼音拼音拼音'),
(343,'G09','初三','wuli','物理','V01','人教版','T02','第2章 物理2','P01','拼音拼音拼音'),
(344,'G09','初三','huaxue','化学','V01','人教版','T02','第2章 化学2','P01','拼音拼音拼音'),
(345,'G09','初三','dili','地理','V01','人教版','T02','第2章 地理2','P01','拼音拼音拼音'),
(346,'G09','初三','shengwu','生物','V01','人教版','T02','第2章 生物2','P01','拼音拼音拼音'),
(347,'G09','初三','lishi','历史','V01','人教版','T02','第2章 历史2','P01','拼音拼音拼音'),
(348,'G09','初三','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P01','拼音拼音拼音'),
(349,'G09','初三','shuxue','数学','V01','人教版','T02','第2章 数学2','P02','拼音拼音拼音'),
(350,'G09','初三','yuwen','语文','V01','人教版','T02','第2章 语文2','P02','拼音拼音拼音'),
(351,'G09','初三','yingyu','英语','V01','人教版','T02','第2章 英语2','P02','拼音拼音拼音'),
(352,'G09','初三','wuli','物理','V01','人教版','T02','第2章 物理2','P02','拼音拼音拼音'),
(353,'G09','初三','huaxue','化学','V01','人教版','T02','第2章 化学2','P02','拼音拼音拼音'),
(354,'G09','初三','dili','地理','V01','人教版','T02','第2章 地理2','P02','拼音拼音拼音'),
(355,'G09','初三','shengwu','生物','V01','人教版','T02','第2章 生物2','P02','拼音拼音拼音'),
(356,'G09','初三','lishi','历史','V01','人教版','T02','第2章 历史2','P02','拼音拼音拼音'),
(357,'G09','初三','zhengzhi','政治','V01','人教版','T02','第2章 政治2','P02','拼音拼音拼音'),
(358,'G09','初三','shuxue','数学','V02','北师大版','T01','第1章 数学','P01','拼音拼音拼音'),
(359,'G09','初三','yuwen','语文','V02','北师大版','T01','第1章 语文','P01','拼音拼音拼音'),
(360,'G09','初三','yingyu','英语','V02','北师大版','T01','第1章 英语','P01','拼音拼音拼音'),
(361,'G09','初三','wuli','物理','V02','北师大版','T01','第1章 物理','P01','拼音拼音拼音'),
(362,'G09','初三','huaxue','化学','V02','北师大版','T01','第1章 化学','P01','拼音拼音拼音'),
(363,'G09','初三','dili','地理','V02','北师大版','T01','第1章 地理','P01','拼音拼音拼音'),
(364,'G09','初三','shengwu','生物','V02','北师大版','T01','第1章 生物','P01','拼音拼音拼音'),
(365,'G09','初三','lishi','历史','V02','北师大版','T01','第1章 历史','P01','拼音拼音拼音'),
(366,'G09','初三','zhengzhi','政治','V02','北师大版','T01','第1章 政治','P01','拼音拼音拼音');

/*Table structure for table `paper` */

DROP TABLE IF EXISTS `paper`;

CREATE TABLE `paper` (
  `PAPER_ID` int(32) NOT NULL AUTO_INCREMENT COMMENT '试卷ID',
  `PAPER_NAME` varchar(64) DEFAULT NULL COMMENT '试卷名称',
  `TYPE_COUNT_COLLECTION` varchar(8000) DEFAULT NULL COMMENT '类型题数集合:题型、大题数目、大题分钟数',
  `PAPER_DIFFICULTY` double DEFAULT NULL COMMENT '试卷难度',
  `PAPER_HOT` int(10) DEFAULT NULL COMMENT '试卷热度',
  `PAPER_GRADE_ID` varchar(32) DEFAULT NULL COMMENT '试卷适应年级ID',
  `PAPER_GRADE_NAME` varchar(128) DEFAULT NULL COMMENT '试卷适应年级名称',
  `PAPER_COURSE_ID` char(10) DEFAULT NULL COMMENT '试卷适应科目ID',
  `PAPER_COURSE_NAME` varchar(128) DEFAULT NULL COMMENT '试卷适应科目名称',
  `PAPER_VERSION` varchar(128) DEFAULT NULL COMMENT '试卷适应科目版本',
  `PAPER_SCORES` varchar(100) DEFAULT NULL COMMENT '分值:对应树结构节点',
  `TOTAL` int(3) DEFAULT NULL COMMENT '试题总数',
  `SCORE` int(3) DEFAULT NULL COMMENT '试卷总分',
  `TIME` int(3) DEFAULT NULL COMMENT '试卷测试分钟数',
  `PAPER_URL` varchar(256) DEFAULT NULL COMMENT '试卷下载链接',
  `OWNER` int(10) DEFAULT NULL COMMENT '创建者',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`PAPER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

/*Data for the table `paper` */

insert  into `paper`(`PAPER_ID`,`PAPER_NAME`,`TYPE_COUNT_COLLECTION`,`PAPER_DIFFICULTY`,`PAPER_HOT`,`PAPER_GRADE_ID`,`PAPER_GRADE_NAME`,`PAPER_COURSE_ID`,`PAPER_COURSE_NAME`,`PAPER_VERSION`,`PAPER_SCORES`,`TOTAL`,`SCORE`,`TIME`,`PAPER_URL`,`OWNER`,`CREATE_TIME`) values 
(32,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[9,10]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[62,63]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":2,\"questionTypeScore\":7,\"questionTypeTime\":8,\"questionTypeDiffi\":6,\"questionIds\":[108,223]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,6,19,20,'/doc/初一数学试卷2018年05月18日13时48分47秒23.doc',23,'2018-05-18 13:48:47'),
(33,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":15,\"questionTypeTime\":15,\"questionTypeDiffi\":5,\"questionIds\":[9,10,11,12,13]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[62,63]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":2,\"questionTypeScore\":7,\"questionTypeTime\":8,\"questionTypeDiffi\":6,\"questionIds\":[108,223]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,9,28,29,'/doc/初一数学试卷2018年05月18日16时18分27秒23.doc',23,'2018-05-18 16:18:28'),
(34,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":4,\"questionTypeScore\":12,\"questionTypeTime\":12,\"questionTypeDiffi\":4,\"questionIds\":[9,12,13,15]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[64,65]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":5,\"questionTypeScore\":15,\"questionTypeTime\":25,\"questionTypeDiffi\":15,\"questionIds\":[225,226,227,228,229]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,11,33,43,'/doc/初一数学试卷2018年05月18日16时21分13秒23.doc',23,'2018-05-18 16:21:14'),
(35,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":3,\"questionTypeScore\":9,\"questionTypeTime\":9,\"questionTypeDiffi\":3,\"questionIds\":[11,12,13]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":1,\"questionTypeScore\":3,\"questionTypeTime\":3,\"questionTypeDiffi\":1,\"questionIds\":[62]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":1,\"questionTypeScore\":4,\"questionTypeTime\":3,\"questionTypeDiffi\":3,\"questionIds\":[108]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,5,16,15,'/doc/初一数学试卷2018年05月18日16时21分40秒23.doc',23,'2018-05-18 16:21:41'),
(36,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":3,\"questionTypeScore\":9,\"questionTypeTime\":9,\"questionTypeDiffi\":3,\"questionIds\":[11,10,9]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[65,64]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":10,\"questionTypeDiffi\":6,\"questionIds\":[225,224]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,7,21,25,'/doc/初一数学试卷2018年05月18日16时21分59秒23.doc',23,'2018-05-18 16:21:59'),
(37,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[9,10]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[62,63]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":3,\"questionTypeScore\":10,\"questionTypeTime\":13,\"questionTypeDiffi\":9,\"questionIds\":[223,108,224]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,7,22,25,'/doc/初一数学试卷2018年05月18日16时22分17秒23.doc',23,'2018-05-18 16:22:18'),
(38,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[9,10]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":3,\"questionTypeScore\":9,\"questionTypeTime\":9,\"questionTypeDiffi\":3,\"questionIds\":[62,63,64]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":3,\"questionTypeScore\":10,\"questionTypeTime\":13,\"questionTypeDiffi\":9,\"questionIds\":[108,223,224]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,8,25,28,'/doc/初一数学试卷2018年05月18日16时23分15秒23.doc',23,'2018-05-18 16:23:15'),
(39,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[10,11]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":2,\"questionIds\":[62,63]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,4,12,12,'/doc/初一数学试卷2018年05月18日16时23分28秒23.doc',23,'2018-05-18 16:23:28'),
(40,'2018年05月18日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":3,\"questionTypeScore\":9,\"questionTypeTime\":9,\"questionTypeDiffi\":3,\"questionIds\":[11,13,15]}]',1,0,'G07','初一','shuxue','数学',NULL,NULL,3,9,9,'/doc/初一数学试卷2018年05月18日16时23分38秒23.doc',23,'2018-05-18 16:23:38'),
(41,'2018年05月19日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":15,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[9,10,11,12,13]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":7,\"questionTypeTime\":8,\"questionTypeDiffi\":0,\"questionIds\":[108,223]}]',0.2,0,'G07','初一','shuxue','数学',NULL,NULL,7,22,23,'/doc/初一数学试卷2018年05月19日21时05分45秒23.doc',23,'2018-05-19 21:05:45'),
(42,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[20,57,23,9,33]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[123,156,75,80,153]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,30,'/doc/初一数学试卷2018年05月22日19时21分40秒23.doc',23,'2018-05-22 19:21:40'),
(43,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[26,51,48,50,25]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[131,132,135,65,149]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,30,'/doc/初一数学试卷2018年05月22日19时24分39秒23.doc',23,'2018-05-22 19:24:39'),
(44,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[21,13,59,24,52]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[92,104,74,71,89]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,30,'/doc/初一数学试卷2018年05月22日19时27分06秒23.doc',23,'2018-05-22 19:27:06'),
(45,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[58,50,28,53,15]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[135,171,69,129,131]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,30,'/doc/初一数学试卷2018年05月22日19时38分07秒23.doc',23,'2018-05-22 19:38:08'),
(46,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":5,\"questionTypeScore\":50,\"questionTypeTime\":15,\"questionTypeDiffi\":0,\"questionIds\":[50,33,54,19,57]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":1,\"questionTypeScore\":10,\"questionTypeTime\":3,\"questionTypeDiffi\":0,\"questionIds\":[162]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,60,60,18,'/doc/初一数学试卷2018年05月22日19时38分36秒23.doc',23,'2018-05-22 19:38:36'),
(47,'2018年05月22日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":10,\"questionTypeScore\":50,\"questionTypeTime\":30,\"questionTypeDiffi\":0,\"questionIds\":[22,48,51,39,15,33,20,55,38,41]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":10,\"questionTypeScore\":50,\"questionTypeTime\":38,\"questionTypeDiffi\":0,\"questionIds\":[120,87,91,255,255,166,255,141,110,255]}]',0.2,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,68,'/doc/初一数学试卷2018年05月22日21时26分53秒23.doc',23,'2018-05-22 21:26:53'),
(48,'2018年05月23日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":7,\"questionTypeScore\":21,\"questionTypeTime\":21,\"questionTypeDiffi\":0,\"questionIds\":[10,11,9,11,9,10,11]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":6,\"questionTypeDiffi\":0,\"questionIds\":[62,63]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":2,\"questionTypeScore\":6,\"questionTypeTime\":10,\"questionTypeDiffi\":0,\"questionIds\":[237,238]}]',0.2,0,'G07','初一','shuxue','数学',NULL,NULL,11,33,37,'/doc/初一数学试卷2018年05月23日12时52分26秒23.doc',23,'2018-05-23 12:52:26'),
(49,'2018年05月24日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":4,\"questionTypeScore\":12,\"questionTypeTime\":12,\"questionTypeDiffi\":0,\"questionIds\":[9,9,10,11]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,4,12,12,'/doc/初一数学试卷2018年05月24日23时10分13秒23.doc',23,'2018-05-24 23:10:13'),
(50,'2018年05月26日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":10,\"questionTypeScore\":30,\"questionTypeTime\":30,\"questionTypeDiffi\":0,\"questionIds\":[43,58,50,42,17,11,33,44,21,13]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":10,\"questionTypeScore\":30,\"questionTypeTime\":30,\"questionTypeDiffi\":0,\"questionIds\":[161,82,130,152,98,105,257,95,83,128]},{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"typeNumName\":\"三\",\"questionCount\":10,\"questionTypeScore\":40,\"questionTypeTime\":48,\"questionTypeDiffi\":0,\"questionIds\":[230,108,245,238,229,249,244,250,234,240]}]',0.26899999999999996,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,108,'/doc/初一数学试卷2018年05月26日00时29分15秒23.doc',23,'2018-05-26 00:29:15'),
(51,'2018年05月26日初一数学试卷','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"typeNumName\":\"一\",\"questionCount\":10,\"questionTypeScore\":50,\"questionTypeTime\":30,\"questionTypeDiffi\":0,\"questionIds\":[14,53,39,27,18,31,42,55,51,22]},{\"questionType\":\"102\",\"questionTypeName\":\"判断题\",\"typeNumName\":\"二\",\"questionCount\":10,\"questionTypeScore\":50,\"questionTypeTime\":30,\"questionTypeDiffi\":0,\"questionIds\":[80,85,164,111,107,99,64,146,151,137]}]',0.1,0,'G07','初一','shuxue','数学',NULL,NULL,100,100,60,'/doc/初一数学试卷2018年05月26日08时26分13秒23.doc',23,'2018-05-26 08:26:14');

/*Table structure for table `paper_comment` */

DROP TABLE IF EXISTS `paper_comment`;

CREATE TABLE `paper_comment` (
  `PAPER_COMMENT_ID` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '试卷评论ID',
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `PAPER_ID` int(32) NOT NULL COMMENT '试卷ID',
  `PAPER_COMMENT` varchar(10240) NOT NULL COMMENT '试卷评论',
  `PAPER_COMMENT_TIME` datetime NOT NULL COMMENT '试卷评论时间',
  `PAPER_COMMENT_PRAISE` int(11) DEFAULT NULL COMMENT '试卷评论赞数',
  `STATUS` char(3) DEFAULT NULL COMMENT '状态：001审核中；002审核通过；003审核不通过；004已删除',
  PRIMARY KEY (`PAPER_COMMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `paper_comment` */

insert  into `paper_comment`(`PAPER_COMMENT_ID`,`USER_ID`,`PAPER_ID`,`PAPER_COMMENT`,`PAPER_COMMENT_TIME`,`PAPER_COMMENT_PRAISE`,`STATUS`) values 
(1,23,32,'232安尔碘啥多','2018-05-25 18:38:31',NULL,'002'),
(2,23,32,'大萨达','2018-05-25 18:38:57',NULL,'002'),
(3,23,32,'热热饭都是','2018-05-25 18:39:00',NULL,'002'),
(4,23,32,'dsa都是','2018-05-25 18:39:02',NULL,'002'),
(5,10,32,'迭代','2018-05-25 23:49:42',NULL,'002');

/*Table structure for table `paper_download` */

DROP TABLE IF EXISTS `paper_download`;

CREATE TABLE `paper_download` (
  `PAPER_ID` int(32) NOT NULL COMMENT '试卷ID',
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `PAPER_NAME` varchar(128) DEFAULT NULL COMMENT '试卷名称',
  `USER_NAME` varchar(32) DEFAULT NULL COMMENT '用户姓名',
  `DOWNLOAD_TIME` datetime DEFAULT NULL COMMENT '下载时间',
  PRIMARY KEY (`PAPER_ID`,`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_download` */

insert  into `paper_download`(`PAPER_ID`,`USER_ID`,`PAPER_NAME`,`USER_NAME`,`DOWNLOAD_TIME`) values 
(32,23,'2018年05月18日初一数学试卷',NULL,'2018-05-25 01:22:03'),
(33,23,'2018年05月18日初一数学试卷',NULL,'2018-05-25 11:27:21'),
(36,23,'2018年05月18日初一数学试卷',NULL,'2018-05-25 11:27:24'),
(38,23,'2018年05月18日初一数学试卷',NULL,'2018-05-25 11:27:26'),
(41,23,'2018年05月19日初一数学试卷',NULL,'2018-05-25 11:04:11'),
(50,23,'2018年05月26日初一数学试卷',NULL,'2018-05-26 00:29:17'),
(51,23,'2018年05月26日初一数学试卷',NULL,'2018-05-26 08:26:14');

/*Table structure for table `paper_fav` */

DROP TABLE IF EXISTS `paper_fav`;

CREATE TABLE `paper_fav` (
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `PAPER_ID` int(32) NOT NULL COMMENT '试卷编号',
  `COLLECT_TIME` datetime DEFAULT NULL COMMENT '收藏时间',
  `PAPER_DIFFICULTY` int(1) DEFAULT NULL COMMENT '试卷难度',
  PRIMARY KEY (`USER_ID`,`PAPER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `paper_fav` */

insert  into `paper_fav`(`USER_ID`,`PAPER_ID`,`COLLECT_TIME`,`PAPER_DIFFICULTY`) values 
(23,32,'2018-05-26 00:01:12',NULL),
(23,51,'2018-05-26 08:26:44',NULL);

/*Table structure for table `paper_test` */

DROP TABLE IF EXISTS `paper_test`;

CREATE TABLE `paper_test` (
  `TEST_ID` int(32) NOT NULL AUTO_INCREMENT COMMENT '测试ID',
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `PAPER_ID` int(32) NOT NULL COMMENT '试卷ID',
  `PAPER_NAME` varchar(128) DEFAULT NULL COMMENT '试卷名称',
  `ANSWER_TIME` int(3) DEFAULT NULL COMMENT '答卷时间',
  `TEST_SCORE` double DEFAULT NULL COMMENT '测试总分',
  `TOTAL_SCORE` double DEFAULT NULL COMMENT '试卷总分',
  `COST_TIME` int(3) DEFAULT NULL COMMENT '花费时间',
  `TEST_ANSWER` varchar(20240) DEFAULT NULL COMMENT '测试回答集合',
  `START_TIME` datetime DEFAULT NULL COMMENT '开始时间',
  PRIMARY KEY (`TEST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `paper_test` */

insert  into `paper_test`(`TEST_ID`,`USER_ID`,`PAPER_ID`,`PAPER_NAME`,`ANSWER_TIME`,`TEST_SCORE`,`TOTAL_SCORE`,`COST_TIME`,`TEST_ANSWER`,`START_TIME`) values 
(13,23,36,'2018年05月18日初一数学试卷',25,6,7,1,'[{\"questionId\":11,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":10,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":9,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":65,\"isRight\":true,\"myScore\":3.0,\"answer\":\"N\"},{\"questionId\":64,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":225,\"isRight\":false,\"myScore\":0.0,\"answer\":\"43242342\"},{\"questionId\":224,\"isRight\":false,\"myScore\":0.0,\"answer\":\"42342342\"}]','2018-05-25 00:33:07'),
(14,23,29,'2018年05月18日初一数学试卷',9,0,3,1,'[{\"questionId\":9,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":10,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":11,\"isRight\":false,\"myScore\":0.0,\"answer\":\"B\"}]','2018-05-25 00:38:20'),
(15,23,38,'2018年05月18日初一数学试卷',28,6,8,1,'[{\"questionId\":9,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":10,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":62,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":63,\"isRight\":false,\"myScore\":0.0,\"answer\":\"Y\"},{\"questionId\":64,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":108,\"isRight\":false,\"myScore\":0.0,\"answer\":\"3\"},{\"questionId\":223,\"isRight\":false,\"myScore\":0.0,\"answer\":\"3\"},{\"questionId\":224,\"isRight\":false,\"myScore\":0.0,\"answer\":\"3\"}]','2018-05-25 00:38:31'),
(16,23,50,'2018年05月26日初一数学试卷',108,37,100,1,'[{\"questionId\":43,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":58,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":50,\"isRight\":false,\"myScore\":0.0,\"answer\":\"B\"},{\"questionId\":42,\"isRight\":false,\"myScore\":0.0,\"answer\":\"B\"},{\"questionId\":17,\"isRight\":true,\"myScore\":3.0,\"answer\":\"D\"},{\"questionId\":11,\"isRight\":true,\"myScore\":3.0,\"answer\":\"D\"},{\"questionId\":33,\"isRight\":true,\"myScore\":3.0,\"answer\":\"D\"},{\"questionId\":44,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":21,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":13,\"isRight\":false,\"myScore\":0.0,\"answer\":\"C\"},{\"questionId\":161,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":82,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":130,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":152,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":98,\"isRight\":false,\"myScore\":0.0,\"answer\":\"Y\"},{\"questionId\":105,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":257,\"isRight\":true,\"myScore\":4.0,\"answer\":\"Y\"},{\"questionId\":95,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":83,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":128,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":230,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":108,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":245,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":238,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":229,\"isRight\":false,\"myScore\":0.0,\"answer\":\"432\"},{\"questionId\":249,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":244,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":250,\"isRight\":false,\"myScore\":0.0,\"answer\":\"432423\"},{\"questionId\":234,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4324\"},{\"questionId\":240,\"isRight\":false,\"myScore\":0.0,\"answer\":\"43242\"}]','2018-05-26 00:30:15'),
(17,23,32,'2018年05月18日初一数学试卷',20,3,6,1,'[{\"questionId\":9,\"isRight\":false,\"myScore\":0.0,\"answer\":\"A\"},{\"questionId\":10,\"isRight\":false,\"myScore\":0.0,\"answer\":\"B\"},{\"questionId\":62,\"isRight\":true,\"myScore\":3.0,\"answer\":\"Y\"},{\"questionId\":63,\"isRight\":false,\"myScore\":0.0,\"answer\":\"Y\"},{\"questionId\":108,\"isRight\":false,\"myScore\":0.0,\"answer\":\"78\"},{\"questionId\":223,\"isRight\":false,\"myScore\":0.0,\"answer\":\"4234\"}]','2018-05-26 09:13:40');

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `QUESTION_ID` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '试题ID',
  `QUESTION_TYPE` char(3) DEFAULT NULL COMMENT '题型：',
  `QUESTION_CLASS` char(3) DEFAULT NULL COMMENT '题类',
  `QUESTION_DIFFICULTY` double DEFAULT NULL COMMENT '试题难度',
  `POINT_NUMBER` int(2) DEFAULT NULL COMMENT '知识点数',
  `POINT` varchar(128) DEFAULT NULL COMMENT '知识点',
  `SOURCE` varchar(128) DEFAULT NULL COMMENT '试题来源',
  `USETIMES` bigint(20) DEFAULT NULL COMMENT '使用次数',
  `TYPE` char(3) DEFAULT NULL COMMENT 'EnumType：0：客观题，1：主观题',
  `QUESTION_SCORE` int(2) DEFAULT NULL COMMENT '分数',
  `QUESTION_TIME` int(3) DEFAULT NULL COMMENT '解题时间',
  `GRADE_NAME` varchar(64) DEFAULT NULL COMMENT '年级名称',
  `COURSE_NAME` varchar(64) DEFAULT NULL COMMENT '学科名称',
  `VERSION_NAME` varchar(64) DEFAULT NULL COMMENT '教材名称',
  `CHAPTER_NAME` varchar(64) DEFAULT NULL COMMENT '章节名称',
  `SELECTION_A` varchar(256) DEFAULT NULL COMMENT 'A',
  `SELECTION_B` varchar(256) DEFAULT NULL COMMENT 'B',
  `SELECTION_C` varchar(256) DEFAULT NULL COMMENT 'C',
  `SELECTION_D` varchar(256) DEFAULT NULL COMMENT 'D',
  `ANSWER` varchar(3000) DEFAULT NULL COMMENT '试题答案',
  `ANALYSIS` varchar(3000) DEFAULT NULL COMMENT '试题解析',
  `QUESTION_HOT` bigint(20) DEFAULT NULL COMMENT '试题热度',
  `OWNNER` int(10) DEFAULT NULL COMMENT '试题拥有者',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `QUESTION_CONTENT` varchar(3000) DEFAULT NULL COMMENT '试题内容',
  `STATUS` char(3) DEFAULT NULL COMMENT '试题状态：001审核中；002审核通过；003审核不通过；004已删除',
  PRIMARY KEY (`QUESTION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=258 DEFAULT CHARSET=utf8;

/*Data for the table `question` */

insert  into `question`(`QUESTION_ID`,`QUESTION_TYPE`,`QUESTION_CLASS`,`QUESTION_DIFFICULTY`,`POINT_NUMBER`,`POINT`,`SOURCE`,`USETIMES`,`TYPE`,`QUESTION_SCORE`,`QUESTION_TIME`,`GRADE_NAME`,`COURSE_NAME`,`VERSION_NAME`,`CHAPTER_NAME`,`SELECTION_A`,`SELECTION_B`,`SELECTION_C`,`SELECTION_D`,`ANSWER`,`ANALYSIS`,`QUESTION_HOT`,`OWNNER`,`CREATE_TIME`,`UPDATE_TIME`,`QUESTION_CONTENT`,`STATUS`) values 
(1,'101','201',0.1,2,'259,268',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学,第2章 数学2','1','2','3','4','B','3213213',0,23,'2018-04-26 15:05:45','2018-04-26 15:05:45','23232432','004'),
(2,'101','201',0.3,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','1','2','3','4','B','3213123',0,23,'2018-04-26 15:08:58','2018-04-26 15:08:58','3213213','004'),
(3,'101','201',0.3,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','1','2','3','4','B','3213123',0,23,'2018-04-26 15:12:18','2018-04-26 15:12:18','3213213','003'),
(4,'101','201',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','1','2','3','4','B','3213',0,23,'2018-04-26 15:13:35','2018-04-26 15:13:35','421321','001'),
(5,'101','201',0.1,2,'259,268',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学,第2章 数学2','1','2','3','4','B','3213',0,23,'2018-04-26 15:16:13','2018-04-26 15:16:13','3213123','001'),
(6,'101','201',0.1,1,'286',NULL,0,'0',321321,3213123,'初一','数学','北师大版','第1章 数学','321','321','321','321','21,B','321312',0,23,'2018-04-26 15:23:54','2018-04-26 15:23:54','321312','001'),
(7,'101','201',0.1,1,'286',NULL,0,'0',321321,3213123,'初一','数学','北师大版','第1章 数学','321','321','321','321','21,B','321312',0,23,'2018-04-26 15:27:07','2018-04-26 15:27:07','321312','001'),
(8,'101','201',0.1,1,'259',NULL,0,'0',2,321312,'初一','数学','人教版','第1章 数学','1','2','3','4','B','3213',0,23,'2018-04-26 15:27:32','2018-04-26 15:27:32','321321','001'),
(9,'101','201',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','1204','1736','1584','1636','B','1736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736173617361736',0,23,'2018-05-07 15:55:11','2018-05-07 15:55:11','用计算器计算\r\n4472－38×72=（   ）','002'),
(10,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','15055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055150551505515055',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(11,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(12,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(13,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(14,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(15,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(16,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(17,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(18,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(19,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(20,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(21,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(22,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(23,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(24,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(25,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(26,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(27,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(28,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(29,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(30,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(31,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(32,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(33,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(34,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(35,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(36,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(37,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(38,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(39,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(40,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(41,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(42,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(43,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(44,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(45,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(46,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(47,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(48,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(49,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(50,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(51,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(52,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(53,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(54,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(55,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(56,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(57,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(58,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(59,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(60,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(61,'101','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','D','解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','用计算器计算\r\n32140－17085=（   ）','002'),
(62,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(63,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(64,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(65,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(66,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(67,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(68,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(69,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(70,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(71,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(72,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(73,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(74,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(75,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(76,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(77,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(78,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(79,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(80,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(81,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(82,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(83,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(84,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(85,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(86,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(87,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(88,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(89,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(90,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(91,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(92,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(93,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(94,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(95,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(96,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(97,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(98,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(99,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(100,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(101,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(102,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(103,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(104,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(105,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(106,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(107,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(108,'103','202',0.5,3,'259,268,277',NULL,0,'0',4,3,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333解析233333',0,23,'2018-05-09 15:54:11','2018-05-09 15:54:11','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(109,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(110,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(111,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(112,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(113,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(114,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(115,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(116,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(117,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(118,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(119,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(120,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(121,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(122,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(123,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(124,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(125,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(126,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(127,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(128,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(129,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(130,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(131,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(132,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(133,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(134,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(135,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(136,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(137,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(138,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(139,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(140,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(141,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(142,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(143,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','N','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(144,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(145,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(146,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(147,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(148,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(149,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(150,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(151,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(152,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(153,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(154,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(155,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(156,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(157,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(158,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(159,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(160,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(161,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(162,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(163,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(164,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(165,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(166,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(167,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(168,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(169,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(170,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(171,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(172,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(173,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(174,'102','202',0.1,1,'259',NULL,0,'0',3,3,'初一','数学','人教版','第1章 数学','14055','44383','43283','15055','Y','解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111解析111',0,23,'2018-05-07 15:56:29','2018-05-07 15:56:29','1+1=2是否正确','002'),
(175,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(176,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(177,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(178,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(179,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(180,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(181,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(182,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(183,'104','201',0.7,2,'296,305',NULL,0,'1',15,10,'初二','语文','人教版','第1章 语文,第2章 语文2','','','','','汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字汉字','汉字汉字解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析解析',0,23,'2018-05-09 16:03:30','2018-05-09 16:03:30','“天雨粟，鬼夜哭，龙为之潜藏。”仓颉造字的古老传说，揭示了文字“出世”惊心动魄的力量。今天，汉字中文随着海内外修习者不断增多，也将中华文化的独特魅力散播到了世界各地。如果有外国友人来你校考察交流，你将如何向他们介绍你心中的汉字？','002'),
(184,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(185,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(186,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(187,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(188,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(189,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(190,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(191,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(192,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(193,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(194,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(195,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(196,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(197,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(198,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(199,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(200,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(201,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(202,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(203,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(204,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(205,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(206,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(207,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(208,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(209,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(210,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(211,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(212,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(213,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(214,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(215,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(216,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(217,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(218,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(219,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(220,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(221,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(222,'105','203',0.9,3,'332,341,350',NULL,0,'1',60,50,'初三','语文','人教版','第1章 语文,第2章 语文2','','','','','<h1>温馨的味道</h1>\r\n早晨，初夏的阳光从密密层层的枝叶间投射下来，地上印满了铜钱大小的粼粼光斑。\r\n\r\n    “我回来了！”正在写作业的我听到家门口传来开门的声音，传入耳中的还有妈妈的招呼声，妈妈买完菜回来了。\r\n\r\n    我依旧在书桌前奋笔疾书着，就在这时，房间的门被悄悄打开，妈妈走进来，温柔地对我说：“你都写了一早上的作业了，出来透透气吧。”我吭了一声，当作对妈妈的回应。妈妈实在看不下去了，对我说：“馥蔓，别写了，出来帮妈妈做饭吧。”做饭？好像挺有趣的样子，可是……，我都已经好久没进厨房了。正当我犹豫发呆之时，妈妈已经帮我把桌面收拾干净，风风火火地把我拉进厨房。当我缓过神时，我发现妈妈正在偷笑。我哭笑不得。','人生要有理想，要有目标，要努力向目标迈进，实现理想，而理想，正是我们最盼望实现的',0,23,'2018-05-09 16:56:56','2018-05-09 16:56:56','按要求完成下面的作文。\r\n    文题（一）：生活中，人人都在盼望着。小学时盼望上中学，中学时盼望上大学，大学时盼望……在你十多年的人生旅途中，你曾有过怎样的盼望呢？在你对未来的畅想中，你又有哪些盼望？请自拟题目，写一篇文章。文体不限，不少于600字，作文中不得出现真实的校名与人名。\r\n\r\n    文题（二）：阅读第Ⅱ卷《有些语言美丽如斯》一文，自拟题目，写一篇不少于600字的评论或读后感。','002'),
(223,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(224,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(225,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(226,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(227,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(228,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(229,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(230,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(231,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(232,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(233,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(234,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(235,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(236,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(237,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(238,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(239,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(240,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(241,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(242,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(243,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(244,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(245,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(246,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(247,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(248,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(249,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(250,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(251,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(252,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(253,'103','203',0.5,2,'259,268',NULL,0,'0',3,5,'初一','数学','人教版','第1章 数学,第2章 数学2','','','','','30-t/2','解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123解析3123',0,23,'2018-05-09 17:05:15','2018-05-09 17:05:15','某水果点销售50千克香蕉，第一天售价为9元/千克，第二天降价6元/千克，第三天再降为3元/千克．三天全部售完，共计所得270元．若该店第二天销售香蕉t千克，则第三天销售香蕉<span class=\"q-blank\">&nbsp;</span>千克．','002'),
(254,'101','203',1,2,'332,341',NULL,0,'0',5,5,'初三','语文','人教版','第1章 语文,第2章 语文2','QAQ','嘤嘤嘤','喵喵喵','哈哈哈哈','A','QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ \r\nQAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ QAQ',0,23,'2018-05-19 00:02:14','2018-05-19 00:02:14','穿山甲到底说了什么？','002'),
(255,'102','202',0.6,1,'259',NULL,0,'0',5,5,'初一','数学','人教版','第1章 数学','','','','','Y','5435345',0,23,'2018-05-19 00:05:32','2018-05-19 00:05:32','1=1','002'),
(256,'104','203',0.7,2,'260,269',NULL,0,'1',5,5,'初一','语文','人教版','第1章 语文,第2章 语文2','','','','','321321321','3213123123123131231231232131',0,23,'2018-05-19 01:25:16','2018-05-19 01:25:16','876867868广东省公司的公司打工广东省广东省感受到 第三个十多个 萨达感受到','002'),
(257,'102','201',0.4,1,'286',NULL,0,'0',4,3,'初一','数学','北师大版','第1章 数学','','','','','Y','123',0,23,'2018-05-23 14:53:42','2018-05-23 14:53:42','1+1-1=0','002');

/*Table structure for table `question_basket` */

DROP TABLE IF EXISTS `question_basket`;

CREATE TABLE `question_basket` (
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `GRADE` char(3) DEFAULT NULL COMMENT '年级',
  `GRADE_NAME` varchar(64) DEFAULT NULL COMMENT '年级名称',
  `COURSE` char(10) NOT NULL COMMENT '学科',
  `COURSE_NAME` varchar(128) DEFAULT NULL COMMENT '学科名称',
  `QUESTION_ID_COLLECTION` varchar(3500) DEFAULT NULL COMMENT '试题ID集合',
  `QUESTION_TYPE_COLLECTION` varchar(1000) DEFAULT NULL COMMENT '试题类型集合',
  `TYPE_COUNT_COLLECTION` varchar(1000) DEFAULT NULL COMMENT '类型题数集合',
  `TOTAL` int(4) DEFAULT NULL COMMENT '试题总数',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`USER_ID`,`COURSE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_basket` */

insert  into `question_basket`(`USER_ID`,`GRADE`,`GRADE_NAME`,`COURSE`,`COURSE_NAME`,`QUESTION_ID_COLLECTION`,`QUESTION_TYPE_COLLECTION`,`TYPE_COUNT_COLLECTION`,`TOTAL`,`CREATE_TIME`) values 
(10,'G07','初一','shuxue','数学','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"questionIds\":[9,10]}]','[\"101\"]','[{\"questionType\":\"101\",\"questionTypeName\":\"单选题\",\"questionCount\":2}]',2,'2018-05-26 09:09:41'),
(23,'G07','初一','shuxue','数学','[{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"questionIds\":[223]}]','[\"103\"]','[{\"questionType\":\"103\",\"questionTypeName\":\"填空题\",\"questionCount\":1}]',1,'2018-05-25 18:41:27'),
(23,'G08','初二','yuwen','语文','[{\"questionType\":\"104\",\"questionTypeName\":\"简答题\",\"questionIds\":[175,176,177]},{\"questionType\":\"105\",\"questionTypeName\":\"作文\",\"questionIds\":[184,185,186,187]}]','[\"104\",\"105\"]','[{\"questionType\":\"104\",\"questionTypeName\":\"简答题\",\"questionCount\":3},{\"questionType\":\"105\",\"questionTypeName\":\"作文\",\"questionCount\":4}]',7,'2018-05-15 14:49:12');

/*Table structure for table `question_comment` */

DROP TABLE IF EXISTS `question_comment`;

CREATE TABLE `question_comment` (
  `QUESTION_COMMENT_ID` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '试题评论ID',
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `QUESTION_ID` bigint(32) NOT NULL COMMENT '试题ID',
  `QUESTION_COMMENT` varchar(10240) NOT NULL COMMENT '试题评论',
  `QUESTION_COMMENT_TIME` datetime NOT NULL COMMENT '试题评论时间',
  `QUESTION_COMMENT_PRAISE` int(11) DEFAULT NULL COMMENT '试题评论赞数',
  `STATUS` char(3) DEFAULT NULL COMMENT '状态：001审核中；002审核通过；003审核不通过；004已删除',
  PRIMARY KEY (`QUESTION_COMMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `question_comment` */

insert  into `question_comment`(`QUESTION_COMMENT_ID`,`USER_ID`,`QUESTION_ID`,`QUESTION_COMMENT`,`QUESTION_COMMENT_TIME`,`QUESTION_COMMENT_PRAISE`,`STATUS`) values 
(1,23,9,'啊啊啊啊阿(〃\'▽\'〃)(￣▽￣)~*','2018-05-25 17:33:15',NULL,'002'),
(2,23,9,'432432423而我若翁','2018-05-25 18:08:16',NULL,'002'),
(3,23,9,'(￣▽￣)~*(￣▽￣)~*(￣▽￣)~*(￣▽￣)~*','2018-05-25 18:20:28',NULL,'002'),
(4,23,9,'3213213额外企鹅无','2018-05-25 18:21:51',NULL,'002'),
(5,23,9,'热污染翁二翁','2018-05-25 18:22:03',NULL,'002'),
(6,23,9,'成功成功成功成功','2018-05-25 18:23:16',NULL,'002'),
(7,23,9,'热污染翁','2018-05-25 18:23:51',NULL,'002'),
(8,23,9,'热污染翁','2018-05-25 18:23:52',NULL,'002'),
(9,23,9,'热污染翁','2018-05-25 18:23:53',NULL,'002'),
(10,23,9,'热污染翁','2018-05-25 18:23:53',NULL,'002'),
(11,23,9,'额外企鹅','2018-05-25 18:24:55',NULL,'002'),
(12,23,9,'3444','2018-05-25 18:25:28',NULL,'002'),
(13,23,9,'3444343','2018-05-25 18:25:36',NULL,'002'),
(14,23,9,'特','2018-05-25 18:27:55',NULL,'002'),
(15,10,1,'好棒！好棒！好棒！好棒！好棒！好棒！','2018-05-25 23:49:14',NULL,'002');

/*Table structure for table `question_error_book` */

DROP TABLE IF EXISTS `question_error_book`;

CREATE TABLE `question_error_book` (
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `QUESTION_ID` bigint(32) NOT NULL COMMENT '试题ID',
  `MY_SCORE` double DEFAULT NULL COMMENT '我的得分',
  `MY_ANSWER` varchar(5000) DEFAULT NULL COMMENT '我的回答',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`USER_ID`,`QUESTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_error_book` */

insert  into `question_error_book`(`USER_ID`,`QUESTION_ID`,`MY_SCORE`,`MY_ANSWER`,`CREATE_TIME`) values 
(23,9,0,'A','2018-05-26 09:14:09'),
(23,10,0,'B','2018-05-26 09:14:09'),
(23,13,0,'C','2018-05-26 00:31:01'),
(23,21,0,'A','2018-05-26 00:31:01'),
(23,42,0,'B','2018-05-26 00:31:01'),
(23,43,0,'A','2018-05-26 00:31:00'),
(23,44,0,'A','2018-05-26 00:31:01'),
(23,50,0,'B','2018-05-26 00:31:00'),
(23,58,0,'A','2018-05-26 00:31:00'),
(23,63,0,'Y','2018-05-26 09:14:09'),
(23,98,0,'Y','2018-05-26 00:31:01'),
(23,108,0,'4324','2018-05-26 00:31:01'),
(23,223,0,'3','2018-05-25 00:38:42'),
(23,224,0,'3','2018-05-25 00:38:42'),
(23,229,0,'432','2018-05-26 00:31:01'),
(23,230,0,'4324','2018-05-26 00:31:01'),
(23,234,0,'4324','2018-05-26 00:31:01'),
(23,238,0,'4324','2018-05-26 00:31:01'),
(23,240,0,'43242','2018-05-26 00:31:01'),
(23,244,0,'4324','2018-05-26 00:31:01'),
(23,245,0,'4324','2018-05-26 00:31:01'),
(23,249,0,'4324','2018-05-26 00:31:01'),
(23,250,0,'432423','2018-05-26 00:31:01');

/*Table structure for table `question_fav` */

DROP TABLE IF EXISTS `question_fav`;

CREATE TABLE `question_fav` (
  `USER_ID` int(10) NOT NULL COMMENT '用户ID',
  `QUESTION_ID` bigint(32) NOT NULL COMMENT '试题ID',
  `COLLECT_TIME` datetime DEFAULT NULL COMMENT '收藏时间',
  `QUESTION_DIFFICULTY` int(1) DEFAULT NULL COMMENT '试题难度',
  `IS_WRONG` int(1) DEFAULT NULL COMMENT '是否做错',
  PRIMARY KEY (`USER_ID`,`QUESTION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `question_fav` */

insert  into `question_fav`(`USER_ID`,`QUESTION_ID`,`COLLECT_TIME`,`QUESTION_DIFFICULTY`,`IS_WRONG`) values 
(23,10,'2018-05-26 08:17:18',NULL,NULL),
(23,20,'2018-05-11 14:54:00',3,0),
(23,21,'2018-05-11 14:54:01',3,0),
(23,22,'2018-05-11 14:54:02',3,0),
(23,23,'2018-05-11 14:54:03',3,0),
(23,175,'2018-05-11 14:54:25',3,0),
(23,176,'2018-05-11 15:11:12',3,0),
(23,184,'2018-05-11 14:54:09',3,0),
(23,185,'2018-05-11 14:54:11',3,0),
(23,223,'2018-05-11 15:11:07',3,0);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `STUDENT_ID` int(10) NOT NULL COMMENT '学生ID',
  `STUDENT_NO` varchar(32) DEFAULT NULL COMMENT '学生编号',
  `STUDENT_NAME` varchar(32) DEFAULT NULL COMMENT '学生姓名',
  `STUDENT_SEX` int(1) DEFAULT NULL COMMENT '学生性别',
  `STUDENT_AGE` int(3) DEFAULT NULL COMMENT '学生年龄',
  `STUDENT_PHONE` varchar(11) DEFAULT NULL COMMENT '学生电话号码',
  `STUDENT_SCHOOL` varchar(256) DEFAULT NULL COMMENT '学生所在学校',
  `STUDENT_ADDR` varchar(256) DEFAULT NULL COMMENT '学生学校地址',
  `STUDENT_COURSE` varchar(128) DEFAULT NULL COMMENT '学生学习学科',
  `STUDENT_VERSION` varchar(128) DEFAULT NULL COMMENT '学生学习版本',
  `STUDENT_GRADE` varchar(16) DEFAULT NULL COMMENT '学生年级',
  PRIMARY KEY (`STUDENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`STUDENT_ID`,`STUDENT_NO`,`STUDENT_NAME`,`STUDENT_SEX`,`STUDENT_AGE`,`STUDENT_PHONE`,`STUDENT_SCHOOL`,`STUDENT_ADDR`,`STUDENT_COURSE`,`STUDENT_VERSION`,`STUDENT_GRADE`) values 
(21,NULL,'张大炮',0,23,'18114990001',NULL,NULL,NULL,NULL,NULL),
(22,NULL,NULL,NULL,NULL,'18214990000',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `TEACHER_ID` int(10) NOT NULL COMMENT '教师ID',
  `TEACHER_NAME` varchar(32) DEFAULT NULL COMMENT '教师姓名',
  `TEACHER_SEX` int(1) DEFAULT NULL COMMENT '教师性别',
  `TEACHER_AGE` int(3) DEFAULT NULL COMMENT '教师年龄',
  `TEACHER_PHONE` varchar(11) DEFAULT NULL COMMENT '教师电话号码',
  `TEACHER_ADDR` varchar(256) DEFAULT NULL COMMENT '教师学校地址',
  `TEACHER_SCHOOL` varchar(256) DEFAULT NULL COMMENT '教师学校',
  `TEACHER_NO` varchar(32) DEFAULT NULL COMMENT '教师编号',
  `TEACHER_TC` varchar(64) DEFAULT NULL COMMENT '教师教授科目',
  `TEACHER_GRADE` varchar(64) DEFAULT NULL COMMENT '教师教授年级',
  `TEACH_VERSION` varchar(64) DEFAULT NULL COMMENT '教师教授科目版本',
  PRIMARY KEY (`TEACHER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`TEACHER_ID`,`TEACHER_NAME`,`TEACHER_SEX`,`TEACHER_AGE`,`TEACHER_PHONE`,`TEACHER_ADDR`,`TEACHER_SCHOOL`,`TEACHER_NO`,`TEACHER_TC`,`TEACHER_GRADE`,`TEACH_VERSION`) values 
(23,'张老师',0,23,'18214990002',NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `USER_ID` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USER_PHONE` varchar(11) NOT NULL COMMENT '用户电话',
  `USER_EMAIL` varchar(32) DEFAULT NULL COMMENT '用户邮箱',
  `USER_NAME` varchar(32) DEFAULT NULL COMMENT '用户姓名',
  `NICK_NAME` varchar(32) DEFAULT NULL COMMENT '用户昵称',
  `USER_SEX` int(1) DEFAULT '0' COMMENT '用户性别',
  `USER_AGE` int(3) DEFAULT NULL COMMENT '用户年龄',
  `USER_TYPE` char(3) NOT NULL COMMENT '用户类型',
  `USER_PASSWORD` varchar(32) NOT NULL COMMENT '用户密码',
  `REGISTER_TIME` datetime NOT NULL COMMENT '注册时间',
  `USER_ICON` varchar(128) DEFAULT NULL COMMENT '用户头像',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`USER_ID`,`USER_PHONE`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`USER_ID`,`USER_PHONE`,`USER_EMAIL`,`USER_NAME`,`NICK_NAME`,`USER_SEX`,`USER_AGE`,`USER_TYPE`,`USER_PASSWORD`,`REGISTER_TIME`,`USER_ICON`,`MODIFY_TIME`) values 
(10,'8000114015',NULL,'张老师','张老师',0,22,'0','123123','2018-04-23 21:40:01','http://localhost:8080/images/5ed85444-29c9-4678-84a3-0abfb475ea49.png','2018-04-30 11:17:41'),
(21,'18114990001',NULL,'张大炮','jojo',0,23,'2','123123','2018-04-21 12:40:49',NULL,'2018-04-22 18:19:28'),
(22,'18214990000','222299@qq.com',NULL,'18214990000',0,NULL,'2','123123','2018-04-22 21:19:18',NULL,'2018-04-23 21:02:40'),
(23,'18214990002',NULL,'张老师','teacher',0,23,'1','123123','2018-04-23 21:40:01',NULL,'2018-04-30 11:17:41');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
