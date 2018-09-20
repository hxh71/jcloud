/*
Navicat MySQL Data Transfer

Source Server         : 47.98.154.107(huang)
Source Server Version : 50721
Source Host           : 47.98.154.107:3306
Source Database       : cherouser

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-26 13:43:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user1`;
CREATE TABLE `sys_user1` (
  `id` varchar(64) CHARACTER SET utf8 NOT NULL COMMENT '主键id',
  `username` varchar(32) CHARACTER SET utf8 DEFAULT NULL COMMENT '昵称',
  `password` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `vip_level` int(11) DEFAULT NULL COMMENT 'vip等级',
  `empirical_value` int(11) DEFAULT NULL COMMENT '经验值',
  `main` tinyint(1) DEFAULT NULL,
  `extend_1` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留扩展字段',
  `create_user` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_user` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `extend_2` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留扩展字段',
  `extend_3` varchar(200) CHARACTER SET utf8 DEFAULT NULL COMMENT '预留扩展字段',
  `delete_flag` int(11) DEFAULT NULL COMMENT '删除标记',
  `remarks` varchar(500) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `doctor_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user1` VALUES ('2c906f0162b1a5af0162b1a772600000', '121', '111', null, null, '1', null, null, '2018-04-11 06:22:44', null, '2018-04-11 06:22:44', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b1a5af0162b38fe4ae0002', '18969062594', '123456', null, null, '1', null, null, '2018-04-11 15:16:15', null, '2018-04-11 15:16:15', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b84bce6e0000', '18969062501', '123456', null, null, '1', null, null, '2018-04-12 13:19:59', null, '2018-04-12 13:19:59', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b88c58830003', '18969062502', '123456', null, null, '1', null, null, '2018-04-12 14:30:28', null, '2018-04-12 14:30:28', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b88d519a0006', '18969062503', '123456', null, null, '1', null, null, '2018-04-12 14:31:32', null, '2018-04-12 14:31:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b899455d0009', '18969062504', '123456', null, null, '1', null, null, '2018-04-12 14:44:35', null, '2018-04-12 14:44:35', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b8a73b93000c', '18969062511', '123456', null, null, '1', null, null, '2018-04-12 14:59:50', null, '2018-04-12 14:59:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b8b51a30000f', '18969062512', '123456', null, null, '1', null, null, '2018-04-12 15:14:59', null, '2018-04-12 15:14:59', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b8c67b780012', '15999999999', '555555', null, null, '1', null, null, '2018-04-12 15:33:58', null, '2018-04-16 19:34:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b8d2f5940015', '18969062514', '123456', null, null, '1', null, null, '2018-04-12 15:47:36', null, '2018-04-12 15:47:36', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b5a64c0162b8d62b900018', '18036798806', '555555', null, null, '1', null, null, '2018-04-12 15:51:06', null, '2018-04-12 15:51:06', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8e3dc540000', '333', '111', null, null, '1', null, null, '2018-04-12 16:06:04', null, '2018-04-12 16:06:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8e579120003', '18969062516', '123456', null, null, '1', null, null, '2018-04-12 16:07:49', null, '2018-04-12 16:07:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8e662cf0008', '18969062517', '123456', null, null, '1', null, null, '2018-04-12 16:08:49', null, '2018-04-12 16:08:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8e98236000b', '18969062519', '123456', null, null, '1', null, null, '2018-04-12 16:12:14', null, '2018-04-12 16:12:14', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8eca914000e', '18969062522', '123456', null, null, '1', null, null, '2018-04-12 16:15:40', null, '2018-04-12 16:15:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8ee46a90011', '15335621390', '111', null, null, '1', null, null, '2018-04-12 16:17:26', null, '2018-04-12 16:17:26', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b8fb693b0014', '18969062587', '123456', null, null, '1', null, null, '2018-04-12 16:31:47', null, '2018-04-13 14:09:41', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b8db9c0162b902d5520017', '18969062598', '123456', null, null, '1', null, null, '2018-04-12 16:39:53', null, '2018-04-12 16:39:53', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b915180162b92134da0000', '18969062595', '123456', null, null, '1', null, null, '2018-04-12 17:13:04', null, '2018-05-31 18:55:52', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b915180162b9da8e820003', '18268075652', '123456', null, null, '1', null, null, '2018-04-12 20:35:31', null, '2018-04-12 20:35:31', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162ba344e4e0000', '17800336254', '123456', null, null, '1', null, null, '2018-04-12 22:13:33', null, '2018-05-28 14:40:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bcd4fa6c0003', '18657132960', '123456', null, null, '1', null, null, '2018-04-13 10:28:17', null, '2018-04-13 10:28:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bce401530006', '18888888888', '555555', null, null, '1', null, null, '2018-04-13 10:44:42', null, '2018-04-13 10:44:42', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bce6c0cb0009', '13333333333', '555555', null, null, '1', null, null, '2018-04-13 10:47:42', null, '2018-04-13 10:47:42', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bcee9b84000c', '13131555555', '555555', null, null, '1', null, null, '2018-04-13 10:56:17', null, '2018-04-13 10:56:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bcf59a87000f', '15333333333', '555555', null, null, '1', null, null, '2018-04-13 11:03:55', null, '2018-04-13 11:03:55', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162b9e93a0162bcf805360012', '13566666666', '555555', null, null, '1', null, null, '2018-04-13 11:06:34', null, '2018-04-13 11:06:34', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162bdf8111a0000', '18969062571', '123456', null, null, '1', null, null, '2018-04-13 15:46:14', null, '2018-04-13 15:46:14', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162bdfbcf6c0003', '18969062572', '123456', null, null, '1', null, null, '2018-04-13 15:50:19', null, '2018-04-13 15:50:19', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162bdfd30970006', '18969062573', '123456', null, null, '1', null, null, '2018-04-13 15:51:50', null, '2018-04-13 15:51:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162be0083860009', '18969062576', '123456', null, null, '1', null, null, '2018-04-13 15:55:27', null, '2018-04-13 15:55:27', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162be24872c000e', '15574914779', '123456', null, null, '1', null, null, '2018-04-13 16:34:48', null, '2018-04-13 16:34:48', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162beaaf68b0011', '13520381041', 'aaaaaa', null, null, '1', null, null, '2018-04-13 19:01:38', null, '2018-04-13 19:01:38', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162beb554960014', '18969062578', '123456', null, null, '1', null, null, '2018-04-13 19:12:57', null, '2018-04-13 19:12:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162c20c06d7001a', '18268075650', '123456', null, null, '1', null, null, '2018-04-14 10:46:31', null, '2018-05-21 19:09:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162c295704b001f', '13526548945', '111111', null, null, '1', null, null, '2018-04-14 13:16:36', null, '2018-04-14 13:57:22', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162bd98dc0162c2dd42ca0025', '17600356874', '000000', null, null, '1', null, null, '2018-04-14 14:35:03', null, '2018-04-16 21:48:36', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162c2de410162cc23f6560004', '18255588824', '123456', null, null, '1', null, null, '2018-04-16 09:48:52', null, '2018-04-16 09:48:52', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162cc2e160162cd148cab0000', '13520381052', 'qqqqqq', null, null, '1', null, null, '2018-04-16 14:11:39', null, '2018-04-16 14:11:39', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162cc2e160162cd1894850003', '13520381054', 'wwwwww', null, null, '1', null, null, '2018-04-16 14:16:03', null, '2018-04-16 14:19:02', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162ce2b200162ce2ba8590000', '18969062112', '123456', null, null, '0', null, null, '2018-04-16 19:16:30', null, '2018-04-17 14:23:24', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162ce92650162d25c4b4a001a', '13858029270', '123456', null, null, '1', null, null, '2018-04-17 14:48:07', null, '2018-04-17 14:48:07', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162d2e95e0162d63053fd0003', '15738807981', '1234567', null, null, '1', null, null, '2018-04-18 08:38:34', null, '2018-06-12 13:58:09', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162dbcfc10162dbe360280004', '18969062575', '123456', null, null, '0', null, null, '2018-04-19 11:12:14', null, '2018-04-19 11:12:14', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162dbcfc10162dc48f5de0008', '15000000000', '555555', null, null, '0', null, null, '2018-04-19 13:03:12', null, '2018-04-19 13:03:12', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162dbcfc10162dddf0f6f0018', '18258124486', '123456', null, null, '1', null, null, '2018-04-19 20:26:46', null, '2018-04-19 20:26:46', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162dbcfc10162e1981414001e', '15888888888', '555555', null, null, '0', null, null, '2018-04-20 13:47:43', null, '2018-04-20 13:47:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162fc4b39016305fe8bd00003', '15971714141', '', null, null, '1', null, null, '2018-04-27 15:25:58', null, '2018-04-27 15:25:58', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162fc4b3901630606c34e0006', '15982825252', '', null, null, '1', null, null, '2018-04-27 15:34:57', null, '2018-04-27 15:34:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162fc4b390163060e3b880009', '15993936363', '', null, null, '1', null, null, '2018-04-27 15:43:06', null, '2018-04-27 15:43:06', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162fc4b3901630610cfc4000c', '13639393636', '', null, null, '1', null, null, '2018-04-27 15:45:55', null, '2018-04-27 15:45:55', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0162fc4b3901630611ee76000f', '13628282525', '444444', null, null, '1', null, null, '2018-04-27 15:47:09', null, '2018-04-27 15:47:09', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016339f4b401633a4b28e10000', '18969062555', '123456', null, null, '1', null, null, '2018-05-07 19:09:54', null, '2018-05-07 19:09:54', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016349a4e601635c69f6a70019', '18267528618', '12345678', null, null, '1', null, null, '2018-05-14 10:10:38', null, '2018-05-14 10:10:38', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016349a4e601635c724683001f', '17600365379', '000000', null, null, '1', null, null, '2018-05-14 10:19:43', null, '2018-05-14 10:19:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635cc86501635cd5a9e60003', '17600365361', '123456', null, null, '1', null, null, '2018-05-14 12:08:17', null, '2018-05-14 12:08:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635cc86501635dbbc1390006', '18767777172', '123456', null, null, '1', null, null, '2018-05-14 16:19:36', null, '2018-06-06 18:11:01', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677228b20018', '18969060001', '12345678', null, null, '0', null, null, '2018-05-16 13:35:25', null, '2018-05-24 13:49:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a501636772658f0019', '15638807982', '1234567', null, null, '0', null, null, '2018-05-16 13:35:40', null, '2018-05-16 13:35:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677858bf001a', '18969060002', '123456', null, null, '1', null, null, '2018-05-16 13:42:10', null, '2018-05-16 13:42:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a5016367789a46001d', '15638807983', '123456', null, null, '1', null, null, '2018-05-16 13:42:27', null, '2018-05-16 13:42:27', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677923970020', '18969060003', '123456', null, null, '1', null, null, '2018-05-16 13:43:02', null, '2018-05-16 13:43:02', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677b75ad0023', '18969060004', '123456', null, null, '1', null, null, '2018-05-16 13:45:34', null, '2018-05-16 13:45:34', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677e8beb0026', '18969060005', '123456', null, null, '1', null, null, '2018-05-16 13:48:57', null, '2018-05-16 13:48:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163677ffff50029', '18969060007', '123456', null, null, '1', null, null, '2018-05-16 13:50:32', null, '2018-05-16 13:50:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a5016367822f68002c', '18969060008', '123456', null, null, '1', null, null, '2018-05-16 13:52:55', null, '2018-05-16 13:52:55', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a501636783fa64002f', '18969060009', '123456', null, null, '1', null, null, '2018-05-16 13:54:53', null, '2018-05-16 13:54:53', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163678495c70032', '18969060010', '123456', null, null, '1', null, null, '2018-05-16 13:55:32', null, '2018-05-16 13:55:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a501636784f7b00035', '15738807985', '123456', null, null, '1', null, null, '2018-05-16 13:55:57', null, '2018-05-16 13:55:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163678916e20038', '18969060011', '123456', null, null, '1', null, null, '2018-05-16 14:00:28', null, '2018-05-16 14:00:28', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163678a9f8a003b', '18969060012', '123456', null, null, '1', null, null, '2018-05-16 14:02:08', null, '2018-05-16 14:02:08', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01635f06a50163679f242b0041', '18969060014', '123456', null, null, '1', null, null, '2018-05-16 14:24:33', null, '2018-05-16 14:24:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636ca367730000', '15738807988', '123456', null, null, '1', null, null, '2018-05-17 13:47:18', null, '2018-05-17 13:47:18', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cb572690003', '15738807977', '123456', null, null, '1', null, null, '2018-05-17 14:07:01', null, '2018-05-17 14:07:01', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cc018d10006', '15738807955', '123456', null, null, '1', null, null, '2018-05-17 14:18:39', null, '2018-05-17 14:18:39', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cc269440009', '15738807966', '123456', null, null, '1', null, null, '2018-05-17 14:21:10', null, '2018-05-17 14:21:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cc5db35000c', '15738807951', '123456', null, null, '1', null, null, '2018-05-17 14:24:56', null, '2018-05-17 14:24:56', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cc73923000f', '15738807952', '123456', null, null, '1', null, null, '2018-05-17 14:26:26', null, '2018-05-17 14:26:26', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cc8f5de0012', '15738807953', '123456', null, null, '1', null, null, '2018-05-17 14:28:20', null, '2018-05-17 14:28:20', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cca67940015', '15738807954', '123456', null, null, '1', null, null, '2018-05-17 14:29:54', null, '2018-05-17 14:29:54', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636ccd777b0018', '15738807956', '123456', null, null, '1', null, null, '2018-05-17 14:33:15', null, '2018-05-17 14:33:15', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cd28ffa001b', '15738807962', '123456', null, null, '1', null, null, '2018-05-17 14:38:49', null, '2018-05-17 14:38:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636cd5a299001e', '15738807963', '123456', null, null, '1', null, null, '2018-05-17 14:42:10', null, '2018-05-17 14:42:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636d2648920021', '15738807969', '123456', null, null, '1', null, null, '2018-05-17 16:10:16', null, '2018-05-17 16:10:16', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601636dcfadf50024', '15672727362', '000000', null, null, '1', null, null, '2018-05-17 19:15:17', null, '2018-05-17 19:15:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f60163767f328d003d', '15366668888', '000000', null, null, '1', null, null, '2018-05-19 11:43:58', null, '2018-05-19 11:43:58', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f6016376a992ac0040', '18268075050', '123456', null, null, '1', null, null, '2018-05-19 12:30:15', null, '2018-05-19 12:30:15', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f60163770d32090043', '13588888888', '000000', null, null, '1', null, null, '2018-05-19 14:19:04', null, '2018-05-19 14:19:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601637724cb9b0046', '17688888888', '000000', null, null, '1', null, null, '2018-05-19 14:44:50', null, '2018-05-19 14:44:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f601638096f1a6004c', '13684918651', '000000', null, null, '1', null, null, '2018-05-21 10:46:06', null, '2018-05-21 10:46:06', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f6016380b1d94d004f', '15712607606', '123456', null, null, '1', null, null, '2018-05-21 11:15:29', null, '2018-05-21 11:15:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f6016380ba546b0055', '15764381270', '12345678', null, null, '1', null, null, '2018-05-21 11:24:45', null, '2018-05-21 11:24:45', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f6016380c45a690059', '13611860243', '123456', null, null, '1', null, null, '2018-05-21 11:35:42', null, '2018-05-21 11:35:42', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01636bd5f60163814ae81d005f', '15712607609', '123456', null, null, '1', null, null, '2018-05-21 14:02:40', null, '2018-05-21 14:02:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016381720d016381886efc0001', '17600336251', '000000', null, null, '1', null, null, '2018-05-21 15:09:52', null, '2018-06-12 18:38:20', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016385639a0163874e78db0006', '15738853677', '123456', null, null, '1', null, null, '2018-05-22 18:04:17', null, '2018-06-15 09:16:37', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016385639a0163877b925c0009', '15738807968', '123456', null, null, '1', null, null, '2018-05-22 18:53:33', null, '2018-05-22 18:53:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016385639a016387ffb0f6000f', '15839782815', '000000', null, null, '1', null, null, '2018-05-22 21:17:51', null, '2018-05-22 21:17:51', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016385639a01638bb79d960016', '13777841406', '12345678', null, null, '1', null, null, '2018-05-23 14:37:37', null, '2018-05-23 14:37:37', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639036b30163908e0ed60000', '18969000002', '123456', null, null, '1', null, null, '2018-05-24 13:10:19', null, '2018-05-24 13:10:19', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639036b301639095bcf20003', '18969000003', '123456', null, null, '1', null, null, '2018-05-24 13:18:42', null, '2018-05-24 13:18:42', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639036b30163909b8bd50006', '18969000004', '123456', null, null, '1', null, null, '2018-05-24 13:25:03', null, '2018-05-24 13:25:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639036b3016390ae77c70011', '18268075659', '123456', null, null, '1', null, null, '2018-05-24 13:45:43', null, '2018-05-24 13:45:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390aeff016390be8b300002', '18268075653', '123456', null, null, '1', null, null, '2018-05-24 14:03:17', null, '2018-05-24 14:03:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390c205016390cd26080001', '18969000009', '123456', null, null, '1', null, null, '2018-05-24 14:19:14', null, '2018-05-24 14:19:14', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390c205016390ce898b0004', '18969000010', '123456', null, null, '1', null, null, '2018-05-24 14:20:45', null, '2018-05-24 14:20:45', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390c205016390d5728a0007', '18268075654', '222222', null, null, '1', null, null, '2018-05-24 14:28:18', null, '2018-06-25 10:59:44', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016390ee270f000d', '18268075651', '123456', null, null, '1', null, null, '2018-05-24 14:55:17', null, '2018-05-24 14:55:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016390f35c630010', '18268075655', '123456', null, null, '1', null, null, '2018-05-24 15:00:58', null, '2018-05-24 15:00:58', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016390f97c3a0015', '18268075657', '123456', null, null, '1', null, null, '2018-05-24 15:07:39', null, '2018-05-24 15:07:39', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016391029223001a', '18268075658', '123456', null, null, '1', null, null, '2018-05-24 15:17:35', null, '2018-05-24 15:17:35', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016391068ea7001d', '18268075666', '123456', null, null, '1', null, null, '2018-05-24 15:21:56', null, '2018-05-24 15:21:56', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe30163910baac50020', '18268075669', '123456', null, null, '1', null, null, '2018-05-24 15:27:31', null, '2018-05-24 15:27:31', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe30163911217830025', '18268075663', '123456', null, null, '1', null, null, '2018-05-24 15:34:32', null, '2018-05-24 15:34:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe301639113b9a90028', '18268075660', '123456', null, null, '1', null, null, '2018-05-24 15:36:19', null, '2018-05-24 15:36:19', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016390dfe3016391186391002b', '18268075665', '123456', null, null, '1', null, null, '2018-05-24 15:41:25', null, '2018-05-24 15:41:25', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e01639125cb2c0004', '18268075667', '123456', null, null, '1', null, null, '2018-05-24 15:56:03', null, '2018-05-24 15:56:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e01639129c73f0007', '18268075668', '123456', null, null, '1', null, null, '2018-05-24 16:00:24', null, '2018-05-24 16:00:24', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e0163912cc53e000a', '18268075678', '123456', null, null, '1', null, null, '2018-05-24 16:03:40', null, '2018-05-24 16:03:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e0163912e6585000d', '18268075555', '123456', null, null, '1', null, null, '2018-05-24 16:05:27', null, '2018-05-24 16:05:27', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e0163913484c10013', '18268079876', '123456', null, null, '1', null, null, '2018-05-24 16:12:08', null, '2018-05-24 16:12:08', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e0163913660e90016', '18268076543', '123456', null, null, '1', null, null, '2018-05-24 16:14:10', null, '2018-05-24 16:14:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016391199e01639140dd0c001c', '18268071111', '666666', null, null, '1', null, null, '2018-05-24 16:25:37', null, '2018-05-24 17:14:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016392812e016394feeab90000', '18969999999', '123456', null, null, '1', null, null, '2018-05-25 09:52:04', null, '2018-05-25 09:52:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639555f0cd0000', '18268070000', '666666', null, null, '1', null, null, '2018-05-25 11:27:07', null, '2018-05-25 11:27:07', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c016395cbb9310017', '15738807933', '123456', null, null, '1', null, null, '2018-05-25 13:35:46', null, '2018-05-25 13:35:46', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639620d930002a', '17600336584', '000000', null, null, '1', null, null, '2018-05-25 15:08:45', null, '2018-05-25 15:08:45', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639626e224002d', '17896548498', '000000', null, null, '1', null, null, '2018-05-25 15:15:21', null, '2018-05-25 15:15:21', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c0163962a3b190030', '18268072222', '000000', null, null, '1', null, null, '2018-05-25 15:19:00', null, '2018-05-25 15:19:00', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c0163963258790033', '18268073333', '000000', null, null, '1', null, null, '2018-05-25 15:27:52', null, '2018-05-25 15:27:52', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639639cbe80039', '18268074444', '000000', null, null, '1', null, null, '2018-05-25 15:36:00', null, '2018-05-25 15:36:00', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639640f010003c', '18268079999', '000000', null, null, '1', null, null, '2018-05-25 15:43:48', null, '2018-05-25 15:43:48', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c016396480745003f', '15738853611', '123456', null, null, '1', null, null, '2018-05-25 15:51:33', null, '2018-05-25 15:51:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639650a5e40044', '18268078888', '000000', null, null, '1', null, null, '2018-05-25 16:00:58', null, '2018-05-25 16:00:58', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c016396544bec0047', '18268077777', '000000', null, null, '1', null, null, '2018-05-25 16:04:57', null, '2018-05-25 16:04:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c0163965812a8004a', '15738853622', '111111', null, null, '1', null, null, '2018-05-25 16:09:04', null, '2018-05-25 18:46:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639658bfd6004d', '18268076666', '000000', null, null, '1', null, null, '2018-05-25 16:09:49', null, '2018-05-25 16:09:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016395535c01639659e8530050', '18268079988', '000000', null, null, '1', null, null, '2018-05-25 16:11:05', null, '2018-05-25 16:11:05', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016396c265016396dcdc530004', '17788913164', '123456', null, null, '0', null, null, '2018-05-25 18:34:07', null, '2018-05-25 18:34:07', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016396c265016396f278610007', '15372059615', '123456', null, null, '0', null, null, '2018-05-25 18:57:43', null, '2018-05-25 18:57:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016396c265016396fd9b720008', '18958381314', '123456', null, null, '0', null, null, '2018-05-25 19:09:53', null, '2018-06-01 09:29:23', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639ad3d001639aed72d30000', '15738807942', '123456', null, null, '1', null, null, '2018-05-26 13:30:43', null, '2018-05-26 13:30:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639b9cde01639c5cb4860000', '18367306028', '123456', null, null, '1', null, null, '2018-05-26 20:11:51', null, '2018-05-31 11:43:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01639b9cde0163a1a97d110003', '15968395351', '123456', null, null, '1', null, null, '2018-05-27 20:53:49', null, '2018-06-19 09:54:19', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4b9d5700001', '15738807917', '123456', null, null, '0', null, null, '2018-05-28 11:10:32', null, '2018-05-28 11:10:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4c1a3b00003', '18969000021', '123456', null, null, '0', null, null, '2018-05-28 11:19:04', null, '2018-05-28 11:19:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4c453b60004', '18969000022', '123456', null, null, '0', null, null, '2018-05-28 11:22:00', null, '2018-05-28 11:22:00', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4c891470005', '18969000023', '123456', null, null, '0', null, null, '2018-05-28 11:26:38', null, '2018-05-28 11:26:38', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4caec890006', '18969000024', '123456', null, null, '0', null, null, '2018-05-28 11:29:12', null, '2018-05-28 11:29:12', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a4ce9bd50007', '13335713700', '123456', null, null, '1', null, null, '2018-05-28 11:33:14', null, '2018-05-31 09:28:25', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a52e97a4000b', '15738807908', '123456', null, null, '0', null, null, '2018-05-28 13:18:04', null, '2018-05-28 13:18:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a4ac6c0163a576e291000f', '18367352096', '123456', null, null, '1', null, null, '2018-05-28 14:37:02', null, '2018-05-28 14:37:02', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5833f0163a58aa9770001', '17602658947', '000000', null, null, '1', null, null, '2018-05-28 14:58:38', null, '2018-05-28 14:58:38', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5a0150163a5a7fbe1000f', '18268072323', '123456', null, null, '1', null, null, '2018-05-28 15:30:40', null, '2018-05-28 15:30:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5a0150163a5bd37dd0026', '17623006719', '123456', null, null, '0', null, null, '2018-05-28 15:53:51', null, '2018-05-28 15:53:51', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a5df681e0007', '18969000033', '123456', null, null, '1', null, null, '2018-05-28 16:31:12', null, '2018-05-28 16:31:12', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a5e09c21000a', '18969000034', '123456', null, null, '1', null, null, '2018-05-28 16:32:31', null, '2018-05-28 16:32:31', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a5e2ada8000d', '18969000035', '123456', null, null, '1', null, null, '2018-05-28 16:34:46', null, '2018-05-28 16:34:46', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a5eea0b80012', '15738853633', '123456', null, null, '1', null, null, '2018-05-28 16:47:49', null, '2018-05-28 16:47:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a5f8686f0015', '18969000036', '123456', null, null, '1', null, null, '2018-05-28 16:58:30', null, '2018-05-28 16:58:30', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163a6851849001c', '17600336524', '000000', null, null, '1', null, null, '2018-05-28 19:32:10', null, '2018-05-28 19:32:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163abb9cd8300f1', '', '123456', null, null, '1', null, null, '2018-05-29 19:47:51', null, '2018-05-29 19:47:51', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163a5c5b30163aea8e92100f9', '15738858533', '111111', null, null, '1', null, null, '2018-05-30 09:28:15', null, '2018-05-30 09:28:15', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163af2cf50163afa7177a0009', '15144172716', '123456', null, null, '1', null, null, '2018-05-30 14:05:53', null, '2018-05-30 14:05:53', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163af2cf50163afe497f8000c', '17600684765', '123456', null, null, '1', null, null, '2018-05-30 15:13:04', null, '2018-05-30 15:13:04', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163af2cf50163afea286c000f', '15161895465', '121738', null, null, '1', null, null, '2018-05-30 15:19:09', null, '2018-05-30 15:19:09', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163af2cf50163afedf9d80012', '17600336987', '123456', null, null, '1', null, null, '2018-05-30 15:23:19', null, '2018-05-30 15:23:19', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b0426ab20007', '15938792236', '123456', null, null, '1', null, null, '2018-05-30 16:55:33', null, '2018-05-30 16:55:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b0440214000a', '18936254152', '123456', null, null, '1', null, null, '2018-05-30 16:57:17', null, '2018-05-30 16:57:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b0646129000f', '17900336584', '123456', null, null, '1', null, null, '2018-05-30 17:32:39', null, '2018-05-30 17:32:39', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b4b2b0cb0046', '15968695351', '123456', null, null, '1', null, null, '2018-05-31 13:36:40', null, '2018-05-31 13:36:40', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b4ba91c80049', '18367645212', '123456', null, null, '1', null, null, '2018-05-31 13:45:16', null, '2018-05-31 14:45:43', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b4e599f1005a', '15667645212', '123456', null, null, '0', null, null, '2018-05-31 14:32:16', null, '2018-06-01 15:14:51', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b4e76883005b', '15236985214', '123qqq***', null, null, '1', null, null, '2018-05-31 14:34:15', null, '2018-05-31 14:34:15', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b54da2110069', '13520365379', '000000', null, null, '1', null, null, '2018-05-31 16:25:54', null, '2018-05-31 16:25:54', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b5594696006c', '17600654874', '000000', null, null, '1', null, null, '2018-05-31 16:38:37', null, '2018-05-31 16:38:37', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b56571d50070', '13536859741', '000000', null, null, '1', null, null, '2018-05-31 16:51:54', null, '2018-05-31 16:51:54', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b57577720078', '15738807916', '123456', null, null, '1', null, null, '2018-05-31 17:09:24', null, '2018-05-31 17:09:24', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b89743700096', '18688990669', '111111', null, null, '1', null, null, '2018-06-01 07:45:11', null, '2018-06-13 10:06:37', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b8d17ae90099', '17600336844', '000000', null, null, '1', null, null, '2018-06-01 08:48:46', null, '2018-06-01 08:48:46', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b8fe1339009c', '13546548446', '000000', null, null, '1', null, null, '2018-06-01 09:37:29', null, '2018-06-01 09:37:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b92095cb009f', '17600589478', '123456', null, null, '1', null, null, '2018-06-01 10:15:11', null, '2018-06-01 10:15:11', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b92ff48c00a2', '18964548476', '000000', null, null, '1', null, null, '2018-06-01 10:31:58', null, '2018-06-01 10:31:58', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163b9380c3e00a7', '17900336548', '123456', null, null, '1', null, null, '2018-06-01 10:40:48', null, '2018-06-01 10:40:48', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163b02c270163ba89def300d3', '17633658454', '123456', null, null, '1', null, null, '2018-06-01 16:49:48', null, '2018-06-01 16:49:48', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c44b7d6a0082', '18969000091', '123456', null, null, '1', null, null, '2018-06-03 14:17:52', null, '2018-06-03 14:17:52', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c849a9bb0207', '18701564073', 'qiaoliang', null, null, '1', null, null, '2018-06-04 08:54:21', null, '2018-06-04 08:54:21', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c88021400222', '18900336251', '123456', null, null, '1', null, null, '2018-06-04 09:53:50', null, '2018-06-04 09:53:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8a290300230', '15669936736', '123456', null, null, '1', null, null, '2018-06-04 10:31:27', null, '2018-06-12 11:16:25', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8add2690247', '13500336251', '123456', null, null, '1', null, null, '2018-06-04 10:43:45', null, '2018-06-04 10:43:45', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8b02edf024a', '17900666251', '123456', null, null, '1', null, null, '2018-06-04 10:46:20', null, '2018-06-04 10:46:20', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8b14db70250', '17600663251', '123456', null, null, '1', null, null, '2018-06-04 10:47:33', null, '2018-06-04 10:47:33', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8bfc5e90253', '17800336251', '123456', null, null, '1', null, null, '2018-06-04 11:03:21', null, '2018-06-04 11:03:21', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c8c065bb0256', '15900336251', '123456', null, null, '1', null, null, '2018-06-04 11:04:02', null, '2018-06-04 11:04:02', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c97cea680273', '13521255019', '654321', null, null, '1', null, null, '2018-06-04 14:29:57', null, '2018-06-06 18:11:16', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c9903497027d', '13992576961', '123456', null, null, '1', null, null, '2018-06-04 14:51:01', null, '2018-06-04 14:51:01', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c99842130282', '13992576969', '123456', null, null, '1', null, null, '2018-06-04 14:59:49', null, '2018-06-04 14:59:49', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c99b2f5c0285', '18268075252', '123456', null, null, '1', null, null, '2018-06-04 15:03:01', null, '2018-06-04 15:03:01', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163c9ab0eac0295', '18268075662', '123456', null, null, '1', null, null, '2018-06-04 15:20:21', null, '2018-06-04 15:20:21', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163caf0d23802c1', '17600299701', '1qazaq1', null, null, '1', null, null, '2018-06-04 21:16:10', null, '2018-06-04 21:16:10', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163ce7590880314', '13288996688', '123456', null, null, '1', null, null, '2018-06-05 13:40:01', null, '2018-06-05 13:40:01', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163ceae30b9032b', '13651368155', '123456', null, null, '1', null, null, '2018-06-05 14:41:52', null, '2018-06-05 14:41:52', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163ced122730344', '15984766481', '000000', null, null, '1', null, null, '2018-06-05 15:20:02', null, '2018-06-05 15:20:02', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163cede1eb4034d', '17764548654', '000000', null, null, '1', null, null, '2018-06-05 15:34:13', null, '2018-06-05 15:34:13', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163d4633e0303ad', '13521255018', '123456', null, null, '1', null, null, '2018-06-06 17:17:44', null, '2018-06-06 17:17:44', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163d465dee303b1', '17811336655', '123456', null, null, '1', null, null, '2018-06-06 17:20:36', null, '2018-06-06 17:20:36', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163d46f358003b6', '17600556688', '123456', null, null, '1', null, null, '2018-06-06 17:30:48', null, '2018-06-06 17:30:48', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163bab50f0163d4723a3803b9', '17600226655', '123456', null, null, '1', null, null, '2018-06-06 17:34:06', null, '2018-06-06 17:34:06', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163d94d860163d9519d620005', '18888228888', '123456', null, null, '1', null, null, '2018-06-07 16:16:35', null, '2018-06-07 16:16:35', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163d9f5bb0163dd2f8798001c', '17766335522', '123456', null, null, '1', null, null, '2018-06-08 10:17:50', null, '2018-06-08 10:17:50', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163d9f5bb0163dd30701f001f', '17788997788', '123456', null, null, '1', null, null, '2018-06-08 10:18:49', null, '2018-06-08 10:18:49', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163d9f5bb0163dd34019c0023', '17788996699', '123456', null, null, '1', null, null, '2018-06-08 10:22:43', null, '2018-06-08 10:22:43', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e02605420004', '18265324124', '123456', null, null, '1', null, null, '2018-06-09 00:06:18', null, '2018-06-09 00:06:18', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e03892180007', '15992635857', '123456', null, null, '1', null, null, '2018-06-09 00:26:34', null, '2018-06-09 00:26:34', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e298873d0021', '15992576961', '222222', null, null, '1', null, null, '2018-06-09 11:30:37', null, '2018-06-09 11:30:37', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e311372a0026', '13588997755', '123456', null, null, '1', null, null, '2018-06-09 13:42:26', null, '2018-06-09 13:42:26', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e3abf0db0044', '17733445566', '123456', null, null, '1', null, null, '2018-06-09 16:31:26', null, '2018-06-09 16:31:26', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e3abf35d0047', '13588999988', '123456', null, null, '1', null, null, '2018-06-09 16:31:27', null, '2018-06-09 16:31:27', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163ded3870163e3b8be15004c', '18616628761', '12345678', null, null, '1', null, null, '2018-06-09 16:45:25', null, '2018-06-09 16:45:25', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163e3e4d10163e406aab10000', '13269656323', '123456', null, null, '1', null, null, '2018-06-09 18:10:32', null, '2018-06-09 18:10:32', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163e3e4d10163e41165da0003', '17733445567', '123456', null, null, '1', null, null, '2018-06-09 18:22:16', null, '2018-06-09 18:22:16', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163e3e4d10163e411679c0006', '13588999989', '123456', null, null, '1', null, null, '2018-06-09 18:22:16', null, '2018-06-09 18:22:16', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163e3e4d10163e45792520009', '18888342888', '123456', null, null, '1', null, null, '2018-06-09 19:38:54', null, '2018-06-09 19:38:54', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163e3e4d10163ec92fa4f0037', '15256213909', '123456', null, null, '1', null, null, '2018-06-11 10:00:45', null, '2018-06-11 10:00:45', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163eda0eb0163edb1aa1e0000', '13569524321', '123456', null, null, '1', null, null, '2018-06-11 15:13:54', null, '2018-06-11 15:13:54', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163eda0eb0163edb1aa370001', '18269325421', '123456', null, null, '1', null, null, '2018-06-11 15:13:54', null, '2018-06-11 15:13:54', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163eda0eb0163edc7a0ed0009', '15257331249', 'sly20111231', null, null, '1', null, null, '2018-06-11 15:37:53', null, '2018-06-11 15:37:53', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163eda0eb0163ee1915f5002d', '13956235242', '123456', null, null, '1', null, null, '2018-06-11 17:06:52', null, '2018-06-11 17:06:52', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163eda0eb0163ee6ef13d004d', '15356213909', '123456', null, null, '1', null, null, '2018-06-11 18:40:38', null, '2018-06-11 18:40:38', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163eeec7f0163ef04ea330002', 'null', '123456', null, null, '1', null, null, '2018-06-11 21:24:27', null, '2018-06-11 21:24:27', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1bd7c2a0006', '17665415263', '123456', null, null, '1', null, null, '2018-06-12 10:05:17', null, '2018-06-12 10:05:17', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1bd7c300007', '17665415269', '123456', null, null, '1', null, null, '2018-06-12 10:05:17', null, '2018-06-12 10:05:17', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1bf8b620009', '18367753361', '123456', null, null, '0', null, null, '2018-06-12 10:07:32', null, '2018-06-12 10:07:32', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1c08a5c000b', '17665415266', '123456', null, null, '1', null, null, '2018-06-12 10:08:37', null, '2018-06-12 10:08:37', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1c08a62000c', '17665415278', '123456', null, null, '1', null, null, '2018-06-12 10:08:37', null, '2018-06-12 10:08:37', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1db3da40015', '15757103968', '123456', null, null, '1', null, null, '2018-06-12 10:37:47', null, '2018-06-12 10:37:47', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f1efc59a0028', '17698745641', '123456', null, null, '1', null, null, '2018-06-12 11:00:13', null, '2018-06-12 11:00:13', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f220a60f0064', '13568479685', '123456', null, null, '1', null, null, '2018-06-12 11:53:36', null, '2018-06-12 11:53:36', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2289da90065', '17765489874', '123456', null, null, '1', null, null, '2018-06-12 12:02:18', null, '2018-06-12 12:02:18', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2854e490067', '13936524215', '123456', null, null, '1', null, null, '2018-06-12 13:43:33', null, '2018-06-12 13:43:33', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f680074', '18263524210', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f6d0075', '18263524211', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f720076', '18263524212', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f770077', '18263524213', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f7c0078', '18263524214', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f810079', '18263524215', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f85007a', '18263524216', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f8a007b', '18263524217', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f8e007c', '18263524218', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f93007d', '18263524219', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f97007e', '18263524220', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2965f9c007f', '18263524221', '123456', null, null, '1', null, null, '2018-06-12 14:02:11', null, '2018-06-12 14:02:11', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2a461f90089', '15738853688', '123456', null, null, '1', null, null, '2018-06-12 14:17:29', null, '2018-06-12 14:17:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2a75a4a008e', '15738853666', '123456', null, null, '1', null, null, '2018-06-12 14:20:44', null, '2018-06-12 14:20:44', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f2b2d5960098', '13783559918', '123456', null, null, '1', null, null, '2018-06-12 14:33:16', null, '2018-06-12 14:33:16', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f3a74a270122', '15656390390', '123456', null, null, '0', null, null, '2018-06-12 19:00:17', null, '2018-06-12 19:00:17', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f1ad2c0163f3a84f180123', '13783559915', '1234567', null, null, '0', null, null, '2018-06-12 19:01:24', null, '2018-06-12 19:01:24', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f442c40163f6b34a490007', '15268558257', '123456', null, null, '1', null, null, '2018-06-13 09:12:15', null, '2018-06-22 11:14:07', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f751e90163f7a2b1ca0001', '13783531600', '123456', null, null, '1', null, null, '2018-06-13 13:33:45', null, '2018-06-13 13:33:45', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f751e90163fd154d640037', '18866998877', '123456', null, null, '1', null, null, '2018-06-14 14:57:02', null, '2018-06-14 14:57:02', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('2c906f0163f751e901640126159c0078', '18969062593', '123456', null, null, '1', null, null, '2018-06-15 09:53:50', null, '2018-06-15 09:53:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f751e90164075278700158', '13511330911', '123456', null, null, '1', null, null, '2018-06-16 14:40:03', null, '2018-06-16 14:40:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f0163f751e9016407c33d87015f', '15958324386', '123456', null, null, '1', null, null, '2018-06-16 16:43:13', null, '2018-06-19 09:47:57', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01641748b301641b32c9b20042', '15738807926', '123456', null, null, '1', null, null, '2018-06-20 11:17:51', null, '2018-06-20 11:17:51', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01641748b301641c49ac90008b', '18810918721', 'qz324653', null, null, '1', null, null, '2018-06-20 16:22:28', null, '2018-06-20 16:22:28', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01641748b3016420162c5700d4', '15901161585', '971101', null, null, '1', null, null, '2018-06-21 10:04:41', null, '2018-06-21 10:04:41', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01641748b301642137ceac010f', '18366785090', '123456', null, null, '0', null, null, '2018-06-21 15:21:03', null, '2018-06-21 15:21:03', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016422a772016425550faf001c', '15958324385', '123456', null, null, '1', null, null, '2018-06-22 10:31:29', null, '2018-06-22 10:31:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016422a7720164264e66ed0049', '18311217010', '19920227@css', null, null, '1', null, null, '2018-06-22 15:03:50', null, '2018-06-22 15:03:50', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016422a7720164267c555b0057', '15824114412', '123456', null, null, '1', null, null, '2018-06-22 15:54:00', null, '2018-06-22 15:54:00', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016422a77201642680b2e8005b', '13819876040', '123456', null, null, '0', null, null, '2018-06-22 15:58:46', null, '2018-06-22 15:58:46', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f016426f8d001642b1c0b37004c', '13581913837', '19870213', null, null, '1', null, null, '2018-06-23 13:26:56', null, '2018-06-23 13:26:56', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01642baa84016436decfdb00ec', '13735806542', 'yongchun3', null, null, '1', null, null, '2018-06-25 20:15:29', null, '2018-06-25 20:15:29', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01642baa84016436ded7ad00ef', '13819198707', 'larry325', null, null, '1', null, null, '2018-06-25 20:15:31', null, '2018-06-25 20:15:31', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01642baa84016439b2bb0900f6', '15738807922', '1234567', null, null, '0', null, null, '2018-06-26 09:26:12', null, '2018-06-26 09:26:12', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('2c906f01642baa84016439c1724f00f7', '15765897358', '1234567', null, null, '0', null, null, '2018-06-26 09:42:16', null, '2018-06-26 09:42:16', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('40289ea062d2a0160162d2a0c3e50000', '222', '111', null, null, '0', null, null, '2018-04-17 16:02:54', null, '2018-04-17 16:02:54', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('40289ebb635cbf1801635cc181640000', '153', '111', null, null, '1', null, null, '2018-05-14 11:46:16', null, '2018-05-14 11:46:16', null, null, '0', null, '1');
INSERT INTO `sys_user1` VALUES ('40289ebb63dd67b90163dd6818fb0000', '001', '123456', null, null, '1', null, null, '2018-06-08 11:19:37', null, '2018-06-08 11:19:37', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('40289ebb63dd67b90163dd6832360003', '002', '123456', null, null, '1', null, null, '2018-06-08 11:19:43', null, '2018-06-08 11:19:43', null, null, '0', null, '0');
INSERT INTO `sys_user1` VALUES ('a', '111', '111', null, null, null, null, null, null, null, null, null, null, null, null, '1');
