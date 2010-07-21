USE [SCHON]
GO
/****** Object:  Table [dbo].[Departamento]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Departamento](
	[ID_Depto] [int] IDENTITY(1,1) NOT NULL,
	[Nome] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Departamento] PRIMARY KEY CLUSTERED 
(
	[ID_Depto] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Departamento] ON
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (1, N'TI')
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (2, N'Marketing')
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (3, N'Recursos Humanos')
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (4, N'Comercial')
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (5, N'Operacional')
INSERT [dbo].[Departamento] ([ID_Depto], [Nome]) VALUES (6, N'Jurídico')
SET IDENTITY_INSERT [dbo].[Departamento] OFF
/****** Object:  Table [dbo].[NivelAcesso]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NivelAcesso](
	[ID_Acesso] [int] IDENTITY(1,1) NOT NULL,
	[Descricao] [varchar](50) NOT NULL,
 CONSTRAINT [PK_NivelAcesso] PRIMARY KEY CLUSTERED 
(
	[ID_Acesso] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[NivelAcesso] ON
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (1, N'Nível 0')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (2, N'Nível 1')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (3, N'Nível 2')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (4, N'Nível 3')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (5, N'Nível 4')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (6, N'Nível 5')
INSERT [dbo].[NivelAcesso] ([ID_Acesso], [Descricao]) VALUES (7, N'Acesso Total')
SET IDENTITY_INSERT [dbo].[NivelAcesso] OFF
/****** Object:  Table [dbo].[Usuarios]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuarios](
	[ID_Usuario] [int] IDENTITY(1,1) NOT NULL,
	[ID_Depto] [int] NOT NULL,
	[ID_Acesso] [int] NOT NULL,
	[Nome] [varchar](100) NOT NULL,
	[Email] [varchar](100) NOT NULL,
	[Ramal] [varchar](10) NOT NULL,
	[Senha] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Funcionarios] PRIMARY KEY CLUSTERED 
(
	[ID_Usuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Usuarios] ON
INSERT [dbo].[Usuarios] ([ID_Usuario], [ID_Depto], [ID_Acesso], [Nome], [Email], [Ramal], [Senha]) VALUES (1, 1, 7, N'Daniel Tanihara Pereira', N'daniel.tanihara@gmail.com', N'8898', N'123')
INSERT [dbo].[Usuarios] ([ID_Usuario], [ID_Depto], [ID_Acesso], [Nome], [Email], [Ramal], [Senha]) VALUES (2, 2, 1, N'Ciclano Fulano do Marketing', N'daniel.tanihara@gmail.com', N'9998', N'123')
INSERT [dbo].[Usuarios] ([ID_Usuario], [ID_Depto], [ID_Acesso], [Nome], [Email], [Ramal], [Senha]) VALUES (3, 1, 2, N'Usuário Nível 1', N'daniel.tanihara@gmail.com', N'9998', N'123')
INSERT [dbo].[Usuarios] ([ID_Usuario], [ID_Depto], [ID_Acesso], [Nome], [Email], [Ramal], [Senha]) VALUES (4, 1, 3, N'Usuário Nível 2', N'daniel.tanihara@gmail.com', N'9998', N'123')
INSERT [dbo].[Usuarios] ([ID_Usuario], [ID_Depto], [ID_Acesso], [Nome], [Email], [Ramal], [Senha]) VALUES (5, 1, 4, N'Usuário Nível 3', N'daniel.tanihara@gmail.com', N'9998', N'123')
SET IDENTITY_INSERT [dbo].[Usuarios] OFF
/****** Object:  Table [dbo].[Categoria]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Categoria](
	[ID_Categoria] [int] IDENTITY(1,1) NOT NULL,
	[ID_Acesso] [int] NOT NULL,
	[Descricao] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Categoria] PRIMARY KEY CLUSTERED 
(
	[ID_Categoria] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Categoria] ON
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (1, 2, N'Sem acesso a internet')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (2, 2, N'Sem acesso a rede')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (3, 2, N'Sem acesso ao SISERP')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (5, 3, N'Conta de E-mail')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (6, 3, N'Login de Rede')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (7, 3, N'Login Sistema SISERP')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (8, 4, N'Indisponibilidade de rede')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (10, 4, N'Indisponibilidade de banco de dados')
INSERT [dbo].[Categoria] ([ID_Categoria], [ID_Acesso], [Descricao]) VALUES (11, 4, N'Segurança')
SET IDENTITY_INSERT [dbo].[Categoria] OFF
/****** Object:  Table [dbo].[Chamados]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Chamados](
	[ID_Chamado] [int] IDENTITY(1,1) NOT NULL,
	[ID_Categoria] [int] NOT NULL,
	[ID_Usuario] [int] NOT NULL,
	[Descricao] [text] NOT NULL,
	[DataHoraIncidente] [datetime] NOT NULL,
	[ID_UsuarioTratamento] [int] NULL,
	[Resolucao] [text] NULL,
	[DataHoraAprovacao] [datetime] NULL,
 CONSTRAINT [PK_Chamados] PRIMARY KEY CLUSTERED 
(
	[ID_Chamado] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[BaseConhecimento]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BaseConhecimento](
	[ID_Conhecimento] [int] IDENTITY(1,1) NOT NULL,
	[ID_Usuario] [int] NOT NULL,
	[Topico] [varchar](100) NOT NULL,
	[Descricao] [text] NOT NULL,
	[DataCadastro] [datetime] NOT NULL,
 CONSTRAINT [PK_BaseConhecimento] PRIMARY KEY CLUSTERED 
(
	[ID_Conhecimento] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ItensChamados]    Script Date: 07/20/2010 22:21:53 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ItensChamados](
	[ID_ChamadoItem] [int] IDENTITY(1,1) NOT NULL,
	[ID_Chamado] [int] NOT NULL,
	[ID_Usuario] [int] NOT NULL,
	[ID_Categoria] [int] NOT NULL,
	[DataHoraAbertura] [datetime] NOT NULL,
	[Observacao] [text] NOT NULL,
	[ID_UsuarioTratamento] [int] NULL,
	[DataHoraFechamento] [datetime] NULL,
	[Resolucao] [text] NULL,
 CONSTRAINT [PK_ItensChamados] PRIMARY KEY CLUSTERED 
(
	[ID_ChamadoItem] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Default [DF_BaseConhecimento_DataCadastro]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[BaseConhecimento] ADD  CONSTRAINT [DF_BaseConhecimento_DataCadastro]  DEFAULT (getdate()) FOR [DataCadastro]
GO
/****** Object:  Default [DF_Chamados_DataHoraIncidente]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Chamados] ADD  CONSTRAINT [DF_Chamados_DataHoraIncidente]  DEFAULT (getdate()) FOR [DataHoraIncidente]
GO
/****** Object:  ForeignKey [FK_BaseConhecimento_BaseConhecimento]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[BaseConhecimento]  WITH CHECK ADD  CONSTRAINT [FK_BaseConhecimento_BaseConhecimento] FOREIGN KEY([ID_Usuario])
REFERENCES [dbo].[Usuarios] ([ID_Usuario])
GO
ALTER TABLE [dbo].[BaseConhecimento] CHECK CONSTRAINT [FK_BaseConhecimento_BaseConhecimento]
GO
/****** Object:  ForeignKey [FK_Categoria_NivelAcesso]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Categoria]  WITH CHECK ADD  CONSTRAINT [FK_Categoria_NivelAcesso] FOREIGN KEY([ID_Acesso])
REFERENCES [dbo].[NivelAcesso] ([ID_Acesso])
GO
ALTER TABLE [dbo].[Categoria] CHECK CONSTRAINT [FK_Categoria_NivelAcesso]
GO
/****** Object:  ForeignKey [FK_Chamados_Categoria]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Chamados]  WITH CHECK ADD  CONSTRAINT [FK_Chamados_Categoria] FOREIGN KEY([ID_Categoria])
REFERENCES [dbo].[Categoria] ([ID_Categoria])
GO
ALTER TABLE [dbo].[Chamados] CHECK CONSTRAINT [FK_Chamados_Categoria]
GO
/****** Object:  ForeignKey [FK_Chamados_Usuarios]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Chamados]  WITH CHECK ADD  CONSTRAINT [FK_Chamados_Usuarios] FOREIGN KEY([ID_Usuario])
REFERENCES [dbo].[Usuarios] ([ID_Usuario])
GO
ALTER TABLE [dbo].[Chamados] CHECK CONSTRAINT [FK_Chamados_Usuarios]
GO
/****** Object:  ForeignKey [FK_Chamados_Usuarios1]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Chamados]  WITH CHECK ADD  CONSTRAINT [FK_Chamados_Usuarios1] FOREIGN KEY([ID_UsuarioTratamento])
REFERENCES [dbo].[Usuarios] ([ID_Usuario])
GO
ALTER TABLE [dbo].[Chamados] CHECK CONSTRAINT [FK_Chamados_Usuarios1]
GO
/****** Object:  ForeignKey [FK_ItensChamados_Categoria]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[ItensChamados]  WITH CHECK ADD  CONSTRAINT [FK_ItensChamados_Categoria] FOREIGN KEY([ID_Categoria])
REFERENCES [dbo].[Categoria] ([ID_Categoria])
GO
ALTER TABLE [dbo].[ItensChamados] CHECK CONSTRAINT [FK_ItensChamados_Categoria]
GO
/****** Object:  ForeignKey [FK_ItensChamados_Chamados]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[ItensChamados]  WITH CHECK ADD  CONSTRAINT [FK_ItensChamados_Chamados] FOREIGN KEY([ID_Chamado])
REFERENCES [dbo].[Chamados] ([ID_Chamado])
GO
ALTER TABLE [dbo].[ItensChamados] CHECK CONSTRAINT [FK_ItensChamados_Chamados]
GO
/****** Object:  ForeignKey [FK_ItensChamados_Usuarios]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[ItensChamados]  WITH CHECK ADD  CONSTRAINT [FK_ItensChamados_Usuarios] FOREIGN KEY([ID_Usuario])
REFERENCES [dbo].[Usuarios] ([ID_Usuario])
GO
ALTER TABLE [dbo].[ItensChamados] CHECK CONSTRAINT [FK_ItensChamados_Usuarios]
GO
/****** Object:  ForeignKey [FK_Usuarios_NivelAcesso]    Script Date: 07/20/2010 22:21:53 ******/
ALTER TABLE [dbo].[Usuarios]  WITH CHECK ADD  CONSTRAINT [FK_Usuarios_NivelAcesso] FOREIGN KEY([ID_Depto])
REFERENCES [dbo].[Departamento] ([ID_Depto])
GO
ALTER TABLE [dbo].[Usuarios] CHECK CONSTRAINT [FK_Usuarios_NivelAcesso]
GO
