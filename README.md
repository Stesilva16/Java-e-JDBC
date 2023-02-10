# Java-e-JDBC

O JDBC é uma API — Application Programming Interface — do Java que contém uma série de classes e interfaces para realizar a comunicação entre uma aplicação desenvolvida em Java e o banco de dados utilizado por ela.

Há quatro tipos de drivers JDBC. São eles:

* driver de ponte JDBC-ODBC: utiliza um driver ODBC para se conectar ao banco de dados;
* driver de API nativa: usa bibliotecas do lado do cliente para se comunicar com o banco de dados;
* driver de protocolo de rede: adota uma camada adicional de software para converter as chamadas JDBC no protocolo utilizado pelo banco de dados;
* driver fino ou Thin Driver: converte as chamadas JDBC de acordo com o banco de dados do fabricante.

Bom no curso estudamos sobre JDBC-MySql tecnologia que permite a conexão com diferentes bancos de dados relacionais, como e MySQL ou muitos outros disponíveis no mercado. 

Pontos relevantes que estudamos:
<br>
* Para acessar o banco de dados, precisamos de um driver <br>
  - Um driver nada mais é do que uma biblioteca (JAR) <br>
* JDBC significa Java DataBase Conectivity <br>
  - JDBC define uma camada de abstração entre a sua aplicação e o driver do banco de dados <br>
  - Essa camada possui, na sua grande maioria, interfaces que o driver implementa <br>
* Para abrir uma conexão, devemos usar o método getConnection, da classe DriverManager <br>
  - O método getConnection recebe uma string de conexão JDBC, que define a URL, usuário, senha, etc <br>
* Para simplificar e encapsular a criação da conexão, devemos usar uma classe ConnectionFactory <br>
-A classe ConnectionFactory segue o padrão de criação Factory Method <br>
  -O Factory Method encapsula a criação de um objeto <br>
* Para executar um comando SQL, podemos usar a interface java.sql.Statement <br>
  - O método execute envia o comando para o banco de dados <br>
  - Dependendo do comando SQL, podemos recuperar a chave primária ou os registros selecionados <br>
* Ao executar SQL como Statement, temos um risco de segurança, chamado de SQL Injection <br>
  - SQL Injection nada mais é do que passar um novo comando SQL como parâmetro <br>
* Para evitar SQL Injection, devemos usar a interface PreparedStatement <br>
  - Diferentemente do Statement, o PreparedStatement trata (sanitiza) cada parâmetro do comando SQL <br>
* O banco de dados oferece um recurso chamado de transação, para juntar várias alterações como unidade de trabalho <br>
  - Se uma alteração falha, nenhuma alteração é aplicada (é feito um rollback da transação) <br>
  - Todas as alterações precisam funcionar para serem aceitas (é feito um commit) <br>
* commit e rollback são operações clássicas de transações <br>
* Para garantir o fechamento dos recursos, existe no Java uma cláusula try-with-resources <br>
  - O recurso em questão deve usar a interface Autoclosable <br>
* É boa prática usar um pool de conexões <br>
* Um pool de conexões administra/controla a quantidade de conexões abertas <br>
  - Normalmente tem um mínimo e máximo de conexões <br>
* Como existe uma interface que representa a conexão (java.sql.Connection), também existe uma interface que representa o pool de conexões (javax.sql.DataSource) <br>
* C3PO é uma implementação Java de um pool de conexão <br>
* Para cada tabela de domínio, temos uma classe de domínio <br>
  - Por exemplo, a tabela produtos tem uma classe Produto associada <br>
  - Objetos dessa classe representa um registro na tabela <br>
* Para acessar a tabela, usaremos um padrão chamado Data Access Object (DAO) <br>
  - Para cada classe de domínio, existe um DAO. Por exemplo, a classe Produto possui um ProdutoDao <br>
  - Todos os métodos JDBC relacionados com o produto devem estar encapsulados no ProdutoDao <br>
* Que quando temos um relacionamento, é preciso ter cuidado para não cair no problema de queries N + 1 <br>
  - N + 1 significa executar uma query e mais uma nova query (N) para cada relacionamento <br>
  - Queries N + 1 podem gerar um problema no desempenho <br>
  - Queries N + 1 podem ser evitadas através de joins no SQL <br>
* A criar a nossa própria camada de persistência <br>
* uma aplicação é escrita em camadas
  - camadas clássicas são view, controller, modelo e persistência
* o fluxo entre as camadas segue a ordem:
<br>
view <--> controller <--> persistencia  <br>
<br>
* nesse curso focamos na camada de persistência <br>
* uma camada não deve deixar "vazar" detalhes da implementação (por exemplo uma exceção como SQLException) <br>
* em outras formações você aprenderá como criar a view ou front-end para Android (mobile) ou web (html) <br>





