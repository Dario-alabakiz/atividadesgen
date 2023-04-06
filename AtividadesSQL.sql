CREATE DATABASE db_ecommerce;

CREATE TABLE tb_lojas(

 id BIGINT AUTO_INCREMENT ,
 loja VARCHAR(70),
produto VARCHAR(70),
codigo INT,
quantidade INT,
valor DECIMAL(8,2),

 PRIMARY KEY(id)
);
INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("MilkShake","Caneca",078,1,49.99);

SELECT * FROM tb_lojas;

CREATE DATABASE db_registro;

CREATE TABLE td_escola(
id BIGINT AUTO_INCREMENT ,
escola VARCHAR(70),
aluno VARCHAR(70),
materia VARCHAR(70),
nota DECIMAL(5,2),

 PRIMARY KEY(id)
);
INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("Infanti","Agatha","Sociologia",5.00);

SELECT * FROM td_escola;