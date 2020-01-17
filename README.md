# Pokepoint

API do mundo Pokemon

## Pré requisitos

- Git (https://git-scm.com/)
- Maven (https://maven.apache.org/)
- Java 8 ou superiror (https://www.oracle.com/technetwork/java/javase/downloads/index.html)

## Banco de Dados

### Banco de Dados de Teste

O banco de dados para teste é o H2, é possivel sua utilização por causa da dependência a seguir:

    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

No arquivo *application-test.properties* podemos ver a configuração usada para acessar o banco de dados.

#### Acessar Banco de Dados de Teste

Para acessar banco de dados de teste e necessario colocar a seguinte url no navegar e usar as informações de acesso no arquivo *application-test.properties*.

    http://localhost:8080/h2-console