# Host: localhost  (Version: 5.5.32)
# Date: 2015-11-05 08:55:54
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES latin1 */;

#
# Structure for table "descriptor"
#

CREATE TABLE `descriptor` (
  `id` varchar(255) NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tableauFlag` bit(1) DEFAULT NULL,
  `workbookId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "descriptor"
#

INSERT INTO `descriptor` VALUES ('1','form','descriptor',b'0',NULL),('2','form','module',b'0',NULL),('3','form','role',b'0',NULL),('4','form','user',b'0',NULL);

#
# Structure for table "module"
#

CREATE TABLE `module` (
  `id` varchar(255) NOT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `is_parent` varchar(255) DEFAULT NULL,
  `sorting` int(11) NOT NULL,
  `descriptor_id` varchar(255) DEFAULT NULL,
  `iparent` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKC04BA66C12DB555` (`descriptor_id`),
  KEY `FKC04BA66C27A8E132` (`iparent`),
  CONSTRAINT `FKC04BA66C12DB555` FOREIGN KEY (`descriptor_id`) REFERENCES `descriptor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "module"
#

INSERT INTO `module` VALUES ('1',NULL,'1 - Dashboard','false',1,'1','5'),('2',NULL,'2 - Menu','false',2,'2','5'),('3',NULL,'3 - Role','false',3,'3','5'),('4',NULL,'4 - User','false',4,'4','5'),('5',NULL,'Role Manager','true',0,NULL,NULL);

#
# Structure for table "role"
#

CREATE TABLE `role` (
  `id` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "role"
#

INSERT INTO `role` VALUES ('1',NULL,'Administrator'),('2',NULL,'General User');

#
# Structure for table "backend_user"
#

CREATE TABLE `backend_user` (
  `id` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fullName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `siteRoleTableau` varchar(255) DEFAULT NULL,
  `userTableauId` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK34849A96A2029C35` (`role_id`),
  CONSTRAINT `FK34849A96A2029C35` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "backend_user"
#

INSERT INTO `backend_user` VALUES ('1',NULL,'Administrator','aXNhdA==','','def0f5ce-2a69-48b2-b198-256cbc15ef49','admin','1');

#
# Structure for table "role_privilage"
#

CREATE TABLE `role_privilage` (
  `id` varchar(255) NOT NULL,
  `module_function_id` varchar(255) DEFAULT NULL,
  `role_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK45FBC72454C09C6E` (`module_function_id`),
  KEY `FK45FBC724A2029C35` (`role_id`),
  CONSTRAINT `FK45FBC72454C09C6E` FOREIGN KEY (`module_function_id`) REFERENCES `module` (`id`),
  CONSTRAINT `FK45FBC724A2029C35` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "role_privilage"
#

INSERT INTO `role_privilage` VALUES ('1','5','1');
