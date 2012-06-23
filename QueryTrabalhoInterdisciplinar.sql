CREATE DATABASE SolicitacaoServico
GO

USE SolicitacaoServico
GO

CREATE TABLE Usuarios
(
	UsuarioId INT PRIMARY KEY IDENTITY,
	Cpf CHAR(14) NOT NULL, --Exemplo: 999.999.999-99
	Nome VARCHAR(30) NOT NULL,
	Sobrenome VARCHAR(30) NOT NULL,
	[Login] VARCHAR(20) NOT NULL,
	Senha VARCHAR(40) NOT NULL
)

CREATE TABLE Clientes
(
	ClienteId INT PRIMARY KEY IDENTITY,
	RazaoSocial VARCHAR(80) NOT NULL,
	CNPJ CHAR(18) NOT NULL, --Exemplo: 99.999.999/9999-99
	NomeResponsavel VARCHAR(100) NOT NULL,
	Telefone CHAR(13) NOT NULL, --Exemplo: (99)9999-9999
	Endereco VARCHAR(400) NOT NULL,
	Email VARCHAR(100),
)

CREATE TABLE OrdemServicos
(
	OrdemServicoId INT PRIMARY KEY IDENTITY,
	OrdemServicoCodigo CHAR(12) NOT NULL, --Exemplo: OS1111232010(OSAnoMesDiaHoraMinuto)
	ClienteId INT FOREIGN KEY REFERENCES Clientes(ClienteId) NOT NULL,
	AtendenteId INT FOREIGN KEY REFERENCES Usuarios(UsuarioId) NOT NULL,
	AnalistaId INT FOREIGN KEY REFERENCES Usuarios(UsuarioId),
	TecnicoId INT FOREIGN KEY REFERENCES Usuarios(UsuarioId),
	Objetivo VARCHAR(300) NOT NULL,
	DataAbertura DATETIME NOT NULL,
	DataFechamento DATETIME,
	[Status] INT NOT NULL,
	Prioridade INT NOT NULL
)

CREATE TABLE Apontamentos
(
	ApontamentoId INT PRIMARY KEY IDENTITY,
	OrdemServicoId INT FOREIGN KEY REFERENCES OrdemServicos(OrdemServicoId) NOT NULL,
	DataInicio DATETIME NOT NULL,
	DataTermino DATETIME NULL,
	UsuarioId INT FOREIGN KEY REFERENCES Usuarios(UsuarioId) NOT NULL,
	Detalhes VARCHAR(500) NOT NULL
)