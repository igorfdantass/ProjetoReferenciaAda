#language: pt
@Tasks
@Regression
Funcionalidade: Tasks

  @Smoke
  Cenario: Criação de task
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    Entao task deve estar na lista de tasks ativas

  Cenario: Criação de duas tasks
    Dado que usuário está na pagina inicial
    Quando inserir nova task
    E inserir segunda task
    Entao task deve estar na lista de tasks ativas
    E segunda task também deve estar listada

  Cenario: Criação de task com variável
    Dado que usuário está na pagina inicial
    Quando inserir task 'task variável'
    Entao task deve estar na lista de tasks ativas

  @Smoke
  Cenario: Criação de task com DataTables
    Dado que usuário está na pagina inicial
    Quando inserir tasks:
      | task1 |
      | task2 |
      | task3 |
    Entao task deve estar na lista de tasks ativas

  Esquema do Cenario: Criar diferentes tasks usando esquema de cenário
    Dado que usuário está na pagina inicial
    Quando inserir task <nomeTask>
    Entao <nomeTask> deve estar na lista de tasks ativas
    @Smoke
    Exemplos:
      | nomeTask |
      | 'task1'  |

    @Regression
    Exemplos:
      | nomeTask |
      | 'task1'  |
      | 'task2'  |
      | 'task3'  |
      | 'task4'  |
