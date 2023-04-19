#language: pt
Funcionalidade: Tasks

  Cenario: Criação de task
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    Entao task deve estar na lista de tasks ativas

  Cenario: Criação de duas tasks
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    E inserir segunda task
    Entao task deve estar na lista de tasks ativas

  Cenario: Criar diferentes tasks usando parametros
    Dado que usuário está na pagina inicial
    Quando inserir task 'task1'
    E inserir task 'task2'
    E inserir task 'task3'
    E inserir task 'task4'
    E inserir task 'task5'
    E inserir task 'task6'
    E inserir task 'task7'
    E inserir task 'task8'
    E inserir task 'task9'
    Entao task deve estar na lista de tasks ativas

  Cenario: Criar diferentes tasks usando DataTables
    Dado que usuário está na pagina inicial
    Quando inserir task
      | task1 |
      | task2 |
      | task3 |
      | task4 |
      | task5 |
      | task6 |
      | task7 |
      | task8 |
      | task9 |
    Entao task deve estar na lista de tasks ativas


  Esquema do Cenario: Criar diferentes tasks usando DataTables
    Dado que usuário está na pagina inicial
    Quando inserir task <nomeTask>
    Entao <nomeTask> deve estar na lista de tasks ativas
    Exemplos:
      | nomeTask |
      | 'task1'  |
      | 'task2'  |
      | 'task3'  |
      | 'task4'  |



