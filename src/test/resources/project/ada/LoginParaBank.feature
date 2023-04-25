#language: pt
@LoginParaBank
@Ignore
Funcionalidade: Login no ParaBank

  Cenario: Login com sucesso
    Dado que estou na página home
    Quando inserir 'usertester' e 'pwdsenha'
    Entao login deve realizado com sucesso

  Esquema do Cenário: Login com schema de cenarios
    Dado que estou na página home
    Quando inserir <username> e <pwd>
    Entao login deve realizado com sucesso

    Exemplos:
      | username     | pwd        |
      | "erro1"      | "pwd"      |
      | "usertester" | "pwdsenha" |

