-- perfis (spring security)
INSERT INTO perfil (id, nome) VALUES (1, 'ADMIN');
INSERT INTO perfil (id, nome) VALUES (2, 'COMUM');
-- usuários (spring security)
INSERT INTO usuario (nome, email, senha) VALUES ('ADM', 'adm@gmail.com', '$2a$12$A6aQtPfjDJzytOnwVJh2Ken.z34qUazUxuCCSlXmVUxZR2LeauT2q');
INSERT INTO usuario (nome, email, senha) VALUES ('usuário', 'comum@gmail.com', '$2a$12$z0vPYz3nWrW/hivpnt/1S.tIPkRaa2rou2.qchKKrB7LcCPJWMnL2');
-- tabela de relacionamentos (spring security)
INSERT INTO usuario_perfil (usuario_id, perfil_id) VALUES (1, 1);
INSERT INTO usuario_perfil (usuario_id, perfil_id) VALUES (1, 2);
INSERT INTO usuario_perfil (usuario_id, perfil_id) VALUES (2, 2);
-- clentes
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('João Silva', 'joao.silva@email.com', '21987654321', '123456');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Maria Oliveira', 'maria.oliveira@email.com', '21976543210', 'senha123');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Carlos Souza', 'carlos.souza@email.com', '21965432109', 'abc123');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Ana Costa', 'ana.costa@email.com', '21954321098', 'ana2024');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Lucas Pereira', 'lucas.pereira@email.com', '21943210987', 'lucas321');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Fernanda Alves', 'fernanda.alves@email.com', '21932109876', 'fer123');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Rafael Gomes', 'rafael.gomes@email.com', '21921098765', 'rafa2023');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Juliana Martins', 'juliana.martins@email.com', '21910987654', 'ju12345');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Bruno Rocha', 'bruno.rocha@email.com', '21999887766', 'bruno777');
INSERT INTO cliente (nome, email, telefone, senha) VALUES ('Patrícia Lima', 'patricia.lima@email.com', '21988776655', 'patri456');
-- imóveis
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Apartamento moderno no centro', 'Apartamento com 2 quartos, sala ampla e cozinha planejada, próximo ao metrô.', 350000.00, 'Rua das Flores, 123 - Centro', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Casa com quintal espaçoso', 'Casa com 3 quartos, garagem para 2 carros e área gourmet.', 480000.00, 'Rua Verde, 456 - Bairro Jardim', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Kitnet compacta', 'Ideal para estudantes, próxima a universidades e comércios.', 150000.00, 'Av. Universitária, 789 - Zona Sul', 'VENDIDO', 7);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Cobertura de luxo', 'Cobertura com piscina, vista panorâmica e 4 suítes.', 1200000.00, 'Av. Atlântica, 1010 - Beira Mar', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Casa em condomínio fechado', 'Segurança 24h, área de lazer completa e 3 quartos.', 650000.00, 'Rua das Palmeiras, 222 - Condomínio Bosque', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Apartamento mobiliado', 'Pronto para morar, com móveis planejados e eletrodomésticos.', 420000.00, 'Rua Azul, 333 - Bairro Novo', 'VENDIDO', 1);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Terreno amplo', 'Terreno plano com 500m², ideal para construção.', 200000.00, 'Rua do Sol, 444 - Zona Norte', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Casa simples', 'Casa com 2 quartos, sala e cozinha, ótima para família pequena.', 230000.00, 'Rua Esperança, 555 - Bairro Popular', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Apartamento com vista para o mar', '3 quartos, varanda grande e excelente localização.', 780000.00, 'Av. Oceânica, 666 - Praia', 'DISPONIVEL', NULL);
INSERT INTO imovel (titulo, descricao, preco, endereco, status, id_cliente) VALUES ('Sobrado reformado', 'Sobrado com acabamento moderno e 3 quartos.', 510000.00, 'Rua Nova, 777 - Bairro Central', 'VENDIDO', 7);