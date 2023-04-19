#language: pt
Funcionalidade: Login no ParaBank

  Cenario: Login com sucesso
    Dado que estou na página home
    Quando inserir 'usertester' e 'pwdsenha'
    Entao login deve realizado com sucesso

  Esquema do Cenario: Login usando esquema de cenário
    Dado que estou na página home
    Quando inserir <username> e <password>
    Entao login deve realizado com sucesso
    Exemplos:
      | username     | password   | msgerro |
      | 'usertester' | 'pwdsenha' |
      | 'usertester' | 'pwdsenha' |