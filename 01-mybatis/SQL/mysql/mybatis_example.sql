/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : 127.0.0.1:3306
 Source Schema         : mybatis_example

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 26/01/2023 14:01:34
*/

DROP DATABASE IF EXISTS `mybatis_example`;
CREATE DATABASE IF NOT EXISTS `mybatis_example`;

USE `mybatis_example`;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp`
(
    `emp_id`     int                                                        NOT NULL AUTO_INCREMENT,
    `emp_name`   char(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
    `emp_salary` double(10, 5)                                              NULL DEFAULT NULL,
    PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp`
VALUES (1, 'tom', 200.33000);
INSERT INTO `t_emp`
VALUES (2, 'jerry', 666.66000);
INSERT INTO `t_emp`
VALUES (3, 'andy', 777.77000);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`       int                                                           NOT NULL AUTO_INCREMENT,
    `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL,
    `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NULL DEFAULT NULL,
    `age`      int                                                           NULL DEFAULT NULL,
    `gender`   char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci      NULL DEFAULT NULL,
    `email`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user`
VALUES (1, 'root0', '123', 23, '男', '12345@qq.com');
INSERT INTO `t_user`
VALUES (2, 'root1', '123456', 23, '男', '12345@qq.com');
INSERT INTO `t_user`
VALUES (3, 'root2', '123456', 23, '男', '12345@qq.com');
INSERT INTO `t_user`
VALUES (5, 'root3', '123456', 23, '男', '12345@qq.com');
INSERT INTO `t_user`
VALUES (6, 'root4', '123456', 23, '男', '12345@qq.com');
INSERT INTO `t_user`
VALUES (7, 'admin', '9527', 23, '男', '12345@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
