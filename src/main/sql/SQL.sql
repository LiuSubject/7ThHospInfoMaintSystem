/*# Host: 127.0.0.1  (Version: 5.5.15)
# Date: 2017-12-03 18:38:34
# Generator: MySQL-Front 5.3  (Build 4.269)*/

/*!40101 SET NAMES utf8 */;

#
# Structure for table "computer_problems"
#

DROP TABLE IF EXISTS `computer_problems`;
CREATE TABLE `computer_problems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `userId` varchar(255) DEFAULT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '申报人',
  `dept` varchar(255) DEFAULT NULL COMMENT '部门',
  `departCode` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `detail` varchar(255) DEFAULT NULL COMMENT '问题详情',
  `img` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `flag` int(11) DEFAULT NULL COMMENT '状态',
  `type` int(11) DEFAULT NULL COMMENT '类别',
  `leader` varchar(255) DEFAULT NULL COMMENT '负责人',
  `reback` varchar(255) DEFAULT NULL COMMENT '回复',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

#
# Data for table "computer_problems"
#

/*!40000 ALTER TABLE `computer_problems` DISABLE KEYS */;
INSERT INTO `computer_problems` VALUES (0,'1','1','1','1','1','1','1','1',2,1,'1','1','1'),(2,'test',NULL,'test','信息科','3080300','test','test',NULL,2,1,NULL,NULL,'2017-11-30 14:51:59'),(3,'test2','admin','test','信息科','3080300','test','test',NULL,1,1,'XXX','request.g1212','2017-11-30 16:47:42'),(4,'TestTest','admin','TestTest','信息科','3080300','TestTest','TestTest',NULL,1,2,'XXX','','2017-11-30 19:24:43'),(6,'123','admin','123','信息科','3080300','123','123',NULL,0,1,NULL,NULL,'2017-12-01 20:01:30'),(7,'TestTesttesttest','admin','testtesttest','信息科','3080300','testtesttest','testtesttest','E:\\code\\java\\Examination_System-master\\target\\Examination_System\\imageiPgY8JO19f.jpg',0,1,NULL,NULL,'2017-12-02 09:11:13'),(10,'电脑问题','admin','ASD','信息科','3080300','123456789','测试用','iuR824ROsn.jpg',1,1,'XXX','还是测试用','2017-12-02 10:13:51'),(11,'图片测试','admin','图片测试','信息科','3080300','图片测试','图片测试','LnJqruJfBF.jpg',0,1,NULL,NULL,'2017-12-02 10:47:02'),(12,'图片测试','admin','图片测试','信息科','3080300','图片测试','图片测试','HXHDYLul0r.jpg',0,1,NULL,NULL,'2017-12-02 10:48:13'),(13,'图片测试2','admin','图片测试','信息科','3080300','图片测试2','图片测试2','V2HGBv4awC.jpg',0,1,NULL,NULL,'2017-12-02 11:19:39'),(15,'accept','admin','accept','信息科','3080300','accept','accept',NULL,0,1,NULL,NULL,'2017-12-02 19:51:42'),(16,'accept2','admin','accept','信息科','3080300','accept','accept',NULL,0,1,NULL,NULL,'2017-12-02 19:51:53');
/*!40000 ALTER TABLE `computer_problems` ENABLE KEYS */;

#
# Structure for table "engine_room_inspection"
#

DROP TABLE IF EXISTS `engine_room_inspection`;
CREATE TABLE `engine_room_inspection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `emr` int(11) DEFAULT NULL,
  `his` int(11) DEFAULT NULL,
  `lis` int(11) DEFAULT NULL,
  `pacs` int(11) DEFAULT NULL,
  `xny` int(11) DEFAULT NULL,
  `oa` int(11) DEFAULT NULL,
  `yb` int(11) DEFAULT NULL,
  `qyw` int(11) DEFAULT NULL,
  `yy` int(11) DEFAULT NULL,
  `hiscc` int(11) DEFAULT NULL,
  `jk` int(11) DEFAULT NULL,
  `hx` int(11) DEFAULT NULL,
  `hj` int(11) DEFAULT NULL,
  `aqsb` int(11) DEFAULT NULL,
  `ups` int(11) DEFAULT NULL,
  `qtmh` int(11) DEFAULT NULL,
  `kt` int(11) DEFAULT NULL,
  `ycyy` varchar(255) DEFAULT NULL,
  `examiner` varchar(255) DEFAULT NULL,
  `userId` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

