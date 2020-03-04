create database veterinaria_db
use veterinaria_db


create table Usuario
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
apellidos varchar(50) not null,
direccion varchar(50) not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table HistoriaClinica
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
historia varchar(500) not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Tarifa
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
valor float not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Raza
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table TipoServicio
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Servicio
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
codigo varchar(10) not null,
tipoServicio int not null,
tarifaId int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (tarifaId) REFERENCES Tarifa(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);


create table TipoMascota
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Carnet
(
id int not null AUTO_INCREMENT,
codigo int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id)
);

create table Producto(
id int not null AUTO_INCREMENT,
nombreProducto varchar(50) not null,
PRIMARY KEY (id)
);

create table DetalleCarnet
(
id int not null,
carnetId int not null,
productoId int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (carnetId) REFERENCES Carnet(id),
FOREIGN KEY (productoId) REFERENCES Producto(id)
);

create table Mascota
(
id int not null AUTO_INCREMENT,
nombre varchar(50) not null,
usuarioId int not null,
edad int not null,
fechaNacimiento date not null,
historiaClinicaId int not null,
razaId int not null,
carnetId int not null,
tipoMascotaId int not null,
peso float not null,
altura float not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioId) REFERENCES Usuario(id),
FOREIGN KEY (historiaClinicaId) REFERENCES HistoriaClinica(id),
FOREIGN KEY (razaId) REFERENCES Raza(id),
FOREIGN KEY (tipoMascotaId) REFERENCES TipoMascota(id),
FOREIGN KEY (carnetId) REFERENCES Carnet(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Cita
(
id int not null AUTO_INCREMENT,
servicioId int not null,
mascotaId int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (servicioId) REFERENCES Servicio(id),
FOREIGN KEY (mascotaId) REFERENCES Mascota(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table RecursoVeterinaria
(
id int not null AUTO_INCREMENT,
codigo varchar(10) not null,
nombre varchar(60) not null,
usuarioId int,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (usuarioId) REFERENCES Usuario(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table RecursoVeterinariaAsignado
(
id int not null AUTO_INCREMENT,
servicioId int not null,
recursoVeterinariaId int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (servicioId) REFERENCES Servicio(id),
FOREIGN KEY (recursoVeterinariaId) REFERENCES RecursoVeterinaria(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table Disponibilidad
(
id int not null AUTO_INCREMENT,
fecha datetime not null,
recursoVeterinariaId int not null,
servicioId int not null,
fechaCreacion datetime not null,
fechaActualizacion datetime not null,
usuarioCreacionId int not null,
PRIMARY KEY (id),
FOREIGN KEY (recursoVeterinariaId) REFERENCES RecursoVeterinaria(id),
FOREIGN KEY (servicioId) REFERENCES Servicio(id),
FOREIGN KEY (usuarioCreacionId) REFERENCES Usuario(id)
);

create table DetalleDisponibilidad
(
id int not null AUTO_INCREMENT,
disponibilidadId int not null,
horaInicio datetime not null,
horaFinal datetime not null,
PRIMARY KEY (id),
FOREIGN KEY (disponibilidadId) REFERENCES Disponibilidad(id)
);