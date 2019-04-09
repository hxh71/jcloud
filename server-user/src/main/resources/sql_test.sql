/*
 Navicat Premium Data Transfer

 Source Server         : localhost123
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : ssotest

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 09/04/2019 16:10:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sql_test
-- ----------------------------
DROP TABLE IF EXISTS `sql_test`;
CREATE TABLE `sql_test`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `d_varchar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `d_bigint` bigint(20) NULL DEFAULT NULL,
  `d_timestamp` timestamp(0) NULL DEFAULT NULL,
  `d_datetime` datetime(0) NULL DEFAULT NULL,
  `d_date` date NULL DEFAULT NULL,
  `d_tinyint` tinyint(1) NULL DEFAULT NULL,
  `d_bit` bit(1) NULL DEFAULT NULL,
  `d_text` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `d_blob` blob NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `create_user` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `update_user` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `deleted` tinyint(1) NULL DEFAULT NULL,
  `remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sql_test
-- ----------------------------
INSERT INTO `sql_test` VALUES ('1', '1', 1, '2019-04-09 10:19:59', '2019-04-09 10:20:01', '2019-04-09', 1, b'1', '测试测试！！！！！！！！！！！测试!!!!!!!!!!!!!!', NULL, '2019-04-09 10:20:27', '2019-04-09 10:20:29', '1', NULL, 13, NULL);

SET FOREIGN_KEY_CHECKS = 1;
