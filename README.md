# 🏠 Sistema Imobiliário

## 📌 Descrição
Sistema backend desenvolvido em Java com Spring Boot para gerenciamento de imóveis e clientes. O sistema mantém as informações dos clientes e dos imóveis e relaciona quantos e quais imóveis são de propriedade de cada cliente, bem como quantos e quais imóveis estão disponíveis para venda

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

## 🔗 Endpoints

### 🤵 Cliente
- GET /cliente → listar
- GET /clientes/{id} → buscar por id
- POST /clientes → salvar
- PUT /clientes/{id} → atualizar
- DELETE /clientes/{id} → deletar

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
O relacionamento entre as entidades deste projeto é de Muitos para Um (OneToMany), visto que um cliente pode possuir vários imóveis, porém todo imóvel pertence a um e apenas um cliente.

---

## ▶️ Como executar

1. Abrir o projeto no STS
2. Rodar como Spring Boot App
3. Acessar: http://localhost:8080

---

## 🧪 Testes
Utilizou-se o Postman para testar cada endpoint.

<img width="741" height="546" alt="Captura de tela 2026-04-27 172746" src="https://github.com/user-attachments/assets/d64fc06f-11a9-4ae2-b2cd-e1cb444d2674" />
Teste do endpoint GET de imoveis

<img width="739" height="550" alt="Captura de tela 2026-04-27 172626" src="https://github.com/user-attachments/assets/5bd21835-c8a1-438d-84bf-be5d691c2dd1" />
Teste do endpoint POST de imoveis

<img width="742" height="553" alt="Captura de tela 2026-04-27 172958" src="https://github.com/user-attachments/assets/e23a54db-b446-4c21-a4d1-73efd5bd96b6" />
Teste do endpoint PUT de imoveis

<img width="746" height="549" alt="Captura de tela 2026-04-27 173049" src="https://github.com/user-attachments/assets/4828239c-3fc6-49bc-8257-529ad38adb7a" />
Teste do endpoint DELETE de imoveis

<img width="740" height="552" alt="Captura de tela 2026-04-27 174020" src="https://github.com/user-attachments/assets/0eea086e-cfce-4d79-a6b6-dc1863c50af5" />
Teste do endpoint GET de cliente

<img width="747" height="547" alt="Captura de tela 2026-04-27 174308" src="https://github.com/user-attachments/assets/a1203aed-bbc1-4e1f-a8a0-88fa0817b0bb" />
Teste do endpoint POST de cliente

<img width="742" height="549" alt="Captura de tela 2026-04-27 173910" src="https://github.com/user-attachments/assets/255d111e-23a7-4f43-9fb4-658cc84d61ad" />
Teste do endpoint PUT de cliente

<img width="743" height="551" alt="Captura de tela 2026-04-27 174148" src="https://github.com/user-attachments/assets/c542e2af-43ab-400e-9d78-137f44763dd1" />
Teste do endpoint DELETE de cliente

<img width="789" height="592" alt="Captura de tela 2026-04-27 173200" src="https://github.com/user-attachments/assets/33970055-6336-4987-b6e8-b01351f11fdd" />
Teste no H2-Console com os dados da tabela Cliente

<img width="1320" height="627" alt="Captura de tela 2026-04-27 173639" src="https://github.com/user-attachments/assets/79ccacd3-75c7-4ffa-b5ac-94bdac6850b1" />
Teste no H2-Console com os dados da tabela Imovel
---

## 🐬 Banco de dados

<img width="775" height="223" alt="Captura de tela 2026-04-20 194934" src="https://github.com/user-attachments/assets/0cc98898-dcbc-4e10-a7b1-9e59695e6f2d" />
Modelo Conceitual do banco de dados exibindo as duas entidades presentes no projeto, Cliente e Imóvel bem como seu relacionamento e atributos

<img width="571" height="222" alt="Captura de tela 2026-04-28 100255" src="https://github.com/user-attachments/assets/ed6d44c5-c5fa-4a5f-a765-4477221aec20" />
Modelo Lógico do banco de dados

<img width="1365" height="718" alt="Captura de tela 2026-04-27 171146" src="https://github.com/user-attachments/assets/63de9d43-cd2c-47c9-b057-772165b626dd" />
Captura de tela da tabela Cliente no MySQL

<img width="1365" height="720" alt="Captura de tela 2026-04-27 171307" src="https://github.com/user-attachments/assets/f11f3811-5320-4bee-ac83-4c7d3620e286" />
Captura de tela da tabela Imovel no MySQL

## 👨‍💻 Desenvolvedores do projeto
- Cássio Roberto Ferreira da Silva
- Gabriel Tavares Nogueira de Moura
- Miguel de Matos Barros Barbosa
- Juliana Neri Silva da Cruz
