drop database if exists pokedex;
create database pokedex;
use pokedex;

create table pokemon(
	id_pokemon bigint primary key auto_increment,
    name varchar(100) unique not null,
    hp bigint not null default 10,
    level bigint not null,
    type bigint,
    attack bigint,
    region bigint
);

create table region(
	id_region bigint primary key auto_increment,
    nome_region varchar(15)
);

create table attack(
	id_attack bigint primary key auto_increment,
    attack varchar(50) unique not null,
    base_demage bigint not null,
    required_level bigint not null,
    type bigint
);

create table type(
	id_type bigint primary key auto_increment,
    type varchar(20) unique not null
);

create table type_pokemon(
	id_type_pokemon bigint primary key auto_increment,
    fk_type bigint,
    fk_pokemon bigint
);

create table attack_pokemon(
	id_attack_pokemon bigint primary key auto_increment,
    fk_attack1 bigint,
    fk_pokemon1 bigint
);

create table type_attack(
	id_type_attack bigint primary key auto_increment,
    fk_type2 bigint,
    fk_attack2 bigint
);

alter table pokemon add constraint fk_region_pokemon
	foreign key (region) references type (id_region) on delete restrict;

alter table type_pokemon add constraint fk_pokemon_type 
	foreign key (fk_type) references type (id_type) on delete restrict;
    
alter table type_pokemon add constraint fk_type_pokemon 
	foreign key (fk_pokemon) references pokemon (id_pokemon) on delete restrict;

alter table attack_pokemon add constraint fk_pokemon_attack 
	foreign key (fk_attack1) references attack (id_attack) on delete restrict;

alter table attack_pokemon add constraint fk_attack_pokemon 
	foreign key (fk_pokemon1) references pokemon (id_pokemon) on delete restrict;

alter table type_attack add constraint fk_attack_type 
	foreign key (fk_type2) references type (id_type) on delete restrict;
    
alter table type_attack add constraint fk_type_attack 
	foreign key (fk_attack2) references attack (id_attack) on delete restrict;    