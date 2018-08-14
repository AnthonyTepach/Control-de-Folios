create database cf_escaneo;
	use cf_escaneo;
	create table cf_usuarios(id_usuario char(36) primary key,nom_user varchar(30),contrasenia_usu varchar(30),tipo_usu Enum('admin','super','opera'))engine=innodb;
	create table cf_cliente(id_cliente char(36) primary key,nom_cliente  varchar (30))engine=innodb;
	create table cf_proyecto(id_proyecto char(36) primary key,nom_proyecto  varchar (30))engine=innodb;
