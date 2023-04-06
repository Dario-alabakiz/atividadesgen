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
VALUE ("PlayStation","VideoGame",256,1,5000.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("PlayStation","Controle",785,2,1000.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("PlayStation","Fone",547,1,800.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("MercadoLivre","Carregador",059,70.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("Amazon","TV",457,1,3560.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("Americanas","Chocolate",498,5,100.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("Extra","Ovo de Pascoa",147,1,200.00);

INSERT INTO tb_lojas(loja,produto,codigo,quantidade,valor)
VALUE ("MilkShake","Caneca",078,1,49.99);

SELECT * FROM tb_lojas;

ALTER TABLE tb_lojas;

UPDATE tb_lojas
SET codigo = 693
WHERE id=5;

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
VALUE("EtecItaquera","Dario","Matemática",9.00);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("Mackenzie","Roberto","Física",8.50);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("SullerGarcia","Claus","Inglês",4.50);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("ÁguaDeMarço","Kauan","História",6.50);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("JorgeMarques","Gabriely","Biologia",7.50);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("EtecTatuape","Beatriz","Quimica",9.50);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("SãoBento","Nicole","Português",8.75);

INSERT INTO td_escola(escola,aluno,materia,nota)
VALUE("Infanti","Agatha","Sociologia",5.00);


SELECT * FROM td_escola;

ALTER TABLE tb_escolas;

UPDATE tb_escolas
SET nota = 4.00
WHERE id=8;
