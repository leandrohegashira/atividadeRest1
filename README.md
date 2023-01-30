# CRUD em API Rest com Spring 
<br>

### 1. Criação do projeto
<br>

Para a criação do projeto usaremos o **Intellij**
<br>
+ New Project
+ Spring initalizr
+ Type: Maven
+ Group: com.demo.academiacx
+ Artifact: academia.demo
+ Package name: com.demo.academiacx
+ JDK: 11
+ Java: 11

![Untitled](https://user-images.githubusercontent.com/98417184/215508459-5d09ae48-a0a3-48a6-aa08-2f94352e0b0b.png)

Aqui vamos inserir algumas dependências:
+ **Spring web**
+ **Spring data JPA** - vai pegar nossos dados, nossa classe e vai jogar dentro de um bando de dados
+ **H2 Database**

Em **application.properties** vai colocar todas as propriedades (que podem ser variáveis fixas ou propriedades) que o spring e as dependecias vão acessar para fazer algum tipo de configuração.

![Untitled](https://user-images.githubusercontent.com/98417184/215509127-0e1f7e6e-9035-41d4-bd71-e022ddd8c620.png)

### 2. Criação da Model
+ Na pasta **com.demo.academiacx** foi criado a package **model**. Nela, inserimos a classe **PessoaModel**. Esta é a representação dos dados que tem nas tabelas do banco de dados
+ Foi adicionado o **@Entity** nessa classe PessoaModel para informar que uma classe também é uma entidade
+ Criamos os atributos Id, Nome, Cpf, Rg, data de nascimento, estado civil, telefone e e-mail.
+ Criamos o construtor e os getters e setters

### 3. Criação da Controller
Aqui é a nossa porta de entrada / porta de saída das chamadas. É aqui onde fazemos as operações do famoso CRUD.
+ Foi criado a package **controller** na pasta **com.demo.academiacx**
+ Foi criado a classe PessoaController
+ Adicionamos a notação **@RestController** e **@RequestMapping(value = "/pessoa")**
+ Foi criado os métodos que vão manipular as telas do nosso sistema. Toda a parte visual do nosso sistema será controlado por ela.
+ Criamos o GetMapping para buscar uma informação do bando de dados
+ Criamos o PostMapping para salvar uma informaçãdo no banco
+ Criamos o PutMapping para atualizar informações
+ E o DeleteMappping para deletar alguma informação necessária

### 4. Utilizando no Postman
+ Abrir o Postman
+ Criamos um nova Collection

Teremos algo parecido com essa tela:
![image](https://user-images.githubusercontent.com/98417184/215514552-6513752a-6cab-4533-a4c7-425a957001fa.png)

+ Aqui podemos realizar métodos criados na Controller para as operações de CRUD
+ Para buscar uma informação de todo o banco, usamos o **GET** e inserimos **http://localhost:8080/pessoa**
+ Para buscar um dado específico pelo **id**, usamos o **GET**, **http://localhost:8080/pessoa/id**
+ Para salvar uma informação usamos o **POST**, **http://localhost:8080/pessoa/save**. 
+![image](https://user-images.githubusercontent.com/98417184/215515811-e50340a5-8870-49e1-bc6b-379c4a2f4958.png)

+ Para atualizar uma informação usamos o **PUT**, **http://localhost:8080/pessoa/update**. 
![image](https://user-images.githubusercontent.com/98417184/215516102-6a004154-01a1-4980-8104-920384dd89f9.png)

+ Para deletar, usamos o **DELETE**, **http://localhost:8080/pessoa/delete**. 
+ ![Sem título](https://user-images.githubusercontent.com/98417184/215516582-8bded092-b3c5-45a0-8779-b0e0b8489862.png)
