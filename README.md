# 🏠 Sistema Imobiliário

## 📌 Descrição
Sistema backend desenvolvido em Java com Spring Boot para gerenciamento de imóveis e clientes. O sistema mantém as informações dos clientes e dos imóveis e relaciona quantos e quais imóveis são de propriedade de cada cliente

---

## 🚀 Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Maven
- MySQL

---

## 🧱 Arquitetura
O projeto segue o padrão MVC:
- Model → Entidades (Imovel, Cliente)
- Repository → Acesso ao banco
- Service → Regras de negócio
- Controller → Endpoints da API

---

## 🔗 Endpoints

### 📍 Imóveis
- GET /imoveis → listar
- GET /imoveis/{id} → buscar por id
- POST /imoveis → cadastrar
- PUT /imoveis/{id} → atualizar
- DELETE /imoveis/{id} → deletar

---

### 👤 Clientes
- GET /clientes → listar
- POST /clientes → cadastrar
- GET /clientes/{id} → buscar
- PUT /clientes/{id} → atualizar
- DELETE /clientes/{id} → deletar

---

## 🔗 Relacionamento
Um cliente pode estar associado a vários imóveis (OneToMany).

---

## ▶️ Como executar

1. Abrir o projeto no STS
2. Rodar como Spring Boot App
3. Acessar:
http://localhost:8080

---

## 🧪 Testes
Utilizar o Postman para testar os endpoints.

---

## 👨‍💻 Autores
Cássio Roberto Ferreira da Silva
Gabriel Tavares Nogueira de Moura
