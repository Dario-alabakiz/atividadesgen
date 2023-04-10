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

INSERT INTO tb_classes(Nome,Lane)
VALUE ("Felipe","Top");

INSERT INTO tb_classes(Nome,Lane)
VALUE ("Lucas","Jungle");

INSERT INTO tb_classes(Nome,Lane)
VALUE ("Nicole","Mid");

INSERT INTO tb_classes(Nome,Lane)
VALUE ("Dario","Adc");

INSERT INTO tb_classes(Nome,Lane)
VALUE ("Gabriely","Sup");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Ahri","Eletrocutar","Incendiar,Flash","1500","3");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Teemo","Eletrocutar","Incendiar,Flash","1100","1");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Kayn","Eletrocutar","Golpear,Flash","3000","2");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Jinx","Conquistar","Cura,Flash","2300","4");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Senna","Aery","Incendiar,Flash","1900","5");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Caitlyn","Conquistar","Incendiar,Flash","2700","4");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Yasuo","Ritmo Fatal","Incendiar,Flash","3500","3");

INSERT INTO tb_personagens(Personagem,Runa,Feitiços,Poder,Lane_id)
VALUE("Fiora","Conquistar","Incendiar,Flash","2200","1");

SELECT * FROM tb_personagens WHERE tb_personagens.Poder >= 2000;

SELECT * FROM tb_personagens WHERE tb_personagens.Poder >= 1000 && tb_personagens.Poder <= 2000;

select * from tb_personagens INNER JOIN tb_classes
ON tb_personagens.Lane_id = tb_classes.id;
