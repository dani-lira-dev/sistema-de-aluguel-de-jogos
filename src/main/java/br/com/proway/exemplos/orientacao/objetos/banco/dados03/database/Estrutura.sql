DROP DATABASE IF EXISTS locadora;
CREATE DATABASE locadora;
USE locadora;

CREATE TABLE jogos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    tipo VARCHAR(30)
);

CREATE TABLE alugueis(
	id INT PRIMARY KEY AUTO_INCREMENT,
    cliente VARCHAR(100),
    id_jogo INT,
    data_hora_aluguel DATETIME,
    data_hora_devolucao DATETIME,
    FOREIGN KEY (id_jogo) REFERENCES jogos(id)
);
DELETE FROM jogos;
INSERT INTO jogos (nome, tipo) VALUES
('GTA V', 'RPG'),
('Jogo da vida', 'Esporte'),
('Minecraft', 'Construção'),
('Counter Strike', 'FPS');

INSERT INTO alugueis (cliente, id_jogo, data_hora_aluguel) VALUES
('Fernanda', 4, '2022-08-20 16:36:52'),
('Dayvid', 1, '2022-08-19 03:00:00');




SELECT 
	alu.id AS 'aluno_id',
    alu.cliente AS 'aluno_cliente',
    jog.nome AS 'jogo_nome',
    jog.id AS 'jogo_id',
    alu.data_hora_aluguel AS 'aluno_data_hora_aluguel', 
    alu.data_hora_devolucao AS 'aluno_data_hora_devolucao'
    FROM alugueis AS alu
INNER JOIN jogos AS jog ON(alu.id_jogo = jog.id);



