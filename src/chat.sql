/*
Navicat MySQL Data Transfer

Source Server         : LocalDB
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : chat

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-24 08:30:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for chat_record
-- ----------------------------
DROP TABLE IF EXISTS `chat_record`;
CREATE TABLE `chat_record` (
  `id` int(10) NOT NULL,
  `from_user_id` int(10) NOT NULL,
  `to_user_id` int(10) NOT NULL,
  `content` varchar(500) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `attachment` varchar(200) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of chat_record
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL DEFAULT '',
  `age` int(3) NOT NULL DEFAULT '0',
  `desc` varchar(200) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `image` varchar(200) CHARACTER SET utf8mb4 NOT NULL DEFAULT '',
  `friends` varchar(500) NOT NULL DEFAULT '',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'root', 'root', '120', 'hello', 'test', '2', '2018-01-20 21:36:34', '2018-01-20 21:36:34');
INSERT INTO `user` VALUES ('2', 'zk', '1234', '22', 'world', 'hha', '1', '2018-01-21 22:34:20', '2018-01-21 22:34:20');
INSERT INTO `user` VALUES ('3', 'test', 'test', '0', '', '', '', '2018-01-21 22:46:51', '2018-01-21 22:46:51');
INSERT INTO `user` VALUES ('4', 'test1', 'test', '0', '', '', '', '2018-01-21 22:50:28', '2018-01-21 22:50:28');
