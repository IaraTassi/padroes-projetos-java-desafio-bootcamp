# 🚀 Desafio projeto Santander Bootcamp 2023 - Fullstack Java+Angular
# 📃 Explorando Padrões de Projetos na Prática com Java

Padrões de Projeto
São  soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objetos.

- Padrões Criacionais: Abstract Factory, Builder, Factory Method, Prototype, Singleton.
- Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method.
- Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy.

## Projeto Java Puro

Singleton: Permite a criação de uma única instância de uma classe e fornece um modo para recuperá-la.

Strategy: Simplificar a variação de algoritmos para a resolução de um mesmo problema.
O padrão Strategy usa bastante do conceito de poliformismo.

Facade: Prover uma interface que reduza a complexidade nas integrações com subsistemas.

## Praticando com Spring Framework

Singleton: @Bean e @Autowired.

Strategy: @Service e @Repository.

Facade: Foi construído uma API REST com o mesmo objetivo desse padrão, para abstrair a complexidade das seguintes integrações: Spring Data JPA¹ e ViaCeEP (Feign).
¹ Em memória (usando o “h2”), por ser mais simples foi usado h2.
Pode ser usado qualquer BD relacional. 

## ✔ Conhecendo o Projeto Base
- Maven Project
- Java 17
- Spring Boot 3.1.4
- Spring Web
- Spring Data JPA
- H2 Database
- OpenFeign
- OpenAPI, foi incluído manualmente
Usamos a interface do Swagger, que é provido pelo OpenAPI

## 🗂 Projetos 
**lab-padroes-projeto-java-puro**: 
Projeto com Java Puro, usando o padrão GoF

**lab-padroes-projeto-spring**
Projeto com Spring Boot, usando o padrão Gof







