-- DQL: DATA QUERY LANGUAGE
-- SELECT: Selecionar registros da tabela

-- SELECIONAR TODAS AS COLUNAS DE UMA TABELA

select id, nome, sobrenome, idade from pessoa;
select * from pessoa;

-- SELECT COM CRIT�RIO E OPERADORES L�GICOS

select * from pessoa where id > 1;
select * from pessoa where idade = 17;
select * from pessoa where idade < 18 and idade > 25;

-- SELECT sem saber a informa��o completa, usa-se LIKE (cont�m)

select * from pessoa where sobrenome like '%_o%';

-- SELECT com nomea��o, usa-se o AS

select p.nome as n from pessoa as p;

-- SELECT com concatena��o "implicita"

select (p.nome, p.sobrenome) as nome from pessoa as p;

-- SELECT usando CONCAT e usando aspas duplas para nomear a coluna

select concat(p.nome, ' ', p.sobrenome) as "Nome Completo" from pessoa as p;

-- SELECT com join referenciando uma tabela e outra

select
	*
from
	pessoas as p
join endereco as e on
	p.id_endereco = e.id;