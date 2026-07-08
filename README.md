# 🚀 Miniguia de Estudos: Desenvolvimento de APIs REST com Java e Spring Boot utilizando Inteligência Artificial

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![API REST](https://img.shields.io/badge/API-REST-blue)
![NotebookLM](https://img.shields.io/badge/IA-NotebookLM-purple)

---

# 📌 Introdução

Este projeto foi desenvolvido como parte de um desafio da plataforma DIO, com o objetivo de utilizar a Inteligência Artificial como uma ferramenta de aprendizagem ativa para organização, pesquisa e consolidação de conhecimentos técnicos.

O tema escolhido para este caderno temático foi:

**Desenvolvimento de APIs REST utilizando Java e Spring Boot.**

Durante o desenvolvimento do projeto, a Inteligência Artificial foi utilizada como apoio para:

- Estruturar conteúdos técnicos;
- Criar resumos organizados;
- Revisar conceitos de programação backend;
- Gerar perguntas estratégicas para aprofundamento;
- Identificar lacunas de conhecimento;
- Auxiliar na criação de um guia de estudos reutilizável.

A utilização do NotebookLM permitiu transformar diversas fontes de estudo em um material organizado, facilitando a revisão e o aprendizado contínuo.

---

# 🎯 Objetivos de Estudo

Os principais objetivos deste projeto foram:

- Compreender os fundamentos de uma API REST;
- Entender como funciona uma aplicação desenvolvida com Spring Boot;
- Conhecer a arquitetura em camadas utilizada em aplicações backend;
- Aprender o funcionamento de Controllers, Services e Repositories;
- Revisar conceitos de HTTP e comunicação entre sistemas;
- Entender integração com banco de dados utilizando JPA e Hibernate;
- Criar um material de consulta rápida para estudos futuros.

---

# 📚 Curadoria de Fontes

As fontes utilizadas foram selecionadas buscando conteúdos oficiais e confiáveis.

## 1. Spring Boot Documentation

Documentação oficial do framework Spring Boot.

https://docs.spring.io/spring-boot/docs/current/reference/html/

**Utilização:**

- Estrutura de projetos;
- Configuração da aplicação;
- Funcionamento do framework.

---

## 2. Spring Framework Documentation

Documentação oficial do ecossistema Spring.

https://docs.spring.io/spring-framework/reference/

**Utilização:**

- Injeção de dependências;
- Controllers;
- Beans;
- Arquitetura Spring.

---

## 3. Oracle Java Documentation

Documentação oficial da linguagem Java.

https://docs.oracle.com/en/java/

**Utilização:**

- Sintaxe Java;
- Orientação a objetos;
- Recursos da linguagem.

---

## 4. MDN Web Docs - HTTP

Documentação sobre protocolos web.

https://developer.mozilla.org/pt-BR/docs/Web/HTTP

**Utilização:**

- Métodos HTTP;
- Status codes;
- Comunicação cliente-servidor.

---

# 🤖 Engenharia de Prompts

Durante o desenvolvimento do projeto foram realizados testes com diferentes estratégias de prompts para obter respostas mais completas da Inteligência Artificial.

---

# Prompt 1 - Introdução ao tema

### Pergunta utilizada:

### Resultado:

A IA apresentou uma explicação introdutória sobre APIs, HTTP e comunicação entre aplicações.

### Aprendizado:

Foi necessário adicionar mais contexto técnico para obter respostas mais próximas da realidade profissional.

---

# Prompt 2 - Aprofundamento técnico

### Pergunta utilizada:

### Resultado:

A resposta apresentou uma visão mais estruturada sobre arquitetura backend.

### Melhorias obtidas:

- Mais exemplos práticos;
- Explicações relacionadas ao mercado;
- Organização por camadas.

---

# Prompt 3 - Revisão profissional

### Pergunta utilizada:

### Resultado:

Foi criado um roteiro contendo:

- Java;
- Spring Boot;
- Banco de dados;
- APIs;
- Testes;
- Boas práticas.

---

# 🛠️ Dificuldades Encontradas (Troubleshooting)

## Respostas muito genéricas

**Problema:**

Algumas respostas iniciais apresentavam apenas conceitos básicos.

**Solução:**

Adicionar contexto ao prompt informando:

- Tecnologia utilizada;
- Nível de conhecimento;
- Objetivo do estudo.

---

## Falta de exemplos práticos

**Problema:**

Algumas explicações eram apenas teóricas.

**Solução:**

Solicitar exemplos utilizando Java e Spring Boot.

---

## Organização do conteúdo

**Problema:**

A quantidade de informações geradas pela IA poderia ficar desorganizada.

**Solução:**

Dividir os assuntos em tópicos menores e utilizar prompts específicos.

---

# 📖 Miniguia de Estudos

# O que é uma API REST?

Uma API REST é uma arquitetura utilizada para permitir comunicação entre diferentes sistemas através do protocolo HTTP.

Ela permite que aplicações enviem e recebam informações utilizando formatos como JSON.

Exemplo de funcionamento:

---

# Métodos HTTP

| Método | Descrição |
|---|---|
| GET | Buscar informações |
| POST | Criar novos registros |
| PUT | Atualizar registros existentes |
| DELETE | Remover registros |

---

# Arquitetura de uma aplicação Spring Boot

Uma aplicação backend normalmente utiliza uma divisão por responsabilidades:

---

# Controller

Responsável por receber requisições HTTP e retornar respostas.

Exemplo:

```java
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String listarProdutos() {
        return "Lista de produtos";
    }
}
