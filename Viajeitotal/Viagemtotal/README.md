# CRUD Produtos - Spring Boot + MySQL + Bruno

Projeto de API REST desenvolvido com:
- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Lombok
- MySQL Driver
- Spring Boot Validation

## Estrutura

- `controller` -> recebe as requisições HTTP
- `service` -> regras da aplicação
- `repository` -> acesso ao banco com JPA
- `entity` -> entidade Produto
- `database/create_database.sql` -> criação do banco e dados de exemplo

## 1. Pré-requisitos

- Java 17 ou superior
- Maven
- MySQL Server
- Bruno (ou outro cliente REST)

## 2. Banco de dados

Abra o MySQL Workbench e execute:

```sql
CREATE DATABASE IF NOT EXISTS crud_produtos;
```

Depois, confira `src/main/resources/application.properties`.

Altere:

```properties
spring.datasource.username=root
spring.datasource.password=COLOQUE_SUA_SENHA
```

Se o seu MySQL estiver na porta padrão 3306, não precisa mudar a URL.

O projeto também usa `createDatabaseIfNotExist=true`, então, com usuário/senha válidos e permissão para criar banco, o banco pode ser criado automaticamente na primeira conexão.

## 3. Executar

No terminal, dentro da pasta do projeto:

```bash
mvn spring-boot:run
```

A API ficará em:

`http://localhost:8080`

## 4. Testar no Bruno

### GET - listar
GET `http://localhost:8080/produtos`

### GET - buscar por ID
GET `http://localhost:8080/produtos/1`

### POST - cadastrar
POST `http://localhost:8080/produtos`

Header:
`Content-Type: application/json`

Body JSON:

```json
{
  "nome": "Monitor",
  "descricao": "Monitor Full HD 24 polegadas",
  "preco": 899.90
}
```

### PUT - alterar
PUT `http://localhost:8080/produtos/1`

```json
{
  "nome": "Notebook atualizado",
  "descricao": "Notebook para programação",
  "preco": 3199.90
}
```

### DELETE - excluir
DELETE `http://localhost:8080/produtos/1`

## 5. Resultado esperado

Depois do POST, o Spring retorna HTTP 201 e algo parecido com:

```json
{
  "id": 4,
  "nome": "Monitor",
  "descricao": "Monitor Full HD 24 polegadas",
  "preco": 899.90
}
```

No GET, os registros cadastrados aparecem em JSON.

## Observação

Se o banco ainda não existir, execute `database/create_database.sql` no MySQL Workbench. Depois inicie o Spring Boot e teste as rotas pelo Bruno.
