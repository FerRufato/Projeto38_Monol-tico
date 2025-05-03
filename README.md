# CadastroApp

CadastroApp é uma aplicação Java para cadastro de usuários utilizando **JSF**, **JPA** e **PostgreSQL**. O projeto segue uma arquitetura em camadas, com interface, controle, serviço e repositório, garantindo organização e separação de responsabilidades.

## 📋 Funcionalidades

- Cadastro de usuários com validação de e-mail.
- Persistência de dados no banco de dados PostgreSQL.
- Interface web simples e funcional utilizando JSF.

## 🛠️ Tecnologias Utilizadas

- **Java 23**: Linguagem principal do projeto.
- **Jakarta EE**: Framework para desenvolvimento de aplicações corporativas.
  - **JSF**: Para a interface web.
  - **CDI**: Para injeção de dependências.
  - **JPA**: Para mapeamento objeto-relacional.
- **PostgreSQL**: Banco de dados relacional.
- **Hibernate**: Implementação do JPA.
- **Maven**: Gerenciador de dependências e build.

## 📂 Estrutura do Projeto

```plaintext
src/main/java/com/exemplo/
├── modelo/               # Entidades JPA
│   └── Usuario.java      # Entidade de usuário
├── repositorio/          # Repositórios para persistência
│   └── UsuarioRepositorio.java
├── servico/              # Regras de negócio
│   └── UsuarioServico.java
├── controle/             # Beans gerenciados para controle
│   └── UsuarioBean.java
src/main/resources/META-INF/
└── persistence.xml        # Configuração de persistência JPA
src/main/webapp/
├── cadastro.xhtml         # Página de cadastro de usuários
└── WEB-INF/
    └── web.xml            # Configuração do JSF
