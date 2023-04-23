#language: pt
@Tasks
Funcionalidade: Tasks

  @Regression
  @Smoke
  @Esse
  Cenario: REGRESSION SMOKE Criação de task
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    Entao task deve estar na lista de tasks ativas

  @Regression
  Cenario: REGRESSION Criação de duas tasks
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    E inserir segunda task
    Entao task deve estar na lista de tasks ativas
    E segunda task também deve estar listada

  @Regression
  Cenario: REGRESSION Criação de task com variável
    Dado que usuário está na pagina inicial
    Quando inserir task 'task variável'
    Entao task deve estar na lista de tasks ativas

  @Regression
  @Smoke
  Cenario: REGRESSION SMOKE Criação de task com DataTables
    Dado que usuário está na pagina inicial
    Quando inserir tasks:
      | task1 |
      | task2 |
      | task3 |
    Entao task deve estar na lista de tasks ativas

  @Regression
  Esquema do Cenario: REGRESSION Criar diferentes tasks usando esquema de cenário
    Dado que usuário está na pagina inicial
    Quando inserir task <nomeTask>
    Entao <nomeTask> deve estar na lista de tasks ativas
    Exemplos:
      | nomeTask |
      | 'task1'  |
      | 'task2'  |
      | 'task3'  |
      | 'task4'  |
