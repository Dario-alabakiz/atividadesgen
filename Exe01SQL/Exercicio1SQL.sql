CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes(
id BIGINT AUTO_INCREMENT,
Nome VARCHAR(255),
Lane VARCHAR(255),
PRIMARY KEY(id)
);

CREATE TABLE tb_personagens(
id BIGINT AUTO_INCREMENT,
Personagem VARCHAR(255),
Runa VARCHAR(255),
Feitiços VARCHAR(255),
Poder INT,
Lane_id BIGINT,
PRIMARY KEY(id),
FOREIGN KEY (Lane_id) REFERENCES tb_classes(id)
);
