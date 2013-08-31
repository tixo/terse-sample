CREATE DATABASE guestbook;

use guestbook;

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` varchar(32) NOT NULL,
  `body` varchar(255) default NULL,
  `beginTime` datetime default NULL,
  `title` varchar(255) default NULL,
  `userId` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `fk_userId` (`userId`),
  CONSTRAINT `fk_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`)
);
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
);
