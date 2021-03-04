# Projeto: Mentoria de testes automatizados web com JUnit 5

Este projeto tem por objetivo simular uma compra com sucesso no site "https://www.saucedemo.com/index.html"

##Tecnologias Utilizadas

Este projeto conta com as seguintes tecnologias:  

- Java (Ver. xxx)
- JUnit5 (Ver. xxx)
- Maven  (Ver. xxx)
- ExtentReport (Ver. xxx)
- Java Faker (Ver. xxx)
- WebDriveManager (Ver. xxx)
- Intellij (Ver. xxx)

##Padrões Utilizados

**Main/Java**

- **Suporte** : Pasta onde se encontram classes de abstracao.

- **Utilitarios** :  Pasta onde ficam classes com métodos auxiliares para serem reutilizadas em outras classes.

**Main/Resources**

Pasta onde se encontram arquivos de inputs para execução dos testes.


**Test/Java**

- **PageObjects** : Pasta onde se encontram classes de mapeamento dos WebElements.

- **Tarefas** : Pasta onde se encontram classes de iteração com os WebElements.

- **CasosDeTeste** : Pasta onde se encontram classes e métodos de Testes.

- **SuiteDeTestes** : Pasta onde se encontram classes de suites de execução dos Tests.


## Como executar o projeto?

Primeiramente, você deverá clonar o projeto na sua máquina por meio do seguinte comando:

`git clone linkdorepositorioondeestaoprojeto`

**Abrindo o projeto na IDE**

Este projeto foi feito no IntelliJ, porém, você pode usar a IDE de sua preferência para executa-lo.

Assim que abri-lo, clique com o botão direito do mouse em cima da classe **TestSuites/AllTests** e execute-a.

**Executando via CMD**

Para executar o projeto via linha de comando, é preciso, primeiro, ter o Maven instalado e configurado na sua máquina.
(https://dicasdejava.com.br/como-instalar-o-maven-no-windows/)
Feito isso, dentro da pasta do projeto, abra o CMD e digite o seguinte comando:

`mvn test`

Deverá executar a sequencia de testescases do pacote.

## Relatórios de Teste

Para visualizar os reports, após a execução, abra a pasta raiz do projeto e acesse a pasta "Relatorio" e abra o aquivo "Meu_Relatorio.html".
