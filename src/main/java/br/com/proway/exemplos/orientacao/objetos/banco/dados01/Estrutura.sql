/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  71398
 * Created: 30 de jul. de 2022
 */
CREATE DATABASE lojaBd;
-- Criar tabela com as colunas, para posteriormente cadstrar 
-- os registros
CREATE TABLE carros(
	id INT PRIMARY KEY AUTO_INCREMENT,
    modelo VARCHAR(100),
    marca VARCHAR(50),
    preco DOUBLE
);

-- Consultar os registros da tabela de carros
SELECT id, modelo, marca, preço FROM carros;

INSERT INTO carros (modelo, marca, preco) VALUES
('Fusca 72', 'VW', 15000);

-- Consultar os dados da tabela
SELECT id, modelo, marca, preco FROM carros;


