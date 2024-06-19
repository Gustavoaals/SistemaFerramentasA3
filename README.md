# Sistema Ferramentas A3
- Projeto de um software para gerenciamento de aquisições
## Introdução
- Projeto de software (teste003- ofc) para controle de Sistema de Ferramentas desenvolvido para o trabalho A3 da UNISUL.
## Desenvolvedor
José Gustavo de Almeida Alves (Gustavoaals 10724114382)
## Contexto
- Esta é uma versão do sistema para a IDE NetBeans.
-O projeto no NetBeans deve ser chamado SistemaFerramentasA3.
-Os dados estão armazenados no banco de dados MySQL.
-Este programa possui diversas classes organizada nos pacotes principal, modelo, visao e dao.
-A pasta src contêm os fontes do projeto.
-A interface gráfica foi construída com o auxílio da IDE NetBeans
-O Banco de construído com o auxílio do Workbench
## Problema
- No churrasco de família, seu tio-avô, lhe pediu um software para gerenciar o empréstimo de ferramentas. Ele quer o software que rode localmente no computador dele. A ideia é ter um cadastro de ferramentas (nome, marca, custo de aquisição) e o de amigos (nome, telefone). Ele gostaria de registrar os empréstimos de uma ou mais ferramentas a um determinado amigo, marcando a data que ocorreu e também a data de devolução. Ele pediu que o software tenha um relatório de ferramentas e o quanto ele gastou. Também vai querer outro relatório dos empréstimos ativos e de todos os empréstimos realizados, por algum motivo ele gostaria de saber quem é que fez mais empréstimos e se tem alguém que nunca devolveu, inclusive, a cada novo empréstimo ele gostaria de o sistema diga se o amigo ainda tem algo que não devolveu.
## Requisitos Funcionais
- RF01 - Cadastro de ferramentas: O software deve permitir que o usuário cadastre as ferramentas, como nome, marca e custo.
- RF02 - Cadastro de amigos: O software deve permitir que o usuário cadastre os dados dos amigos, como nome, e-mail e telefone.
- RF03 - Registro de empréstimos: O software deve permitir que o usuário registre os empréstimos de ferramentas para os amigos, informando a ferramenta, o amigo, a data do empréstimo e os dados previstos de devolução.
- RF04 - Registro de empréstimos: O software deve mostrar um aviso ao usuário a cada novo empréstimo se a uma pendência de devolução.
- RF05 - Relatório de ferramentas: O software deve gerar um relatório com todas as ferramentas cadastradas, informando a descrição e o valor de cada uma, bem como o gasto total com a aquisição das ferramentas.
- RF06 - Relatório de empréstimos ativos: O software deve gerar um relatório com todos os empréstimos que ainda não foram devolvidos, informando a ferramenta emprestada, o amigo que pegou emprestado, a data de empréstimo e os dados previstos de devolução.
- RF07 - Relatório de todos os empréstimos: O software deve gerar um relatório com todos os empréstimos realizados, informando a ferramenta emprestada, o amigo que pegou emprestado, a data de empréstimo e os dados de devolução e qual amigo faz mais empréstimos.
- RF08 - Verificação de ferramentas não devolvidas: O software deve verificar a cada novo empréstimo se o amigo ainda tem ferramentas não devolvidas e informar ao usuário.
## Requisitos Não Funcionais
- RNF001: O programa deve ser executado em um sistema operacional compatível, como Windows 10.
- RNF002: O programa deve ser desenvolvido utilizando Java na versão 22.0.1.
- RNF003: O programa deve ser conectado a uma base de dados MySQL na versão 8.4.0.
- RNF004: O ambiente de desenvolvimento deve ser o Apache NetBeans IDE na versão 21.
## Banco de Dados
- Usuário: root
- Senha: root
 ![Captura de Tela (99)](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/27195e32-3c13-4585-be50-113b9ea51f61)

## 📷 Telas
![telaInicio](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/f2aef49c-21d3-4f29-aa33-29b319b6716c)
![CADASTROaMIGO](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/95d05ea6-5c08-418c-8530-2c4aec4a2ba3)
![CADASTROferramenta](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/d35ba238-56a9-4d28-b14c-cf354ea96ac4)
![gerenciamentoDeAmigo](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/565d5d2c-efff-4888-bcde-32b98760bc8b)
![gerenciamentoDeFerramenta](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/e412f303-4b7c-42f2-839d-4922912b40d6)
![conclusaoDoEmprestimo](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/f969bb65-2d31-4041-8fc1-9b3b7b745946)
![emprestimodeferramenta](https://github.com/Gustavoaals/SistemaFerramentasA3/assets/160749842/663bfa42-2095-4510-a297-3725040bf7be)
