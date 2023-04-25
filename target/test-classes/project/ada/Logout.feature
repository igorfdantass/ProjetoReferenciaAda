#language: pt
@Logout
@Regression
Funcionalidade: Logout

  Cenario: Logout com sucesso
    Dado que estou na página home
    Quando inserir 'tautester1' e 'pwdsenha'
    E fazer logout
    Entao deve desconectar corretamente