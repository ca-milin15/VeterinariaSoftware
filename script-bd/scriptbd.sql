create database veterinaria
use veterinaria

create table tbl_usuario
(
id int not null,
nombre varchar(50) not null,
apellidos varchar(50) not null,
direccion varchar(50) not null,
fechaCreacion date not null,
fechaActualizacion date not null,
PRIMARY KEY (id)
);

create table tbl_historiaClinica
(
id int not null,
nombre varchar(50) not null,
historia varchar(900) not null,
fechaCreacion date not null,
fechaActualizacion date not null,
PRIMARY KEY (id)
);

create table tbl_tarifa
(
id int not null,
nombre varchar(50) not null,
valor int not null,
fechaCreacion date not null,
fechaActualizacion date not null,
PRIMARY KEY (id)
);

create table tbl_raza
(
id int not null,
nombre varchar(50) not null,
fechaCreacion date not null,
fechaActualizacion date not null,
usuarioCreacion int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacion) REFERENCES tbl_usuario(id)
);

create table tbl_tipoServicio
(
id int not null,
nombre varchar(50) not null,
fechaCreacion date not null,
fechaActualizacion date not null,
usuarioCreacion int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacion) REFERENCES tbl_usuario(id)
);

create table tbl_servicio
(
id int not null,
nombre varchar(50) not null,
codigo varchar(10) not null,
tipoServicio int not null,
tarifaId int not null,
fechaCreacion date not null,
fechaActualizacion date not null,
PRIMARY KEY (id),
FOREIGN KEY (tarifaId) REFERENCES tbl_tarifa(id)
);

create table tbl_tipoMascota
(
id int not null,
nombre varchar(50) not null,
fechaCreacion date not null,
fechaActualizacion date not null,
usuarioCreacion int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacion) REFERENCES tbl_usuario(id)
);

create table tbl_mascota
(
id int not null,
nombre varchar(50) not null,
usuarioId int not null,
edad int not null,
fechaNacimiento date not null,
historiaClinicaId int not null,
razaId int not null,
tipoMascotaId int not null,
peso double not null,
altura double not null,
fechaCreacion date not null,
fechaActualizacion date not null,
usuarioCreacion int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioId) REFERENCES tbl_usuario(id),
FOREIGN KEY (historiaClinicaId) REFERENCES tbl_historiaClinica(id),
FOREIGN KEY (razaId) REFERENCES tbl_raza(id),
FOREIGN KEY (tipoMascotaId) REFERENCES tbl_tipoMascota(id),
FOREIGN KEY (usuarioCreacion) REFERENCES tbl_usuario(id)
);

create table tbl_servicioMascota
(
id int not null,
servicioId int not null,
mascotaId int not null,
fechaCreacion date not null,
fechaActualizacion date not null,
PRIMARY KEY (id),
FOREIGN KEY (servicioId) REFERENCES tbl_servicio(id),
FOREIGN KEY (mascotaId) REFERENCES tbl_mascota(id)
);