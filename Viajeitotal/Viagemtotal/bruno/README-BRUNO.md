# Coleção para testar no Bruno

Crie uma Collection chamada `CRUD Produtos`.

Crie as seguintes requisições:

1. `GET Listar Produtos`
   URL: `http://localhost:8080/produtos`

2. `GET Buscar Produto`
   URL: `http://localhost:8080/produtos/1`

3. `POST Criar Produto`
   URL: `http://localhost:8080/produtos`
   Body JSON:
   {
     "nome": "Monitor",
     "descricao": "Monitor Full HD 24 polegadas",
     "preco": 899.90
   }

4. `PUT Atualizar Produto`
   URL: `http://localhost:8080/produtos/1`
   Body JSON:
   {
     "nome": "Notebook atualizado",
     "descricao": "Notebook para programação",
     "preco": 3199.90
   }

5. `DELETE Excluir Produto`
   URL: `http://localhost:8080/produtos/1`

Use `Content-Type: application/json` nas requisições POST e PUT.