#
# Data for table "engine_room_inspection"
#

/*!40000 ALTER TABLE `engine_room_inspection` DISABLE KEYS */;
INSERT INTO `engine_room_inspection` VALUES (5,'111',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,'1','1','1','1'),(6,'1',1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,'1','1','admin','2017-12-03 10:41:17'),(7,'2017-12-06',1,1,2,0,0,2,0,0,0,0,0,2,0,0,0,1,0,'0','我','admin','2017-12-03 18:12:04');
/*!40000 ALTER TABLE `engine_room_inspection` ENABLE KEYS */;

#
# Structure for table "material_application"
#

DROP TABLE IF EXISTS `material_application`;
CREATE TABLE `material_application` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(255) DEFAULT NULL COMMENT '工号',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `dept` varchar(255) DEFAULT NULL COMMENT '部门',
  `departCode` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `number` int(11) DEFAULT NULL COMMENT '数量',
  `brand` varchar(255) DEFAULT NULL COMMENT '品牌',
  `model` varchar(255) DEFAULT NULL COMMENT '型号',
  `judge` int(11) DEFAULT NULL COMMENT '单价',
  `total` int(11) DEFAULT NULL COMMENT '总价',
  `use_date` varchar(255) DEFAULT NULL COMMENT '安装时间',
  `applicant` varchar(255) DEFAULT NULL COMMENT '申请人',
  `reason` varchar(255) DEFAULT NULL COMMENT '申请理由',
  `bmYj` varchar(255) DEFAULT NULL COMMENT '部门意见',
  `fgyzYj` varchar(255) DEFAULT NULL COMMENT '分管院长意见',
  `xxkYj` varchar(255) DEFAULT NULL COMMENT '信息科意见',
  `yzYj` varchar(255) DEFAULT NULL COMMENT '院长意见',
  `flag` int(11) DEFAULT NULL COMMENT '状态',
  `leader` varchar(255) DEFAULT NULL COMMENT '负责人',
  `reback` varchar(255) DEFAULT NULL COMMENT '回复',
  `create_time` varchar(255) DEFAULT '' COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Data for table "material_application"
#

/*!40000 ALTER TABLE `material_application` DISABLE KEYS */;
INSERT INTO `material_application` VALUES (1,'1','1','1','1',1,'1','1',1,1,'2017-12-2','1','1','1','1','1','1',2,'XXX','1','2017-12-2 16:02:14'),(2,'admin','11','信息科','3080300',11,'11','11',11,11,'11','11','11',NULL,NULL,NULL,NULL,1,'XXX','123123','2017-12-02 19:53:47'),(3,'admin','','信息科','3080300',2542354,'','',NULL,NULL,'','','',NULL,NULL,NULL,NULL,0,NULL,NULL,'2017-12-03 16:00:24');
/*!40000 ALTER TABLE `material_application` ENABLE KEYS */;

#
# Structure for table "role"
#

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleID` int(11) NOT NULL,
  `roleName` varchar(20) NOT NULL,
  `permissions` varchar(255) DEFAULT NULL COMMENT '权限',
  PRIMARY KEY (`roleID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "role"
#

INSERT INTO `role` VALUES (0,'admin',NULL),(1,'normal',NULL),(2,'student',NULL);

#
# Structure for table "userlogin"
#

DROP TABLE IF EXISTS `userlogin`;
CREATE TABLE `userlogin` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `role` int(11) NOT NULL DEFAULT '2' COMMENT '角色权限',
  `depart` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `departcode` varchar(255) DEFAULT NULL COMMENT '所属部门编码',
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`userID`),
  KEY `role` (`role`),
  CONSTRAINT `userlogin_ibfk_1` FOREIGN KEY (`role`) REFERENCES `role` (`roleID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

#
# Data for table "userlogin"
#

INSERT INTO `userlogin` VALUES (1,'admin','123',0,'信息科','3080300','XXX'),(14,'1001','123',1,NULL,NULL,NULL),(15,'1002','123',1,NULL,NULL,NULL),(16,'1003','123',1,NULL,NULL,NULL);
