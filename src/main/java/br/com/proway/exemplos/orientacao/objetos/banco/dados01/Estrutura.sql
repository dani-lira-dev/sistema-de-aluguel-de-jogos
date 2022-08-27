CREATE DATABASE lojaBd;
-- Selecionar qual banco de dados será trabalhado
USE lojaDb; 
-- Criar tabela com as colunas, para posteriormente cadastrar
-- os registros
CREATE TABLE carros(
    id INT PRIMARY KEY AUTO_INCREMENT,
    modelo VARCHAR(100),
    marca VARCHAR(50),
    preco DOUBLE
);

-- Consultar os registros da tabela de carros
SELECT id, modelo, marca, preco FROM carros;

INSERT INTO carros (modelo, marca, preco) VALUES
('Fusca 72', 'VW', 15000);

-- Consultar os dados da tabela
SELECT id, modelo, marca, preco FROM carros;

CREATE TABLE jogos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    tipo VARCHAR(30)
);

SELECT id, nome, tipo FROM jogos;