-- DDL: DATA DEFINITION LANGUAGE (LINGUAGEM DE DEFINIÇÃO DE DADOS) | CREATE, ALTER, DROP
-- TABLE/TABELA: ESTRUTURA ONDE OS DADOS SERÃO ARMAZENADOS, FORMADA POR LINHAS E COLUNAS

CREATE TABLE pessoa(id int PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
nome varchar(25) NOT NULL,
sobrenome varchar(25) NOT NULL,
idade int NOT NULL,
id_endereco int NOT NULL,
CONSTRAINT fk_endereco FOREIGN KEY(id_endereco) REFERENCES endereco(id);

CREATE TABLE pessoas2(nome varchar(25) NOT NULL,
sobrenome varchar(25) NOT NULL,
idade int NOT NULL);

CREATE TABLE livros(titulo varchar(25) NOT NULL,
autor varchar(25) NOT NULL,
ano_publicacao int NOT NULL);

CREATE TABLE endereco(id int GENERATED ALWAYS AS identity,
logradouro varchar(50) NOT NULL,
numero varchar(20) NOT NULL,
complemento varchar(20) NULL,
bairro varchar(50) NOT NULL,
cidade varchar(50) NOT NULL,
cep varchar(50) NOT NULL);

-- DROP: APAGAR TABELA

DROP TABLE pessoas2;
DROP TABLE livros;
DROP TABLE endereco;

-- ALTER TABLE: ALTERAR ESTRUTURA DA TABELA
-- GENERATE ALWAYS: Gerar sempre, não deixa inserir outro valor | GENERATE BY DEFAULT: Default para caso não seja inserido valores
-- Identity diferente de PK

-- ADD: ADICIONAR COLUNA

ALTER TABLE pessoas ADD COLUMN endereco varchar(200) NOT NULL;
ALTER TABLE pessoas ADD COLUMN id int GENERATED ALWAYS AS IDENTITY;
ALTER TABLE pessoas ADD COLUMN cpf varchar(11) NOT NULL DEFAULT '000.000.000-00';

-- DROP: REMOVER COLUNA

ALTER TABLE pessoas DROP COLUMN endereco;