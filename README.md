# 📚 Gerenciador de Bibliotecas

Sistema completo para gerenciamento de bibliotecas, desenvolvido como projeto acadêmico. A aplicação permite cadastrar, listar, editar e remover livros, autores e usuários, além de gerenciar empréstimos de forma simples e intuitiva.

Este projeto é dividido em dois módulos:
- Backend: Spring Boot + Banco de Dados
- Frontend: React

---

## 🚀 Tecnologias Utilizadas

### Backend
- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Web
- PostgreSQL
- Docker
---

### Frontend
- React
- Axios (requisições HTTP)
- React Router DOM
---

## ⚙ Funcionalidades

- Cadastro de livros com título, autor, categoria e disponibilidade
- Cadastro e listagem de autores
- Gerenciamento de usuários (quem pode pegar emprestado)
- Empréstimo e devolução de livros
- Validação de campos e regras de negócio
- Integração frontend + backend via API RESTful

---

## 🏗 Estrutura do Projeto

bash
biblioteca-project/
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── frontend/
│   ├── src/
│   ├── public/
│   └── package.json
└── README.md

---
## 🖥 Como rodar o projeto localmente
### 1. Clone o repositório
bash
git clone https://github.com/seu-usuario/biblioteca-project.git
cd biblioteca-projec

### 2. ⚙ Backend (Spring Boot)

### 📋 Pré-requisitos:
- Java 17+
- Maven
- PostgreSQL ou outro banco compatível
- (Opcional: Docker para PostgreSQL)

### 🛠 Configurar o banco de dados

Crie um banco chamado biblioteca_db:

sql
CREATE DATABASE biblioteca_db;

### ⚙ Configure o application.properties
Local: backend/src/main/resources/application.properties

properties
spring.datasource.url=jdbc:postgresql://localhost:5432/biblioteca_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

----
## ▶ Rodar a aplicação
bash
cd backend
./mvnw spring-boot:run

---
Screencast do projeto: https://youtu.be/CdCZbqxeRxg?si=rxZRhr5N06KiF9Y1
Screencast unit test: https://youtu.be/qb-HXiQMhDo
---
## 📊 Diagrama de Classes (UML)
O diagrama abaixo mostra a arquitetura completa do sistema, indo da interface com o usuário (React) até a persistência no banco de dados (PostgreSQL).
![Captura de tela 2025-04-09 220640](https://github.com/user-attachments/assets/ea0672e5-549d-4fcf-aa0d-965c4cfd9999)

