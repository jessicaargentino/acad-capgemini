-- DTL: DATA TRANSACTION LANGUAGE
-- Savepoint e Rollback

-- EXEMPLO 01
begin transaction;

create table pessoa(id int primary key generated always as identity,
nome varchar(50) not null,
sobrenome varchar(150) null);

create table categoria(id int primary key generated always as identity,
nome varchar(50) not null,
descricao varchar(150) null);

commit;
end;

-- EXEMPLO 02
begin transaction;

insert
	int pessoa(nome,
	sobrenome)
values ('Laura',
'Palmer');

savepoint create_pessoa;

insert
	int pessoa(nome,
	sobrenome)
values ('Audrey',
'Horne');

if (
select
	count(id)
from
	pessoa) > 4 then
rollback create_pessoa;
end if;

commit;
end;
