create table AreaResponsavel
(
ID_AreaResponsavel integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
primary key(ID_AreaResponsavel)
) ;

INSERT INTO AreaResponsavel (NOME) VALUES ('HelpDesk');
INSERT INTO AreaResponsavel (NOME) VALUES ('Suporte Banco de Dados');
INSERT INTO AreaResponsavel (NOME) VALUES ('Suporte Redes');
INSERT INTO AreaResponsavel (NOME) VALUES ('Suporte Segurança');
INSERT INTO AreaResponsavel (NOME) VALUES ('Suporte Nível 2');
INSERT INTO AreaResponsavel (NOME) VALUES ('Suporte');


create table StatusAtendimento
(
ID_StatusAtendimento integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
FecharAtendimento Smallint,
primary key(ID_StatusAtendimento)
) ;

INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Aguardando atendimento',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Em atendimento',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Em estudo',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Encerrada',1);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Agendado com usuário',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Cancelado',1);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Aguardando feedback do usuário',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Indisponível para atendimento',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Interrompido para atender outro chamado',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Aguardando retorno do fornecedor',0);
INSERT INTO StatusAtendimento (Nome, FecharAtendimento) VALUES ('Aguardando Backup',0);

create table Local
(
ID_Local integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
primary key(ID_Local)
) ;

INSERT INTO Local (Nome) VALUES ('Marketing');
INSERT INTO Local (Nome) VALUES ('Comercial');
INSERT INTO Local (Nome) VALUES ('Financeiro');
INSERT INTO Local (Nome) VALUES ('Vendas');
INSERT INTO Local (Nome) VALUES ('TI');
INSERT INTO Local (Nome) VALUES ('Treinamento');
INSERT INTO Local (Nome) VALUES ('RH');
INSERT INTO Local (Nome) VALUES ('Jurídico');
INSERT INTO Local (Nome) VALUES ('Presidência');


create table Unidade
(
ID_Unidade integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
primary key(ID_Unidade)
); 

create table NivelAcesso
(
ID_NivelAcesso integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
PermiteEditar Smallint,
primary key(ID_NivelAcesso)
) ;

INSERT INTO NivelAcesso (Nome, PermiteEditar) VALUES ('Administrador', 1);
INSERT INTO NivelAcesso (Nome, PermiteEditar) VALUES ('Operador', 0);


create table Problema
(
ID_Problema integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Descricao varchar(50),
ID_AreaResponsavel integer CONSTRAINT FK_IDAreaResponsavelProblema References AreaResponsavel on Delete Cascade on Update Restrict,
SLA integer,
primary key(ID_Problema)
); 


create table Usuario
(
ID_Usuario integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
Nome varchar(50),
ID_AreaResponsavel integer  CONSTRAINT FK_IDAreaResponsavelUsuario References AreaResponsavel on Delete Cascade on Update Restrict,
ID_Local integer  CONSTRAINT FK_IDLocalUsuario References Local on Delete Cascade on Update Restrict,
ID_NivelAcesso integer  CONSTRAINT FK_IDNivelAcessoUsuario References NivelAcesso on Delete Cascade on Update Restrict,
Ramal varchar(10),
Senha varchar(10),
Email varchar(50),
primary key(ID_Usuario)
); 

INSERT INTO Usuario (Nome, ID_AreaResponsavel, ID_Local, ID_NivelAcesso, Ramal, Senha, Email)
values ('Daniel', 6, 5, 1, '2000', '123', 'daniel.tanihara@gmail.com');

INSERT INTO Usuario (Nome, ID_AreaResponsavel, ID_Local, ID_NivelAcesso, Ramal, Senha, Email)
values ('admin', 6, 5, 1, '2000', '123456', 'daniel.tanihara@gmail.com');

INSERT INTO Usuario (Nome, ID_Local, ID_NivelAcesso, Ramal, Senha, Email)
values ('Joao', 1, 2, '2000', '123456', 'daniel.tanihara@gmail.com');

INSERT INTO Usuario (Nome, ID_Local, ID_NivelAcesso, Ramal, Senha, Email)
values ('Maria', 2, 2, '2000', '123456', 'daniel.tanihara@gmail.com');


create table Chamado
(
ID_Chamado integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
ID_Usuario integer CONSTRAINT FK_IDUsuarioChamado References Usuario on Delete Cascade on Update Restrict,
ID_AreaResponsavel integer CONSTRAINT FK_IDAreaResponsavelChamado References AreaResponsavel on Delete Cascade on Update Restrict,
ID_Problema integer CONSTRAINT FK_IDProblemaChamado References Problema on Delete Cascade on Update Restrict,
ID_Unidade integer CONSTRAINT FK_IDUnidadeChamado References Unidade on Delete Cascade on Update Restrict,
ID_Local integer CONSTRAINT FK_IDLocalChamado References Local on Delete Cascade on Update Restrict,
ID_StatusAtendimentoAtual integer CONSTRAINT FK_IDStatusAtendimentoChamado References StatusAtendimento on Delete Cascade on Update Restrict,
Descricao varchar(1000),
DataAbertura Date,
HoraAbertura Time,
DataFechamento Date,
HoraFechamento Time,
primary key(ID_Chamado)
) ;


create table ChamadoAcao
(
ID_ChamadoAcao integer NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
ID_Chamado integer CONSTRAINT FK_IDChamadoChamadoAcao References Chamado on Delete Cascade on Update Restrict,
ID_Usuario integer CONSTRAINT FK_IDUsuarioChamadoAcao References Usuario on Delete Cascade on Update Restrict,
ID_StatusAtendimentoAnterior integer CONSTRAINT FK_IDStatusChamadoAnterior References StatusAtendimento on Delete Cascade on Update Restrict,
ID_StatusAtendimentoAtual integer CONSTRAINT FK_IDStatusChamadoAtual References StatusAtendimento on Delete Cascade on Update Restrict,
Descricao varchar(1000),
Data Date,
Hora Time,
primary key(ID_ChamadoAcao)
) ;

