create database loja_informatica;
use loja_informatica;

CREATE TABLE clientes (
    cpf BIGINT PRIMARY KEY,
    nome_cliente VARCHAR(255),
    data_nasc DATE,
    genero VARCHAR(10),
    estado_civil VARCHAR(20),
    lougradouro VARCHAR(255),
    bairro VARCHAR(100),
    cep VARCHAR(10),
    email VARCHAR(255),
    celular VARCHAR(15)
);

create table produtos(
tipo varchar(30),
nome varchar(150),
preco double,
quantidade int,
id int not null auto_increment,
primary key (id)
);

CREATE TABLE vendas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  quantidade INT,
  cod_produto INT,
  nome_produto VARCHAR(100),
  valor_unitario DECIMAL(10, 2),
  valor_total DECIMAL(10, 2),
  cpf VARCHAR(11),
  nome VARCHAR(100),
  tipo_pag VARCHAR(100),
  parcelamento INT,
  valor_final DECIMAL(10, 2),
  data_venda DATE,
  FOREIGN KEY (cod_produto) REFERENCES produtos(id)
);

DELIMITER //

CREATE PROCEDURE consultar_venda(IN data_inicio DATE, IN data_fim DATE)
BEGIN
    SELECT vendas.data_venda AS Data, clientes.nome_cliente AS Cliente, produtos.nome AS Produto, vendas.quantidade AS Quantidade, vendas.valor_final AS Valor
    FROM vendas
    INNER JOIN clientes ON vendas.cpf = clientes.cpf
    INNER JOIN produtos ON vendas.cod_produto = produtos.id
    WHERE vendas.data_venda BETWEEN data_inicio AND data_fim
    GROUP BY Data, Cliente, Produto, Quantidade, Valor;
END //

DELIMITER ;

