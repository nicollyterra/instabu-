create database labublog;
use labublog;

create table labubu (
idLabubu int primary key auto_increment,
nome varchar(45) unique,
senha varchar(45)
);

create table roupa (
idRoupa int primary key auto_increment,
categoria varchar(45),
id_foto boolean,
check (categoria in ('cabeca', 'corpo', 'cor'))
);

create table roupaDoLabubu (
idLabubu int,
idRoupa int,
primary key (idLabubu, idRoupa),
foreign key (idLabubu) references labubu(idLabubu),
foreign key (idRoupa) references roupa(idRoupa) 
);

insert into roupa (categoria, id_foto) values
('cor', 1),
('cor', 2),
('cor', 3),
('cor', 4);

insert into roupa (categoria, id_foto) values
('cabeca', 0),
('cabeca', 5),
('cabeca', 6),
('cabeca', 7),
('cabeca', 8);

insert into roupa (categoria, id_foto) values
('corpo', 0),
('corpo', 9),
('corpo', 10),
('corpo', 11),
('corpo', 12),
('corpo', 13),
('corpo', 14),
('corpo', 15);

insert into labubu (nome, senha) values
('Pninoca', 'senha123');

insert into roupaDoLabubu values
(1, 1),
(1, 9),
(1, 15);