/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2018-05-26 15:24:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chengji
-- ----------------------------
DROP TABLE IF EXISTS `chengji`;
CREATE TABLE `chengji` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `kecheng` varchar(255) DEFAULT NULL,
  `grade` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chengji
-- ----------------------------
INSERT INTO `chengji` VALUES ('1', '小明', '语文', '56');
INSERT INTO `chengji` VALUES ('2', '小明', '数学', '75');
INSERT INTO `chengji` VALUES ('3', '小明', '英语', '90');
INSERT INTO `chengji` VALUES ('4', '小红', '语文', '88');
INSERT INTO `chengji` VALUES ('5', '小红', '数学', '75');
INSERT INTO `chengji` VALUES ('6', '小刚', '语文', '69');
INSERT INTO `chengji` VALUES ('7', '小刚', '数学', '35');
INSERT INTO `chengji` VALUES ('8', '小刚', '英语', '60');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Cno` varchar(255) DEFAULT NULL,
  `Cname` varchar(255) DEFAULT NULL,
  `Tno` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cname_index` (`Cname`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '001', '高数', '2001');
INSERT INTO `course` VALUES ('2', '002', '英语', '2002');
INSERT INTO `course` VALUES ('3', '003', '物理', '2003');
INSERT INTO `course` VALUES ('4', '004', '历史', '2004');
INSERT INTO `course` VALUES ('5', '005', '化学', '2005');

-- ----------------------------
-- Table structure for mr
-- ----------------------------
DROP TABLE IF EXISTS `mr`;
CREATE TABLE `mr` (
  `uid` varchar(20) DEFAULT NULL,
  `gid` varchar(20) DEFAULT NULL,
  `exp` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mr
-- ----------------------------
INSERT INTO `mr` VALUES ('10001', '20003', '1');
INSERT INTO `mr` VALUES ('10001', '20004', '2');
INSERT INTO `mr` VALUES ('10002', '20001', '2');
INSERT INTO `mr` VALUES ('10002', '20002', '2');
INSERT INTO `mr` VALUES ('10002', '20005', '2');
INSERT INTO `mr` VALUES ('10002', '20007', '2');
INSERT INTO `mr` VALUES ('10003', '20001', '3');
INSERT INTO `mr` VALUES ('10003', '20004', '1');
INSERT INTO `mr` VALUES ('10003', '20005', '3');
INSERT INTO `mr` VALUES ('10003', '20006', '3');
INSERT INTO `mr` VALUES ('10004', '20003', '1');
INSERT INTO `mr` VALUES ('10004', '20004', '1');
INSERT INTO `mr` VALUES ('10004', '20007', '5');
INSERT INTO `mr` VALUES ('10005', '20002', '2');
INSERT INTO `mr` VALUES ('10005', '20005', '2');
INSERT INTO `mr` VALUES ('10005', '20006', '2');
INSERT INTO `mr` VALUES ('10005', '20007', '1');
INSERT INTO `mr` VALUES ('10006', '20001', '1');
INSERT INTO `mr` VALUES ('10006', '20002', '2');
INSERT INTO `mr` VALUES ('10006', '20003', '1');
INSERT INTO `mr` VALUES ('10006', '20005', '1');
INSERT INTO `mr` VALUES ('10006', '20006', '2');

-- ----------------------------
-- Table structure for sc
-- ----------------------------
DROP TABLE IF EXISTS `sc`;
CREATE TABLE `sc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Sno` varchar(255) DEFAULT NULL,
  `Cno` varchar(255) DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sc
-- ----------------------------
INSERT INTO `sc` VALUES ('1', '1001', '001', '65');
INSERT INTO `sc` VALUES ('2', '1001', '002', '60');
INSERT INTO `sc` VALUES ('3', '1001', '003', '54');
INSERT INTO `sc` VALUES ('4', '1001', '004', '80');
INSERT INTO `sc` VALUES ('5', '1001', '005', '66');
INSERT INTO `sc` VALUES ('6', '1002', '001', '75');
INSERT INTO `sc` VALUES ('7', '1002', '002', '80');
INSERT INTO `sc` VALUES ('8', '1003', '003', '59');
INSERT INTO `sc` VALUES ('9', '1003', '004', '44');
INSERT INTO `sc` VALUES ('10', '1004', '005', '80');
INSERT INTO `sc` VALUES ('11', '1005', '001', '75');
INSERT INTO `sc` VALUES ('12', '1005', '002', '70');

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_no` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `name` (`name`,`sex`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES ('1', '20150100', '小明', '男', '1996-01-08');
INSERT INTO `stu` VALUES ('2', '20150101', '小刚', '男', '1997-05-07');
INSERT INTO `stu` VALUES ('3', '20150102', '小红', '男', '2000-05-27');
INSERT INTO `stu` VALUES ('4', '20150103', '小白', '女', '2001-01-27');
INSERT INTO `stu` VALUES ('5', '20150104', '小牛', '女', '2001-11-27');

-- ----------------------------
-- Table structure for stu1
-- ----------------------------
DROP TABLE IF EXISTS `stu1`;
CREATE TABLE `stu1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuno` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `phonenum` int(11) DEFAULT NULL,
  `history` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu1
-- ----------------------------
INSERT INTO `stu1` VALUES ('1', '1', 'A', '22', '男', '123456', '小学');
INSERT INTO `stu1` VALUES ('2', '2', 'B', '21', '男', '119', '大专');
INSERT INTO `stu1` VALUES ('3', '3', 'C', '23', '男', '110', '大专');
INSERT INTO `stu1` VALUES ('4', '4', 'D', '18', '女', '114', '大专');
INSERT INTO `stu1` VALUES ('5', '5', 'E', '24', '女', '114', '本科');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `Sno` varchar(255) DEFAULT NULL,
  `Sname` varchar(255) DEFAULT NULL,
  `Sage` int(11) DEFAULT NULL,
  `Ssex` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `test` (`Sno`,`Sname`),
  KEY `age_index` (`Sage`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1001', 'SamJACK', '15', '男');
INSERT INTO `student` VALUES ('2', '1002', 'Tom', '25', '女');
INSERT INTO `student` VALUES ('3', '1003', 'Smart', '17', '男');
INSERT INTO `student` VALUES ('4', '1004', 'Smith', '16', '男');
INSERT INTO `student` VALUES ('5', '1005', 'Jack', '23', '男');
INSERT INTO `student` VALUES ('6', '1006', 'Jadon', '24', '女');
INSERT INTO `student` VALUES ('7', '1007', 'xiaobai', '12', '女');
INSERT INTO `student` VALUES ('8', '1008', 'xiaohong', '17', '男');
INSERT INTO `student` VALUES ('9', '1009', 'Too', '15', '男');
INSERT INTO `student` VALUES ('10', '1010', 'baichi', '21', '女');

-- ----------------------------
-- Table structure for tb_stu_1
-- ----------------------------
DROP TABLE IF EXISTS `tb_stu_1`;
CREATE TABLE `tb_stu_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_name` (`name`(1))
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_stu_1
-- ----------------------------
INSERT INTO `tb_stu_1` VALUES ('1', '李四');
INSERT INTO `tb_stu_1` VALUES ('2', '王五');
INSERT INTO `tb_stu_1` VALUES ('3', '赵六');
INSERT INTO `tb_stu_1` VALUES ('4', '张思');
INSERT INTO `tb_stu_1` VALUES ('5', '阿三');
INSERT INTO `tb_stu_1` VALUES ('6', '宝宝');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Tno` varchar(255) DEFAULT NULL,
  `Tname` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '2001', '李红');
