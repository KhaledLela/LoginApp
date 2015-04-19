
# LoginApp

#Jsp &amp; Servlet Login Sample.

- ORM Hibernate.
- Jsp & Servlet.
- Mysql DBMS.

#Preparation :
- Need Mysql dbms install OR and DBMS server and put it's Driver under WEB-INF/lib.
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
- Change hibernate.cfg.xml Database name, username,password.
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/loginschema</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">root</property>

- Create schema.
     `CREATE SCHEMA IF NOT EXISTS loginschema DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;`
- Create Users table.
		
			CREATE TABLE `users` (
			  `id` int(11) NOT NULL AUTO_INCREMENT,
			  `fName` varchar(255) DEFAULT NULL,
			  `lName` varchar(255) DEFAULT NULL,
			  `passwd` varchar(255) DEFAULT NULL,
			  `uName` varchar(255) DEFAULT NULL,
			  PRIMARY KEY (`id`)
			) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
		
		
			INSERT INTO `users` VALUES (1,'Khaled','Lela','123','root');`