# Projeto Leilão
Esse é o projeto "Leilão", construído com Spring Boot e Maven. Ele tem o objetivo de demonstrar o uso de mocks com o Mockito para testes em Java.

# Pré-requisitos
O projeto necessita de:

- Java 8 ou superior
- Maven 3.8.1 ou superior

# Configuração
Para configurar o projeto, siga as seguintes etapas:

Clone o repositório.
Navegue até a pasta do projeto.
Execute o comando mvn clean install para instalar as dependências.

# Dependências
O projeto usa diversas dependências, incluindo:

- spring-boot-starter-thymeleaf para criar interfaces de usuário baseadas em templates.
- thymeleaf-extras-springsecurity5 para integração de segurança com Thymeleaf.
- thymeleaf-extras-java8time para adicionar suporte a objetos de data e hora do Java 8 na Thymeleaf.
- spring-boot-starter-web para criar aplicações web com Spring MVC.
- spring-boot-starter-validation para validação de dados.
- spring-boot-starter-data-jpa para acesso a dados via JPA.
- spring-boot-starter-security para adicionar segurança à aplicação.
- spring-boot-devtools para fornecer ferramentas de desenvolvimento úteis.
- spring-boot-starter-test para facilitar a criação de testes.
- h2 para fornecer um banco de dados em memória para desenvolvimento e testes.

# Testes
O projeto inclui uma dependência de spring-boot-starter-test para facilitar a criação de testes. Utilizaremos a biblioteca Mockito para criar mocks nos nossos testes. Para executar os testes, use o comando mvn test.

# Compilação e execução
Use o comando mvn package para compilar o projeto e java -jar target/leilao-0.0.1-SNAPSHOT.jar para executar.

# Contribuição
Contribuições são bem-vindas. Por favor, envie um Pull Request ou abra uma Issue para discutir o que você gostaria de mudar.

# Licença
# MIT