create database if not exists casaDoCodigo;
use casaDoCodigo;

set names 'utf8';

drop table if exists livroAutor;
drop table if exists livro;
drop table if exists autor;



create table if not exists autor(
	idAutor int not null primary key AUTO_INCREMENT,
	nomeAutor varchar(255),
	detalhesAutor varchar(5000),
	imagemAutor varchar (255));
	
create table if not exists livro(
	id int not null primary key auto_increment,
	nomeLivro varchar (500),
	descricaoLivro varchar(5000),
	dataPublicacao date,
	numeroPaginas int,
	valorFisico decimal(10,2),
	valorVirtual decimal(10,2),
	valorVirtualComFisico decimal(10,2),
	isbn varchar(255),
	imagemUrl varchar(255));

create table if not exists livroAutor(
	idAutor int,
	idLivro int,
	constraint fk_livroAutor_autor foreign key(idAutor) references autor(idAutor)
	on update cascade on delete cascade,
	constraint fk_livroAutor_livro foreign key(idLivro) references livro(id)
	on update cascade on delete cascade,
	primary key (idAutor,idLivro));