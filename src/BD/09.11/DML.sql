-- DML: DATA MANIPULATION LANGUAGE - INSERT, UPDATE E DELETE
-- INSERT: Inserir dados na tabela
-- UPDATE: Atualizar dados na tabela
-- DELETE: Apagar dados na tabela

-- INSERT

insert
	into
	pessoa(nome,
	sobrenome,
	idade)
values('Laura',
'Palmer',
17);

insert
	into
	pessoa(nome,
	sobrenome,
	idade)
values('Laura',
'Palmer',
17);

insert
	into
	pessoa(nome,
	sobrenome,
	idade)
values('Dale',
'Cooper',
34);

insert
	into
	pessoa(nome,
	sobrenome,
	idade)
values('The',
'Arm',
0);

insert
	into
	endereco
(logradouro,
	numero,
	complemento,
	bairro,
	cidade,
	cep)
values('Rua Bolinho',
1,
'Casa',
'Bernice',
'Twin Peaks',
'40982-880');

-- UPDATE

update
	pessoa
set
	nome = 'Audrey',
	sobrenome = 'Horne',
	idade = 18
where
	id = 1;
	

-- DELETE

delete
from
	pessoa
where
	id = 1;

-- Não é possível excluir devido a ligação/ser usado com/pela a tabela pessoa
-- O mesmo acontece ao tentar inserir uma pessoa com o id_endereco inexistente, não é possível
delete
from
	endereco
where
	id = 1;
	

