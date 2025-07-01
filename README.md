# 🥗 Projeto API Food Tracker - Spring Boot

Este projeto foi desenvolvido como parte dos primeiros estudos com Spring Boot, seguindo uma videoaula do canal **Fiasco**. O objetivo foi compreender o funcionamento básico de uma **API RESTful** com Java, e aprender a manipular dados através de rotas com operações de CRUD (Create, Read, Delete).

## 🚀 Tecnologias utilizadas

- [Java](https://docs.oracle.com/en/java/) - Linguagem de programação utilizada
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework utilizado
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Banco de dados H2](https://www.h2database.com/)

## ℹ️ Sobre o projeto

A aplicação é uma API REST para o gerenciamento de alimentos, permitindo:

- Cadastro de novos alimentos com nome, quantidade, calorias e data de validade
- Listagem de todos os alimentos ou consulta por ID
- Exclusão de alimentos por ID ou em massa

As funcionalidades estão expostas via endpoints mapeados no controller `/food`, e seguem uma estrutura simples com uso de `@RequestBody` e `@RequestParam` para manipulação dos dados.

### 🔹 FoodController
- `GET /food/list-all`: Lista todos os alimentos cadastrados
- `GET /food/list-id/{id}`: Busca alimento por ID
- `POST /food/addFood`: Cadastra alimento via corpo da requisição (JSON)
- `POST /food/add-url`: Cadastra alimento via parâmetros de URL
- `DELETE /food/delete-id/{id}`: Remove alimento por ID
- `DELETE /food/delete-all`: Remove todos os registros

## 🛠️ Melhorias planejadas

- Desenvolver um **frontend** para cadastrar e visualizar os alimentos de forma intuitiva

## ⚠️ Observações

- Projeto com fins educativos, com o foco em fixar a estrutura básica de uma aplicação Spring Boot.
- Foram aplicadas boas práticas básicas como separação em camadas (controller, service, model).
- O sistema utiliza a API de datas do Java (`LocalDateTime`) para registrar a validade dos alimentos.
