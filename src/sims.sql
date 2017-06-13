/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : sims

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2017-06-12 21:47:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentId` int(11) NOT NULL auto_increment,
  `studentNumber` int(10) NOT NULL,
  `studentName` varchar(20) NOT NULL,
  `studentSex` varchar(6) NOT NULL,
  `studentBirthday` varchar(20) NOT NULL,
  `studentDepartment` varchar(20) NOT NULL,
  PRIMARY KEY  (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '314006171', '陈炯', '男', '1995-09-19', '计算机学院');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL auto_increment,
  `username` varchar(32) NOT NULL,
  `userpassword` varchar(32) NOT NULL,
  PRIMARY KEY  (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'cj', '123');
INSERT INTO `user` VALUES ('2', 'cjiong', '123');
INSERT INTO `user` VALUES ('3', '', '');
INSERT INTO `user` VALUES ('4', '123', '123');
INSERT INTO `user` VALUES ('5', '1233', '1234');
