CREATE DATABASE IF NOT EXISTS sistemaemprestimoa3;
USE sistemaemprestimoa3;
-- Tabela tb_amigo
CREATE TABLE IF NOT EXISTS `tb_amigo` (
  `id_amigo` INT NOT NULL,
  `nome` VARCHAR(45) NULL,
  `telefone` VARCHAR(20) NULL,
  PRIMARY KEY (`id_amigo`)
) ENGINE = InnoDB;

-- Tabela tb_ferramenta
CREATE TABLE IF NOT EXISTS `tb_ferramenta` (
  `id_ferramenta` INT NOT NULL,
  `nome` VARCHAR(30) NULL,
  `custo` FLOAT NULL,
  `marca` VARCHAR(45) NULL,
  PRIMARY KEY (`id_ferramenta`)
) ENGINE = InnoDB;

-- Tabela tb_emprestimo
CREATE TABLE IF NOT EXISTS `tb_emprestimo` (
  `id_emprestimo` INT NOT NULL,
  `id_ferramenta` INT NULL,
  `id_amigo` INT NULL,
  `data_emprestimo` VARCHAR(45) NULL,
  `data_devolucao_prevista` VARCHAR(45) NULL,
  `data_devolucao_real` VARCHAR(45) NULL,
  `status` TINYINT NULL,
  FOREIGN KEY (`id_amigo`) REFERENCES `tb_amigo` (`id_amigo`),
  FOREIGN KEY (`id_ferramenta`) REFERENCES `tb_ferramenta` (`id_ferramenta`),
  PRIMARY KEY (`id_emprestimo`)
) ENGINE = InnoDB;