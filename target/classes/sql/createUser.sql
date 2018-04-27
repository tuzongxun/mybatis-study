CREATE TABLE `user` (
   `id` int(5) NOT NULL AUTO_INCREMENT,
   `name` varchar(20) NOT NULL,
   `age` int(3) NOT NULL,
   `role` int(2) NOT NULL DEFAULT '0',
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8