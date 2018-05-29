/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : jmail

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2018-05-27 15:06:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  `email` varchar(30) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `register_date` date DEFAULT NULL,
  `last_login_date` date DEFAULT NULL,
  `last_login_ip` varchar(50) DEFAULT NULL,
  `validata_code` varchar(255) DEFAULT NULL COMMENT '找回密码唯一标识',
  `out_date` datetime DEFAULT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
