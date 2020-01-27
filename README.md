# Pokepoint

API do mundo Pokemon

## Features

Atraves da API podemos obter os seguintes dados sobre os jogos e do anime Pokemon:

- Tipos de Pokemons
- Movimentos dos Pokemons
- Pokemons e seus dados
- Personagens
- Ginásios
- Games
- Cidades

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

## Endpoint


| Endpoint                   | Descrição                                        |
|----------------------------|--------------------------------------------------|
| [/move](#/move)            | Retorna todos os movimentos                      |
| [/move/{id}](#/move/{id})  | Retorna o movimento de acordo com o ID informado |
| [/type](#/type)            | Retorna todos os tipos de Pokemons               |
| [/type/{id}](#/type/{id})  | Retorna o tipo de acordo com o ID informado      |

#### /move

Retorna todos os movimentos dos Pokemons em uma unica requisição:

```
[
    {
        "englishName": "Dragon Claw",
        "japaneseName": "ドラゴンクロー",
        "portugueseName": "Garra de Dragão",
        "accuracy": 100,
        "power": 80,
        "ppMin": 15,
        "ppMax": 25,
        "type": "Dragon"
    },
    {
        "englishName": "Flamethrower",
        "japaneseName": "かえんほうしゃ",
        "portugueseName": "Lança Chamas",
        "accuracy": 100,
        "power": 90,
        "ppMin": 15,
        "ppMax": 25,
        "type": "Fire"
    }
]
```

#### /move/{id}
Retorna o movimento do ID passado na requisição:
```
{
    "englishName": "Flamethrower",
    "japaneseName": "かえんほうしゃ",
    "portugueseName": "Lança Chamas",
    "accuracy": 100,
    "power": 90,
    "ppMin": 15,
    "ppMax": 25,
    "type": "Fire"
}
```

#### /type

Retorna todos os tipos de Pokemons:
```
[
    {
        "id": 1,
        "englishName": "Normal",
        "japaneseName": "ノーマルタイプ",
        "portugueseName": "Normal"
    },
    {
        "id": 2,
        "englishName": "Fighting",
        "japaneseName": "かくとうタイプ",
        "portugueseName": "lutador"
    }
]
```

#### /type/{id}
Retorna o tipo de acordo com o ID passado na requisição:
```
{
    "id": 2,
    "englishName": "Fighting",
    "japaneseName": "かくとうタイプ",
    "portugueseName": "lutador"
}
```