INSERT INTO `teacher` VALUES ('2', '2002', '曾总');
INSERT INTO `teacher` VALUES ('3', '2003', '李白');
INSERT INTO `teacher` VALUES ('4', '2004', '王宏');
INSERT INTO `teacher` VALUES ('5', '2005', '张强');
INSERT INTO `teacher` VALUES ('6', '2006', '尼古拉斯李');

-- ----------------------------
-- Table structure for teacher1
-- ----------------------------
DROP TABLE IF EXISTS `teacher1`;
CREATE TABLE `teacher1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Tno` varchar(255) DEFAULT NULL,
  `Tname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher1
-- ----------------------------
INSERT INTO `teacher1` VALUES ('1', '2001', '李红');
INSERT INTO `teacher1` VALUES ('2', '2002', '曾总');
INSERT INTO `teacher1` VALUES ('3', '2003', '李白');
INSERT INTO `teacher1` VALUES ('4', '2004', '王宏');
INSERT INTO `teacher1` VALUES ('5', '2005', '张强');

-- ----------------------------
-- Table structure for t_blog
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_blog
-- ----------------------------
INSERT INTO `t_blog` VALUES ('1', 'aaa', '1');
INSERT INTO `t_blog` VALUES ('2', 'bbb', '2');
INSERT INTO `t_blog` VALUES ('3', 'ccc', '3');
INSERT INTO `t_blog` VALUES ('4', 'ddd', '4');
INSERT INTO `t_blog` VALUES ('5', 'eee', '4');
INSERT INTO `t_blog` VALUES ('6', 'fff', '3');
INSERT INTO `t_blog` VALUES ('7', 'ggg', '2');
INSERT INTO `t_blog` VALUES ('8', 'hhh', null);
INSERT INTO `t_blog` VALUES ('9', 'iii', null);
INSERT INTO `t_blog` VALUES ('10', 'jjj', null);

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', 'C++');
INSERT INTO `t_type` VALUES ('2', 'C');
INSERT INTO `t_type` VALUES ('3', 'JAVA');
INSERT INTO `t_type` VALUES ('4', 'C#');
INSERT INTO `t_type` VALUES ('5', 'JAVASCRIPT');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for vc
-- ----------------------------
DROP TABLE IF EXISTS `vc`;
CREATE TABLE `vc` (
  `v` varchar(4) DEFAULT NULL,
  `c` char(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vc
-- ----------------------------
INSERT INTO `vc` VALUES ('vc  ', 'vc');
