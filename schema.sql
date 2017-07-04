-- 数据库
DROP DATABASE IF EXISTS SixBox;
CREATE DATABASE SixBox;
USE SixBox;

-- 测试表
DROP TABLE IF EXISTS foo;
CREATE TABLE foo (
  id         INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  bar        VARCHAR(255)        NOT NULL UNIQUE,
  createTime DATETIME
)
  DEFAULT CHARSET = utf8;
