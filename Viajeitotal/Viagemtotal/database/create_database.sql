CREATE DATABASE IF NOT EXISTS crud_produtos
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE crud_produtos;

CREATE TABLE IF NOT EXISTS produtos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);

INSERT INTO produtos (nome, descricao, preco) VALUES
('Notebook', 'Notebook para estudos e programação', 2999.90),
('Mouse', 'Mouse USB para computador', 79.90),
('Teclado', 'Teclado USB ABNT2', 129.90);
