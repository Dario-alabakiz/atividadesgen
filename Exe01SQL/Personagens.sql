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
